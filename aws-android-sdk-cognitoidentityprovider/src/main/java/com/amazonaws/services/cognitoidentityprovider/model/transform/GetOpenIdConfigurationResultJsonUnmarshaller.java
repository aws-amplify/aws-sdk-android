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
 * JSON unmarshaller for response GetOpenIdConfigurationResult
 */
public class GetOpenIdConfigurationResultJsonUnmarshaller implements
        Unmarshaller<GetOpenIdConfigurationResult, JsonUnmarshallerContext> {

    public GetOpenIdConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetOpenIdConfigurationResult getOpenIdConfigurationResult = new GetOpenIdConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("issuer")) {
                getOpenIdConfigurationResult.setIssuer(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jwks_uri")) {
                getOpenIdConfigurationResult.setJwks_uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("authorization_endpoint")) {
                getOpenIdConfigurationResult.setAuthorization_endpoint(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("subject_types_supported")) {
                getOpenIdConfigurationResult
                        .setSubject_types_supported(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("response_types_supported")) {
                getOpenIdConfigurationResult
                        .setResponse_types_supported(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("id_token_signing_alg_values_supported")) {
                getOpenIdConfigurationResult
                        .setId_token_signing_alg_values_supported(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getOpenIdConfigurationResult;
    }

    private static GetOpenIdConfigurationResultJsonUnmarshaller instance;

    public static GetOpenIdConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetOpenIdConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
