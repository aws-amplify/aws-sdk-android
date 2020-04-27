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
 * JSON marshaller for POJO ProcessingInput
 */
class ProcessingInputJsonMarshaller {

    public void marshall(ProcessingInput processingInput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingInput.getInputName() != null) {
            String inputName = processingInput.getInputName();
            jsonWriter.name("InputName");
            jsonWriter.value(inputName);
        }
        if (processingInput.getS3Input() != null) {
            ProcessingS3Input s3Input = processingInput.getS3Input();
            jsonWriter.name("S3Input");
            ProcessingS3InputJsonMarshaller.getInstance().marshall(s3Input, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProcessingInputJsonMarshaller instance;

    public static ProcessingInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingInputJsonMarshaller();
        return instance;
    }
}
