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
 * JSON unmarshaller for POJO DocumentClassifierProperties
 */
class DocumentClassifierPropertiesJsonUnmarshaller implements
        Unmarshaller<DocumentClassifierProperties, JsonUnmarshallerContext> {

    public DocumentClassifierProperties unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DocumentClassifierProperties documentClassifierProperties = new DocumentClassifierProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DocumentClassifierArn")) {
                documentClassifierProperties.setDocumentClassifierArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                documentClassifierProperties.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                documentClassifierProperties.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                documentClassifierProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTime")) {
                documentClassifierProperties.setSubmitTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                documentClassifierProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingStartTime")) {
                documentClassifierProperties.setTrainingStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrainingEndTime")) {
                documentClassifierProperties.setTrainingEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputDataConfig")) {
                documentClassifierProperties
                        .setInputDataConfig(DocumentClassifierInputDataConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ClassifierMetadata")) {
                documentClassifierProperties
                        .setClassifierMetadata(ClassifierMetadataJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                documentClassifierProperties.setDataAccessRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return documentClassifierProperties;
    }

    private static DocumentClassifierPropertiesJsonUnmarshaller instance;

    public static DocumentClassifierPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassifierPropertiesJsonUnmarshaller();
        return instance;
    }
}
