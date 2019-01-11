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
 * JSON marshaller for POJO EntityRecognizerMetadata
 */
class EntityRecognizerMetadataJsonMarshaller {

    public void marshall(EntityRecognizerMetadata entityRecognizerMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (entityRecognizerMetadata.getNumberOfTrainedDocuments() != null) {
            Integer numberOfTrainedDocuments = entityRecognizerMetadata
                    .getNumberOfTrainedDocuments();
            jsonWriter.name("NumberOfTrainedDocuments");
            jsonWriter.value(numberOfTrainedDocuments);
        }
        if (entityRecognizerMetadata.getNumberOfTestDocuments() != null) {
            Integer numberOfTestDocuments = entityRecognizerMetadata.getNumberOfTestDocuments();
            jsonWriter.name("NumberOfTestDocuments");
            jsonWriter.value(numberOfTestDocuments);
        }
        if (entityRecognizerMetadata.getEvaluationMetrics() != null) {
            EntityRecognizerEvaluationMetrics evaluationMetrics = entityRecognizerMetadata
                    .getEvaluationMetrics();
            jsonWriter.name("EvaluationMetrics");
            EntityRecognizerEvaluationMetricsJsonMarshaller.getInstance().marshall(
                    evaluationMetrics, jsonWriter);
        }
        if (entityRecognizerMetadata.getEntityTypes() != null) {
            java.util.List<EntityRecognizerMetadataEntityTypesListItem> entityTypes = entityRecognizerMetadata
                    .getEntityTypes();
            jsonWriter.name("EntityTypes");
            jsonWriter.beginArray();
            for (EntityRecognizerMetadataEntityTypesListItem entityTypesItem : entityTypes) {
                if (entityTypesItem != null) {
                    EntityRecognizerMetadataEntityTypesListItemJsonMarshaller.getInstance()
                            .marshall(entityTypesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EntityRecognizerMetadataJsonMarshaller instance;

    public static EntityRecognizerMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerMetadataJsonMarshaller();
        return instance;
    }
}
