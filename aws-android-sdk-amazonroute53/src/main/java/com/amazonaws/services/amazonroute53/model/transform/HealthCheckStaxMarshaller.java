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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO HealthCheck
 */
class HealthCheckStaxMarshaller {

    public void marshall(HealthCheck _healthCheck, Request<?> request, String _prefix) {
        String prefix;
        if (_healthCheck.getId() != null) {
            prefix = _prefix + "Id";
            String id = _healthCheck.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_healthCheck.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _healthCheck.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_healthCheck.getLinkedService() != null) {
            prefix = _prefix + "LinkedService";
            LinkedService linkedService = _healthCheck.getLinkedService();
            LinkedServiceStaxMarshaller.getInstance()
                    .marshall(linkedService, request, prefix + ".");
        }
        if (_healthCheck.getHealthCheckConfig() != null) {
            prefix = _prefix + "HealthCheckConfig";
            HealthCheckConfig healthCheckConfig = _healthCheck.getHealthCheckConfig();
            HealthCheckConfigStaxMarshaller.getInstance().marshall(healthCheckConfig, request,
                    prefix + ".");
        }
        if (_healthCheck.getHealthCheckVersion() != null) {
            prefix = _prefix + "HealthCheckVersion";
            Long healthCheckVersion = _healthCheck.getHealthCheckVersion();
            request.addParameter(prefix, StringUtils.fromLong(healthCheckVersion));
        }
        if (_healthCheck.getCloudWatchAlarmConfiguration() != null) {
            prefix = _prefix + "CloudWatchAlarmConfiguration";
            CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration = _healthCheck
                    .getCloudWatchAlarmConfiguration();
            CloudWatchAlarmConfigurationStaxMarshaller.getInstance().marshall(
                    cloudWatchAlarmConfiguration, request, prefix + ".");
        }
    }

    private static HealthCheckStaxMarshaller instance;

    public static HealthCheckStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckStaxMarshaller();
        return instance;
    }
}
