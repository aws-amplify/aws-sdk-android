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
 * JSON unmarshaller for POJO AuthResult
 */
class AuthResultJsonUnmarshaller implements Unmarshaller<AuthResult, JsonUnmarshallerContext> {

    public AuthResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuthResult authResult = new AuthResult();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("authInfo")) {
                authResult.setAuthInfo(AuthInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("allowed")) {
                authResult.setAllowed(AllowedJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("denied")) {
                authResult.setDenied(DeniedJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authDecision")) {
                authResult.setAuthDecision(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("missingContextValues")) {
                authResult.setMissingContextValues(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return authResult;
    }

    private static AuthResultJsonUnmarshaller instance;

    public static AuthResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthResultJsonUnmarshaller();
        return instance;
    }
}
