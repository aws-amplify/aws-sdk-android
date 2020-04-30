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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DetectorModelVersionSummary
 */
class DetectorModelVersionSummaryJsonMarshaller {

    public void marshall(DetectorModelVersionSummary detectorModelVersionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detectorModelVersionSummary.getDetectorModelName() != null) {
            String detectorModelName = detectorModelVersionSummary.getDetectorModelName();
            jsonWriter.name("detectorModelName");
            jsonWriter.value(detectorModelName);
        }
        if (detectorModelVersionSummary.getDetectorModelVersion() != null) {
            String detectorModelVersion = detectorModelVersionSummary.getDetectorModelVersion();
            jsonWriter.name("detectorModelVersion");
            jsonWriter.value(detectorModelVersion);
        }
        if (detectorModelVersionSummary.getDetectorModelArn() != null) {
            String detectorModelArn = detectorModelVersionSummary.getDetectorModelArn();
            jsonWriter.name("detectorModelArn");
            jsonWriter.value(detectorModelArn);
        }
        if (detectorModelVersionSummary.getRoleArn() != null) {
            String roleArn = detectorModelVersionSummary.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (detectorModelVersionSummary.getCreationTime() != null) {
            java.util.Date creationTime = detectorModelVersionSummary.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (detectorModelVersionSummary.getLastUpdateTime() != null) {
            java.util.Date lastUpdateTime = detectorModelVersionSummary.getLastUpdateTime();
            jsonWriter.name("lastUpdateTime");
            jsonWriter.value(lastUpdateTime);
        }
        if (detectorModelVersionSummary.getStatus() != null) {
            String status = detectorModelVersionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (detectorModelVersionSummary.getEvaluationMethod() != null) {
            String evaluationMethod = detectorModelVersionSummary.getEvaluationMethod();
            jsonWriter.name("evaluationMethod");
            jsonWriter.value(evaluationMethod);
        }
        jsonWriter.endObject();
    }

    private static DetectorModelVersionSummaryJsonMarshaller instance;

    public static DetectorModelVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorModelVersionSummaryJsonMarshaller();
        return instance;
    }
}
