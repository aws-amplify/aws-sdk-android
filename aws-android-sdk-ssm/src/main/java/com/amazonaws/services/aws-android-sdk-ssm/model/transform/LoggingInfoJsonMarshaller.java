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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LoggingInfo
 */
class LoggingInfoJsonMarshaller {

    public void marshall(LoggingInfo loggingInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (loggingInfo.getS3BucketName() != null) {
            String s3BucketName = loggingInfo.getS3BucketName();
            jsonWriter.name("S3BucketName");
            jsonWriter.value(s3BucketName);
        }
        if (loggingInfo.getS3KeyPrefix() != null) {
            String s3KeyPrefix = loggingInfo.getS3KeyPrefix();
            jsonWriter.name("S3KeyPrefix");
            jsonWriter.value(s3KeyPrefix);
        }
        if (loggingInfo.getS3Region() != null) {
            String s3Region = loggingInfo.getS3Region();
            jsonWriter.name("S3Region");
            jsonWriter.value(s3Region);
        }
        jsonWriter.endObject();
    }

    private static LoggingInfoJsonMarshaller instance;
    public static LoggingInfoJsonMarshaller getInstance() {
        if (instance == null) instance = new LoggingInfoJsonMarshaller();
        return instance;
    }
}
