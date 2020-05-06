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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ICD10CMEntity
 */
class ICD10CMEntityJsonUnmarshaller implements Unmarshaller<ICD10CMEntity, JsonUnmarshallerContext> {

    public ICD10CMEntity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ICD10CMEntity iCD10CMEntity = new ICD10CMEntity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                iCD10CMEntity.setId(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Text")) {
                iCD10CMEntity.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Category")) {
                iCD10CMEntity.setCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                iCD10CMEntity.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Score")) {
                iCD10CMEntity.setScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BeginOffset")) {
                iCD10CMEntity.setBeginOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndOffset")) {
                iCD10CMEntity.setEndOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                iCD10CMEntity.setAttributes(new ListUnmarshaller<ICD10CMAttribute>(
                        ICD10CMAttributeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Traits")) {
                iCD10CMEntity.setTraits(new ListUnmarshaller<ICD10CMTrait>(
                        ICD10CMTraitJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ICD10CMConcepts")) {
                iCD10CMEntity.setICD10CMConcepts(new ListUnmarshaller<ICD10CMConcept>(
                        ICD10CMConceptJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return iCD10CMEntity;
    }

    private static ICD10CMEntityJsonUnmarshaller instance;

    public static ICD10CMEntityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ICD10CMEntityJsonUnmarshaller();
        return instance;
    }
}
