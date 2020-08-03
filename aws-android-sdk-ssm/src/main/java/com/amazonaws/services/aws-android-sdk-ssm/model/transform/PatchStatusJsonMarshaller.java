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
 * JSON marshaller for POJO PatchStatus
 */
class PatchStatusJsonMarshaller {

    public void marshall(PatchStatus patchStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patchStatus.getDeploymentStatus() != null) {
            String deploymentStatus = patchStatus.getDeploymentStatus();
            jsonWriter.name("DeploymentStatus");
            jsonWriter.value(deploymentStatus);
        }
        if (patchStatus.getComplianceLevel() != null) {
            String complianceLevel = patchStatus.getComplianceLevel();
            jsonWriter.name("ComplianceLevel");
            jsonWriter.value(complianceLevel);
        }
        if (patchStatus.getApprovalDate() != null) {
            java.util.Date approvalDate = patchStatus.getApprovalDate();
            jsonWriter.name("ApprovalDate");
            jsonWriter.value(approvalDate);
        }
        jsonWriter.endObject();
    }

    private static PatchStatusJsonMarshaller instance;
    public static PatchStatusJsonMarshaller getInstance() {
        if (instance == null) instance = new PatchStatusJsonMarshaller();
        return instance;
    }
}
