/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO TargetedSentimentDetectionJobProperties
 */
class TargetedSentimentDetectionJobPropertiesJsonUnmarshaller implements
        Unmarshaller<TargetedSentimentDetectionJobProperties, JsonUnmarshallerContext> {

    public TargetedSentimentDetectionJobProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties = new TargetedSentimentDetectionJobProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                targetedSentimentDetectionJobProperties.setJobId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobArn")) {
                targetedSentimentDetectionJobProperties.setJobArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                targetedSentimentDetectionJobProperties.setJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                targetedSentimentDetectionJobProperties.setJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                targetedSentimentDetectionJobProperties.setMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                targetedSentimentDetectionJobProperties.setSubmitTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                targetedSentimentDetectionJobProperties.setEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                targetedSentimentDetectionJobProperties
                        .setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                targetedSentimentDetectionJobProperties
                        .setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                targetedSentimentDetectionJobProperties.setLanguageCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                targetedSentimentDetectionJobProperties.setDataAccessRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeKmsKeyId")) {
                targetedSentimentDetectionJobProperties.setVolumeKmsKeyId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcConfig")) {
                targetedSentimentDetectionJobProperties.setVpcConfig(VpcConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return targetedSentimentDetectionJobProperties;
    }

    private static TargetedSentimentDetectionJobPropertiesJsonUnmarshaller instance;

    public static TargetedSentimentDetectionJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetedSentimentDetectionJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
