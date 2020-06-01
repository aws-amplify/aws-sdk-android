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
 * JSON marshaller for POJO ProcessingOutputConfig
 */
class ProcessingOutputConfigJsonMarshaller {

    public void marshall(ProcessingOutputConfig processingOutputConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingOutputConfig.getOutputs() != null) {
            java.util.List<ProcessingOutput> outputs = processingOutputConfig.getOutputs();
            jsonWriter.name("Outputs");
            jsonWriter.beginArray();
            for (ProcessingOutput outputsItem : outputs) {
                if (outputsItem != null) {
                    ProcessingOutputJsonMarshaller.getInstance().marshall(outputsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (processingOutputConfig.getKmsKeyId() != null) {
            String kmsKeyId = processingOutputConfig.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static ProcessingOutputConfigJsonMarshaller instance;

    public static ProcessingOutputConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingOutputConfigJsonMarshaller();
        return instance;
    }
}
