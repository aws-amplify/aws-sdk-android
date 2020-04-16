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
 * JSON marshaller for POJO S3EncryptionSettings
 */
class S3EncryptionSettingsJsonMarshaller {

    public void marshall(S3EncryptionSettings s3EncryptionSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (s3EncryptionSettings.getEncryptionType() != null) {
            String encryptionType = s3EncryptionSettings.getEncryptionType();
            jsonWriter.name("EncryptionType");
            jsonWriter.value(encryptionType);
        }
        if (s3EncryptionSettings.getKmsKeyArn() != null) {
            String kmsKeyArn = s3EncryptionSettings.getKmsKeyArn();
            jsonWriter.name("KmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        jsonWriter.endObject();
    }

    private static S3EncryptionSettingsJsonMarshaller instance;

    public static S3EncryptionSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3EncryptionSettingsJsonMarshaller();
        return instance;
    }
}
