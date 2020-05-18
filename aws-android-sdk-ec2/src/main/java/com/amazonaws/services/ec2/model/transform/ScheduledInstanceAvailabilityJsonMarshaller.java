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
 * JSON marshaller for POJO ScheduledInstanceAvailability
 */
class ScheduledInstanceAvailabilityJsonMarshaller {

    public void marshall(ScheduledInstanceAvailability scheduledInstanceAvailability,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstanceAvailability.getAvailabilityZone() != null) {
            String availabilityZone = scheduledInstanceAvailability.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (scheduledInstanceAvailability.getAvailableInstanceCount() != null) {
            Integer availableInstanceCount = scheduledInstanceAvailability
                    .getAvailableInstanceCount();
            jsonWriter.name("AvailableInstanceCount");
            jsonWriter.value(availableInstanceCount);
        }
        if (scheduledInstanceAvailability.getFirstSlotStartTime() != null) {
            java.util.Date firstSlotStartTime = scheduledInstanceAvailability
                    .getFirstSlotStartTime();
            jsonWriter.name("FirstSlotStartTime");
            jsonWriter.value(firstSlotStartTime);
        }
        if (scheduledInstanceAvailability.getHourlyPrice() != null) {
            String hourlyPrice = scheduledInstanceAvailability.getHourlyPrice();
            jsonWriter.name("HourlyPrice");
            jsonWriter.value(hourlyPrice);
        }
        if (scheduledInstanceAvailability.getInstanceType() != null) {
            String instanceType = scheduledInstanceAvailability.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (scheduledInstanceAvailability.getMaxTermDurationInDays() != null) {
            Integer maxTermDurationInDays = scheduledInstanceAvailability
                    .getMaxTermDurationInDays();
            jsonWriter.name("MaxTermDurationInDays");
            jsonWriter.value(maxTermDurationInDays);
        }
        if (scheduledInstanceAvailability.getMinTermDurationInDays() != null) {
            Integer minTermDurationInDays = scheduledInstanceAvailability
                    .getMinTermDurationInDays();
            jsonWriter.name("MinTermDurationInDays");
            jsonWriter.value(minTermDurationInDays);
        }
        if (scheduledInstanceAvailability.getNetworkPlatform() != null) {
            String networkPlatform = scheduledInstanceAvailability.getNetworkPlatform();
            jsonWriter.name("NetworkPlatform");
            jsonWriter.value(networkPlatform);
        }
        if (scheduledInstanceAvailability.getPlatform() != null) {
            String platform = scheduledInstanceAvailability.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (scheduledInstanceAvailability.getPurchaseToken() != null) {
            String purchaseToken = scheduledInstanceAvailability.getPurchaseToken();
            jsonWriter.name("PurchaseToken");
            jsonWriter.value(purchaseToken);
        }
        if (scheduledInstanceAvailability.getRecurrence() != null) {
            ScheduledInstanceRecurrence recurrence = scheduledInstanceAvailability.getRecurrence();
            jsonWriter.name("Recurrence");
            ScheduledInstanceRecurrenceJsonMarshaller.getInstance()
                    .marshall(recurrence, jsonWriter);
        }
        if (scheduledInstanceAvailability.getSlotDurationInHours() != null) {
            Integer slotDurationInHours = scheduledInstanceAvailability.getSlotDurationInHours();
            jsonWriter.name("SlotDurationInHours");
            jsonWriter.value(slotDurationInHours);
        }
        if (scheduledInstanceAvailability.getTotalScheduledInstanceHours() != null) {
            Integer totalScheduledInstanceHours = scheduledInstanceAvailability
                    .getTotalScheduledInstanceHours();
            jsonWriter.name("TotalScheduledInstanceHours");
            jsonWriter.value(totalScheduledInstanceHours);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstanceAvailabilityJsonMarshaller instance;

    public static ScheduledInstanceAvailabilityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceAvailabilityJsonMarshaller();
        return instance;
    }
}
