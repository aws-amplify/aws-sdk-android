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
 * JSON marshaller for POJO CapacityReservation
 */
class CapacityReservationJsonMarshaller {

    public void marshall(CapacityReservation capacityReservation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (capacityReservation.getCapacityReservationId() != null) {
            String capacityReservationId = capacityReservation.getCapacityReservationId();
            jsonWriter.name("CapacityReservationId");
            jsonWriter.value(capacityReservationId);
        }
        if (capacityReservation.getOwnerId() != null) {
            String ownerId = capacityReservation.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (capacityReservation.getCapacityReservationArn() != null) {
            String capacityReservationArn = capacityReservation.getCapacityReservationArn();
            jsonWriter.name("CapacityReservationArn");
            jsonWriter.value(capacityReservationArn);
        }
        if (capacityReservation.getAvailabilityZoneId() != null) {
            String availabilityZoneId = capacityReservation.getAvailabilityZoneId();
            jsonWriter.name("AvailabilityZoneId");
            jsonWriter.value(availabilityZoneId);
        }
        if (capacityReservation.getInstanceType() != null) {
            String instanceType = capacityReservation.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (capacityReservation.getInstancePlatform() != null) {
            String instancePlatform = capacityReservation.getInstancePlatform();
            jsonWriter.name("InstancePlatform");
            jsonWriter.value(instancePlatform);
        }
        if (capacityReservation.getAvailabilityZone() != null) {
            String availabilityZone = capacityReservation.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (capacityReservation.getTenancy() != null) {
            String tenancy = capacityReservation.getTenancy();
            jsonWriter.name("Tenancy");
            jsonWriter.value(tenancy);
        }
        if (capacityReservation.getTotalInstanceCount() != null) {
            Integer totalInstanceCount = capacityReservation.getTotalInstanceCount();
            jsonWriter.name("TotalInstanceCount");
            jsonWriter.value(totalInstanceCount);
        }
        if (capacityReservation.getAvailableInstanceCount() != null) {
            Integer availableInstanceCount = capacityReservation.getAvailableInstanceCount();
            jsonWriter.name("AvailableInstanceCount");
            jsonWriter.value(availableInstanceCount);
        }
        if (capacityReservation.getEbsOptimized() != null) {
            Boolean ebsOptimized = capacityReservation.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (capacityReservation.getEphemeralStorage() != null) {
            Boolean ephemeralStorage = capacityReservation.getEphemeralStorage();
            jsonWriter.name("EphemeralStorage");
            jsonWriter.value(ephemeralStorage);
        }
        if (capacityReservation.getState() != null) {
            String state = capacityReservation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (capacityReservation.getEndDate() != null) {
            java.util.Date endDate = capacityReservation.getEndDate();
            jsonWriter.name("EndDate");
            jsonWriter.value(endDate);
        }
        if (capacityReservation.getEndDateType() != null) {
            String endDateType = capacityReservation.getEndDateType();
            jsonWriter.name("EndDateType");
            jsonWriter.value(endDateType);
        }
        if (capacityReservation.getInstanceMatchCriteria() != null) {
            String instanceMatchCriteria = capacityReservation.getInstanceMatchCriteria();
            jsonWriter.name("InstanceMatchCriteria");
            jsonWriter.value(instanceMatchCriteria);
        }
        if (capacityReservation.getCreateDate() != null) {
            java.util.Date createDate = capacityReservation.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (capacityReservation.getTags() != null) {
            java.util.List<Tag> tags = capacityReservation.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CapacityReservationJsonMarshaller instance;

    public static CapacityReservationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CapacityReservationJsonMarshaller();
        return instance;
    }
}
