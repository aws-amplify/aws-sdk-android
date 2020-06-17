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
 * JSON marshaller for POJO ResourcesAffected
 */
class ResourcesAffectedJsonMarshaller {

    public void marshall(ResourcesAffected resourcesAffected, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourcesAffected.getS3Bucket() != null) {
            S3Bucket s3Bucket = resourcesAffected.getS3Bucket();
            jsonWriter.name("s3Bucket");
            S3BucketJsonMarshaller.getInstance().marshall(s3Bucket, jsonWriter);
        }
        if (resourcesAffected.getS3Object() != null) {
            S3Object s3Object = resourcesAffected.getS3Object();
            jsonWriter.name("s3Object");
            S3ObjectJsonMarshaller.getInstance().marshall(s3Object, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResourcesAffectedJsonMarshaller instance;

    public static ResourcesAffectedJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourcesAffectedJsonMarshaller();
        return instance;
    }
}
