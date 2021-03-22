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

package com.webank.wedatasphere.dss.orchestrator.common.protocol;

import java.util.List;

/**
 * @author allenlliu
 * @date 2020/12/29 17:04
 */
public class RequestQueryOrchestrator {
    private List<Long> orchestratorIds;

    public RequestQueryOrchestrator(List<Long> orchestratorIds) {
        this.orchestratorIds = orchestratorIds;
    }

    public List<Long> getOrchestratorIds() {
        return orchestratorIds;
    }

    public void setOrchestratorIds(List<Long> orchestratorIds) {
        this.orchestratorIds = orchestratorIds;
    }


}