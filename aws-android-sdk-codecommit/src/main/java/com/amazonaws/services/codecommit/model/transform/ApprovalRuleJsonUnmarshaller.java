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
 * JSON unmarshaller for POJO ApprovalRule
 */
class ApprovalRuleJsonUnmarshaller implements Unmarshaller<ApprovalRule, JsonUnmarshallerContext> {

    public ApprovalRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ApprovalRule approvalRule = new ApprovalRule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("approvalRuleId")) {
                approvalRule.setApprovalRuleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("approvalRuleName")) {
                approvalRule.setApprovalRuleName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("approvalRuleContent")) {
                approvalRule.setApprovalRuleContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ruleContentSha256")) {
                approvalRule.setRuleContentSha256(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                approvalRule.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                approvalRule.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedUser")) {
                approvalRule.setLastModifiedUser(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("originApprovalRuleTemplate")) {
                approvalRule
                        .setOriginApprovalRuleTemplate(OriginApprovalRuleTemplateJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return approvalRule;
    }

    private static ApprovalRuleJsonUnmarshaller instance;

    public static ApprovalRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApprovalRuleJsonUnmarshaller();
        return instance;
    }
}
