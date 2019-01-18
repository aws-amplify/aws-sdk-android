/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InstanceState
 */
class InstanceStateStaxMarshaller {

    public void marshall(InstanceState _instanceState, Request<?> request, String _prefix) {
        String prefix;
        if (_instanceState.getInstanceId() != null) {
            prefix = _prefix + "InstanceId";
            String instanceId = _instanceState.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }
        if (_instanceState.getState() != null) {
            prefix = _prefix + "State";
            String state = _instanceState.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
        if (_instanceState.getReasonCode() != null) {
            prefix = _prefix + "ReasonCode";
            String reasonCode = _instanceState.getReasonCode();
            request.addParameter(prefix, StringUtils.fromString(reasonCode));
        }
        if (_instanceState.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _instanceState.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static InstanceStateStaxMarshaller instance;

    public static InstanceStateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStateStaxMarshaller();
        return instance;
    }
}
