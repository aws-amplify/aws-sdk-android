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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AuthorizerDescription
 */
class AuthorizerDescriptionJsonUnmarshaller implements
        Unmarshaller<AuthorizerDescription, JsonUnmarshallerContext> {

    public AuthorizerDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuthorizerDescription authorizerDescription = new AuthorizerDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("authorizerName")) {
                authorizerDescription.setAuthorizerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerArn")) {
                authorizerDescription.setAuthorizerArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorizerFunctionArn")) {
                authorizerDescription.setAuthorizerFunctionArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tokenKeyName")) {
                authorizerDescription.setTokenKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tokenSigningPublicKeys")) {
                authorizerDescription.setTokenSigningPublicKeys(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                authorizerDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                authorizerDescription.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                authorizerDescription.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return authorizerDescription;
    }

    private static AuthorizerDescriptionJsonUnmarshaller instance;

    public static AuthorizerDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizerDescriptionJsonUnmarshaller();
        return instance;
    }
}
