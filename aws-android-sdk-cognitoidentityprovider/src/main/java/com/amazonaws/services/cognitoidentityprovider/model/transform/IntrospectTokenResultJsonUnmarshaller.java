/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response IntrospectTokenResult
 */
public class IntrospectTokenResultJsonUnmarshaller implements
        Unmarshaller<IntrospectTokenResult, JsonUnmarshallerContext> {

    public IntrospectTokenResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        IntrospectTokenResult introspectTokenResult = new IntrospectTokenResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Active")) {
                introspectTokenResult.setActive(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scope")) {
                introspectTokenResult.setScope(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientId")) {
                introspectTokenResult.setClientId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Username")) {
                introspectTokenResult.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TokenType")) {
                introspectTokenResult.setTokenType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Exp")) {
                introspectTokenResult.setExp(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Iat")) {
                introspectTokenResult.setIat(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Nbf")) {
                introspectTokenResult.setNbf(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Sub")) {
                introspectTokenResult.setSub(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Aud")) {
                introspectTokenResult.setAud(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Iss")) {
                introspectTokenResult.setIss(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Jti")) {
                introspectTokenResult.setJti(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return introspectTokenResult;
    }

    private static IntrospectTokenResultJsonUnmarshaller instance;

    public static IntrospectTokenResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IntrospectTokenResultJsonUnmarshaller();
        return instance;
    }
}
