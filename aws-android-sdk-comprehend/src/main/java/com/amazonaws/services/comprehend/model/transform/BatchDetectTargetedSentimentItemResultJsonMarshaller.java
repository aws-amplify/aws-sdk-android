/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchDetectTargetedSentimentItemResult
 */
class BatchDetectTargetedSentimentItemResultJsonMarshaller {

    public void marshall(
            BatchDetectTargetedSentimentItemResult batchDetectTargetedSentimentItemResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchDetectTargetedSentimentItemResult.getIndex() != null) {
            Integer index = batchDetectTargetedSentimentItemResult.getIndex();
            jsonWriter.name("Index");
            jsonWriter.value(index);
        }
        if (batchDetectTargetedSentimentItemResult.getEntities() != null) {
            java.util.List<TargetedSentimentEntity> entities = batchDetectTargetedSentimentItemResult
                    .getEntities();
            jsonWriter.name("Entities");
            jsonWriter.beginArray();
            for (TargetedSentimentEntity entitiesItem : entities) {
                if (entitiesItem != null) {
                    TargetedSentimentEntityJsonMarshaller.getInstance().marshall(entitiesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BatchDetectTargetedSentimentItemResultJsonMarshaller instance;

    public static BatchDetectTargetedSentimentItemResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchDetectTargetedSentimentItemResultJsonMarshaller();
        return instance;
    }
}
