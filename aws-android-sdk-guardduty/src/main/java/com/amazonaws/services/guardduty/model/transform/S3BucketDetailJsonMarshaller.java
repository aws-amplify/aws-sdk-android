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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3BucketDetail
 */
class S3BucketDetailJsonMarshaller {

    public void marshall(S3BucketDetail s3BucketDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3BucketDetail.getArn() != null) {
            String arn = s3BucketDetail.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (s3BucketDetail.getName() != null) {
            String name = s3BucketDetail.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (s3BucketDetail.getType() != null) {
            String type = s3BucketDetail.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (s3BucketDetail.getCreatedAt() != null) {
            java.util.Date createdAt = s3BucketDetail.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (s3BucketDetail.getOwner() != null) {
            Owner owner = s3BucketDetail.getOwner();
            jsonWriter.name("Owner");
            OwnerJsonMarshaller.getInstance().marshall(owner, jsonWriter);
        }
        if (s3BucketDetail.getTags() != null) {
            java.util.List<Tag> tags = s3BucketDetail.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (s3BucketDetail.getDefaultServerSideEncryption() != null) {
            DefaultServerSideEncryption defaultServerSideEncryption = s3BucketDetail
                    .getDefaultServerSideEncryption();
            jsonWriter.name("DefaultServerSideEncryption");
            DefaultServerSideEncryptionJsonMarshaller.getInstance().marshall(
                    defaultServerSideEncryption, jsonWriter);
        }
        if (s3BucketDetail.getPublicAccess() != null) {
            PublicAccess publicAccess = s3BucketDetail.getPublicAccess();
            jsonWriter.name("PublicAccess");
            PublicAccessJsonMarshaller.getInstance().marshall(publicAccess, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3BucketDetailJsonMarshaller instance;

    public static S3BucketDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3BucketDetailJsonMarshaller();
        return instance;
    }
}
