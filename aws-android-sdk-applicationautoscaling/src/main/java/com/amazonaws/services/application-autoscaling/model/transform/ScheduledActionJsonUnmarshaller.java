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
package com.amazonaws.services.application-autoscaling.model.transform;

import com.amazonaws.services.application-autoscaling.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO ScheduledAction
 */
class ScheduledActionJsonUnmarshaller implements Unmarshaller<ScheduledAction, JsonUnmarshallerContext> {

    public ScheduledAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScheduledAction scheduledAction = new ScheduledAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ScheduledActionName")) {
                scheduledAction.setScheduledActionName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ScheduledActionARN")) {
                scheduledAction.setScheduledActionARN(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ServiceNamespace")) {
                scheduledAction.setServiceNamespace(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Schedule")) {
                scheduledAction.setSchedule(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResourceId")) {
                scheduledAction.setResourceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ScalableDimension")) {
                scheduledAction.setScalableDimension(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StartTime")) {
                scheduledAction.setStartTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("EndTime")) {
                scheduledAction.setEndTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ScalableTargetAction")) {
                scheduledAction.setScalableTargetAction(ScalableTargetActionJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreationTime")) {
                scheduledAction.setCreationTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scheduledAction;
    }

    private static ScheduledActionJsonUnmarshaller instance;
    public static ScheduledActionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ScheduledActionJsonUnmarshaller();
        return instance;
    }
}
