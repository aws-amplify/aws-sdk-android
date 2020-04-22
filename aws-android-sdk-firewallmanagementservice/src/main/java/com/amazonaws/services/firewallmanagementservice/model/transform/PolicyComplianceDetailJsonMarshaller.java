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

package com.amazonaws.services.firewallmanagementservice.model.transform;

import com.amazonaws.services.firewallmanagementservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PolicyComplianceDetail
 */
class PolicyComplianceDetailJsonMarshaller {

    public void marshall(PolicyComplianceDetail policyComplianceDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (policyComplianceDetail.getPolicyOwner() != null) {
            String policyOwner = policyComplianceDetail.getPolicyOwner();
            jsonWriter.name("PolicyOwner");
            jsonWriter.value(policyOwner);
        }
        if (policyComplianceDetail.getPolicyId() != null) {
            String policyId = policyComplianceDetail.getPolicyId();
            jsonWriter.name("PolicyId");
            jsonWriter.value(policyId);
        }
        if (policyComplianceDetail.getMemberAccount() != null) {
            String memberAccount = policyComplianceDetail.getMemberAccount();
            jsonWriter.name("MemberAccount");
            jsonWriter.value(memberAccount);
        }
        if (policyComplianceDetail.getViolators() != null) {
            java.util.List<ComplianceViolator> violators = policyComplianceDetail.getViolators();
            jsonWriter.name("Violators");
            jsonWriter.beginArray();
            for (ComplianceViolator violatorsItem : violators) {
                if (violatorsItem != null) {
                    ComplianceViolatorJsonMarshaller.getInstance().marshall(violatorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (policyComplianceDetail.getEvaluationLimitExceeded() != null) {
            Boolean evaluationLimitExceeded = policyComplianceDetail.getEvaluationLimitExceeded();
            jsonWriter.name("EvaluationLimitExceeded");
            jsonWriter.value(evaluationLimitExceeded);
        }
        if (policyComplianceDetail.getExpiredAt() != null) {
            java.util.Date expiredAt = policyComplianceDetail.getExpiredAt();
            jsonWriter.name("ExpiredAt");
            jsonWriter.value(expiredAt);
        }
        if (policyComplianceDetail.getIssueInfoMap() != null) {
            java.util.Map<String, String> issueInfoMap = policyComplianceDetail.getIssueInfoMap();
            jsonWriter.name("IssueInfoMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> issueInfoMapEntry : issueInfoMap.entrySet()) {
                String issueInfoMapValue = issueInfoMapEntry.getValue();
                if (issueInfoMapValue != null) {
                    jsonWriter.name(issueInfoMapEntry.getKey());
                    jsonWriter.value(issueInfoMapValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static PolicyComplianceDetailJsonMarshaller instance;

    public static PolicyComplianceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyComplianceDetailJsonMarshaller();
        return instance;
    }
}
