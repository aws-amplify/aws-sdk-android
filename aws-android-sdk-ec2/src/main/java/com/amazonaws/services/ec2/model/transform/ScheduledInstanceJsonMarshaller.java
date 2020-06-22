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
 * JSON marshaller for POJO ScheduledInstance
 */
class ScheduledInstanceJsonMarshaller {

    public void marshall(ScheduledInstance scheduledInstance, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstance.getAvailabilityZone() != null) {
            String availabilityZone = scheduledInstance.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (scheduledInstance.getCreateDate() != null) {
            java.util.Date createDate = scheduledInstance.getCreateDate();
            jsonWriter.name("CreateDate");
            jsonWriter.value(createDate);
        }
        if (scheduledInstance.getHourlyPrice() != null) {
            String hourlyPrice = scheduledInstance.getHourlyPrice();
            jsonWriter.name("HourlyPrice");
            jsonWriter.value(hourlyPrice);
        }
        if (scheduledInstance.getInstanceCount() != null) {
            Integer instanceCount = scheduledInstance.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (scheduledInstance.getInstanceType() != null) {
            String instanceType = scheduledInstance.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (scheduledInstance.getNetworkPlatform() != null) {
            String networkPlatform = scheduledInstance.getNetworkPlatform();
            jsonWriter.name("NetworkPlatform");
            jsonWriter.value(networkPlatform);
        }
        if (scheduledInstance.getNextSlotStartTime() != null) {
            java.util.Date nextSlotStartTime = scheduledInstance.getNextSlotStartTime();
            jsonWriter.name("NextSlotStartTime");
            jsonWriter.value(nextSlotStartTime);
        }
        if (scheduledInstance.getPlatform() != null) {
            String platform = scheduledInstance.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (scheduledInstance.getPreviousSlotEndTime() != null) {
            java.util.Date previousSlotEndTime = scheduledInstance.getPreviousSlotEndTime();
            jsonWriter.name("PreviousSlotEndTime");
            jsonWriter.value(previousSlotEndTime);
        }
        if (scheduledInstance.getRecurrence() != null) {
            ScheduledInstanceRecurrence recurrence = scheduledInstance.getRecurrence();
            jsonWriter.name("Recurrence");
            ScheduledInstanceRecurrenceJsonMarshaller.getInstance()
                    .marshall(recurrence, jsonWriter);
        }
        if (scheduledInstance.getScheduledInstanceId() != null) {
            String scheduledInstanceId = scheduledInstance.getScheduledInstanceId();
            jsonWriter.name("ScheduledInstanceId");
            jsonWriter.value(scheduledInstanceId);
        }
        if (scheduledInstance.getSlotDurationInHours() != null) {
            Integer slotDurationInHours = scheduledInstance.getSlotDurationInHours();
            jsonWriter.name("SlotDurationInHours");
            jsonWriter.value(slotDurationInHours);
        }
        if (scheduledInstance.getTermEndDate() != null) {
            java.util.Date termEndDate = scheduledInstance.getTermEndDate();
            jsonWriter.name("TermEndDate");
            jsonWriter.value(termEndDate);
        }
        if (scheduledInstance.getTermStartDate() != null) {
            java.util.Date termStartDate = scheduledInstance.getTermStartDate();
            jsonWriter.name("TermStartDate");
            jsonWriter.value(termStartDate);
        }
        if (scheduledInstance.getTotalScheduledInstanceHours() != null) {
            Integer totalScheduledInstanceHours = scheduledInstance
                    .getTotalScheduledInstanceHours();
            jsonWriter.name("TotalScheduledInstanceHours");
            jsonWriter.value(totalScheduledInstanceHours);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstanceJsonMarshaller instance;

    public static ScheduledInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceJsonMarshaller();
        return instance;
    }
}
