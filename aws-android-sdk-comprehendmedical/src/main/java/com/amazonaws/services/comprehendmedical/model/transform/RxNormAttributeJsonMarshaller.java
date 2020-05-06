/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RxNormAttribute
 */
class RxNormAttributeJsonMarshaller {

    public void marshall(RxNormAttribute rxNormAttribute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (rxNormAttribute.getType() != null) {
            String type = rxNormAttribute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (rxNormAttribute.getScore() != null) {
            Float score = rxNormAttribute.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (rxNormAttribute.getRelationshipScore() != null) {
            Float relationshipScore = rxNormAttribute.getRelationshipScore();
            jsonWriter.name("RelationshipScore");
            jsonWriter.value(relationshipScore);
        }
        if (rxNormAttribute.getId() != null) {
            Integer id = rxNormAttribute.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (rxNormAttribute.getBeginOffset() != null) {
            Integer beginOffset = rxNormAttribute.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (rxNormAttribute.getEndOffset() != null) {
            Integer endOffset = rxNormAttribute.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (rxNormAttribute.getText() != null) {
            String text = rxNormAttribute.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (rxNormAttribute.getTraits() != null) {
            java.util.List<RxNormTrait> traits = rxNormAttribute.getTraits();
            jsonWriter.name("Traits");
            jsonWriter.beginArray();
            for (RxNormTrait traitsItem : traits) {
                if (traitsItem != null) {
                    RxNormTraitJsonMarshaller.getInstance().marshall(traitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RxNormAttributeJsonMarshaller instance;

    public static RxNormAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RxNormAttributeJsonMarshaller();
        return instance;
    }
}
