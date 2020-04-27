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
 * JSON marshaller for POJO ProcessingS3Output
 */
class ProcessingS3OutputJsonMarshaller {

    public void marshall(ProcessingS3Output processingS3Output, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingS3Output.getS3Uri() != null) {
            String s3Uri = processingS3Output.getS3Uri();
            jsonWriter.name("S3Uri");
            jsonWriter.value(s3Uri);
        }
        if (processingS3Output.getLocalPath() != null) {
            String localPath = processingS3Output.getLocalPath();
            jsonWriter.name("LocalPath");
            jsonWriter.value(localPath);
        }
        if (processingS3Output.getS3UploadMode() != null) {
            String s3UploadMode = processingS3Output.getS3UploadMode();
            jsonWriter.name("S3UploadMode");
            jsonWriter.value(s3UploadMode);
        }
        jsonWriter.endObject();
    }

    private static ProcessingS3OutputJsonMarshaller instance;

    public static ProcessingS3OutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingS3OutputJsonMarshaller();
        return instance;
    }
}
