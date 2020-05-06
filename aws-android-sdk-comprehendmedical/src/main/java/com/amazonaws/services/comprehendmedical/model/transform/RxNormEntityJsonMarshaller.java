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
 * JSON marshaller for POJO RxNormEntity
 */
class RxNormEntityJsonMarshaller {

    public void marshall(RxNormEntity rxNormEntity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rxNormEntity.getId() != null) {
            Integer id = rxNormEntity.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (rxNormEntity.getText() != null) {
            String text = rxNormEntity.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (rxNormEntity.getCategory() != null) {
            String category = rxNormEntity.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (rxNormEntity.getType() != null) {
            String type = rxNormEntity.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (rxNormEntity.getScore() != null) {
            Float score = rxNormEntity.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (rxNormEntity.getBeginOffset() != null) {
            Integer beginOffset = rxNormEntity.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (rxNormEntity.getEndOffset() != null) {
            Integer endOffset = rxNormEntity.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (rxNormEntity.getAttributes() != null) {
            java.util.List<RxNormAttribute> attributes = rxNormEntity.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginArray();
            for (RxNormAttribute attributesItem : attributes) {
                if (attributesItem != null) {
                    RxNormAttributeJsonMarshaller.getInstance()
                            .marshall(attributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (rxNormEntity.getTraits() != null) {
            java.util.List<RxNormTrait> traits = rxNormEntity.getTraits();
            jsonWriter.name("Traits");
            jsonWriter.beginArray();
            for (RxNormTrait traitsItem : traits) {
                if (traitsItem != null) {
                    RxNormTraitJsonMarshaller.getInstance().marshall(traitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (rxNormEntity.getRxNormConcepts() != null) {
            java.util.List<RxNormConcept> rxNormConcepts = rxNormEntity.getRxNormConcepts();
            jsonWriter.name("RxNormConcepts");
            jsonWriter.beginArray();
            for (RxNormConcept rxNormConceptsItem : rxNormConcepts) {
                if (rxNormConceptsItem != null) {
                    RxNormConceptJsonMarshaller.getInstance().marshall(rxNormConceptsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RxNormEntityJsonMarshaller instance;

    public static RxNormEntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RxNormEntityJsonMarshaller();
        return instance;
    }
}
