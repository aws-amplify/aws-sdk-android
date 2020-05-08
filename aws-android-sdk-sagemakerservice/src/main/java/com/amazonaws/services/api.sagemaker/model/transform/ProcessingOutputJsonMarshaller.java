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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProcessingOutput
 */
class ProcessingOutputJsonMarshaller {

    public void marshall(ProcessingOutput processingOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingOutput.getOutputName() != null) {
            String outputName = processingOutput.getOutputName();
            jsonWriter.name("OutputName");
            jsonWriter.value(outputName);
        }
        if (processingOutput.getS3Output() != null) {
            ProcessingS3Output s3Output = processingOutput.getS3Output();
            jsonWriter.name("S3Output");
            ProcessingS3OutputJsonMarshaller.getInstance().marshall(s3Output, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProcessingOutputJsonMarshaller instance;

    public static ProcessingOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingOutputJsonMarshaller();
        return instance;
    }
}
