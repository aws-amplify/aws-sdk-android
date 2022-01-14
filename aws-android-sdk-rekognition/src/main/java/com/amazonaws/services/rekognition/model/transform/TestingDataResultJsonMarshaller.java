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
 * JSON marshaller for POJO TestingDataResult
 */
class TestingDataResultJsonMarshaller {

    public void marshall(TestingDataResult testingDataResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (testingDataResult.getInput() != null) {
            TestingData input = testingDataResult.getInput();
            jsonWriter.name("Input");
            TestingDataJsonMarshaller.getInstance().marshall(input, jsonWriter);
        }
        if (testingDataResult.getOutput() != null) {
            TestingData output = testingDataResult.getOutput();
            jsonWriter.name("Output");
            TestingDataJsonMarshaller.getInstance().marshall(output, jsonWriter);
        }
        if (testingDataResult.getValidation() != null) {
            ValidationData validation = testingDataResult.getValidation();
            jsonWriter.name("Validation");
            ValidationDataJsonMarshaller.getInstance().marshall(validation, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TestingDataResultJsonMarshaller instance;

    public static TestingDataResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TestingDataResultJsonMarshaller();
        return instance;
    }
}
