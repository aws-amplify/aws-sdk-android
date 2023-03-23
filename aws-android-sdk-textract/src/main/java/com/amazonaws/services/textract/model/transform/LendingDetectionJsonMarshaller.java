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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LendingDetection
 */
class LendingDetectionJsonMarshaller {

    public void marshall(LendingDetection lendingDetection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lendingDetection.getText() != null) {
            String text = lendingDetection.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (lendingDetection.getSelectionStatus() != null) {
            String selectionStatus = lendingDetection.getSelectionStatus();
            jsonWriter.name("SelectionStatus");
            jsonWriter.value(selectionStatus);
        }
        if (lendingDetection.getGeometry() != null) {
            Geometry geometry = lendingDetection.getGeometry();
            jsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        if (lendingDetection.getConfidence() != null) {
            Float confidence = lendingDetection.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        jsonWriter.endObject();
    }

    private static LendingDetectionJsonMarshaller instance;

    public static LendingDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LendingDetectionJsonMarshaller();
        return instance;
    }
}
