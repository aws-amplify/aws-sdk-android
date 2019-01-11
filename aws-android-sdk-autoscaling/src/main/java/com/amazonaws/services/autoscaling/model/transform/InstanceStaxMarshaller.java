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
 * StAX marshaller for POJO Instance
 */
class InstanceStaxMarshaller {

    public void marshall(Instance _instance, Request<?> request, String _prefix) {
        String prefix;
        if (_instance.getInstanceId() != null) {
            prefix = _prefix + "InstanceId";
            String instanceId = _instance.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }
        if (_instance.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _instance.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_instance.getLifecycleState() != null) {
            prefix = _prefix + "LifecycleState";
            String lifecycleState = _instance.getLifecycleState();
            request.addParameter(prefix, StringUtils.fromString(lifecycleState));
        }
        if (_instance.getHealthStatus() != null) {
            prefix = _prefix + "HealthStatus";
            String healthStatus = _instance.getHealthStatus();
            request.addParameter(prefix, StringUtils.fromString(healthStatus));
        }
        if (_instance.getLaunchConfigurationName() != null) {
            prefix = _prefix + "LaunchConfigurationName";
            String launchConfigurationName = _instance.getLaunchConfigurationName();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationName));
        }
        if (_instance.getLaunchTemplate() != null) {
            prefix = _prefix + "LaunchTemplate";
            LaunchTemplateSpecification launchTemplate = _instance.getLaunchTemplate();
            LaunchTemplateSpecificationStaxMarshaller.getInstance().marshall(launchTemplate,
                    request, prefix + ".");
        }
        if (_instance.getProtectedFromScaleIn() != null) {
            prefix = _prefix + "ProtectedFromScaleIn";
            Boolean protectedFromScaleIn = _instance.getProtectedFromScaleIn();
            request.addParameter(prefix, StringUtils.fromBoolean(protectedFromScaleIn));
        }
    }

    private static InstanceStaxMarshaller instance;

    public static InstanceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStaxMarshaller();
        return instance;
    }
}
