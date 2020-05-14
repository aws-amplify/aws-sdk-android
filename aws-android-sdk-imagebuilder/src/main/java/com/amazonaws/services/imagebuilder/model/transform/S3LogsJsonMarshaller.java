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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3Logs
 */
class S3LogsJsonMarshaller {

    public void marshall(S3Logs s3Logs, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3Logs.getS3BucketName() != null) {
            String s3BucketName = s3Logs.getS3BucketName();
            jsonWriter.name("s3BucketName");
            jsonWriter.value(s3BucketName);
        }
        if (s3Logs.getS3KeyPrefix() != null) {
            String s3KeyPrefix = s3Logs.getS3KeyPrefix();
            jsonWriter.name("s3KeyPrefix");
            jsonWriter.value(s3KeyPrefix);
        }
        jsonWriter.endObject();
    }

    private static S3LogsJsonMarshaller instance;

    public static S3LogsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3LogsJsonMarshaller();
        return instance;
    }
}
