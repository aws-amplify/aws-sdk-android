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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Object
 */
class S3ObjectJsonMarshaller {

    public void marshall(S3Object s3Object, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Object.getBucketArn() != null) {
            String bucketArn = s3Object.getBucketArn();
            jsonWriter.name("bucketArn");
            jsonWriter.value(bucketArn);
        }
        if (s3Object.getETag() != null) {
            String eTag = s3Object.getETag();
            jsonWriter.name("eTag");
            jsonWriter.value(eTag);
        }
        if (s3Object.getExtension() != null) {
            String extension = s3Object.getExtension();
            jsonWriter.name("extension");
            jsonWriter.value(extension);
        }
        if (s3Object.getKey() != null) {
            String key = s3Object.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (s3Object.getLastModified() != null) {
            java.util.Date lastModified = s3Object.getLastModified();
            jsonWriter.name("lastModified");
            jsonWriter.value(lastModified);
        }
        if (s3Object.getPath() != null) {
            String path = s3Object.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (s3Object.getPublicAccess() != null) {
            Boolean publicAccess = s3Object.getPublicAccess();
            jsonWriter.name("publicAccess");
            jsonWriter.value(publicAccess);
        }
        if (s3Object.getServerSideEncryption() != null) {
            ServerSideEncryption serverSideEncryption = s3Object.getServerSideEncryption();
            jsonWriter.name("serverSideEncryption");
            ServerSideEncryptionJsonMarshaller.getInstance().marshall(serverSideEncryption,
                    jsonWriter);
        }
        if (s3Object.getSize() != null) {
            Long size = s3Object.getSize();
            jsonWriter.name("size");
            jsonWriter.value(size);
        }
        if (s3Object.getStorageClass() != null) {
            String storageClass = s3Object.getStorageClass();
            jsonWriter.name("storageClass");
            jsonWriter.value(storageClass);
        }
        if (s3Object.getTags() != null) {
            java.util.List<KeyValuePair> tags = s3Object.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (KeyValuePair tagsItem : tags) {
                if (tagsItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (s3Object.getVersionId() != null) {
            String versionId = s3Object.getVersionId();
            jsonWriter.name("versionId");
            jsonWriter.value(versionId);
        }
        jsonWriter.endObject();
    }

    private static S3ObjectJsonMarshaller instance;

    public static S3ObjectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ObjectJsonMarshaller();
        return instance;
    }
}
