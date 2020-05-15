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

package com.amazonaws.services.api.ecr.model.transform;

import com.amazonaws.services.api.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AuthorizationData
 */
class AuthorizationDataJsonUnmarshaller implements
        Unmarshaller<AuthorizationData, JsonUnmarshallerContext> {

    public AuthorizationData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuthorizationData authorizationData = new AuthorizationData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("authorizationToken")) {
                authorizationData.setAuthorizationToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("expiresAt")) {
                authorizationData.setExpiresAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("proxyEndpoint")) {
                authorizationData.setProxyEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return authorizationData;
    }

    private static AuthorizationDataJsonUnmarshaller instance;

    public static AuthorizationDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizationDataJsonUnmarshaller();
        return instance;
    }
}
