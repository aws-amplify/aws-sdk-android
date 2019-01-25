/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TextDetection
 */
class TextDetectionJsonMarshaller {

    public void marshall(TextDetection textDetection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (textDetection.getDetectedText() != null) {
            String detectedText = textDetection.getDetectedText();
            jsonWriter.name("DetectedText");
            jsonWriter.value(detectedText);
        }
        if (textDetection.getType() != null) {
            String type = textDetection.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (textDetection.getId() != null) {
            Integer id = textDetection.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (textDetection.getParentId() != null) {
            Integer parentId = textDetection.getParentId();
            jsonWriter.name("ParentId");
            jsonWriter.value(parentId);
        }
        if (textDetection.getConfidence() != null) {
            Float confidence = textDetection.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (textDetection.getGeometry() != null) {
            Geometry geometry = textDetection.getGeometry();
            jsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TextDetectionJsonMarshaller instance;

    public static TextDetectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TextDetectionJsonMarshaller();
        return instance;
    }
}
