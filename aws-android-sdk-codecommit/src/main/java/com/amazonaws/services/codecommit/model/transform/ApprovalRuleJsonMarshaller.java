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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApprovalRule
 */
class ApprovalRuleJsonMarshaller {

    public void marshall(ApprovalRule approvalRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (approvalRule.getApprovalRuleId() != null) {
            String approvalRuleId = approvalRule.getApprovalRuleId();
            jsonWriter.name("approvalRuleId");
            jsonWriter.value(approvalRuleId);
        }
        if (approvalRule.getApprovalRuleName() != null) {
            String approvalRuleName = approvalRule.getApprovalRuleName();
            jsonWriter.name("approvalRuleName");
            jsonWriter.value(approvalRuleName);
        }
        if (approvalRule.getApprovalRuleContent() != null) {
            String approvalRuleContent = approvalRule.getApprovalRuleContent();
            jsonWriter.name("approvalRuleContent");
            jsonWriter.value(approvalRuleContent);
        }
        if (approvalRule.getRuleContentSha256() != null) {
            String ruleContentSha256 = approvalRule.getRuleContentSha256();
            jsonWriter.name("ruleContentSha256");
            jsonWriter.value(ruleContentSha256);
        }
        if (approvalRule.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = approvalRule.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (approvalRule.getCreationDate() != null) {
            java.util.Date creationDate = approvalRule.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (approvalRule.getLastModifiedUser() != null) {
            String lastModifiedUser = approvalRule.getLastModifiedUser();
            jsonWriter.name("lastModifiedUser");
            jsonWriter.value(lastModifiedUser);
        }
        if (approvalRule.getOriginApprovalRuleTemplate() != null) {
            OriginApprovalRuleTemplate originApprovalRuleTemplate = approvalRule
                    .getOriginApprovalRuleTemplate();
            jsonWriter.name("originApprovalRuleTemplate");
            OriginApprovalRuleTemplateJsonMarshaller.getInstance().marshall(
                    originApprovalRuleTemplate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ApprovalRuleJsonMarshaller instance;

    public static ApprovalRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApprovalRuleJsonMarshaller();
        return instance;
    }
}
