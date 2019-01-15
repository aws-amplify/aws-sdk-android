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
 * JSON unmarshaller for POJO SentimentDetectionJobProperties
 */
class SentimentDetectionJobPropertiesJsonUnmarshaller implements
        Unmarshaller<SentimentDetectionJobProperties, JsonUnmarshallerContext> {

    public SentimentDetectionJobProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SentimentDetectionJobProperties sentimentDetectionJobProperties = new SentimentDetectionJobProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                sentimentDetectionJobProperties.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                sentimentDetectionJobProperties.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                sentimentDetectionJobProperties.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                sentimentDetectionJobProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                sentimentDetectionJobProperties.setSubmitTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                sentimentDetectionJobProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                sentimentDetectionJobProperties.setInputDataConfig(InputDataConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                sentimentDetectionJobProperties
                        .setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                sentimentDetectionJobProperties.setLanguageCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                sentimentDetectionJobProperties.setDataAccessRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return sentimentDetectionJobProperties;
    }

    private static SentimentDetectionJobPropertiesJsonUnmarshaller instance;

    public static SentimentDetectionJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SentimentDetectionJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
