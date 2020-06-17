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

package com.amazonaws.services.snowball.model.transform;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Resource
 */
class S3ResourceJsonMarshaller {

    public void marshall(S3Resource s3Resource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Resource.getBucketArn() != null) {
            String bucketArn = s3Resource.getBucketArn();
            jsonWriter.name("BucketArn");
            jsonWriter.value(bucketArn);
        }
        if (s3Resource.getKeyRange() != null) {
            KeyRange keyRange = s3Resource.getKeyRange();
            jsonWriter.name("KeyRange");
            KeyRangeJsonMarshaller.getInstance().marshall(keyRange, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static S3ResourceJsonMarshaller instance;

    public static S3ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3ResourceJsonMarshaller();
        return instance;
    }
}
