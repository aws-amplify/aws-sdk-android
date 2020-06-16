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

package com.amazonaws.services.qldb.model.transform;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3EncryptionConfiguration
 */
class S3EncryptionConfigurationJsonMarshaller {

    public void marshall(S3EncryptionConfiguration s3EncryptionConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3EncryptionConfiguration.getObjectEncryptionType() != null) {
            String objectEncryptionType = s3EncryptionConfiguration.getObjectEncryptionType();
            jsonWriter.name("ObjectEncryptionType");
            jsonWriter.value(objectEncryptionType);
        }
        if (s3EncryptionConfiguration.getKmsKeyArn() != null) {
            String kmsKeyArn = s3EncryptionConfiguration.getKmsKeyArn();
            jsonWriter.name("KmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        jsonWriter.endObject();
    }

    private static S3EncryptionConfigurationJsonMarshaller instance;

    public static S3EncryptionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3EncryptionConfigurationJsonMarshaller();
        return instance;
    }
}
