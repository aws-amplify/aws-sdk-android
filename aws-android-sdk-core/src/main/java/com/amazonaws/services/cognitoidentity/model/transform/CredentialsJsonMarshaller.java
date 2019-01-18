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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Credentials
 */
class CredentialsJsonMarshaller {

    public void marshall(Credentials credentials, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (credentials.getAccessKeyId() != null) {
            String accessKeyId = credentials.getAccessKeyId();
            jsonWriter.name("AccessKeyId");
            jsonWriter.value(accessKeyId);
        }
        if (credentials.getSecretKey() != null) {
            String secretKey = credentials.getSecretKey();
            jsonWriter.name("SecretKey");
            jsonWriter.value(secretKey);
        }
        if (credentials.getSessionToken() != null) {
            String sessionToken = credentials.getSessionToken();
            jsonWriter.name("SessionToken");
            jsonWriter.value(sessionToken);
        }
        if (credentials.getExpiration() != null) {
            java.util.Date expiration = credentials.getExpiration();
            jsonWriter.name("Expiration");
            jsonWriter.value(expiration);
        }
        jsonWriter.endObject();
    }

    private static CredentialsJsonMarshaller instance;

    public static CredentialsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CredentialsJsonMarshaller();
        return instance;
    }
}
