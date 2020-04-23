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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TargetHealth
 */
class TargetHealthStaxMarshaller {

    public void marshall(TargetHealth _targetHealth, Request<?> request, String _prefix) {
        String prefix;
        if (_targetHealth.getState() != null) {
            prefix = _prefix + "State";
            String state = _targetHealth.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
        if (_targetHealth.getReason() != null) {
            prefix = _prefix + "Reason";
            String reason = _targetHealth.getReason();
            request.addParameter(prefix, StringUtils.fromString(reason));
        }
        if (_targetHealth.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _targetHealth.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static TargetHealthStaxMarshaller instance;

    public static TargetHealthStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TargetHealthStaxMarshaller();
        return instance;
    }
}
