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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PasswordClaimType
 */
class PasswordClaimTypeJsonMarshaller {

    public void marshall(PasswordClaimType passwordClaimType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (passwordClaimType.getSecretBlock() != null) {
            java.nio.ByteBuffer secretBlock = passwordClaimType.getSecretBlock();
            jsonWriter.name("SecretBlock");
            jsonWriter.value(secretBlock);
        }
        if (passwordClaimType.getSignature() != null) {
            java.nio.ByteBuffer signature = passwordClaimType.getSignature();
            jsonWriter.name("Signature");
            jsonWriter.value(signature);
        }
        jsonWriter.endObject();
    }

    private static PasswordClaimTypeJsonMarshaller instance;

    public static PasswordClaimTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PasswordClaimTypeJsonMarshaller();
        return instance;
    }
}
