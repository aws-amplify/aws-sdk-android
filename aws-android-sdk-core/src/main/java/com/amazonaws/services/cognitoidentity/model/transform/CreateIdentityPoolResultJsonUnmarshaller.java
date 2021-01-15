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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateIdentityPoolResult
 */
public class CreateIdentityPoolResultJsonUnmarshaller implements
        Unmarshaller<CreateIdentityPoolResult, JsonUnmarshallerContext> {

    public CreateIdentityPoolResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIdentityPoolResult createIdentityPoolResult = new CreateIdentityPoolResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IdentityPoolId")) {
                createIdentityPoolResult.setIdentityPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentityPoolName")) {
                createIdentityPoolResult.setIdentityPoolName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowUnauthenticatedIdentities")) {
                createIdentityPoolResult.setAllowUnauthenticatedIdentities(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowClassicFlow")) {
                createIdentityPoolResult.setAllowClassicFlow(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SupportedLoginProviders")) {
                createIdentityPoolResult.setSupportedLoginProviders(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DeveloperProviderName")) {
                createIdentityPoolResult.setDeveloperProviderName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OpenIdConnectProviderARNs")) {
                createIdentityPoolResult.setOpenIdConnectProviderARNs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CognitoIdentityProviders")) {
                createIdentityPoolResult
                        .setCognitoIdentityProviders(new ListUnmarshaller<CognitoIdentityProvider>(
                                CognitoIdentityProviderJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SamlProviderARNs")) {
                createIdentityPoolResult.setSamlProviderARNs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IdentityPoolTags")) {
                createIdentityPoolResult.setIdentityPoolTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createIdentityPoolResult;
    }

    private static CreateIdentityPoolResultJsonUnmarshaller instance;

    public static CreateIdentityPoolResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIdentityPoolResultJsonUnmarshaller();
        return instance;
    }
}
