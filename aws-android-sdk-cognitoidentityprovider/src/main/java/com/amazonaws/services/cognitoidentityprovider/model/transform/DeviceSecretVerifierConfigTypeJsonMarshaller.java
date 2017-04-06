/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO DeviceSecretVerifierConfigType
 */
class DeviceSecretVerifierConfigTypeJsonMarshaller {

    public void marshall(DeviceSecretVerifierConfigType deviceSecretVerifierConfigType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deviceSecretVerifierConfigType.getPasswordVerifier() != null) {
            String passwordVerifier = deviceSecretVerifierConfigType.getPasswordVerifier();
            jsonWriter.name("PasswordVerifier");
            jsonWriter.value(passwordVerifier);
        }
        if (deviceSecretVerifierConfigType.getSalt() != null) {
            String salt = deviceSecretVerifierConfigType.getSalt();
            jsonWriter.name("Salt");
            jsonWriter.value(salt);
        }
        jsonWriter.endObject();
    }

    private static DeviceSecretVerifierConfigTypeJsonMarshaller instance;

    public static DeviceSecretVerifierConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceSecretVerifierConfigTypeJsonMarshaller();
        return instance;
    }
}
