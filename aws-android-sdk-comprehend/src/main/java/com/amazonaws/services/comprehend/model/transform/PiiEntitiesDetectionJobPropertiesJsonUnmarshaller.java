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
 * JSON unmarshaller for POJO PiiEntitiesDetectionJobProperties
 */
class PiiEntitiesDetectionJobPropertiesJsonUnmarshaller implements
        Unmarshaller<PiiEntitiesDetectionJobProperties, JsonUnmarshallerContext> {

    public PiiEntitiesDetectionJobProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PiiEntitiesDetectionJobProperties piiEntitiesDetectionJobProperties = new PiiEntitiesDetectionJobProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                piiEntitiesDetectionJobProperties.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobArn")) {
                piiEntitiesDetectionJobProperties.setJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobName")) {
                piiEntitiesDetectionJobProperties.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                piiEntitiesDetectionJobProperties.setJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                piiEntitiesDetectionJobProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                piiEntitiesDetectionJobProperties.setSubmitTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                piiEntitiesDetectionJobProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                piiEntitiesDetectionJobProperties
                        .setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("OutputDataConfig")) {
                piiEntitiesDetectionJobProperties
                        .setOutputDataConfig(PiiOutputDataConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RedactionConfig")) {
                piiEntitiesDetectionJobProperties
                        .setRedactionConfig(RedactionConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                piiEntitiesDetectionJobProperties.setLanguageCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                piiEntitiesDetectionJobProperties.setDataAccessRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mode")) {
                piiEntitiesDetectionJobProperties.setMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return piiEntitiesDetectionJobProperties;
    }

    private static PiiEntitiesDetectionJobPropertiesJsonUnmarshaller instance;

    public static PiiEntitiesDetectionJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PiiEntitiesDetectionJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
