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
 * JSON marshaller for POJO StartTechnicalCueDetectionFilter
 */
class StartTechnicalCueDetectionFilterJsonMarshaller {

    public void marshall(StartTechnicalCueDetectionFilter startTechnicalCueDetectionFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (startTechnicalCueDetectionFilter.getMinSegmentConfidence() != null) {
            Float minSegmentConfidence = startTechnicalCueDetectionFilter.getMinSegmentConfidence();
            jsonWriter.name("MinSegmentConfidence");
            jsonWriter.value(minSegmentConfidence);
        }
        if (startTechnicalCueDetectionFilter.getBlackFrame() != null) {
            BlackFrame blackFrame = startTechnicalCueDetectionFilter.getBlackFrame();
            jsonWriter.name("BlackFrame");
            BlackFrameJsonMarshaller.getInstance().marshall(blackFrame, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StartTechnicalCueDetectionFilterJsonMarshaller instance;

    public static StartTechnicalCueDetectionFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartTechnicalCueDetectionFilterJsonMarshaller();
        return instance;
    }
}
