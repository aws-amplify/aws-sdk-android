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
 * JSON marshaller for POJO UserBucket
 */
class UserBucketJsonMarshaller {

    public void marshall(UserBucket userBucket, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userBucket.getS3Bucket() != null) {
            String s3Bucket = userBucket.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (userBucket.getS3Key() != null) {
            String s3Key = userBucket.getS3Key();
            jsonWriter.name("S3Key");
            jsonWriter.value(s3Key);
        }
        jsonWriter.endObject();
    }

    private static UserBucketJsonMarshaller instance;

    public static UserBucketJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserBucketJsonMarshaller();
        return instance;
    }
}
