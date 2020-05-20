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
 * JSON unmarshaller for POJO ScalingActivity
 */
class ScalingActivityJsonUnmarshaller implements Unmarshaller<ScalingActivity, JsonUnmarshallerContext> {

    public ScalingActivity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ScalingActivity scalingActivity = new ScalingActivity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActivityId")) {
                scalingActivity.setActivityId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ServiceNamespace")) {
                scalingActivity.setServiceNamespace(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResourceId")) {
                scalingActivity.setResourceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ScalableDimension")) {
                scalingActivity.setScalableDimension(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                scalingActivity.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Cause")) {
                scalingActivity.setCause(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StartTime")) {
                scalingActivity.setStartTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("EndTime")) {
                scalingActivity.setEndTime(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StatusCode")) {
                scalingActivity.setStatusCode(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                scalingActivity.setStatusMessage(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Details")) {
                scalingActivity.setDetails(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return scalingActivity;
    }

    private static ScalingActivityJsonUnmarshaller instance;
    public static ScalingActivityJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ScalingActivityJsonUnmarshaller();
        return instance;
    }
}
