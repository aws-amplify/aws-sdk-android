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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsLambdaFunctionCode
 */
class AwsLambdaFunctionCodeJsonMarshaller {

    public void marshall(AwsLambdaFunctionCode awsLambdaFunctionCode, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsLambdaFunctionCode.getS3Bucket() != null) {
            String s3Bucket = awsLambdaFunctionCode.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (awsLambdaFunctionCode.getS3Key() != null) {
            String s3Key = awsLambdaFunctionCode.getS3Key();
            jsonWriter.name("S3Key");
            jsonWriter.value(s3Key);
        }
        if (awsLambdaFunctionCode.getS3ObjectVersion() != null) {
            String s3ObjectVersion = awsLambdaFunctionCode.getS3ObjectVersion();
            jsonWriter.name("S3ObjectVersion");
            jsonWriter.value(s3ObjectVersion);
        }
        if (awsLambdaFunctionCode.getZipFile() != null) {
            String zipFile = awsLambdaFunctionCode.getZipFile();
            jsonWriter.name("ZipFile");
            jsonWriter.value(zipFile);
        }
        jsonWriter.endObject();
    }

    private static AwsLambdaFunctionCodeJsonMarshaller instance;

    public static AwsLambdaFunctionCodeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsLambdaFunctionCodeJsonMarshaller();
        return instance;
    }
}
