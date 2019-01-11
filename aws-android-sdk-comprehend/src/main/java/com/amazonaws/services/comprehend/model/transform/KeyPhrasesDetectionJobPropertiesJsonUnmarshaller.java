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
 * JSON unmarshaller for POJO KeyPhrasesDetectionJobProperties
 */
class KeyPhrasesDetectionJobPropertiesJsonUnmarshaller implements
        Unmarshaller<KeyPhrasesDetectionJobProperties, JsonUnmarshallerContext> {

    public KeyPhrasesDetectionJobProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        KeyPhrasesDetectionJobProperties keyPhrasesDetectionJobProperties = new KeyPhrasesDetectionJobProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                keyPhrasesDetectionJobProperties.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                keyPhrasesDetectionJobProperties.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                keyPhrasesDetectionJobProperties.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                keyPhrasesDetectionJobProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                keyPhrasesDetectionJobProperties.setSubmitTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                keyPhrasesDetectionJobProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                keyPhrasesDetectionJobProperties.setInputDataConfig(InputDataConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                keyPhrasesDetectionJobProperties
                        .setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                keyPhrasesDetectionJobProperties.setLanguageCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                keyPhrasesDetectionJobProperties.setDataAccessRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return keyPhrasesDetectionJobProperties;
    }

    private static KeyPhrasesDetectionJobPropertiesJsonUnmarshaller instance;

    public static KeyPhrasesDetectionJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyPhrasesDetectionJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
