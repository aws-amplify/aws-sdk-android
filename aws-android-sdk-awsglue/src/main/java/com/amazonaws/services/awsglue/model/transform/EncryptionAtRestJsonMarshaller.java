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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EncryptionAtRest
 */
class EncryptionAtRestJsonMarshaller {

    public void marshall(EncryptionAtRest encryptionAtRest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (encryptionAtRest.getCatalogEncryptionMode() != null) {
            String catalogEncryptionMode = encryptionAtRest.getCatalogEncryptionMode();
            jsonWriter.name("CatalogEncryptionMode");
            jsonWriter.value(catalogEncryptionMode);
        }
        if (encryptionAtRest.getSseAwsKmsKeyId() != null) {
            String sseAwsKmsKeyId = encryptionAtRest.getSseAwsKmsKeyId();
            jsonWriter.name("SseAwsKmsKeyId");
            jsonWriter.value(sseAwsKmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static EncryptionAtRestJsonMarshaller instance;

    public static EncryptionAtRestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EncryptionAtRestJsonMarshaller();
        return instance;
    }
}
