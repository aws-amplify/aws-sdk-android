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
 * JSON marshaller for POJO Entity
 */
class EntityJsonMarshaller {

    public void marshall(Entity entity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entity.getId() != null) {
            Integer id = entity.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (entity.getBeginOffset() != null) {
            Integer beginOffset = entity.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (entity.getEndOffset() != null) {
            Integer endOffset = entity.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (entity.getScore() != null) {
            Float score = entity.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (entity.getText() != null) {
            String text = entity.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (entity.getCategory() != null) {
            String category = entity.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (entity.getType() != null) {
            String type = entity.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (entity.getTraits() != null) {
            java.util.List<Trait> traits = entity.getTraits();
            jsonWriter.name("Traits");
            jsonWriter.beginArray();
            for (Trait traitsItem : traits) {
                if (traitsItem != null) {
                    TraitJsonMarshaller.getInstance().marshall(traitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (entity.getAttributes() != null) {
            java.util.List<Attribute> attributes = entity.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginArray();
            for (Attribute attributesItem : attributes) {
                if (attributesItem != null) {
                    AttributeJsonMarshaller.getInstance().marshall(attributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EntityJsonMarshaller instance;

    public static EntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityJsonMarshaller();
        return instance;
    }
}
