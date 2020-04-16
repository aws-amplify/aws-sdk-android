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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PatchRule
 */
class PatchRuleJsonMarshaller {

    public void marshall(PatchRule patchRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patchRule.getPatchFilterGroup() != null) {
            PatchFilterGroup patchFilterGroup = patchRule.getPatchFilterGroup();
            jsonWriter.name("PatchFilterGroup");
            PatchFilterGroupJsonMarshaller.getInstance().marshall(patchFilterGroup, jsonWriter);
        }
        if (patchRule.getComplianceLevel() != null) {
            String complianceLevel = patchRule.getComplianceLevel();
            jsonWriter.name("ComplianceLevel");
            jsonWriter.value(complianceLevel);
        }
        if (patchRule.getApproveAfterDays() != null) {
            Integer approveAfterDays = patchRule.getApproveAfterDays();
            jsonWriter.name("ApproveAfterDays");
            jsonWriter.value(approveAfterDays);
        }
        if (patchRule.getApproveUntilDate() != null) {
            String approveUntilDate = patchRule.getApproveUntilDate();
            jsonWriter.name("ApproveUntilDate");
            jsonWriter.value(approveUntilDate);
        }
        if (patchRule.getEnableNonSecurity() != null) {
            Boolean enableNonSecurity = patchRule.getEnableNonSecurity();
            jsonWriter.name("EnableNonSecurity");
            jsonWriter.value(enableNonSecurity);
        }
        jsonWriter.endObject();
    }

    private static PatchRuleJsonMarshaller instance;

    public static PatchRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchRuleJsonMarshaller();
        return instance;
    }
}
