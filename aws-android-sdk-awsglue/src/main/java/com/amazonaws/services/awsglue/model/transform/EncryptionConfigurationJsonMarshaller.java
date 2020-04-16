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
 * JSON marshaller for POJO EncryptionConfiguration
 */
class EncryptionConfigurationJsonMarshaller {

    public void marshall(EncryptionConfiguration encryptionConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (encryptionConfiguration.getS3Encryption() != null) {
            java.util.List<S3Encryption> s3Encryption = encryptionConfiguration.getS3Encryption();
            jsonWriter.name("S3Encryption");
            jsonWriter.beginArray();
            for (S3Encryption s3EncryptionItem : s3Encryption) {
                if (s3EncryptionItem != null) {
                    S3EncryptionJsonMarshaller.getInstance().marshall(s3EncryptionItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (encryptionConfiguration.getCloudWatchEncryption() != null) {
            CloudWatchEncryption cloudWatchEncryption = encryptionConfiguration
                    .getCloudWatchEncryption();
            jsonWriter.name("CloudWatchEncryption");
            CloudWatchEncryptionJsonMarshaller.getInstance().marshall(cloudWatchEncryption,
                    jsonWriter);
        }
        if (encryptionConfiguration.getJobBookmarksEncryption() != null) {
            JobBookmarksEncryption jobBookmarksEncryption = encryptionConfiguration
                    .getJobBookmarksEncryption();
            jsonWriter.name("JobBookmarksEncryption");
            JobBookmarksEncryptionJsonMarshaller.getInstance().marshall(jobBookmarksEncryption,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EncryptionConfigurationJsonMarshaller instance;

    public static EncryptionConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EncryptionConfigurationJsonMarshaller();
        return instance;
    }
}
