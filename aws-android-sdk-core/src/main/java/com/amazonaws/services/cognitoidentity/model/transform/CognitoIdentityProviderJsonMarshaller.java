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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CognitoIdentityProvider
 */
class CognitoIdentityProviderJsonMarshaller {

    public void marshall(CognitoIdentityProvider cognitoIdentityProvider, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cognitoIdentityProvider.getProviderName() != null) {
            String providerName = cognitoIdentityProvider.getProviderName();
            jsonWriter.name("ProviderName");
            jsonWriter.value(providerName);
        }
        if (cognitoIdentityProvider.getClientId() != null) {
            String clientId = cognitoIdentityProvider.getClientId();
            jsonWriter.name("ClientId");
            jsonWriter.value(clientId);
        }
        if (cognitoIdentityProvider.getServerSideTokenCheck() != null) {
            Boolean serverSideTokenCheck = cognitoIdentityProvider.getServerSideTokenCheck();
            jsonWriter.name("ServerSideTokenCheck");
            jsonWriter.value(serverSideTokenCheck);
        }
        jsonWriter.endObject();
    }

    private static CognitoIdentityProviderJsonMarshaller instance;

    public static CognitoIdentityProviderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CognitoIdentityProviderJsonMarshaller();
        return instance;
    }
}
