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
 * JSON marshaller for POJO BatchDetectEntitiesItemResult
 */
class BatchDetectEntitiesItemResultJsonMarshaller {

    public void marshall(BatchDetectEntitiesItemResult batchDetectEntitiesItemResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchDetectEntitiesItemResult.getIndex() != null) {
            Integer index = batchDetectEntitiesItemResult.getIndex();
            jsonWriter.name("Index");
            jsonWriter.value(index);
        }
        if (batchDetectEntitiesItemResult.getEntities() != null) {
            java.util.List<Entity> entities = batchDetectEntitiesItemResult.getEntities();
            jsonWriter.name("Entities");
            jsonWriter.beginArray();
            for (Entity entitiesItem : entities) {
                if (entitiesItem != null) {
                    EntityJsonMarshaller.getInstance().marshall(entitiesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BatchDetectEntitiesItemResultJsonMarshaller instance;

    public static BatchDetectEntitiesItemResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchDetectEntitiesItemResultJsonMarshaller();
        return instance;
    }
}
