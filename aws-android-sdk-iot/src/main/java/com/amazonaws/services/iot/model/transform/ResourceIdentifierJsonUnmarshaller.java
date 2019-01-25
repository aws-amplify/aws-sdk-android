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
 * JSON unmarshaller for POJO ResourceIdentifier
 */
class ResourceIdentifierJsonUnmarshaller implements
        Unmarshaller<ResourceIdentifier, JsonUnmarshallerContext> {

    public ResourceIdentifier unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResourceIdentifier resourceIdentifier = new ResourceIdentifier();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("deviceCertificateId")) {
                resourceIdentifier.setDeviceCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("caCertificateId")) {
                resourceIdentifier.setCaCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cognitoIdentityPoolId")) {
                resourceIdentifier.setCognitoIdentityPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("clientId")) {
                resourceIdentifier.setClientId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("policyVersionIdentifier")) {
                resourceIdentifier
                        .setPolicyVersionIdentifier(PolicyVersionIdentifierJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("account")) {
                resourceIdentifier.setAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resourceIdentifier;
    }

    private static ResourceIdentifierJsonUnmarshaller instance;

    public static ResourceIdentifierJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceIdentifierJsonUnmarshaller();
        return instance;
    }
}
