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
 * JSON marshaller for POJO S3Bucket
 */
class S3BucketJsonMarshaller {

    public void marshall(S3Bucket s3Bucket, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Bucket.getArn() != null) {
            String arn = s3Bucket.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (s3Bucket.getCreatedAt() != null) {
            java.util.Date createdAt = s3Bucket.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (s3Bucket.getDefaultServerSideEncryption() != null) {
            ServerSideEncryption defaultServerSideEncryption = s3Bucket
                    .getDefaultServerSideEncryption();
            jsonWriter.name("defaultServerSideEncryption");
            ServerSideEncryptionJsonMarshaller.getInstance().marshall(defaultServerSideEncryption,
                    jsonWriter);
        }
        if (s3Bucket.getName() != null) {
            String name = s3Bucket.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (s3Bucket.getOwner() != null) {
            S3BucketOwner owner = s3Bucket.getOwner();
            jsonWriter.name("owner");
            S3BucketOwnerJsonMarshaller.getInstance().marshall(owner, jsonWriter);
        }
        if (s3Bucket.getPublicAccess() != null) {
            BucketPublicAccess publicAccess = s3Bucket.getPublicAccess();
            jsonWriter.name("publicAccess");
            BucketPublicAccessJsonMarshaller.getInstance().marshall(publicAccess, jsonWriter);
        }
        if (s3Bucket.getTags() != null) {
            java.util.List<KeyValuePair> tags = s3Bucket.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (KeyValuePair tagsItem : tags) {
                if (tagsItem != null) {
                    KeyValuePairJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static S3BucketJsonMarshaller instance;

    public static S3BucketJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3BucketJsonMarshaller();
        return instance;
    }
}
