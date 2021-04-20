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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TechnicalCueSegment
 */
class TechnicalCueSegmentJsonMarshaller {

    public void marshall(TechnicalCueSegment technicalCueSegment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (technicalCueSegment.getType() != null) {
            String type = technicalCueSegment.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (technicalCueSegment.getConfidence() != null) {
            Float confidence = technicalCueSegment.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        jsonWriter.endObject();
    }

    private static TechnicalCueSegmentJsonMarshaller instance;

    public static TechnicalCueSegmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TechnicalCueSegmentJsonMarshaller();
        return instance;
    }
}
