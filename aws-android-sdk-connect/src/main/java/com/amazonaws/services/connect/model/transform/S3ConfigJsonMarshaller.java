/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Config
 */
class S3ConfigJsonMarshaller {

    public void marshall(S3Config s3Config, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Config.getBucketName() != null) {
            String bucketName = s3Config.getBucketName();
            jsonWriter.name("BucketName");
            jsonWriter.value(bucketName);
        }
        if (s3Config.getBucketPrefix() != null) {
            String bucketPrefix = s3Config.getBucketPrefix();
            jsonWriter.name("BucketPrefix");
            jsonWriter.value(bucketPrefix);
        }
        if (s3Config.getEncryptionConfig() != null) {
            EncryptionConfig encryptionConfig = s3Config.getEncryptionConfig();
            jsonWriter.name("EncryptionConfig");
            EncryptionConfigJsonMarshaller.getInstance().marshall(encryptionConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3ConfigJsonMarshaller instance;

    public static S3ConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ConfigJsonMarshaller();
        return instance;
    }
}
