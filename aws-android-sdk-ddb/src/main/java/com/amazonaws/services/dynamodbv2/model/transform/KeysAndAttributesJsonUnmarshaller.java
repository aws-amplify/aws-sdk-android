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
 * JSON unmarshaller for POJO KeysAndAttributes
 */
class KeysAndAttributesJsonUnmarshaller implements
        Unmarshaller<KeysAndAttributes, JsonUnmarshallerContext> {

    public KeysAndAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        KeysAndAttributes keysAndAttributes = new KeysAndAttributes();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Keys")) {
                keysAndAttributes
                        .setKeys(new ListUnmarshaller<java.util.Map<String, AttributeValue>>(
                                new MapUnmarshaller<AttributeValue>(AttributeValueJsonUnmarshaller
                                        .getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("AttributesToGet")) {
                keysAndAttributes.setAttributesToGet(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ConsistentRead")) {
                keysAndAttributes.setConsistentRead(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProjectionExpression")) {
                keysAndAttributes.setProjectionExpression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpressionAttributeNames")) {
                keysAndAttributes.setExpressionAttributeNames(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return keysAndAttributes;
    }

    private static KeysAndAttributesJsonUnmarshaller instance;

    public static KeysAndAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeysAndAttributesJsonUnmarshaller();
        return instance;
    }
}
