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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Detector
 */
class DetectorJsonMarshaller {

    public void marshall(Detector detector, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detector.getDetectorId() != null) {
            String detectorId = detector.getDetectorId();
            jsonWriter.name("detectorId");
            jsonWriter.value(detectorId);
        }
        if (detector.getDescription() != null) {
            String description = detector.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (detector.getLastUpdatedTime() != null) {
            String lastUpdatedTime = detector.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (detector.getCreatedTime() != null) {
            String createdTime = detector.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static DetectorJsonMarshaller instance;

    public static DetectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorJsonMarshaller();
        return instance;
    }
}
