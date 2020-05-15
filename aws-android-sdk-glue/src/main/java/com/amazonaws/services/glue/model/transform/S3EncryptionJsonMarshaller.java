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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Encryption
 */
class S3EncryptionJsonMarshaller {

    public void marshall(S3Encryption s3Encryption, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Encryption.getS3EncryptionMode() != null) {
            String s3EncryptionMode = s3Encryption.getS3EncryptionMode();
            jsonWriter.name("S3EncryptionMode");
            jsonWriter.value(s3EncryptionMode);
        }
        if (s3Encryption.getKmsKeyArn() != null) {
            String kmsKeyArn = s3Encryption.getKmsKeyArn();
            jsonWriter.name("KmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        jsonWriter.endObject();
    }

    private static S3EncryptionJsonMarshaller instance;

    public static S3EncryptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3EncryptionJsonMarshaller();
        return instance;
    }
}
