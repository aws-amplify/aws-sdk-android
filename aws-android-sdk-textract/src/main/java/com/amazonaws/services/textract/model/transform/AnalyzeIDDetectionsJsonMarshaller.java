/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AnalyzeIDDetections
 */
class AnalyzeIDDetectionsJsonMarshaller {

    public void marshall(AnalyzeIDDetections analyzeIDDetections, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (analyzeIDDetections.getText() != null) {
            String text = analyzeIDDetections.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (analyzeIDDetections.getNormalizedValue() != null) {
            NormalizedValue normalizedValue = analyzeIDDetections.getNormalizedValue();
            jsonWriter.name("NormalizedValue");
            NormalizedValueJsonMarshaller.getInstance().marshall(normalizedValue, jsonWriter);
        }
        if (analyzeIDDetections.getConfidence() != null) {
            Float confidence = analyzeIDDetections.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        jsonWriter.endObject();
    }

    private static AnalyzeIDDetectionsJsonMarshaller instance;

    public static AnalyzeIDDetectionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyzeIDDetectionsJsonMarshaller();
        return instance;
    }
}
