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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HostKeyAttributes
 */
class HostKeyAttributesJsonMarshaller {

    public void marshall(HostKeyAttributes hostKeyAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hostKeyAttributes.getAlgorithm() != null) {
            String algorithm = hostKeyAttributes.getAlgorithm();
            jsonWriter.name("algorithm");
            jsonWriter.value(algorithm);
        }
        if (hostKeyAttributes.getPublicKey() != null) {
            String publicKey = hostKeyAttributes.getPublicKey();
            jsonWriter.name("publicKey");
            jsonWriter.value(publicKey);
        }
        if (hostKeyAttributes.getWitnessedAt() != null) {
            java.util.Date witnessedAt = hostKeyAttributes.getWitnessedAt();
            jsonWriter.name("witnessedAt");
            jsonWriter.value(witnessedAt);
        }
        if (hostKeyAttributes.getFingerprintSHA1() != null) {
            String fingerprintSHA1 = hostKeyAttributes.getFingerprintSHA1();
            jsonWriter.name("fingerprintSHA1");
            jsonWriter.value(fingerprintSHA1);
        }
        if (hostKeyAttributes.getFingerprintSHA256() != null) {
            String fingerprintSHA256 = hostKeyAttributes.getFingerprintSHA256();
            jsonWriter.name("fingerprintSHA256");
            jsonWriter.value(fingerprintSHA256);
        }
        if (hostKeyAttributes.getNotValidBefore() != null) {
            java.util.Date notValidBefore = hostKeyAttributes.getNotValidBefore();
            jsonWriter.name("notValidBefore");
            jsonWriter.value(notValidBefore);
        }
        if (hostKeyAttributes.getNotValidAfter() != null) {
            java.util.Date notValidAfter = hostKeyAttributes.getNotValidAfter();
            jsonWriter.name("notValidAfter");
            jsonWriter.value(notValidAfter);
        }
        jsonWriter.endObject();
    }

    private static HostKeyAttributesJsonMarshaller instance;

    public static HostKeyAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HostKeyAttributesJsonMarshaller();
        return instance;
    }
}
