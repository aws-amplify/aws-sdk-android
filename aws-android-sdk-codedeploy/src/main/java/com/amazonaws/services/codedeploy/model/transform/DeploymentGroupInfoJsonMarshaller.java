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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeploymentGroupInfo
 */
class DeploymentGroupInfoJsonMarshaller {

    public void marshall(DeploymentGroupInfo deploymentGroupInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentGroupInfo.getApplicationName() != null) {
            String applicationName = deploymentGroupInfo.getApplicationName();
            jsonWriter.name("applicationName");
            jsonWriter.value(applicationName);
        }
        if (deploymentGroupInfo.getDeploymentGroupId() != null) {
            String deploymentGroupId = deploymentGroupInfo.getDeploymentGroupId();
            jsonWriter.name("deploymentGroupId");
            jsonWriter.value(deploymentGroupId);
        }
        if (deploymentGroupInfo.getDeploymentGroupName() != null) {
            String deploymentGroupName = deploymentGroupInfo.getDeploymentGroupName();
            jsonWriter.name("deploymentGroupName");
            jsonWriter.value(deploymentGroupName);
        }
        if (deploymentGroupInfo.getDeploymentConfigName() != null) {
            String deploymentConfigName = deploymentGroupInfo.getDeploymentConfigName();
            jsonWriter.name("deploymentConfigName");
            jsonWriter.value(deploymentConfigName);
        }
        if (deploymentGroupInfo.getEc2TagFilters() != null) {
            java.util.List<EC2TagFilter> ec2TagFilters = deploymentGroupInfo.getEc2TagFilters();
            jsonWriter.name("ec2TagFilters");
            jsonWriter.beginArray();
            for (EC2TagFilter ec2TagFiltersItem : ec2TagFilters) {
                if (ec2TagFiltersItem != null) {
                    EC2TagFilterJsonMarshaller.getInstance()
                            .marshall(ec2TagFiltersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deploymentGroupInfo.getOnPremisesInstanceTagFilters() != null) {
            java.util.List<TagFilter> onPremisesInstanceTagFilters = deploymentGroupInfo
                    .getOnPremisesInstanceTagFilters();
            jsonWriter.name("onPremisesInstanceTagFilters");
            jsonWriter.beginArray();
            for (TagFilter onPremisesInstanceTagFiltersItem : onPremisesInstanceTagFilters) {
                if (onPremisesInstanceTagFiltersItem != null) {
                    TagFilterJsonMarshaller.getInstance().marshall(
                            onPremisesInstanceTagFiltersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deploymentGroupInfo.getAutoScalingGroups() != null) {
            java.util.List<AutoScalingGroup> autoScalingGroups = deploymentGroupInfo
                    .getAutoScalingGroups();
            jsonWriter.name("autoScalingGroups");
            jsonWriter.beginArray();
            for (AutoScalingGroup autoScalingGroupsItem : autoScalingGroups) {
                if (autoScalingGroupsItem != null) {
                    AutoScalingGroupJsonMarshaller.getInstance().marshall(autoScalingGroupsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deploymentGroupInfo.getServiceRoleArn() != null) {
            String serviceRoleArn = deploymentGroupInfo.getServiceRoleArn();
            jsonWriter.name("serviceRoleArn");
            jsonWriter.value(serviceRoleArn);
        }
        if (deploymentGroupInfo.getTargetRevision() != null) {
            RevisionLocation targetRevision = deploymentGroupInfo.getTargetRevision();
            jsonWriter.name("targetRevision");
            RevisionLocationJsonMarshaller.getInstance().marshall(targetRevision, jsonWriter);
        }
        if (deploymentGroupInfo.getTriggerConfigurations() != null) {
            java.util.List<TriggerConfig> triggerConfigurations = deploymentGroupInfo
                    .getTriggerConfigurations();
            jsonWriter.name("triggerConfigurations");
            jsonWriter.beginArray();
            for (TriggerConfig triggerConfigurationsItem : triggerConfigurations) {
                if (triggerConfigurationsItem != null) {
                    TriggerConfigJsonMarshaller.getInstance().marshall(triggerConfigurationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (deploymentGroupInfo.getAlarmConfiguration() != null) {
            AlarmConfiguration alarmConfiguration = deploymentGroupInfo.getAlarmConfiguration();
            jsonWriter.name("alarmConfiguration");
            AlarmConfigurationJsonMarshaller.getInstance().marshall(alarmConfiguration, jsonWriter);
        }
        if (deploymentGroupInfo.getAutoRollbackConfiguration() != null) {
            AutoRollbackConfiguration autoRollbackConfiguration = deploymentGroupInfo
                    .getAutoRollbackConfiguration();
            jsonWriter.name("autoRollbackConfiguration");
            AutoRollbackConfigurationJsonMarshaller.getInstance().marshall(
                    autoRollbackConfiguration, jsonWriter);
        }
        if (deploymentGroupInfo.getDeploymentStyle() != null) {
            DeploymentStyle deploymentStyle = deploymentGroupInfo.getDeploymentStyle();
            jsonWriter.name("deploymentStyle");
            DeploymentStyleJsonMarshaller.getInstance().marshall(deploymentStyle, jsonWriter);
        }
        if (deploymentGroupInfo.getBlueGreenDeploymentConfiguration() != null) {
            BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration = deploymentGroupInfo
                    .getBlueGreenDeploymentConfiguration();
            jsonWriter.name("blueGreenDeploymentConfiguration");
            BlueGreenDeploymentConfigurationJsonMarshaller.getInstance().marshall(
                    blueGreenDeploymentConfiguration, jsonWriter);
        }
        if (deploymentGroupInfo.getLoadBalancerInfo() != null) {
            LoadBalancerInfo loadBalancerInfo = deploymentGroupInfo.getLoadBalancerInfo();
            jsonWriter.name("loadBalancerInfo");
            LoadBalancerInfoJsonMarshaller.getInstance().marshall(loadBalancerInfo, jsonWriter);
        }
        if (deploymentGroupInfo.getLastSuccessfulDeployment() != null) {
            LastDeploymentInfo lastSuccessfulDeployment = deploymentGroupInfo
                    .getLastSuccessfulDeployment();
            jsonWriter.name("lastSuccessfulDeployment");
            LastDeploymentInfoJsonMarshaller.getInstance().marshall(lastSuccessfulDeployment,
                    jsonWriter);
        }
        if (deploymentGroupInfo.getLastAttemptedDeployment() != null) {
            LastDeploymentInfo lastAttemptedDeployment = deploymentGroupInfo
                    .getLastAttemptedDeployment();
            jsonWriter.name("lastAttemptedDeployment");
            LastDeploymentInfoJsonMarshaller.getInstance().marshall(lastAttemptedDeployment,
                    jsonWriter);
        }
        if (deploymentGroupInfo.getEc2TagSet() != null) {
            EC2TagSet ec2TagSet = deploymentGroupInfo.getEc2TagSet();
            jsonWriter.name("ec2TagSet");
            EC2TagSetJsonMarshaller.getInstance().marshall(ec2TagSet, jsonWriter);
        }
        if (deploymentGroupInfo.getOnPremisesTagSet() != null) {
            OnPremisesTagSet onPremisesTagSet = deploymentGroupInfo.getOnPremisesTagSet();
            jsonWriter.name("onPremisesTagSet");
            OnPremisesTagSetJsonMarshaller.getInstance().marshall(onPremisesTagSet, jsonWriter);
        }
        if (deploymentGroupInfo.getComputePlatform() != null) {
            String computePlatform = deploymentGroupInfo.getComputePlatform();
            jsonWriter.name("computePlatform");
            jsonWriter.value(computePlatform);
        }
        if (deploymentGroupInfo.getEcsServices() != null) {
            java.util.List<ECSService> ecsServices = deploymentGroupInfo.getEcsServices();
            jsonWriter.name("ecsServices");
            jsonWriter.beginArray();
            for (ECSService ecsServicesItem : ecsServices) {
                if (ecsServicesItem != null) {
                    ECSServiceJsonMarshaller.getInstance().marshall(ecsServicesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DeploymentGroupInfoJsonMarshaller instance;

    public static DeploymentGroupInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentGroupInfoJsonMarshaller();
        return instance;
    }
}
