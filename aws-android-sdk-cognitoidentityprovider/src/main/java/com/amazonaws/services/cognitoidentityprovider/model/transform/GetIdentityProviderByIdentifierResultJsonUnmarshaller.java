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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetIdentityProviderByIdentifierResult
 */
public class GetIdentityProviderByIdentifierResultJsonUnmarshaller implements
        Unmarshaller<GetIdentityProviderByIdentifierResult, JsonUnmarshallerContext> {

    public GetIdentityProviderByIdentifierResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetIdentityProviderByIdentifierResult getIdentityProviderByIdentifierResult = new GetIdentityProviderByIdentifierResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IdentityProvider")) {
                getIdentityProviderByIdentifierResult
                        .setIdentityProvider(IdentityProviderTypeJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getIdentityProviderByIdentifierResult;
    }

    private static GetIdentityProviderByIdentifierResultJsonUnmarshaller instance;

    public static GetIdentityProviderByIdentifierResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIdentityProviderByIdentifierResultJsonUnmarshaller();
        return instance;
    }
}
