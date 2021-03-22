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

package com.webank.wedatasphere.dss.standard.common.entity.ref;

import com.webank.wedatasphere.dss.common.entity.DSSLabel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by enjoyyin on 2020/11/16.
 */
public interface RequestRef extends Ref {

    Object getParameter(String key);

    void setParameter(String key, Object value);

    Map<String, Object> getParameters();

    String getName();

    String getType();

    default List<DSSLabel> getDSSLabels(){
        return new ArrayList<>();
    }

}