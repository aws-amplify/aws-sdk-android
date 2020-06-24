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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ApprovalRuleTemplate
 */
class ApprovalRuleTemplateJsonUnmarshaller implements
        Unmarshaller<ApprovalRuleTemplate, JsonUnmarshallerContext> {

    public ApprovalRuleTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ApprovalRuleTemplate approvalRuleTemplate = new ApprovalRuleTemplate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("approvalRuleTemplateId")) {
                approvalRuleTemplate.setApprovalRuleTemplateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("approvalRuleTemplateName")) {
                approvalRuleTemplate.setApprovalRuleTemplateName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("approvalRuleTemplateDescription")) {
                approvalRuleTemplate.setApprovalRuleTemplateDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("approvalRuleTemplateContent")) {
                approvalRuleTemplate.setApprovalRuleTemplateContent(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ruleContentSha256")) {
                approvalRuleTemplate.setRuleContentSha256(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                approvalRuleTemplate.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                approvalRuleTemplate.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedUser")) {
                approvalRuleTemplate.setLastModifiedUser(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return approvalRuleTemplate;
    }

    private static ApprovalRuleTemplateJsonUnmarshaller instance;

    public static ApprovalRuleTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApprovalRuleTemplateJsonUnmarshaller();
        return instance;
    }
}
