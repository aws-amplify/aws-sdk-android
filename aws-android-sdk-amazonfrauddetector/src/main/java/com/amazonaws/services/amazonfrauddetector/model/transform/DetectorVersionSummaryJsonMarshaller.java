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
 * JSON marshaller for POJO DetectorVersionSummary
 */
class DetectorVersionSummaryJsonMarshaller {

    public void marshall(DetectorVersionSummary detectorVersionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (detectorVersionSummary.getDetectorVersionId() != null) {
            String detectorVersionId = detectorVersionSummary.getDetectorVersionId();
            jsonWriter.name("detectorVersionId");
            jsonWriter.value(detectorVersionId);
        }
        if (detectorVersionSummary.getStatus() != null) {
            String status = detectorVersionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (detectorVersionSummary.getDescription() != null) {
            String description = detectorVersionSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (detectorVersionSummary.getLastUpdatedTime() != null) {
            String lastUpdatedTime = detectorVersionSummary.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static DetectorVersionSummaryJsonMarshaller instance;

    public static DetectorVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorVersionSummaryJsonMarshaller();
        return instance;
    }
}
