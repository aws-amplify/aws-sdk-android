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
 * JSON unmarshaller for response UpdateIdentityPoolResult
 */
public class UpdateIdentityPoolResultJsonUnmarshaller implements
        Unmarshaller<UpdateIdentityPoolResult, JsonUnmarshallerContext> {

    public UpdateIdentityPoolResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateIdentityPoolResult updateIdentityPoolResult = new UpdateIdentityPoolResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IdentityPoolId")) {
                updateIdentityPoolResult.setIdentityPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentityPoolName")) {
                updateIdentityPoolResult.setIdentityPoolName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowUnauthenticatedIdentities")) {
                updateIdentityPoolResult.setAllowUnauthenticatedIdentities(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowClassicFlow")) {
                updateIdentityPoolResult.setAllowClassicFlow(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SupportedLoginProviders")) {
                updateIdentityPoolResult.setSupportedLoginProviders(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DeveloperProviderName")) {
                updateIdentityPoolResult.setDeveloperProviderName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OpenIdConnectProviderARNs")) {
                updateIdentityPoolResult.setOpenIdConnectProviderARNs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CognitoIdentityProviders")) {
                updateIdentityPoolResult
                        .setCognitoIdentityProviders(new ListUnmarshaller<CognitoIdentityProvider>(
                                CognitoIdentityProviderJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SamlProviderARNs")) {
                updateIdentityPoolResult.setSamlProviderARNs(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IdentityPoolTags")) {
                updateIdentityPoolResult.setIdentityPoolTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateIdentityPoolResult;
    }

    private static UpdateIdentityPoolResultJsonUnmarshaller instance;

    public static UpdateIdentityPoolResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateIdentityPoolResultJsonUnmarshaller();
        return instance;
    }
}
