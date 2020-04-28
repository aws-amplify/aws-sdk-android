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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuthorizationData
 */
class AuthorizationDataJsonMarshaller {

    public void marshall(AuthorizationData authorizationData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (authorizationData.getAuthorizationToken() != null) {
            String authorizationToken = authorizationData.getAuthorizationToken();
            jsonWriter.name("authorizationToken");
            jsonWriter.value(authorizationToken);
        }
        if (authorizationData.getExpiresAt() != null) {
            java.util.Date expiresAt = authorizationData.getExpiresAt();
            jsonWriter.name("expiresAt");
            jsonWriter.value(expiresAt);
        }
        if (authorizationData.getProxyEndpoint() != null) {
            String proxyEndpoint = authorizationData.getProxyEndpoint();
            jsonWriter.name("proxyEndpoint");
            jsonWriter.value(proxyEndpoint);
        }
        jsonWriter.endObject();
    }

    private static AuthorizationDataJsonMarshaller instance;

    public static AuthorizationDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizationDataJsonMarshaller();
        return instance;
    }
}
