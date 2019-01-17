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
 * JSON unmarshaller for POJO ClassifierMetadata
 */
class ClassifierMetadataJsonUnmarshaller implements
        Unmarshaller<ClassifierMetadata, JsonUnmarshallerContext> {

    public ClassifierMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClassifierMetadata classifierMetadata = new ClassifierMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NumberOfLabels")) {
                classifierMetadata.setNumberOfLabels(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfTrainedDocuments")) {
                classifierMetadata.setNumberOfTrainedDocuments(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfTestDocuments")) {
                classifierMetadata.setNumberOfTestDocuments(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationMetrics")) {
                classifierMetadata.setEvaluationMetrics(ClassifierEvaluationMetricsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return classifierMetadata;
    }

    private static ClassifierMetadataJsonUnmarshaller instance;

    public static ClassifierMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClassifierMetadataJsonUnmarshaller();
        return instance;
    }
}
