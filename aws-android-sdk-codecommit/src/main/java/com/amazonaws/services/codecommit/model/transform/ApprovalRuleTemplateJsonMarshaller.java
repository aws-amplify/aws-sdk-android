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
 * JSON marshaller for POJO ApprovalRuleTemplate
 */
class ApprovalRuleTemplateJsonMarshaller {

    public void marshall(ApprovalRuleTemplate approvalRuleTemplate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (approvalRuleTemplate.getApprovalRuleTemplateId() != null) {
            String approvalRuleTemplateId = approvalRuleTemplate.getApprovalRuleTemplateId();
            jsonWriter.name("approvalRuleTemplateId");
            jsonWriter.value(approvalRuleTemplateId);
        }
        if (approvalRuleTemplate.getApprovalRuleTemplateName() != null) {
            String approvalRuleTemplateName = approvalRuleTemplate.getApprovalRuleTemplateName();
            jsonWriter.name("approvalRuleTemplateName");
            jsonWriter.value(approvalRuleTemplateName);
        }
        if (approvalRuleTemplate.getApprovalRuleTemplateDescription() != null) {
            String approvalRuleTemplateDescription = approvalRuleTemplate
                    .getApprovalRuleTemplateDescription();
            jsonWriter.name("approvalRuleTemplateDescription");
            jsonWriter.value(approvalRuleTemplateDescription);
        }
        if (approvalRuleTemplate.getApprovalRuleTemplateContent() != null) {
            String approvalRuleTemplateContent = approvalRuleTemplate
                    .getApprovalRuleTemplateContent();
            jsonWriter.name("approvalRuleTemplateContent");
            jsonWriter.value(approvalRuleTemplateContent);
        }
        if (approvalRuleTemplate.getRuleContentSha256() != null) {
            String ruleContentSha256 = approvalRuleTemplate.getRuleContentSha256();
            jsonWriter.name("ruleContentSha256");
            jsonWriter.value(ruleContentSha256);
        }
        if (approvalRuleTemplate.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = approvalRuleTemplate.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (approvalRuleTemplate.getCreationDate() != null) {
            java.util.Date creationDate = approvalRuleTemplate.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (approvalRuleTemplate.getLastModifiedUser() != null) {
            String lastModifiedUser = approvalRuleTemplate.getLastModifiedUser();
            jsonWriter.name("lastModifiedUser");
            jsonWriter.value(lastModifiedUser);
        }
        jsonWriter.endObject();
    }

    private static ApprovalRuleTemplateJsonMarshaller instance;

    public static ApprovalRuleTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApprovalRuleTemplateJsonMarshaller();
        return instance;
    }
}
