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
 * StAX marshaller for POJO AutoScalingInstanceDetails
 */
class AutoScalingInstanceDetailsStaxMarshaller {

    public void marshall(AutoScalingInstanceDetails _autoScalingInstanceDetails,
            Request<?> request, String _prefix) {
        String prefix;
        if (_autoScalingInstanceDetails.getInstanceId() != null) {
            prefix = _prefix + "InstanceId";
            String instanceId = _autoScalingInstanceDetails.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }
        if (_autoScalingInstanceDetails.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _autoScalingInstanceDetails.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_autoScalingInstanceDetails.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _autoScalingInstanceDetails.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_autoScalingInstanceDetails.getLifecycleState() != null) {
            prefix = _prefix + "LifecycleState";
            String lifecycleState = _autoScalingInstanceDetails.getLifecycleState();
            request.addParameter(prefix, StringUtils.fromString(lifecycleState));
        }
        if (_autoScalingInstanceDetails.getHealthStatus() != null) {
            prefix = _prefix + "HealthStatus";
            String healthStatus = _autoScalingInstanceDetails.getHealthStatus();
            request.addParameter(prefix, StringUtils.fromString(healthStatus));
        }
        if (_autoScalingInstanceDetails.getLaunchConfigurationName() != null) {
            prefix = _prefix + "LaunchConfigurationName";
            String launchConfigurationName = _autoScalingInstanceDetails
                    .getLaunchConfigurationName();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationName));
        }
        if (_autoScalingInstanceDetails.getLaunchTemplate() != null) {
            prefix = _prefix + "LaunchTemplate";
            LaunchTemplateSpecification launchTemplate = _autoScalingInstanceDetails
                    .getLaunchTemplate();
            LaunchTemplateSpecificationStaxMarshaller.getInstance().marshall(launchTemplate,
                    request, prefix + ".");
        }
        if (_autoScalingInstanceDetails.getProtectedFromScaleIn() != null) {
            prefix = _prefix + "ProtectedFromScaleIn";
            Boolean protectedFromScaleIn = _autoScalingInstanceDetails.getProtectedFromScaleIn();
            request.addParameter(prefix, StringUtils.fromBoolean(protectedFromScaleIn));
        }
    }

    private static AutoScalingInstanceDetailsStaxMarshaller instance;

    public static AutoScalingInstanceDetailsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingInstanceDetailsStaxMarshaller();
        return instance;
    }
}
