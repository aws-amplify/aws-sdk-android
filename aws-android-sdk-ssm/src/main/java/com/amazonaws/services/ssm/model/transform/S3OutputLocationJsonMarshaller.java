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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3OutputLocation
 */
class S3OutputLocationJsonMarshaller {

    public void marshall(S3OutputLocation s3OutputLocation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (s3OutputLocation.getOutputS3Region() != null) {
            String outputS3Region = s3OutputLocation.getOutputS3Region();
            jsonWriter.name("OutputS3Region");
            jsonWriter.value(outputS3Region);
        }
        if (s3OutputLocation.getOutputS3BucketName() != null) {
            String outputS3BucketName = s3OutputLocation.getOutputS3BucketName();
            jsonWriter.name("OutputS3BucketName");
            jsonWriter.value(outputS3BucketName);
        }
        if (s3OutputLocation.getOutputS3KeyPrefix() != null) {
            String outputS3KeyPrefix = s3OutputLocation.getOutputS3KeyPrefix();
            jsonWriter.name("OutputS3KeyPrefix");
            jsonWriter.value(outputS3KeyPrefix);
        }
        jsonWriter.endObject();
    }

    private static S3OutputLocationJsonMarshaller instance;

    public static S3OutputLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3OutputLocationJsonMarshaller();
        return instance;
    }
}
