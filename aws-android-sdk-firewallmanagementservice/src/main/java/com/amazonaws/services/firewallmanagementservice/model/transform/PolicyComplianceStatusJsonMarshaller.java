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
 * JSON marshaller for POJO PolicyComplianceStatus
 */
class PolicyComplianceStatusJsonMarshaller {

    public void marshall(PolicyComplianceStatus policyComplianceStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (policyComplianceStatus.getPolicyOwner() != null) {
            String policyOwner = policyComplianceStatus.getPolicyOwner();
            jsonWriter.name("PolicyOwner");
            jsonWriter.value(policyOwner);
        }
        if (policyComplianceStatus.getPolicyId() != null) {
            String policyId = policyComplianceStatus.getPolicyId();
            jsonWriter.name("PolicyId");
            jsonWriter.value(policyId);
        }
        if (policyComplianceStatus.getPolicyName() != null) {
            String policyName = policyComplianceStatus.getPolicyName();
            jsonWriter.name("PolicyName");
            jsonWriter.value(policyName);
        }
        if (policyComplianceStatus.getMemberAccount() != null) {
            String memberAccount = policyComplianceStatus.getMemberAccount();
            jsonWriter.name("MemberAccount");
            jsonWriter.value(memberAccount);
        }
        if (policyComplianceStatus.getEvaluationResults() != null) {
            java.util.List<EvaluationResult> evaluationResults = policyComplianceStatus
                    .getEvaluationResults();
            jsonWriter.name("EvaluationResults");
            jsonWriter.beginArray();
            for (EvaluationResult evaluationResultsItem : evaluationResults) {
                if (evaluationResultsItem != null) {
                    EvaluationResultJsonMarshaller.getInstance().marshall(evaluationResultsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (policyComplianceStatus.getLastUpdated() != null) {
            java.util.Date lastUpdated = policyComplianceStatus.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (policyComplianceStatus.getIssueInfoMap() != null) {
            java.util.Map<String, String> issueInfoMap = policyComplianceStatus.getIssueInfoMap();
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

    private static PolicyComplianceStatusJsonMarshaller instance;

    public static PolicyComplianceStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyComplianceStatusJsonMarshaller();
        return instance;
    }
}
