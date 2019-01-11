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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClassifierMetadata
 */
class ClassifierMetadataJsonMarshaller {

    public void marshall(ClassifierMetadata classifierMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (classifierMetadata.getNumberOfLabels() != null) {
            Integer numberOfLabels = classifierMetadata.getNumberOfLabels();
            jsonWriter.name("NumberOfLabels");
            jsonWriter.value(numberOfLabels);
        }
        if (classifierMetadata.getNumberOfTrainedDocuments() != null) {
            Integer numberOfTrainedDocuments = classifierMetadata.getNumberOfTrainedDocuments();
            jsonWriter.name("NumberOfTrainedDocuments");
            jsonWriter.value(numberOfTrainedDocuments);
        }
        if (classifierMetadata.getNumberOfTestDocuments() != null) {
            Integer numberOfTestDocuments = classifierMetadata.getNumberOfTestDocuments();
            jsonWriter.name("NumberOfTestDocuments");
            jsonWriter.value(numberOfTestDocuments);
        }
        if (classifierMetadata.getEvaluationMetrics() != null) {
            ClassifierEvaluationMetrics evaluationMetrics = classifierMetadata
                    .getEvaluationMetrics();
            jsonWriter.name("EvaluationMetrics");
            ClassifierEvaluationMetricsJsonMarshaller.getInstance().marshall(evaluationMetrics,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClassifierMetadataJsonMarshaller instance;

    public static ClassifierMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassifierMetadataJsonMarshaller();
        return instance;
    }
}
