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
 * JSON marshaller for POJO DetectorModelConfiguration
 */
class DetectorModelConfigurationJsonMarshaller {

    public void marshall(DetectorModelConfiguration detectorModelConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (detectorModelConfiguration.getDetectorModelName() != null) {
            String detectorModelName = detectorModelConfiguration.getDetectorModelName();
            jsonWriter.name("detectorModelName");
            jsonWriter.value(detectorModelName);
        }
        if (detectorModelConfiguration.getDetectorModelVersion() != null) {
            String detectorModelVersion = detectorModelConfiguration.getDetectorModelVersion();
            jsonWriter.name("detectorModelVersion");
            jsonWriter.value(detectorModelVersion);
        }
        if (detectorModelConfiguration.getDetectorModelDescription() != null) {
            String detectorModelDescription = detectorModelConfiguration
                    .getDetectorModelDescription();
            jsonWriter.name("detectorModelDescription");
            jsonWriter.value(detectorModelDescription);
        }
        if (detectorModelConfiguration.getDetectorModelArn() != null) {
            String detectorModelArn = detectorModelConfiguration.getDetectorModelArn();
            jsonWriter.name("detectorModelArn");
            jsonWriter.value(detectorModelArn);
        }
        if (detectorModelConfiguration.getRoleArn() != null) {
            String roleArn = detectorModelConfiguration.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (detectorModelConfiguration.getCreationTime() != null) {
            java.util.Date creationTime = detectorModelConfiguration.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (detectorModelConfiguration.getLastUpdateTime() != null) {
            java.util.Date lastUpdateTime = detectorModelConfiguration.getLastUpdateTime();
            jsonWriter.name("lastUpdateTime");
            jsonWriter.value(lastUpdateTime);
        }
        if (detectorModelConfiguration.getStatus() != null) {
            String status = detectorModelConfiguration.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (detectorModelConfiguration.getKey() != null) {
            String key = detectorModelConfiguration.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (detectorModelConfiguration.getEvaluationMethod() != null) {
            String evaluationMethod = detectorModelConfiguration.getEvaluationMethod();
            jsonWriter.name("evaluationMethod");
            jsonWriter.value(evaluationMethod);
        }
        jsonWriter.endObject();
    }

    private static DetectorModelConfigurationJsonMarshaller instance;

    public static DetectorModelConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorModelConfigurationJsonMarshaller();
        return instance;
    }
}
