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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LoadBalancerState
 */
class LoadBalancerStateStaxMarshaller {

    public void marshall(LoadBalancerState _loadBalancerState, Request<?> request, String _prefix) {
        String prefix;
        if (_loadBalancerState.getLoadBalancerName() != null) {
            prefix = _prefix + "LoadBalancerName";
            String loadBalancerName = _loadBalancerState.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (_loadBalancerState.getState() != null) {
            prefix = _prefix + "State";
            String state = _loadBalancerState.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
    }

    private static LoadBalancerStateStaxMarshaller instance;

    public static LoadBalancerStateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerStateStaxMarshaller();
        return instance;
    }
}
