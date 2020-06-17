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
 * JSON marshaller for POJO S3Destination
 */
class S3DestinationJsonMarshaller {

    public void marshall(S3Destination s3Destination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Destination.getBucketName() != null) {
            String bucketName = s3Destination.getBucketName();
            jsonWriter.name("bucketName");
            jsonWriter.value(bucketName);
        }
        if (s3Destination.getKeyPrefix() != null) {
            String keyPrefix = s3Destination.getKeyPrefix();
            jsonWriter.name("keyPrefix");
            jsonWriter.value(keyPrefix);
        }
        if (s3Destination.getKmsKeyArn() != null) {
            String kmsKeyArn = s3Destination.getKmsKeyArn();
            jsonWriter.name("kmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        jsonWriter.endObject();
    }

    private static S3DestinationJsonMarshaller instance;

    public static S3DestinationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationJsonMarshaller();
        return instance;
    }
}
