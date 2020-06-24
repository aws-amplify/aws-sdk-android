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
 * JSON marshaller for POJO ApprovalRuleEventMetadata
 */
class ApprovalRuleEventMetadataJsonMarshaller {

    public void marshall(ApprovalRuleEventMetadata approvalRuleEventMetadata,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (approvalRuleEventMetadata.getApprovalRuleName() != null) {
            String approvalRuleName = approvalRuleEventMetadata.getApprovalRuleName();
            jsonWriter.name("approvalRuleName");
            jsonWriter.value(approvalRuleName);
        }
        if (approvalRuleEventMetadata.getApprovalRuleId() != null) {
            String approvalRuleId = approvalRuleEventMetadata.getApprovalRuleId();
            jsonWriter.name("approvalRuleId");
            jsonWriter.value(approvalRuleId);
        }
        if (approvalRuleEventMetadata.getApprovalRuleContent() != null) {
            String approvalRuleContent = approvalRuleEventMetadata.getApprovalRuleContent();
            jsonWriter.name("approvalRuleContent");
            jsonWriter.value(approvalRuleContent);
        }
        jsonWriter.endObject();
    }

    private static ApprovalRuleEventMetadataJsonMarshaller instance;

    public static ApprovalRuleEventMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApprovalRuleEventMetadataJsonMarshaller();
        return instance;
    }
}
