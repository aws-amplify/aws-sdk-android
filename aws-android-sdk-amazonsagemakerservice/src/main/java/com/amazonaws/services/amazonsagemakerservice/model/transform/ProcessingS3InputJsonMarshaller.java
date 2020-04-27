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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProcessingS3Input
 */
class ProcessingS3InputJsonMarshaller {

    public void marshall(ProcessingS3Input processingS3Input, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingS3Input.getS3Uri() != null) {
            String s3Uri = processingS3Input.getS3Uri();
            jsonWriter.name("S3Uri");
            jsonWriter.value(s3Uri);
        }
        if (processingS3Input.getLocalPath() != null) {
            String localPath = processingS3Input.getLocalPath();
            jsonWriter.name("LocalPath");
            jsonWriter.value(localPath);
        }
        if (processingS3Input.getS3DataType() != null) {
            String s3DataType = processingS3Input.getS3DataType();
            jsonWriter.name("S3DataType");
            jsonWriter.value(s3DataType);
        }
        if (processingS3Input.getS3InputMode() != null) {
            String s3InputMode = processingS3Input.getS3InputMode();
            jsonWriter.name("S3InputMode");
            jsonWriter.value(s3InputMode);
        }
        if (processingS3Input.getS3DataDistributionType() != null) {
            String s3DataDistributionType = processingS3Input.getS3DataDistributionType();
            jsonWriter.name("S3DataDistributionType");
            jsonWriter.value(s3DataDistributionType);
        }
        if (processingS3Input.getS3CompressionType() != null) {
            String s3CompressionType = processingS3Input.getS3CompressionType();
            jsonWriter.name("S3CompressionType");
            jsonWriter.value(s3CompressionType);
        }
        jsonWriter.endObject();
    }

    private static ProcessingS3InputJsonMarshaller instance;

    public static ProcessingS3InputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingS3InputJsonMarshaller();
        return instance;
    }
}
