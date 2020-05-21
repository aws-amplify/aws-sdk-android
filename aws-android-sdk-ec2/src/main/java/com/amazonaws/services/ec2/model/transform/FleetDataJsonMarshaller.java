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
 * JSON marshaller for POJO FleetData
 */
class FleetDataJsonMarshaller {

    public void marshall(FleetData fleetData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fleetData.getActivityStatus() != null) {
            String activityStatus = fleetData.getActivityStatus();
            jsonWriter.name("ActivityStatus");
            jsonWriter.value(activityStatus);
        }
        if (fleetData.getCreateTime() != null) {
            java.util.Date createTime = fleetData.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (fleetData.getFleetId() != null) {
            String fleetId = fleetData.getFleetId();
            jsonWriter.name("FleetId");
            jsonWriter.value(fleetId);
        }
        if (fleetData.getFleetState() != null) {
            String fleetState = fleetData.getFleetState();
            jsonWriter.name("FleetState");
            jsonWriter.value(fleetState);
        }
        if (fleetData.getClientToken() != null) {
            String clientToken = fleetData.getClientToken();
            jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
        }
        if (fleetData.getExcessCapacityTerminationPolicy() != null) {
            String excessCapacityTerminationPolicy = fleetData.getExcessCapacityTerminationPolicy();
            jsonWriter.name("ExcessCapacityTerminationPolicy");
            jsonWriter.value(excessCapacityTerminationPolicy);
        }
        if (fleetData.getFulfilledCapacity() != null) {
            Double fulfilledCapacity = fleetData.getFulfilledCapacity();
            jsonWriter.name("FulfilledCapacity");
            jsonWriter.value(fulfilledCapacity);
        }
        if (fleetData.getFulfilledOnDemandCapacity() != null) {
            Double fulfilledOnDemandCapacity = fleetData.getFulfilledOnDemandCapacity();
            jsonWriter.name("FulfilledOnDemandCapacity");
            jsonWriter.value(fulfilledOnDemandCapacity);
        }
        if (fleetData.getLaunchTemplateConfigs() != null) {
            java.util.List<FleetLaunchTemplateConfig> launchTemplateConfigs = fleetData
                    .getLaunchTemplateConfigs();
            jsonWriter.name("LaunchTemplateConfigs");
            jsonWriter.beginArray();
            for (FleetLaunchTemplateConfig launchTemplateConfigsItem : launchTemplateConfigs) {
                if (launchTemplateConfigsItem != null) {
                    FleetLaunchTemplateConfigJsonMarshaller.getInstance().marshall(
                            launchTemplateConfigsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fleetData.getTargetCapacitySpecification() != null) {
            TargetCapacitySpecification targetCapacitySpecification = fleetData
                    .getTargetCapacitySpecification();
            jsonWriter.name("TargetCapacitySpecification");
            TargetCapacitySpecificationJsonMarshaller.getInstance().marshall(
                    targetCapacitySpecification, jsonWriter);
        }
        if (fleetData.getTerminateInstancesWithExpiration() != null) {
            Boolean terminateInstancesWithExpiration = fleetData
                    .getTerminateInstancesWithExpiration();
            jsonWriter.name("TerminateInstancesWithExpiration");
            jsonWriter.value(terminateInstancesWithExpiration);
        }
        if (fleetData.getType() != null) {
            String type = fleetData.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (fleetData.getValidFrom() != null) {
            java.util.Date validFrom = fleetData.getValidFrom();
            jsonWriter.name("ValidFrom");
            jsonWriter.value(validFrom);
        }
        if (fleetData.getValidUntil() != null) {
            java.util.Date validUntil = fleetData.getValidUntil();
            jsonWriter.name("ValidUntil");
            jsonWriter.value(validUntil);
        }
        if (fleetData.getReplaceUnhealthyInstances() != null) {
            Boolean replaceUnhealthyInstances = fleetData.getReplaceUnhealthyInstances();
            jsonWriter.name("ReplaceUnhealthyInstances");
            jsonWriter.value(replaceUnhealthyInstances);
        }
        if (fleetData.getSpotOptions() != null) {
            SpotOptions spotOptions = fleetData.getSpotOptions();
            jsonWriter.name("SpotOptions");
            SpotOptionsJsonMarshaller.getInstance().marshall(spotOptions, jsonWriter);
        }
        if (fleetData.getOnDemandOptions() != null) {
            OnDemandOptions onDemandOptions = fleetData.getOnDemandOptions();
            jsonWriter.name("OnDemandOptions");
            OnDemandOptionsJsonMarshaller.getInstance().marshall(onDemandOptions, jsonWriter);
        }
        if (fleetData.getTags() != null) {
            java.util.List<Tag> tags = fleetData.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fleetData.getErrors() != null) {
            java.util.List<DescribeFleetError> errors = fleetData.getErrors();
            jsonWriter.name("Errors");
            jsonWriter.beginArray();
            for (DescribeFleetError errorsItem : errors) {
                if (errorsItem != null) {
                    DescribeFleetErrorJsonMarshaller.getInstance().marshall(errorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fleetData.getInstances() != null) {
            java.util.List<DescribeFleetsInstances> instances = fleetData.getInstances();
            jsonWriter.name("Instances");
            jsonWriter.beginArray();
            for (DescribeFleetsInstances instancesItem : instances) {
                if (instancesItem != null) {
                    DescribeFleetsInstancesJsonMarshaller.getInstance().marshall(instancesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FleetDataJsonMarshaller instance;

    public static FleetDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FleetDataJsonMarshaller();
        return instance;
    }
}
