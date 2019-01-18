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
 * JSON unmarshaller for POJO IdentityProviderType
 */
class IdentityProviderTypeJsonUnmarshaller implements
        Unmarshaller<IdentityProviderType, JsonUnmarshallerContext> {

    public IdentityProviderType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IdentityProviderType identityProviderType = new IdentityProviderType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserPoolId")) {
                identityProviderType.setUserPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProviderName")) {
                identityProviderType.setProviderName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProviderType")) {
                identityProviderType.setProviderType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProviderDetails")) {
                identityProviderType.setProviderDetails(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AttributeMapping")) {
                identityProviderType.setAttributeMapping(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IdpIdentifiers")) {
                identityProviderType.setIdpIdentifiers(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                identityProviderType.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                identityProviderType.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return identityProviderType;
    }

    private static IdentityProviderTypeJsonUnmarshaller instance;

    public static IdentityProviderTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IdentityProviderTypeJsonUnmarshaller();
        return instance;
    }
}
