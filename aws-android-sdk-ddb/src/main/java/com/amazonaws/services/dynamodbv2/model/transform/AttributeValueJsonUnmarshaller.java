/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AttributeValue
 */
class AttributeValueJsonUnmarshaller implements
        Unmarshaller<AttributeValue, JsonUnmarshallerContext> {

    public AttributeValue unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AttributeValue attributeValue = new AttributeValue();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S")) {
                attributeValue.setS(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("N")) {
                attributeValue.setN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("B")) {
                attributeValue.setB(ByteBufferJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SS")) {
                attributeValue.setSS(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NS")) {
                attributeValue.setNS(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BS")) {
                attributeValue.setBS(new ListUnmarshaller<java.nio.ByteBuffer>(
                        ByteBufferJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("M")) {
                attributeValue.setM(new MapUnmarshaller<AttributeValue>(
                        AttributeValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("L")) {
                attributeValue.setL(new ListUnmarshaller<AttributeValue>(
                        AttributeValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NULL")) {
                attributeValue.setNULL(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BOOL")) {
                attributeValue.setBOOL(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attributeValue;
    }

    private static AttributeValueJsonUnmarshaller instance;

    public static AttributeValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttributeValueJsonUnmarshaller();
        return instance;
    }
}
