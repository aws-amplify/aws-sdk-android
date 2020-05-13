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
 * JSON marshaller for POJO BucketMetadata
 */
class BucketMetadataJsonMarshaller {

    public void marshall(BucketMetadata bucketMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bucketMetadata.getAccountId() != null) {
            String accountId = bucketMetadata.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (bucketMetadata.getBucketArn() != null) {
            String bucketArn = bucketMetadata.getBucketArn();
            jsonWriter.name("bucketArn");
            jsonWriter.value(bucketArn);
        }
        if (bucketMetadata.getBucketCreatedAt() != null) {
            java.util.Date bucketCreatedAt = bucketMetadata.getBucketCreatedAt();
            jsonWriter.name("bucketCreatedAt");
            jsonWriter.value(bucketCreatedAt);
        }
        if (bucketMetadata.getBucketName() != null) {
            String bucketName = bucketMetadata.getBucketName();
            jsonWriter.name("bucketName");
            jsonWriter.value(bucketName);
        }
        if (bucketMetadata.getClassifiableObjectCount() != null) {
            Long classifiableObjectCount = bucketMetadata.getClassifiableObjectCount();
            jsonWriter.name("classifiableObjectCount");
            jsonWriter.value(classifiableObjectCount);
        }
        if (bucketMetadata.getLastUpdated() != null) {
            java.util.Date lastUpdated = bucketMetadata.getLastUpdated();
            jsonWriter.name("lastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (bucketMetadata.getObjectCount() != null) {
            Long objectCount = bucketMetadata.getObjectCount();
            jsonWriter.name("objectCount");
            jsonWriter.value(objectCount);
        }
        if (bucketMetadata.getObjectCountByEncryptionType() != null) {
            ObjectCountByEncryptionType objectCountByEncryptionType = bucketMetadata
                    .getObjectCountByEncryptionType();
            jsonWriter.name("objectCountByEncryptionType");
            ObjectCountByEncryptionTypeJsonMarshaller.getInstance().marshall(
                    objectCountByEncryptionType, jsonWriter);
        }
        if (bucketMetadata.getPublicAccess() != null) {
            BucketPublicAccess publicAccess = bucketMetadata.getPublicAccess();
            jsonWriter.name("publicAccess");
            BucketPublicAccessJsonMarshaller.getInstance().marshall(publicAccess, jsonWriter);
        }
        if (bucketMetadata.getRegion() != null) {
            String region = bucketMetadata.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (bucketMetadata.getReplicationDetails() != null) {
            ReplicationDetails replicationDetails = bucketMetadata.getReplicationDetails();
            jsonWriter.name("replicationDetails");
            ReplicationDetailsJsonMarshaller.getInstance().marshall(replicationDetails, jsonWriter);
        }
        if (bucketMetadata.getSharedAccess() != null) {
            String sharedAccess = bucketMetadata.getSharedAccess();
            jsonWriter.name("sharedAccess");
            jsonWriter.value(sharedAccess);
        }
        if (bucketMetadata.getSizeInBytes() != null) {
            Long sizeInBytes = bucketMetadata.getSizeInBytes();
            jsonWriter.name("sizeInBytes");
            jsonWriter.value(sizeInBytes);
        }
        if (bucketMetadata.getSizeInBytesCompressed() != null) {
            Long sizeInBytesCompressed = bucketMetadata.getSizeInBytesCompressed();
            jsonWriter.name("sizeInBytesCompressed");
            jsonWriter.value(sizeInBytesCompressed);
        }
        if (bucketMetadata.getTags() != null) {
            java.util.List<KeyValuePair> tags = bucketMetadata.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (KeyValuePair tagsItem : tags) {
                if (tagsItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (bucketMetadata.getVersioning() != null) {
            Boolean versioning = bucketMetadata.getVersioning();
            jsonWriter.name("versioning");
            jsonWriter.value(versioning);
        }
        jsonWriter.endObject();
    }

    private static BucketMetadataJsonMarshaller instance;

    public static BucketMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BucketMetadataJsonMarshaller();
        return instance;
    }
}
