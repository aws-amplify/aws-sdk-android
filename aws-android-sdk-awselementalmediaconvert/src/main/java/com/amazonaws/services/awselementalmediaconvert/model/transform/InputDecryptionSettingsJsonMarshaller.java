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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputDecryptionSettings
 */
class InputDecryptionSettingsJsonMarshaller {

    public void marshall(InputDecryptionSettings inputDecryptionSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inputDecryptionSettings.getDecryptionMode() != null) {
            String decryptionMode = inputDecryptionSettings.getDecryptionMode();
            jsonWriter.name("DecryptionMode");
            jsonWriter.value(decryptionMode);
        }
        if (inputDecryptionSettings.getEncryptedDecryptionKey() != null) {
            String encryptedDecryptionKey = inputDecryptionSettings.getEncryptedDecryptionKey();
            jsonWriter.name("EncryptedDecryptionKey");
            jsonWriter.value(encryptedDecryptionKey);
        }
        if (inputDecryptionSettings.getInitializationVector() != null) {
            String initializationVector = inputDecryptionSettings.getInitializationVector();
            jsonWriter.name("InitializationVector");
            jsonWriter.value(initializationVector);
        }
        if (inputDecryptionSettings.getKmsKeyRegion() != null) {
            String kmsKeyRegion = inputDecryptionSettings.getKmsKeyRegion();
            jsonWriter.name("KmsKeyRegion");
            jsonWriter.value(kmsKeyRegion);
        }
        jsonWriter.endObject();
    }

    private static InputDecryptionSettingsJsonMarshaller instance;

    public static InputDecryptionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDecryptionSettingsJsonMarshaller();
        return instance;
    }
}
