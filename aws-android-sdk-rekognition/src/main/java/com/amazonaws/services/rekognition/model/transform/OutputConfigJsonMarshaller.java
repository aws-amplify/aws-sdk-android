/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputConfig
 */
class OutputConfigJsonMarshaller {

    public void marshall(OutputConfig outputConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputConfig.getS3Bucket() != null) {
            String s3Bucket = outputConfig.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (outputConfig.getS3KeyPrefix() != null) {
            String s3KeyPrefix = outputConfig.getS3KeyPrefix();
            jsonWriter.name("S3KeyPrefix");
            jsonWriter.value(s3KeyPrefix);
        }
        jsonWriter.endObject();
    }

    private static OutputConfigJsonMarshaller instance;

    public static OutputConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputConfigJsonMarshaller();
        return instance;
    }
}
