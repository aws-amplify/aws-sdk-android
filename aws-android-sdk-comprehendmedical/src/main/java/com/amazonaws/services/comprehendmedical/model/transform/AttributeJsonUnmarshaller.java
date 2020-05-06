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
 * JSON unmarshaller for POJO Attribute
 */
class AttributeJsonUnmarshaller implements Unmarshaller<Attribute, JsonUnmarshallerContext> {

    public Attribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Attribute attribute = new Attribute();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                attribute.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Score")) {
                attribute.setScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RelationshipScore")) {
                attribute.setRelationshipScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RelationshipType")) {
                attribute.setRelationshipType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                attribute.setId(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BeginOffset")) {
                attribute.setBeginOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndOffset")) {
                attribute.setEndOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Text")) {
                attribute.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Category")) {
                attribute.setCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Traits")) {
                attribute.setTraits(new ListUnmarshaller<Trait>(TraitJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attribute;
    }

    private static AttributeJsonUnmarshaller instance;

    public static AttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttributeJsonUnmarshaller();
        return instance;
    }
}
