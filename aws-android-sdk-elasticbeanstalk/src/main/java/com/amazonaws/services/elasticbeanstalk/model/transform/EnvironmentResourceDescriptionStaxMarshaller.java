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
 * StAX marshaller for POJO EnvironmentResourceDescription
 */
class EnvironmentResourceDescriptionStaxMarshaller {

    public void marshall(EnvironmentResourceDescription _environmentResourceDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_environmentResourceDescription.getEnvironmentName() != null) {
            prefix = _prefix + "EnvironmentName";
            String environmentName = _environmentResourceDescription.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (_environmentResourceDescription.getAutoScalingGroups() != null) {
            prefix = _prefix + "AutoScalingGroups";
            java.util.List<AutoScalingGroup> autoScalingGroups = _environmentResourceDescription
                    .getAutoScalingGroups();
            int autoScalingGroupsIndex = 1;
            String autoScalingGroupsPrefix = prefix;
            for (AutoScalingGroup autoScalingGroupsItem : autoScalingGroups) {
                prefix = autoScalingGroupsPrefix + ".member." + autoScalingGroupsIndex;
                if (autoScalingGroupsItem != null) {
                    AutoScalingGroupStaxMarshaller.getInstance().marshall(autoScalingGroupsItem,
                            request, prefix + ".");
                }
                autoScalingGroupsIndex++;
            }
            prefix = autoScalingGroupsPrefix;
        }
        if (_environmentResourceDescription.getInstances() != null) {
            prefix = _prefix + "Instances";
            java.util.List<Instance> instances = _environmentResourceDescription.getInstances();
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
        if (_environmentResourceDescription.getLaunchConfigurations() != null) {
            prefix = _prefix + "LaunchConfigurations";
            java.util.List<LaunchConfiguration> launchConfigurations = _environmentResourceDescription
                    .getLaunchConfigurations();
            int launchConfigurationsIndex = 1;
            String launchConfigurationsPrefix = prefix;
            for (LaunchConfiguration launchConfigurationsItem : launchConfigurations) {
                prefix = launchConfigurationsPrefix + ".member." + launchConfigurationsIndex;
                if (launchConfigurationsItem != null) {
                    LaunchConfigurationStaxMarshaller.getInstance().marshall(
                            launchConfigurationsItem, request, prefix + ".");
                }
                launchConfigurationsIndex++;
            }
            prefix = launchConfigurationsPrefix;
        }
        if (_environmentResourceDescription.getLaunchTemplates() != null) {
            prefix = _prefix + "LaunchTemplates";
            java.util.List<LaunchTemplate> launchTemplates = _environmentResourceDescription
                    .getLaunchTemplates();
            int launchTemplatesIndex = 1;
            String launchTemplatesPrefix = prefix;
            for (LaunchTemplate launchTemplatesItem : launchTemplates) {
                prefix = launchTemplatesPrefix + ".member." + launchTemplatesIndex;
                if (launchTemplatesItem != null) {
                    LaunchTemplateStaxMarshaller.getInstance().marshall(launchTemplatesItem,
                            request, prefix + ".");
                }
                launchTemplatesIndex++;
            }
            prefix = launchTemplatesPrefix;
        }
        if (_environmentResourceDescription.getLoadBalancers() != null) {
            prefix = _prefix + "LoadBalancers";
            java.util.List<LoadBalancer> loadBalancers = _environmentResourceDescription
                    .getLoadBalancers();
            int loadBalancersIndex = 1;
            String loadBalancersPrefix = prefix;
            for (LoadBalancer loadBalancersItem : loadBalancers) {
                prefix = loadBalancersPrefix + ".member." + loadBalancersIndex;
                if (loadBalancersItem != null) {
                    LoadBalancerStaxMarshaller.getInstance().marshall(loadBalancersItem, request,
                            prefix + ".");
                }
                loadBalancersIndex++;
            }
            prefix = loadBalancersPrefix;
        }
        if (_environmentResourceDescription.getTriggers() != null) {
            prefix = _prefix + "Triggers";
            java.util.List<Trigger> triggers = _environmentResourceDescription.getTriggers();
            int triggersIndex = 1;
            String triggersPrefix = prefix;
            for (Trigger triggersItem : triggers) {
                prefix = triggersPrefix + ".member." + triggersIndex;
                if (triggersItem != null) {
                    TriggerStaxMarshaller.getInstance().marshall(triggersItem, request,
                            prefix + ".");
                }
                triggersIndex++;
            }
            prefix = triggersPrefix;
        }
        if (_environmentResourceDescription.getQueues() != null) {
            prefix = _prefix + "Queues";
            java.util.List<Queue> queues = _environmentResourceDescription.getQueues();
            int queuesIndex = 1;
            String queuesPrefix = prefix;
            for (Queue queuesItem : queues) {
                prefix = queuesPrefix + ".member." + queuesIndex;
                if (queuesItem != null) {
                    QueueStaxMarshaller.getInstance().marshall(queuesItem, request, prefix + ".");
                }
                queuesIndex++;
            }
            prefix = queuesPrefix;
        }
    }

    private static EnvironmentResourceDescriptionStaxMarshaller instance;

    public static EnvironmentResourceDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentResourceDescriptionStaxMarshaller();
        return instance;
    }
}
