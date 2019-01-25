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
 * StAX request marshaller for CreateAutoScalingGroupRequest
 */
public class CreateAutoScalingGroupRequestMarshaller implements
        Marshaller<Request<CreateAutoScalingGroupRequest>, CreateAutoScalingGroupRequest> {

    public Request<CreateAutoScalingGroupRequest> marshall(
            CreateAutoScalingGroupRequest createAutoScalingGroupRequest) {
        if (createAutoScalingGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateAutoScalingGroupRequest)");
        }

        Request<CreateAutoScalingGroupRequest> request = new DefaultRequest<CreateAutoScalingGroupRequest>(
                createAutoScalingGroupRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateAutoScalingGroup");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (createAutoScalingGroupRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = createAutoScalingGroupRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (createAutoScalingGroupRequest.getLaunchConfigurationName() != null) {
            prefix = "LaunchConfigurationName";
            String launchConfigurationName = createAutoScalingGroupRequest
                    .getLaunchConfigurationName();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationName));
        }
        if (createAutoScalingGroupRequest.getLaunchTemplate() != null) {
            prefix = "LaunchTemplate";
            LaunchTemplateSpecification launchTemplate = createAutoScalingGroupRequest
                    .getLaunchTemplate();
            LaunchTemplateSpecificationStaxMarshaller.getInstance().marshall(launchTemplate,
                    request, prefix + ".");
        }
        if (createAutoScalingGroupRequest.getMixedInstancesPolicy() != null) {
            prefix = "MixedInstancesPolicy";
            MixedInstancesPolicy mixedInstancesPolicy = createAutoScalingGroupRequest
                    .getMixedInstancesPolicy();
            MixedInstancesPolicyStaxMarshaller.getInstance().marshall(mixedInstancesPolicy,
                    request, prefix + ".");
        }
        if (createAutoScalingGroupRequest.getInstanceId() != null) {
            prefix = "InstanceId";
            String instanceId = createAutoScalingGroupRequest.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }
        if (createAutoScalingGroupRequest.getMinSize() != null) {
            prefix = "MinSize";
            Integer minSize = createAutoScalingGroupRequest.getMinSize();
            request.addParameter(prefix, StringUtils.fromInteger(minSize));
        }
        if (createAutoScalingGroupRequest.getMaxSize() != null) {
            prefix = "MaxSize";
            Integer maxSize = createAutoScalingGroupRequest.getMaxSize();
            request.addParameter(prefix, StringUtils.fromInteger(maxSize));
        }
        if (createAutoScalingGroupRequest.getDesiredCapacity() != null) {
            prefix = "DesiredCapacity";
            Integer desiredCapacity = createAutoScalingGroupRequest.getDesiredCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(desiredCapacity));
        }
        if (createAutoScalingGroupRequest.getDefaultCooldown() != null) {
            prefix = "DefaultCooldown";
            Integer defaultCooldown = createAutoScalingGroupRequest.getDefaultCooldown();
            request.addParameter(prefix, StringUtils.fromInteger(defaultCooldown));
        }
        if (createAutoScalingGroupRequest.getAvailabilityZones() != null) {
            prefix = "AvailabilityZones";
            java.util.List<String> availabilityZones = createAutoScalingGroupRequest
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
        if (createAutoScalingGroupRequest.getLoadBalancerNames() != null) {
            prefix = "LoadBalancerNames";
            java.util.List<String> loadBalancerNames = createAutoScalingGroupRequest
                    .getLoadBalancerNames();
            int loadBalancerNamesIndex = 1;
            String loadBalancerNamesPrefix = prefix;
            for (String loadBalancerNamesItem : loadBalancerNames) {
                prefix = loadBalancerNamesPrefix + ".member." + loadBalancerNamesIndex;
                if (loadBalancerNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(loadBalancerNamesItem));
                }
                loadBalancerNamesIndex++;
            }
            prefix = loadBalancerNamesPrefix;
        }
        if (createAutoScalingGroupRequest.getTargetGroupARNs() != null) {
            prefix = "TargetGroupARNs";
            java.util.List<String> targetGroupARNs = createAutoScalingGroupRequest
                    .getTargetGroupARNs();
            int targetGroupARNsIndex = 1;
            String targetGroupARNsPrefix = prefix;
            for (String targetGroupARNsItem : targetGroupARNs) {
                prefix = targetGroupARNsPrefix + ".member." + targetGroupARNsIndex;
                if (targetGroupARNsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(targetGroupARNsItem));
                }
                targetGroupARNsIndex++;
            }
            prefix = targetGroupARNsPrefix;
        }
        if (createAutoScalingGroupRequest.getHealthCheckType() != null) {
            prefix = "HealthCheckType";
            String healthCheckType = createAutoScalingGroupRequest.getHealthCheckType();
            request.addParameter(prefix, StringUtils.fromString(healthCheckType));
        }
        if (createAutoScalingGroupRequest.getHealthCheckGracePeriod() != null) {
            prefix = "HealthCheckGracePeriod";
            Integer healthCheckGracePeriod = createAutoScalingGroupRequest
                    .getHealthCheckGracePeriod();
            request.addParameter(prefix, StringUtils.fromInteger(healthCheckGracePeriod));
        }
        if (createAutoScalingGroupRequest.getPlacementGroup() != null) {
            prefix = "PlacementGroup";
            String placementGroup = createAutoScalingGroupRequest.getPlacementGroup();
            request.addParameter(prefix, StringUtils.fromString(placementGroup));
        }
        if (createAutoScalingGroupRequest.getVPCZoneIdentifier() != null) {
            prefix = "VPCZoneIdentifier";
            String vPCZoneIdentifier = createAutoScalingGroupRequest.getVPCZoneIdentifier();
            request.addParameter(prefix, StringUtils.fromString(vPCZoneIdentifier));
        }
        if (createAutoScalingGroupRequest.getTerminationPolicies() != null) {
            prefix = "TerminationPolicies";
            java.util.List<String> terminationPolicies = createAutoScalingGroupRequest
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
        if (createAutoScalingGroupRequest.getNewInstancesProtectedFromScaleIn() != null) {
            prefix = "NewInstancesProtectedFromScaleIn";
            Boolean newInstancesProtectedFromScaleIn = createAutoScalingGroupRequest
                    .getNewInstancesProtectedFromScaleIn();
            request.addParameter(prefix, StringUtils.fromBoolean(newInstancesProtectedFromScaleIn));
        }
        if (createAutoScalingGroupRequest.getLifecycleHookSpecificationList() != null) {
            prefix = "LifecycleHookSpecificationList";
            java.util.List<LifecycleHookSpecification> lifecycleHookSpecificationList = createAutoScalingGroupRequest
                    .getLifecycleHookSpecificationList();
            int lifecycleHookSpecificationListIndex = 1;
            String lifecycleHookSpecificationListPrefix = prefix;
            for (LifecycleHookSpecification lifecycleHookSpecificationListItem : lifecycleHookSpecificationList) {
                prefix = lifecycleHookSpecificationListPrefix + ".member."
                        + lifecycleHookSpecificationListIndex;
                if (lifecycleHookSpecificationListItem != null) {
                    LifecycleHookSpecificationStaxMarshaller.getInstance().marshall(
                            lifecycleHookSpecificationListItem, request, prefix + ".");
                }
                lifecycleHookSpecificationListIndex++;
            }
            prefix = lifecycleHookSpecificationListPrefix;
        }
        if (createAutoScalingGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createAutoScalingGroupRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
        if (createAutoScalingGroupRequest.getServiceLinkedRoleARN() != null) {
            prefix = "ServiceLinkedRoleARN";
            String serviceLinkedRoleARN = createAutoScalingGroupRequest.getServiceLinkedRoleARN();
            request.addParameter(prefix, StringUtils.fromString(serviceLinkedRoleARN));
        }

        return request;
    }
}
