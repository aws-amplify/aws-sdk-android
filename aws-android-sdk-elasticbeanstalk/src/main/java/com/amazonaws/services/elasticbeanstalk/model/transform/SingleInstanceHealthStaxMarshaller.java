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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SingleInstanceHealth
 */
class SingleInstanceHealthStaxMarshaller {

    public void marshall(SingleInstanceHealth _singleInstanceHealth, Request<?> request,
            String _prefix) {
        String prefix;
        if (_singleInstanceHealth.getInstanceId() != null) {
            prefix = _prefix + "InstanceId";
            String instanceId = _singleInstanceHealth.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }
        if (_singleInstanceHealth.getHealthStatus() != null) {
            prefix = _prefix + "HealthStatus";
            String healthStatus = _singleInstanceHealth.getHealthStatus();
            request.addParameter(prefix, StringUtils.fromString(healthStatus));
        }
        if (_singleInstanceHealth.getColor() != null) {
            prefix = _prefix + "Color";
            String color = _singleInstanceHealth.getColor();
            request.addParameter(prefix, StringUtils.fromString(color));
        }
        if (_singleInstanceHealth.getCauses() != null) {
            prefix = _prefix + "Causes";
            java.util.List<String> causes = _singleInstanceHealth.getCauses();
            int causesIndex = 1;
            String causesPrefix = prefix;
            for (String causesItem : causes) {
                prefix = causesPrefix + ".member." + causesIndex;
                if (causesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(causesItem));
                }
                causesIndex++;
            }
            prefix = causesPrefix;
        }
        if (_singleInstanceHealth.getLaunchedAt() != null) {
            prefix = _prefix + "LaunchedAt";
            java.util.Date launchedAt = _singleInstanceHealth.getLaunchedAt();
            request.addParameter(prefix, StringUtils.fromDate(launchedAt));
        }
        if (_singleInstanceHealth.getApplicationMetrics() != null) {
            prefix = _prefix + "ApplicationMetrics";
            ApplicationMetrics applicationMetrics = _singleInstanceHealth.getApplicationMetrics();
            ApplicationMetricsStaxMarshaller.getInstance().marshall(applicationMetrics, request,
                    prefix + ".");
        }
        if (_singleInstanceHealth.getSystem() != null) {
            prefix = _prefix + "System";
            SystemStatus system = _singleInstanceHealth.getSystem();
            SystemStatusStaxMarshaller.getInstance().marshall(system, request, prefix + ".");
        }
        if (_singleInstanceHealth.getDeployment() != null) {
            prefix = _prefix + "Deployment";
            Deployment deployment = _singleInstanceHealth.getDeployment();
            DeploymentStaxMarshaller.getInstance().marshall(deployment, request, prefix + ".");
        }
        if (_singleInstanceHealth.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _singleInstanceHealth.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_singleInstanceHealth.getInstanceType() != null) {
            prefix = _prefix + "InstanceType";
            String instanceType = _singleInstanceHealth.getInstanceType();
            request.addParameter(prefix, StringUtils.fromString(instanceType));
        }
    }

    private static SingleInstanceHealthStaxMarshaller instance;

    public static SingleInstanceHealthStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SingleInstanceHealthStaxMarshaller();
        return instance;
    }
}
