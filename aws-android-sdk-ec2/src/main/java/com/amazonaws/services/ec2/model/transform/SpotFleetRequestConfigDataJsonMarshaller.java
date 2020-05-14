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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SpotFleetRequestConfigData
 */
class SpotFleetRequestConfigDataJsonMarshaller {

    public void marshall(SpotFleetRequestConfigData spotFleetRequestConfigData,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (spotFleetRequestConfigData.getAllocationStrategy() != null) {
            String allocationStrategy = spotFleetRequestConfigData.getAllocationStrategy();
            jsonWriter.name("AllocationStrategy");
            jsonWriter.value(allocationStrategy);
        }
        if (spotFleetRequestConfigData.getOnDemandAllocationStrategy() != null) {
            String onDemandAllocationStrategy = spotFleetRequestConfigData
                    .getOnDemandAllocationStrategy();
            jsonWriter.name("OnDemandAllocationStrategy");
            jsonWriter.value(onDemandAllocationStrategy);
        }
        if (spotFleetRequestConfigData.getClientToken() != null) {
            String clientToken = spotFleetRequestConfigData.getClientToken();
            jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
        }
        if (spotFleetRequestConfigData.getExcessCapacityTerminationPolicy() != null) {
            String excessCapacityTerminationPolicy = spotFleetRequestConfigData
                    .getExcessCapacityTerminationPolicy();
            jsonWriter.name("ExcessCapacityTerminationPolicy");
            jsonWriter.value(excessCapacityTerminationPolicy);
        }
        if (spotFleetRequestConfigData.getFulfilledCapacity() != null) {
            Double fulfilledCapacity = spotFleetRequestConfigData.getFulfilledCapacity();
            jsonWriter.name("FulfilledCapacity");
            jsonWriter.value(fulfilledCapacity);
        }
        if (spotFleetRequestConfigData.getOnDemandFulfilledCapacity() != null) {
            Double onDemandFulfilledCapacity = spotFleetRequestConfigData
                    .getOnDemandFulfilledCapacity();
            jsonWriter.name("OnDemandFulfilledCapacity");
            jsonWriter.value(onDemandFulfilledCapacity);
        }
        if (spotFleetRequestConfigData.getIamFleetRole() != null) {
            String iamFleetRole = spotFleetRequestConfigData.getIamFleetRole();
            jsonWriter.name("IamFleetRole");
            jsonWriter.value(iamFleetRole);
        }
        if (spotFleetRequestConfigData.getLaunchSpecifications() != null) {
            java.util.List<SpotFleetLaunchSpecification> launchSpecifications = spotFleetRequestConfigData
                    .getLaunchSpecifications();
            jsonWriter.name("LaunchSpecifications");
            jsonWriter.beginArray();
            for (SpotFleetLaunchSpecification launchSpecificationsItem : launchSpecifications) {
                if (launchSpecificationsItem != null) {
                    SpotFleetLaunchSpecificationJsonMarshaller.getInstance().marshall(
                            launchSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (spotFleetRequestConfigData.getLaunchTemplateConfigs() != null) {
            java.util.List<LaunchTemplateConfig> launchTemplateConfigs = spotFleetRequestConfigData
                    .getLaunchTemplateConfigs();
            jsonWriter.name("LaunchTemplateConfigs");
            jsonWriter.beginArray();
            for (LaunchTemplateConfig launchTemplateConfigsItem : launchTemplateConfigs) {
                if (launchTemplateConfigsItem != null) {
                    LaunchTemplateConfigJsonMarshaller.getInstance().marshall(
                            launchTemplateConfigsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (spotFleetRequestConfigData.getSpotPrice() != null) {
            String spotPrice = spotFleetRequestConfigData.getSpotPrice();
            jsonWriter.name("SpotPrice");
            jsonWriter.value(spotPrice);
        }
        if (spotFleetRequestConfigData.getTargetCapacity() != null) {
            Integer targetCapacity = spotFleetRequestConfigData.getTargetCapacity();
            jsonWriter.name("TargetCapacity");
            jsonWriter.value(targetCapacity);
        }
        if (spotFleetRequestConfigData.getOnDemandTargetCapacity() != null) {
            Integer onDemandTargetCapacity = spotFleetRequestConfigData.getOnDemandTargetCapacity();
            jsonWriter.name("OnDemandTargetCapacity");
            jsonWriter.value(onDemandTargetCapacity);
        }
        if (spotFleetRequestConfigData.getOnDemandMaxTotalPrice() != null) {
            String onDemandMaxTotalPrice = spotFleetRequestConfigData.getOnDemandMaxTotalPrice();
            jsonWriter.name("OnDemandMaxTotalPrice");
            jsonWriter.value(onDemandMaxTotalPrice);
        }
        if (spotFleetRequestConfigData.getSpotMaxTotalPrice() != null) {
            String spotMaxTotalPrice = spotFleetRequestConfigData.getSpotMaxTotalPrice();
            jsonWriter.name("SpotMaxTotalPrice");
            jsonWriter.value(spotMaxTotalPrice);
        }
        if (spotFleetRequestConfigData.getTerminateInstancesWithExpiration() != null) {
            Boolean terminateInstancesWithExpiration = spotFleetRequestConfigData
                    .getTerminateInstancesWithExpiration();
            jsonWriter.name("TerminateInstancesWithExpiration");
            jsonWriter.value(terminateInstancesWithExpiration);
        }
        if (spotFleetRequestConfigData.getType() != null) {
            String type = spotFleetRequestConfigData.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (spotFleetRequestConfigData.getValidFrom() != null) {
            java.util.Date validFrom = spotFleetRequestConfigData.getValidFrom();
            jsonWriter.name("ValidFrom");
            jsonWriter.value(validFrom);
        }
        if (spotFleetRequestConfigData.getValidUntil() != null) {
            java.util.Date validUntil = spotFleetRequestConfigData.getValidUntil();
            jsonWriter.name("ValidUntil");
            jsonWriter.value(validUntil);
        }
        if (spotFleetRequestConfigData.getReplaceUnhealthyInstances() != null) {
            Boolean replaceUnhealthyInstances = spotFleetRequestConfigData
                    .getReplaceUnhealthyInstances();
            jsonWriter.name("ReplaceUnhealthyInstances");
            jsonWriter.value(replaceUnhealthyInstances);
        }
        if (spotFleetRequestConfigData.getInstanceInterruptionBehavior() != null) {
            String instanceInterruptionBehavior = spotFleetRequestConfigData
                    .getInstanceInterruptionBehavior();
            jsonWriter.name("InstanceInterruptionBehavior");
            jsonWriter.value(instanceInterruptionBehavior);
        }
        if (spotFleetRequestConfigData.getLoadBalancersConfig() != null) {
            LoadBalancersConfig loadBalancersConfig = spotFleetRequestConfigData
                    .getLoadBalancersConfig();
            jsonWriter.name("LoadBalancersConfig");
            LoadBalancersConfigJsonMarshaller.getInstance().marshall(loadBalancersConfig,
                    jsonWriter);
        }
        if (spotFleetRequestConfigData.getInstancePoolsToUseCount() != null) {
            Integer instancePoolsToUseCount = spotFleetRequestConfigData
                    .getInstancePoolsToUseCount();
            jsonWriter.name("InstancePoolsToUseCount");
            jsonWriter.value(instancePoolsToUseCount);
        }
        if (spotFleetRequestConfigData.getTagSpecifications() != null) {
            java.util.List<TagSpecification> tagSpecifications = spotFleetRequestConfigData
                    .getTagSpecifications();
            jsonWriter.name("TagSpecifications");
            jsonWriter.beginArray();
            for (TagSpecification tagSpecificationsItem : tagSpecifications) {
                if (tagSpecificationsItem != null) {
                    TagSpecificationJsonMarshaller.getInstance().marshall(tagSpecificationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SpotFleetRequestConfigDataJsonMarshaller instance;

    public static SpotFleetRequestConfigDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotFleetRequestConfigDataJsonMarshaller();
        return instance;
    }
}
