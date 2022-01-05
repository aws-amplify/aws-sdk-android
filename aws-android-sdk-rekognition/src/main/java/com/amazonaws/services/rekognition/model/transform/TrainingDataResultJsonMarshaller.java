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
 * JSON marshaller for POJO TrainingDataResult
 */
class TrainingDataResultJsonMarshaller {

    public void marshall(TrainingDataResult trainingDataResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trainingDataResult.getInput() != null) {
            TrainingData input = trainingDataResult.getInput();
            jsonWriter.name("Input");
            TrainingDataJsonMarshaller.getInstance().marshall(input, jsonWriter);
        }
        if (trainingDataResult.getOutput() != null) {
            TrainingData output = trainingDataResult.getOutput();
            jsonWriter.name("Output");
            TrainingDataJsonMarshaller.getInstance().marshall(output, jsonWriter);
        }
        if (trainingDataResult.getValidation() != null) {
            ValidationData validation = trainingDataResult.getValidation();
            jsonWriter.name("Validation");
            ValidationDataJsonMarshaller.getInstance().marshall(validation, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrainingDataResultJsonMarshaller instance;

    public static TrainingDataResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrainingDataResultJsonMarshaller();
        return instance;
    }
}
