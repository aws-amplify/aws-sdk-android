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
 * JSON marshaller for POJO SpotInstanceRequest
 */
class SpotInstanceRequestJsonMarshaller {

    public void marshall(SpotInstanceRequest spotInstanceRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (spotInstanceRequest.getActualBlockHourlyPrice() != null) {
            String actualBlockHourlyPrice = spotInstanceRequest.getActualBlockHourlyPrice();
            jsonWriter.name("ActualBlockHourlyPrice");
            jsonWriter.value(actualBlockHourlyPrice);
        }
        if (spotInstanceRequest.getAvailabilityZoneGroup() != null) {
            String availabilityZoneGroup = spotInstanceRequest.getAvailabilityZoneGroup();
            jsonWriter.name("AvailabilityZoneGroup");
            jsonWriter.value(availabilityZoneGroup);
        }
        if (spotInstanceRequest.getBlockDurationMinutes() != null) {
            Integer blockDurationMinutes = spotInstanceRequest.getBlockDurationMinutes();
            jsonWriter.name("BlockDurationMinutes");
            jsonWriter.value(blockDurationMinutes);
        }
        if (spotInstanceRequest.getCreateTime() != null) {
            java.util.Date createTime = spotInstanceRequest.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (spotInstanceRequest.getFault() != null) {
            SpotInstanceStateFault fault = spotInstanceRequest.getFault();
            jsonWriter.name("Fault");
            SpotInstanceStateFaultJsonMarshaller.getInstance().marshall(fault, jsonWriter);
        }
        if (spotInstanceRequest.getInstanceId() != null) {
            String instanceId = spotInstanceRequest.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (spotInstanceRequest.getLaunchGroup() != null) {
            String launchGroup = spotInstanceRequest.getLaunchGroup();
            jsonWriter.name("LaunchGroup");
            jsonWriter.value(launchGroup);
        }
        if (spotInstanceRequest.getLaunchSpecification() != null) {
            LaunchSpecification launchSpecification = spotInstanceRequest.getLaunchSpecification();
            jsonWriter.name("LaunchSpecification");
            LaunchSpecificationJsonMarshaller.getInstance().marshall(launchSpecification,
                    jsonWriter);
        }
        if (spotInstanceRequest.getLaunchedAvailabilityZone() != null) {
            String launchedAvailabilityZone = spotInstanceRequest.getLaunchedAvailabilityZone();
            jsonWriter.name("LaunchedAvailabilityZone");
            jsonWriter.value(launchedAvailabilityZone);
        }
        if (spotInstanceRequest.getProductDescription() != null) {
            String productDescription = spotInstanceRequest.getProductDescription();
            jsonWriter.name("ProductDescription");
            jsonWriter.value(productDescription);
        }
        if (spotInstanceRequest.getSpotInstanceRequestId() != null) {
            String spotInstanceRequestId = spotInstanceRequest.getSpotInstanceRequestId();
            jsonWriter.name("SpotInstanceRequestId");
            jsonWriter.value(spotInstanceRequestId);
        }
        if (spotInstanceRequest.getSpotPrice() != null) {
            String spotPrice = spotInstanceRequest.getSpotPrice();
            jsonWriter.name("SpotPrice");
            jsonWriter.value(spotPrice);
        }
        if (spotInstanceRequest.getState() != null) {
            String state = spotInstanceRequest.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (spotInstanceRequest.getStatus() != null) {
            SpotInstanceStatus status = spotInstanceRequest.getStatus();
            jsonWriter.name("Status");
            SpotInstanceStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (spotInstanceRequest.getTags() != null) {
            java.util.List<Tag> tags = spotInstanceRequest.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (spotInstanceRequest.getType() != null) {
            String type = spotInstanceRequest.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (spotInstanceRequest.getValidFrom() != null) {
            java.util.Date validFrom = spotInstanceRequest.getValidFrom();
            jsonWriter.name("ValidFrom");
            jsonWriter.value(validFrom);
        }
        if (spotInstanceRequest.getValidUntil() != null) {
            java.util.Date validUntil = spotInstanceRequest.getValidUntil();
            jsonWriter.name("ValidUntil");
            jsonWriter.value(validUntil);
        }
        if (spotInstanceRequest.getInstanceInterruptionBehavior() != null) {
            String instanceInterruptionBehavior = spotInstanceRequest
                    .getInstanceInterruptionBehavior();
            jsonWriter.name("InstanceInterruptionBehavior");
            jsonWriter.value(instanceInterruptionBehavior);
        }
        jsonWriter.endObject();
    }

    private static SpotInstanceRequestJsonMarshaller instance;

    public static SpotInstanceRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotInstanceRequestJsonMarshaller();
        return instance;
    }
}
