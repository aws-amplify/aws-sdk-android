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
 * StAX marshaller for POJO AutoScalingGroup
 */
class AutoScalingGroupStaxMarshaller {

    public void marshall(AutoScalingGroup _autoScalingGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_autoScalingGroup.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _autoScalingGroup.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_autoScalingGroup.getAutoScalingGroupARN() != null) {
            prefix = _prefix + "AutoScalingGroupARN";
            String autoScalingGroupARN = _autoScalingGroup.getAutoScalingGroupARN();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupARN));
        }
        if (_autoScalingGroup.getLaunchConfigurationName() != null) {
            prefix = _prefix + "LaunchConfigurationName";
            String launchConfigurationName = _autoScalingGroup.getLaunchConfigurationName();
            request.addParameter(prefix, StringUtils.fromString(launchConfigurationName));
        }
        if (_autoScalingGroup.getLaunchTemplate() != null) {
            prefix = _prefix + "LaunchTemplate";
            LaunchTemplateSpecification launchTemplate = _autoScalingGroup.getLaunchTemplate();
            LaunchTemplateSpecificationStaxMarshaller.getInstance().marshall(launchTemplate,
                    request, prefix + ".");
        }
        if (_autoScalingGroup.getMixedInstancesPolicy() != null) {
            prefix = _prefix + "MixedInstancesPolicy";
            MixedInstancesPolicy mixedInstancesPolicy = _autoScalingGroup.getMixedInstancesPolicy();
            MixedInstancesPolicyStaxMarshaller.getInstance().marshall(mixedInstancesPolicy,
                    request, prefix + ".");
        }
        if (_autoScalingGroup.getMinSize() != null) {
            prefix = _prefix + "MinSize";
            Integer minSize = _autoScalingGroup.getMinSize();
            request.addParameter(prefix, StringUtils.fromInteger(minSize));
        }
        if (_autoScalingGroup.getMaxSize() != null) {
            prefix = _prefix + "MaxSize";
            Integer maxSize = _autoScalingGroup.getMaxSize();
            request.addParameter(prefix, StringUtils.fromInteger(maxSize));
        }
        if (_autoScalingGroup.getDesiredCapacity() != null) {
            prefix = _prefix + "DesiredCapacity";
            Integer desiredCapacity = _autoScalingGroup.getDesiredCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(desiredCapacity));
        }
        if (_autoScalingGroup.getDefaultCooldown() != null) {
            prefix = _prefix + "DefaultCooldown";
            Integer defaultCooldown = _autoScalingGroup.getDefaultCooldown();
            request.addParameter(prefix, StringUtils.fromInteger(defaultCooldown));
        }
        if (_autoScalingGroup.getAvailabilityZones() != null) {
            prefix = _prefix + "AvailabilityZones";
            java.util.List<String> availabilityZones = _autoScalingGroup.getAvailabilityZones();
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
        if (_autoScalingGroup.getLoadBalancerNames() != null) {
            prefix = _prefix + "LoadBalancerNames";
            java.util.List<String> loadBalancerNames = _autoScalingGroup.getLoadBalancerNames();
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
        if (_autoScalingGroup.getTargetGroupARNs() != null) {
            prefix = _prefix + "TargetGroupARNs";
            java.util.List<String> targetGroupARNs = _autoScalingGroup.getTargetGroupARNs();
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
        if (_autoScalingGroup.getHealthCheckType() != null) {
            prefix = _prefix + "HealthCheckType";
            String healthCheckType = _autoScalingGroup.getHealthCheckType();
            request.addParameter(prefix, StringUtils.fromString(healthCheckType));
        }
        if (_autoScalingGroup.getHealthCheckGracePeriod() != null) {
            prefix = _prefix + "HealthCheckGracePeriod";
            Integer healthCheckGracePeriod = _autoScalingGroup.getHealthCheckGracePeriod();
            request.addParameter(prefix, StringUtils.fromInteger(healthCheckGracePeriod));
        }
        if (_autoScalingGroup.getInstances() != null) {
            prefix = _prefix + "Instances";
            java.util.List<Instance> instances = _autoScalingGroup.getInstances();
            int instancesIndex = 1;
            String instancesPrefix = prefix;
            for (Instance instancesItem : instances) {
                prefix = instancesPrefix + ".member." + instancesIndex;
                if (instancesItem != null) {
                    InstanceStaxMarshaller.getInstance().marshall(instancesItem, request,
                            prefix + ".");
                }
                instancesIndex++;
            }
            prefix = instancesPrefix;
        }
        if (_autoScalingGroup.getCreatedTime() != null) {
            prefix = _prefix + "CreatedTime";
            java.util.Date createdTime = _autoScalingGroup.getCreatedTime();
            request.addParameter(prefix, StringUtils.fromDate(createdTime));
        }
        if (_autoScalingGroup.getSuspendedProcesses() != null) {
            prefix = _prefix + "SuspendedProcesses";
            java.util.List<SuspendedProcess> suspendedProcesses = _autoScalingGroup
                    .getSuspendedProcesses();
            int suspendedProcessesIndex = 1;
            String suspendedProcessesPrefix = prefix;
            for (SuspendedProcess suspendedProcessesItem : suspendedProcesses) {
                prefix = suspendedProcessesPrefix + ".member." + suspendedProcessesIndex;
                if (suspendedProcessesItem != null) {
                    SuspendedProcessStaxMarshaller.getInstance().marshall(suspendedProcessesItem,
                            request, prefix + ".");
                }
                suspendedProcessesIndex++;
            }
            prefix = suspendedProcessesPrefix;
        }
        if (_autoScalingGroup.getPlacementGroup() != null) {
            prefix = _prefix + "PlacementGroup";
            String placementGroup = _autoScalingGroup.getPlacementGroup();
            request.addParameter(prefix, StringUtils.fromString(placementGroup));
        }
        if (_autoScalingGroup.getVPCZoneIdentifier() != null) {
            prefix = _prefix + "VPCZoneIdentifier";
            String vPCZoneIdentifier = _autoScalingGroup.getVPCZoneIdentifier();
            request.addParameter(prefix, StringUtils.fromString(vPCZoneIdentifier));
        }
        if (_autoScalingGroup.getEnabledMetrics() != null) {
            prefix = _prefix + "EnabledMetrics";
            java.util.List<EnabledMetric> enabledMetrics = _autoScalingGroup.getEnabledMetrics();
            int enabledMetricsIndex = 1;
            String enabledMetricsPrefix = prefix;
            for (EnabledMetric enabledMetricsItem : enabledMetrics) {
                prefix = enabledMetricsPrefix + ".member." + enabledMetricsIndex;
                if (enabledMetricsItem != null) {
                    EnabledMetricStaxMarshaller.getInstance().marshall(enabledMetricsItem, request,
                            prefix + ".");
                }
                enabledMetricsIndex++;
            }
            prefix = enabledMetricsPrefix;
        }
        if (_autoScalingGroup.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _autoScalingGroup.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_autoScalingGroup.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<TagDescription> tags = _autoScalingGroup.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (TagDescription tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagDescriptionStaxMarshaller.getInstance().marshall(tagsItem, request,
                            prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
        if (_autoScalingGroup.getTerminationPolicies() != null) {
            prefix = _prefix + "TerminationPolicies";
            java.util.List<String> terminationPolicies = _autoScalingGroup.getTerminationPolicies();
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
        if (_autoScalingGroup.getNewInstancesProtectedFromScaleIn() != null) {
            prefix = _prefix + "NewInstancesProtectedFromScaleIn";
            Boolean newInstancesProtectedFromScaleIn = _autoScalingGroup
                    .getNewInstancesProtectedFromScaleIn();
            request.addParameter(prefix, StringUtils.fromBoolean(newInstancesProtectedFromScaleIn));
        }
        if (_autoScalingGroup.getServiceLinkedRoleARN() != null) {
            prefix = _prefix + "ServiceLinkedRoleARN";
            String serviceLinkedRoleARN = _autoScalingGroup.getServiceLinkedRoleARN();
            request.addParameter(prefix, StringUtils.fromString(serviceLinkedRoleARN));
        }
    }

    private static AutoScalingGroupStaxMarshaller instance;

    public static AutoScalingGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingGroupStaxMarshaller();
        return instance;
    }
}
