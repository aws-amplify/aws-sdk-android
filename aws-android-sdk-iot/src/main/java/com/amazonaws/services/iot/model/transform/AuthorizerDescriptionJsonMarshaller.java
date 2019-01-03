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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuthorizerDescription
 */
class AuthorizerDescriptionJsonMarshaller {

    public void marshall(AuthorizerDescription authorizerDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (authorizerDescription.getAuthorizerName() != null) {
            String authorizerName = authorizerDescription.getAuthorizerName();
            jsonWriter.name("authorizerName");
            jsonWriter.value(authorizerName);
        }
        if (authorizerDescription.getAuthorizerArn() != null) {
            String authorizerArn = authorizerDescription.getAuthorizerArn();
            jsonWriter.name("authorizerArn");
            jsonWriter.value(authorizerArn);
        }
        if (authorizerDescription.getAuthorizerFunctionArn() != null) {
            String authorizerFunctionArn = authorizerDescription.getAuthorizerFunctionArn();
            jsonWriter.name("authorizerFunctionArn");
            jsonWriter.value(authorizerFunctionArn);
        }
        if (authorizerDescription.getTokenKeyName() != null) {
            String tokenKeyName = authorizerDescription.getTokenKeyName();
            jsonWriter.name("tokenKeyName");
            jsonWriter.value(tokenKeyName);
        }
        if (authorizerDescription.getTokenSigningPublicKeys() != null) {
            java.util.Map<String, String> tokenSigningPublicKeys = authorizerDescription
                    .getTokenSigningPublicKeys();
            jsonWriter.name("tokenSigningPublicKeys");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tokenSigningPublicKeysEntry : tokenSigningPublicKeys
                    .entrySet()) {
                String tokenSigningPublicKeysValue = tokenSigningPublicKeysEntry.getValue();
                if (tokenSigningPublicKeysValue != null) {
                    jsonWriter.name(tokenSigningPublicKeysEntry.getKey());
                    jsonWriter.value(tokenSigningPublicKeysValue);
                }
            }
            jsonWriter.endObject();
        }
        if (authorizerDescription.getStatus() != null) {
            String status = authorizerDescription.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (authorizerDescription.getCreationDate() != null) {
            java.util.Date creationDate = authorizerDescription.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (authorizerDescription.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = authorizerDescription.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        jsonWriter.endObject();
    }

    private static AuthorizerDescriptionJsonMarshaller instance;

    public static AuthorizerDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizerDescriptionJsonMarshaller();
        return instance;
    }
}
