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
 * StAX marshaller for POJO LoadBalancerTargetGroupState
 */
class LoadBalancerTargetGroupStateStaxMarshaller {

    public void marshall(LoadBalancerTargetGroupState _loadBalancerTargetGroupState,
            Request<?> request, String _prefix) {
        String prefix;
        if (_loadBalancerTargetGroupState.getLoadBalancerTargetGroupARN() != null) {
            prefix = _prefix + "LoadBalancerTargetGroupARN";
            String loadBalancerTargetGroupARN = _loadBalancerTargetGroupState
                    .getLoadBalancerTargetGroupARN();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerTargetGroupARN));
        }
        if (_loadBalancerTargetGroupState.getState() != null) {
            prefix = _prefix + "State";
            String state = _loadBalancerTargetGroupState.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
    }

    private static LoadBalancerTargetGroupStateStaxMarshaller instance;

    public static LoadBalancerTargetGroupStateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTargetGroupStateStaxMarshaller();
        return instance;
    }
}
