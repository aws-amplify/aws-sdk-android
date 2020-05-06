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
 * JSON unmarshaller for POJO RxNormAttribute
 */
class RxNormAttributeJsonUnmarshaller implements
        Unmarshaller<RxNormAttribute, JsonUnmarshallerContext> {

    public RxNormAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RxNormAttribute rxNormAttribute = new RxNormAttribute();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                rxNormAttribute.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Score")) {
                rxNormAttribute.setScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RelationshipScore")) {
                rxNormAttribute.setRelationshipScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                rxNormAttribute.setId(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BeginOffset")) {
                rxNormAttribute.setBeginOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndOffset")) {
                rxNormAttribute.setEndOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Text")) {
                rxNormAttribute.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Traits")) {
                rxNormAttribute.setTraits(new ListUnmarshaller<RxNormTrait>(
                        RxNormTraitJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return rxNormAttribute;
    }

    private static RxNormAttributeJsonUnmarshaller instance;

    public static RxNormAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RxNormAttributeJsonUnmarshaller();
        return instance;
    }
}
