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
 * JSON unmarshaller for POJO ICD10CMAttribute
 */
class ICD10CMAttributeJsonUnmarshaller implements
        Unmarshaller<ICD10CMAttribute, JsonUnmarshallerContext> {

    public ICD10CMAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ICD10CMAttribute iCD10CMAttribute = new ICD10CMAttribute();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                iCD10CMAttribute.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Score")) {
                iCD10CMAttribute.setScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RelationshipScore")) {
                iCD10CMAttribute.setRelationshipScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                iCD10CMAttribute.setId(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BeginOffset")) {
                iCD10CMAttribute.setBeginOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndOffset")) {
                iCD10CMAttribute.setEndOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Text")) {
                iCD10CMAttribute.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Traits")) {
                iCD10CMAttribute.setTraits(new ListUnmarshaller<ICD10CMTrait>(
                        ICD10CMTraitJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return iCD10CMAttribute;
    }

    private static ICD10CMAttributeJsonUnmarshaller instance;

    public static ICD10CMAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ICD10CMAttributeJsonUnmarshaller();
        return instance;
    }
}
