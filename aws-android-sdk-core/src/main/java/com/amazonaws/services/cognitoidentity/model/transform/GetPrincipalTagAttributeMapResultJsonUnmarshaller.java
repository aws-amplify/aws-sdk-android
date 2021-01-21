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
 * JSON unmarshaller for response GetPrincipalTagAttributeMapResult
 */
public class GetPrincipalTagAttributeMapResultJsonUnmarshaller implements
        Unmarshaller<GetPrincipalTagAttributeMapResult, JsonUnmarshallerContext> {

    public GetPrincipalTagAttributeMapResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetPrincipalTagAttributeMapResult getPrincipalTagAttributeMapResult = new GetPrincipalTagAttributeMapResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IdentityPoolId")) {
                getPrincipalTagAttributeMapResult.setIdentityPoolId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentityProviderName")) {
                getPrincipalTagAttributeMapResult.setIdentityProviderName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UseDefaults")) {
                getPrincipalTagAttributeMapResult.setUseDefaults(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrincipalTags")) {
                getPrincipalTagAttributeMapResult.setPrincipalTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getPrincipalTagAttributeMapResult;
    }

    private static GetPrincipalTagAttributeMapResultJsonUnmarshaller instance;

    public static GetPrincipalTagAttributeMapResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPrincipalTagAttributeMapResultJsonUnmarshaller();
        return instance;
    }
}
