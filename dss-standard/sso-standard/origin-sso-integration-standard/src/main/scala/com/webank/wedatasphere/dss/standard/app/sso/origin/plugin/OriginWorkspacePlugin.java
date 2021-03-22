/*
 *
 *  * Copyright 2019 WeBank
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.webank.wedatasphere.dss.standard.app.sso.origin.plugin;

import com.webank.wedatasphere.dss.standard.app.sso.builder.DssMsgBuilderOperation;
import com.webank.wedatasphere.dss.standard.app.sso.plugin.AbstractWorkspacePlugin;
import com.webank.wedatasphere.dss.standard.app.sso.origin.client.HttpClient;
import com.webank.wedatasphere.linkis.httpclient.dws.DWSHttpClient;
import java.util.List;

/**
 * Created by enjoyyin on 2020/9/10.
 */
public class OriginWorkspacePlugin extends AbstractWorkspacePlugin {

    @Override
    protected List<String> getAllUsers(DssMsgBuilderOperation.DSSMsg dssMsg) {
        String dssUrl = dssMsg.getDSSUrl();
        DWSHttpClient dwsHttpClient = HttpClient.getDSSClient(dssUrl);
        WorkspaceUsersAction workspaceUsersAction = new WorkspaceUsersAction();
        HttpClient.addCookies(dssMsg, workspaceUsersAction);
        WorkspaceUsersResult result = (WorkspaceUsersResult) dwsHttpClient.execute(workspaceUsersAction);
        return result.getUsers();
    }
}