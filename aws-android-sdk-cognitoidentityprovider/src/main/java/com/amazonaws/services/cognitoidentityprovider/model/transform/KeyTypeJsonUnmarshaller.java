/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO KeyType
 */
class KeyTypeJsonUnmarshaller implements Unmarshaller<KeyType, JsonUnmarshallerContext> {

    public KeyType unmarshall(JsonUnmarshallerContext context) throws Exception {
        KeyType keyType = new KeyType();
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("kty")) {
                keyType.setKty(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("alg")) {
                keyType.setAlg(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("use")) {
                keyType.setUse(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("kid")) {
                keyType.setKid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("n")) {
                keyType.setN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("e")) {
                keyType.setE(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return keyType;
    }

    private static KeyTypeJsonUnmarshaller instance;

    public static KeyTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyTypeJsonUnmarshaller();
        return instance;
    }
}
