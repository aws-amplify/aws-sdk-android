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
 * StAX marshaller for POJO HealthCheck
 */
class HealthCheckStaxMarshaller {

    public void marshall(HealthCheck _healthCheck, Request<?> request, String _prefix) {
        String prefix;
        if (_healthCheck.getTarget() != null) {
            prefix = _prefix + "Target";
            String target = _healthCheck.getTarget();
            request.addParameter(prefix, StringUtils.fromString(target));
        }
        if (_healthCheck.getInterval() != null) {
            prefix = _prefix + "Interval";
            Integer interval = _healthCheck.getInterval();
            request.addParameter(prefix, StringUtils.fromInteger(interval));
        }
        if (_healthCheck.getTimeout() != null) {
            prefix = _prefix + "Timeout";
            Integer timeout = _healthCheck.getTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(timeout));
        }
        if (_healthCheck.getUnhealthyThreshold() != null) {
            prefix = _prefix + "UnhealthyThreshold";
            Integer unhealthyThreshold = _healthCheck.getUnhealthyThreshold();
            request.addParameter(prefix, StringUtils.fromInteger(unhealthyThreshold));
        }
        if (_healthCheck.getHealthyThreshold() != null) {
            prefix = _prefix + "HealthyThreshold";
            Integer healthyThreshold = _healthCheck.getHealthyThreshold();
            request.addParameter(prefix, StringUtils.fromInteger(healthyThreshold));
        }
    }

    private static HealthCheckStaxMarshaller instance;

    public static HealthCheckStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckStaxMarshaller();
        return instance;
    }
}
