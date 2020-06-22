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
 * JSON unmarshaller for POJO ScheduledInstance
 */
class ScheduledInstanceJsonUnmarshaller implements
        Unmarshaller<ScheduledInstance, JsonUnmarshallerContext> {

    public ScheduledInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScheduledInstance scheduledInstance = new ScheduledInstance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AvailabilityZone")) {
                scheduledInstance.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateDate")) {
                scheduledInstance.setCreateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HourlyPrice")) {
                scheduledInstance.setHourlyPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                scheduledInstance.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                scheduledInstance.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkPlatform")) {
                scheduledInstance.setNetworkPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextSlotStartTime")) {
                scheduledInstance.setNextSlotStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                scheduledInstance.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreviousSlotEndTime")) {
                scheduledInstance.setPreviousSlotEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Recurrence")) {
                scheduledInstance.setRecurrence(ScheduledInstanceRecurrenceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduledInstanceId")) {
                scheduledInstance.setScheduledInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlotDurationInHours")) {
                scheduledInstance.setSlotDurationInHours(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TermEndDate")) {
                scheduledInstance.setTermEndDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TermStartDate")) {
                scheduledInstance.setTermStartDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalScheduledInstanceHours")) {
                scheduledInstance.setTotalScheduledInstanceHours(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scheduledInstance;
    }

    private static ScheduledInstanceJsonUnmarshaller instance;

    public static ScheduledInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceJsonUnmarshaller();
        return instance;
    }
}
