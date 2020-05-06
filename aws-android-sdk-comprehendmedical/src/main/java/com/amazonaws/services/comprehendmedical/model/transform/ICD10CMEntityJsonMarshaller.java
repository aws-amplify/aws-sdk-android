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
 * JSON marshaller for POJO ICD10CMEntity
 */
class ICD10CMEntityJsonMarshaller {

    public void marshall(ICD10CMEntity iCD10CMEntity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (iCD10CMEntity.getId() != null) {
            Integer id = iCD10CMEntity.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (iCD10CMEntity.getText() != null) {
            String text = iCD10CMEntity.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (iCD10CMEntity.getCategory() != null) {
            String category = iCD10CMEntity.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (iCD10CMEntity.getType() != null) {
            String type = iCD10CMEntity.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (iCD10CMEntity.getScore() != null) {
            Float score = iCD10CMEntity.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (iCD10CMEntity.getBeginOffset() != null) {
            Integer beginOffset = iCD10CMEntity.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (iCD10CMEntity.getEndOffset() != null) {
            Integer endOffset = iCD10CMEntity.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (iCD10CMEntity.getAttributes() != null) {
            java.util.List<ICD10CMAttribute> attributes = iCD10CMEntity.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginArray();
            for (ICD10CMAttribute attributesItem : attributes) {
                if (attributesItem != null) {
                    ICD10CMAttributeJsonMarshaller.getInstance().marshall(attributesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (iCD10CMEntity.getTraits() != null) {
            java.util.List<ICD10CMTrait> traits = iCD10CMEntity.getTraits();
            jsonWriter.name("Traits");
            jsonWriter.beginArray();
            for (ICD10CMTrait traitsItem : traits) {
                if (traitsItem != null) {
                    ICD10CMTraitJsonMarshaller.getInstance().marshall(traitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (iCD10CMEntity.getICD10CMConcepts() != null) {
            java.util.List<ICD10CMConcept> iCD10CMConcepts = iCD10CMEntity.getICD10CMConcepts();
            jsonWriter.name("ICD10CMConcepts");
            jsonWriter.beginArray();
            for (ICD10CMConcept iCD10CMConceptsItem : iCD10CMConcepts) {
                if (iCD10CMConceptsItem != null) {
                    ICD10CMConceptJsonMarshaller.getInstance().marshall(iCD10CMConceptsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ICD10CMEntityJsonMarshaller instance;

    public static ICD10CMEntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ICD10CMEntityJsonMarshaller();
        return instance;
    }
}
