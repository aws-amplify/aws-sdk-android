/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO LivenessOutputConfig
 */
class LivenessOutputConfigJsonMarshaller {

    public void marshall(LivenessOutputConfig livenessOutputConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (livenessOutputConfig.getS3Bucket() != null) {
            String s3Bucket = livenessOutputConfig.getS3Bucket();
            jsonWriter.name("S3Bucket");
            jsonWriter.value(s3Bucket);
        }
        if (livenessOutputConfig.getS3KeyPrefix() != null) {
            String s3KeyPrefix = livenessOutputConfig.getS3KeyPrefix();
            jsonWriter.name("S3KeyPrefix");
            jsonWriter.value(s3KeyPrefix);
        }
        jsonWriter.endObject();
    }

    private static LivenessOutputConfigJsonMarshaller instance;

    public static LivenessOutputConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LivenessOutputConfigJsonMarshaller();
        return instance;
    }
}
