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
 * JSON marshaller for POJO ICD10CMAttribute
 */
class ICD10CMAttributeJsonMarshaller {

    public void marshall(ICD10CMAttribute iCD10CMAttribute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (iCD10CMAttribute.getType() != null) {
            String type = iCD10CMAttribute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (iCD10CMAttribute.getScore() != null) {
            Float score = iCD10CMAttribute.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (iCD10CMAttribute.getRelationshipScore() != null) {
            Float relationshipScore = iCD10CMAttribute.getRelationshipScore();
            jsonWriter.name("RelationshipScore");
            jsonWriter.value(relationshipScore);
        }
        if (iCD10CMAttribute.getId() != null) {
            Integer id = iCD10CMAttribute.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (iCD10CMAttribute.getBeginOffset() != null) {
            Integer beginOffset = iCD10CMAttribute.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (iCD10CMAttribute.getEndOffset() != null) {
            Integer endOffset = iCD10CMAttribute.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        if (iCD10CMAttribute.getText() != null) {
            String text = iCD10CMAttribute.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (iCD10CMAttribute.getTraits() != null) {
            java.util.List<ICD10CMTrait> traits = iCD10CMAttribute.getTraits();
            jsonWriter.name("Traits");
            jsonWriter.beginArray();
            for (ICD10CMTrait traitsItem : traits) {
                if (traitsItem != null) {
                    ICD10CMTraitJsonMarshaller.getInstance().marshall(traitsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ICD10CMAttributeJsonMarshaller instance;

    public static ICD10CMAttributeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ICD10CMAttributeJsonMarshaller();
        return instance;
    }
}
