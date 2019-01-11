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
 * JSON unmarshaller for POJO EntityRecognizerProperties
 */
class EntityRecognizerPropertiesJsonUnmarshaller implements
        Unmarshaller<EntityRecognizerProperties, JsonUnmarshallerContext> {

    public EntityRecognizerProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EntityRecognizerProperties entityRecognizerProperties = new EntityRecognizerProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EntityRecognizerArn")) {
                entityRecognizerProperties.setEntityRecognizerArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                entityRecognizerProperties.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                entityRecognizerProperties.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                entityRecognizerProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                entityRecognizerProperties.setSubmitTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                entityRecognizerProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingStartTime")) {
                entityRecognizerProperties.setTrainingStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingEndTime")) {
                entityRecognizerProperties.setTrainingEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                entityRecognizerProperties
                        .setInputDataConfig(EntityRecognizerInputDataConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecognizerMetadata")) {
                entityRecognizerProperties
                        .setRecognizerMetadata(EntityRecognizerMetadataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                entityRecognizerProperties.setDataAccessRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return entityRecognizerProperties;
    }

    private static EntityRecognizerPropertiesJsonUnmarshaller instance;

    public static EntityRecognizerPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerPropertiesJsonUnmarshaller();
        return instance;
    }
}
