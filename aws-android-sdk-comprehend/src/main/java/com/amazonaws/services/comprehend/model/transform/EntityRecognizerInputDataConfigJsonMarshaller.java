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
 * JSON marshaller for POJO EntityRecognizerInputDataConfig
 */
class EntityRecognizerInputDataConfigJsonMarshaller {

    public void marshall(EntityRecognizerInputDataConfig entityRecognizerInputDataConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entityRecognizerInputDataConfig.getEntityTypes() != null) {
            java.util.List<EntityTypesListItem> entityTypes = entityRecognizerInputDataConfig
                    .getEntityTypes();
            jsonWriter.name("EntityTypes");
            jsonWriter.beginArray();
            for (EntityTypesListItem entityTypesItem : entityTypes) {
                if (entityTypesItem != null) {
                    EntityTypesListItemJsonMarshaller.getInstance().marshall(entityTypesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (entityRecognizerInputDataConfig.getDocuments() != null) {
            EntityRecognizerDocuments documents = entityRecognizerInputDataConfig.getDocuments();
            jsonWriter.name("Documents");
            EntityRecognizerDocumentsJsonMarshaller.getInstance().marshall(documents, jsonWriter);
        }
        if (entityRecognizerInputDataConfig.getAnnotations() != null) {
            EntityRecognizerAnnotations annotations = entityRecognizerInputDataConfig
                    .getAnnotations();
            jsonWriter.name("Annotations");
            EntityRecognizerAnnotationsJsonMarshaller.getInstance().marshall(annotations,
                    jsonWriter);
        }
        if (entityRecognizerInputDataConfig.getEntityList() != null) {
            EntityRecognizerEntityList entityList = entityRecognizerInputDataConfig.getEntityList();
            jsonWriter.name("EntityList");
            EntityRecognizerEntityListJsonMarshaller.getInstance().marshall(entityList, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EntityRecognizerInputDataConfigJsonMarshaller instance;

    public static EntityRecognizerInputDataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerInputDataConfigJsonMarshaller();
        return instance;
    }
}
