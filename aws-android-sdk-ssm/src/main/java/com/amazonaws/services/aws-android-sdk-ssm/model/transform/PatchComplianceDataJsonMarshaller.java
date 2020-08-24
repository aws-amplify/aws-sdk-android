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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PatchComplianceData
 */
class PatchComplianceDataJsonMarshaller {

    public void marshall(PatchComplianceData patchComplianceData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patchComplianceData.getTitle() != null) {
            String title = patchComplianceData.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (patchComplianceData.getKBId() != null) {
            String kBId = patchComplianceData.getKBId();
            jsonWriter.name("KBId");
            jsonWriter.value(kBId);
        }
        if (patchComplianceData.getClassification() != null) {
            String classification = patchComplianceData.getClassification();
            jsonWriter.name("Classification");
            jsonWriter.value(classification);
        }
        if (patchComplianceData.getSeverity() != null) {
            String severity = patchComplianceData.getSeverity();
            jsonWriter.name("Severity");
            jsonWriter.value(severity);
        }
        if (patchComplianceData.getState() != null) {
            String state = patchComplianceData.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (patchComplianceData.getInstalledTime() != null) {
            java.util.Date installedTime = patchComplianceData.getInstalledTime();
            jsonWriter.name("InstalledTime");
            jsonWriter.value(installedTime);
        }
        jsonWriter.endObject();
    }

    private static PatchComplianceDataJsonMarshaller instance;
    public static PatchComplianceDataJsonMarshaller getInstance() {
        if (instance == null) instance = new PatchComplianceDataJsonMarshaller();
        return instance;
    }
}
