/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TopicsDetectionJobProperties
 */
class TopicsDetectionJobPropertiesJsonUnmarshaller implements
        Unmarshaller<TopicsDetectionJobProperties, JsonUnmarshallerContext> {

    public TopicsDetectionJobProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TopicsDetectionJobProperties topicsDetectionJobProperties = new TopicsDetectionJobProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                topicsDetectionJobProperties.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                topicsDetectionJobProperties.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                topicsDetectionJobProperties.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                topicsDetectionJobProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                topicsDetectionJobProperties.setSubmitTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                topicsDetectionJobProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                topicsDetectionJobProperties.setInputDataConfig(InputDataConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                topicsDetectionJobProperties.setOutputDataConfig(OutputDataConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfTopics")) {
                topicsDetectionJobProperties.setNumberOfTopics(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return topicsDetectionJobProperties;
    }

    private static TopicsDetectionJobPropertiesJsonUnmarshaller instance;

    public static TopicsDetectionJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicsDetectionJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
