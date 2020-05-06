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
 * JSON marshaller for POJO Attribute
 */
class AttributeJsonMarshaller {

    public void marshall(Attribute attribute, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attribute.getType() != null) {
            String type = attribute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (attribute.getScore() != null) {
            Float score = attribute.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (attribute.getRelationshipScore() != null) {
            Float relationshipScore = attribute.getRelationshipScore();
            jsonWriter.name("RelationshipScore");
            jsonWriter.value(relationshipScore);
        }
        if (attribute.getRelationshipType() != null) {
            String relationshipType = attribute.getRelationshipType();
            jsonWriter.name("RelationshipType");
            jsonWriter.value(relationshipType);
        }
        if (attribute.getId() != null) {
            Integer id = attribute.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (attribute.getBeginOffset() != null) {
            Integer beginOffset = attribute.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (attribute.getEndOffset() != null) {
            Integer endOffset = attribute.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (attribute.getText() != null) {
            String text = attribute.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (attribute.getCategory() != null) {
            String category = attribute.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (attribute.getTraits() != null) {
            java.util.List<Trait> traits = attribute.getTraits();
            jsonWriter.name("Traits");
            jsonWriter.beginArray();
            for (Trait traitsItem : traits) {
                if (traitsItem != null) {
                    TraitJsonMarshaller.getInstance().marshall(traitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AttributeJsonMarshaller instance;

    public static AttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeJsonMarshaller();
        return instance;
    }
}
