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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GrantConstraints
 */
class GrantConstraintsJsonMarshaller {

    public void marshall(GrantConstraints grantConstraints, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (grantConstraints.getEncryptionContextSubset() != null) {
            java.util.Map<String, String> encryptionContextSubset = grantConstraints
                    .getEncryptionContextSubset();
            jsonWriter.name("EncryptionContextSubset");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> encryptionContextSubsetEntry : encryptionContextSubset
                    .entrySet()) {
                String encryptionContextSubsetValue = encryptionContextSubsetEntry.getValue();
                if (encryptionContextSubsetValue != null) {
                    jsonWriter.name(encryptionContextSubsetEntry.getKey());
                    jsonWriter.value(encryptionContextSubsetValue);
                }
            }
            jsonWriter.endObject();
        }
        if (grantConstraints.getEncryptionContextEquals() != null) {
            java.util.Map<String, String> encryptionContextEquals = grantConstraints
                    .getEncryptionContextEquals();
            jsonWriter.name("EncryptionContextEquals");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> encryptionContextEqualsEntry : encryptionContextEquals
                    .entrySet()) {
                String encryptionContextEqualsValue = encryptionContextEqualsEntry.getValue();
                if (encryptionContextEqualsValue != null) {
                    jsonWriter.name(encryptionContextEqualsEntry.getKey());
                    jsonWriter.value(encryptionContextEqualsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static GrantConstraintsJsonMarshaller instance;

    public static GrantConstraintsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrantConstraintsJsonMarshaller();
        return instance;
    }
}
