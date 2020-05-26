/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO GlobalNodeGroup
 */
class GlobalNodeGroupStaxMarshaller {

    public void marshall(GlobalNodeGroup _globalNodeGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_globalNodeGroup.getGlobalNodeGroupId() != null) {
            prefix = _prefix + "GlobalNodeGroupId";
            String globalNodeGroupId = _globalNodeGroup.getGlobalNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalNodeGroupId));
        }
        if (_globalNodeGroup.getSlots() != null) {
            prefix = _prefix + "Slots";
            String slots = _globalNodeGroup.getSlots();
            request.addParameter(prefix, StringUtils.fromString(slots));
        }
    }

    private static GlobalNodeGroupStaxMarshaller instance;

    public static GlobalNodeGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalNodeGroupStaxMarshaller();
        return instance;
    }
}
