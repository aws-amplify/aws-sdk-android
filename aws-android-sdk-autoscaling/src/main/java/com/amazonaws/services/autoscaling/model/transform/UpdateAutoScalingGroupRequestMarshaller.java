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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UpdateAutoScalingGroupRequest
 */
public class UpdateAutoScalingGroupRequestMarshaller implements
        Marshaller<Request<UpdateAutoScalingGroupRequest>, UpdateAutoScalingGroupRequest> {

    public Request<UpdateAutoScalingGroupRequest> marshall(
            UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) {
        if (updateAutoScalingGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAutoScalingGroupRequest)");
        }

        Request<UpdateAutoScalingGroupRequest> request = new DefaultRequest<UpdateAutoScalingGroupRequest>(
                updateAutoScalingGroupRequest, "AmazonAutoScaling");
        request.addParameter("Action", "UpdateAutoScalingGroup");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (updateAutoScalingGroupRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = updateAutoScalingGroupRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (updateAutoScalingGroupRequest.getLaunchConfigurationName() != null) {
            prefix = "LaunchConfigurationName";
            String launchConfigurationName = updateAutoScalingGroupRequest
                    .getLaunchConfigurationName();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationName));
        }
        if (updateAutoScalingGroupRequest.getLaunchTemplate() != null) {
            prefix = "LaunchTemplate";
            LaunchTemplateSpecification launchTemplate = updateAutoScalingGroupRequest
                    .getLaunchTemplate();
            LaunchTemplateSpecificationStaxMarshaller.getInstance().marshall(launchTemplate,
                    request, prefix + ".");
        }
        if (updateAutoScalingGroupRequest.getMixedInstancesPolicy() != null) {
            prefix = "MixedInstancesPolicy";
            MixedInstancesPolicy mixedInstancesPolicy = updateAutoScalingGroupRequest
                    .getMixedInstancesPolicy();
            MixedInstancesPolicyStaxMarshaller.getInstance().marshall(mixedInstancesPolicy,
                    request, prefix + ".");
        }
        if (updateAutoScalingGroupRequest.getMinSize() != null) {
            prefix = "MinSize";
            Integer minSize = updateAutoScalingGroupRequest.getMinSize();
            request.addParameter(prefix, StringUtils.fromInteger(minSize));
        }
        if (updateAutoScalingGroupRequest.getMaxSize() != null) {
            prefix = "MaxSize";
            Integer maxSize = updateAutoScalingGroupRequest.getMaxSize();
            request.addParameter(prefix, StringUtils.fromInteger(maxSize));
        }
        if (updateAutoScalingGroupRequest.getDesiredCapacity() != null) {
            prefix = "DesiredCapacity";
            Integer desiredCapacity = updateAutoScalingGroupRequest.getDesiredCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(desiredCapacity));
        }
        if (updateAutoScalingGroupRequest.getDefaultCooldown() != null) {
            prefix = "DefaultCooldown";
            Integer defaultCooldown = updateAutoScalingGroupRequest.getDefaultCooldown();
            request.addParameter(prefix, StringUtils.fromInteger(defaultCooldown));
        }
        if (updateAutoScalingGroupRequest.getAvailabilityZones() != null) {
            prefix = "AvailabilityZones";
            java.util.List<String> availabilityZones = updateAutoScalingGroupRequest
                    .getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (String availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + ".member." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(availabilityZonesItem));
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }
        if (updateAutoScalingGroupRequest.getHealthCheckType() != null) {
            prefix = "HealthCheckType";
            String healthCheckType = updateAutoScalingGroupRequest.getHealthCheckType();
            request.addParameter(prefix, StringUtils.fromString(healthCheckType));
        }
        if (updateAutoScalingGroupRequest.getHealthCheckGracePeriod() != null) {
            prefix = "HealthCheckGracePeriod";
            Integer healthCheckGracePeriod = updateAutoScalingGroupRequest
                    .getHealthCheckGracePeriod();
            request.addParameter(prefix, StringUtils.fromInteger(healthCheckGracePeriod));
        }
        if (updateAutoScalingGroupRequest.getPlacementGroup() != null) {
            prefix = "PlacementGroup";
            String placementGroup = updateAutoScalingGroupRequest.getPlacementGroup();
            request.addParameter(prefix, StringUtils.fromString(placementGroup));
        }
        if (updateAutoScalingGroupRequest.getVPCZoneIdentifier() != null) {
            prefix = "VPCZoneIdentifier";
            String vPCZoneIdentifier = updateAutoScalingGroupRequest.getVPCZoneIdentifier();
            request.addParameter(prefix, StringUtils.fromString(vPCZoneIdentifier));
        }
        if (updateAutoScalingGroupRequest.getTerminationPolicies() != null) {
            prefix = "TerminationPolicies";
            java.util.List<String> terminationPolicies = updateAutoScalingGroupRequest
                    .getTerminationPolicies();
            int terminationPoliciesIndex = 1;
            String terminationPoliciesPrefix = prefix;
            for (String terminationPoliciesItem : terminationPolicies) {
                prefix = terminationPoliciesPrefix + ".member." + terminationPoliciesIndex;
                if (terminationPoliciesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(terminationPoliciesItem));
                }
                terminationPoliciesIndex++;
            }
            prefix = terminationPoliciesPrefix;
        }
        if (updateAutoScalingGroupRequest.getNewInstancesProtectedFromScaleIn() != null) {
            prefix = "NewInstancesProtectedFromScaleIn";
            Boolean newInstancesProtectedFromScaleIn = updateAutoScalingGroupRequest
                    .getNewInstancesProtectedFromScaleIn();
            request.addParameter(prefix, StringUtils.fromBoolean(newInstancesProtectedFromScaleIn));
        }
        if (updateAutoScalingGroupRequest.getServiceLinkedRoleARN() != null) {
            prefix = "ServiceLinkedRoleARN";
            String serviceLinkedRoleARN = updateAutoScalingGroupRequest.getServiceLinkedRoleARN();
            request.addParameter(prefix, StringUtils.fromString(serviceLinkedRoleARN));
        }

        return request;
    }
}
