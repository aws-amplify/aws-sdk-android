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
 * JSON marshaller for POJO DetectionFilter
 */
class DetectionFilterJsonMarshaller {

    public void marshall(DetectionFilter detectionFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (detectionFilter.getMinConfidence() != null) {
            Float minConfidence = detectionFilter.getMinConfidence();
            jsonWriter.name("MinConfidence");
            jsonWriter.value(minConfidence);
        }
        if (detectionFilter.getMinBoundingBoxHeight() != null) {
            Float minBoundingBoxHeight = detectionFilter.getMinBoundingBoxHeight();
            jsonWriter.name("MinBoundingBoxHeight");
            jsonWriter.value(minBoundingBoxHeight);
        }
        if (detectionFilter.getMinBoundingBoxWidth() != null) {
            Float minBoundingBoxWidth = detectionFilter.getMinBoundingBoxWidth();
            jsonWriter.name("MinBoundingBoxWidth");
            jsonWriter.value(minBoundingBoxWidth);
        }
        jsonWriter.endObject();
    }

    private static DetectionFilterJsonMarshaller instance;

    public static DetectionFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectionFilterJsonMarshaller();
        return instance;
    }
}
