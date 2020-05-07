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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Storage
 */
class S3StorageJsonMarshaller {

    public void marshall(S3Storage s3Storage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Storage.getAWSAccessKeyId() != null) {
            String aWSAccessKeyId = s3Storage.getAWSAccessKeyId();
            jsonWriter.name("AWSAccessKeyId");
            jsonWriter.value(aWSAccessKeyId);
        }
        if (s3Storage.getBucket() != null) {
            String bucket = s3Storage.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (s3Storage.getPrefix() != null) {
            String prefix = s3Storage.getPrefix();
            jsonWriter.name("Prefix");
            jsonWriter.value(prefix);
        }
        if (s3Storage.getUploadPolicy() != null) {
            java.nio.ByteBuffer uploadPolicy = s3Storage.getUploadPolicy();
            jsonWriter.name("UploadPolicy");
            jsonWriter.value(uploadPolicy);
        }
        if (s3Storage.getUploadPolicySignature() != null) {
            String uploadPolicySignature = s3Storage.getUploadPolicySignature();
            jsonWriter.name("UploadPolicySignature");
            jsonWriter.value(uploadPolicySignature);
        }
        jsonWriter.endObject();
    }

    private static S3StorageJsonMarshaller instance;

    public static S3StorageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3StorageJsonMarshaller();
        return instance;
    }
}
