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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ScheduledInstanceAvailability
 */
class ScheduledInstanceAvailabilityJsonUnmarshaller implements
        Unmarshaller<ScheduledInstanceAvailability, JsonUnmarshallerContext> {

    public ScheduledInstanceAvailability unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScheduledInstanceAvailability scheduledInstanceAvailability = new ScheduledInstanceAvailability();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZone")) {
                scheduledInstanceAvailability.setAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailableInstanceCount")) {
                scheduledInstanceAvailability.setAvailableInstanceCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FirstSlotStartTime")) {
                scheduledInstanceAvailability.setFirstSlotStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HourlyPrice")) {
                scheduledInstanceAvailability.setHourlyPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                scheduledInstanceAvailability.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxTermDurationInDays")) {
                scheduledInstanceAvailability.setMaxTermDurationInDays(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinTermDurationInDays")) {
                scheduledInstanceAvailability.setMinTermDurationInDays(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkPlatform")) {
                scheduledInstanceAvailability.setNetworkPlatform(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                scheduledInstanceAvailability.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PurchaseToken")) {
                scheduledInstanceAvailability.setPurchaseToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Recurrence")) {
                scheduledInstanceAvailability
                        .setRecurrence(ScheduledInstanceRecurrenceJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("SlotDurationInHours")) {
                scheduledInstanceAvailability.setSlotDurationInHours(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalScheduledInstanceHours")) {
                scheduledInstanceAvailability
                        .setTotalScheduledInstanceHours(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scheduledInstanceAvailability;
    }

    private static ScheduledInstanceAvailabilityJsonUnmarshaller instance;

    public static ScheduledInstanceAvailabilityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceAvailabilityJsonUnmarshaller();
        return instance;
    }
}
