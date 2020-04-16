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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsWafWebAclRule
 */
class AwsWafWebAclRuleJsonMarshaller {

    public void marshall(AwsWafWebAclRule awsWafWebAclRule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsWafWebAclRule.getAction() != null) {
            WafAction action = awsWafWebAclRule.getAction();
            jsonWriter.name("Action");
            WafActionJsonMarshaller.getInstance().marshall(action, jsonWriter);
        }
        if (awsWafWebAclRule.getExcludedRules() != null) {
            java.util.List<WafExcludedRule> excludedRules = awsWafWebAclRule.getExcludedRules();
            jsonWriter.name("ExcludedRules");
            jsonWriter.beginArray();
            for (WafExcludedRule excludedRulesItem : excludedRules) {
                if (excludedRulesItem != null) {
                    WafExcludedRuleJsonMarshaller.getInstance().marshall(excludedRulesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsWafWebAclRule.getOverrideAction() != null) {
            WafOverrideAction overrideAction = awsWafWebAclRule.getOverrideAction();
            jsonWriter.name("OverrideAction");
            WafOverrideActionJsonMarshaller.getInstance().marshall(overrideAction, jsonWriter);
        }
        if (awsWafWebAclRule.getPriority() != null) {
            Integer priority = awsWafWebAclRule.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (awsWafWebAclRule.getRuleId() != null) {
            String ruleId = awsWafWebAclRule.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (awsWafWebAclRule.getType() != null) {
            String type = awsWafWebAclRule.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static AwsWafWebAclRuleJsonMarshaller instance;

    public static AwsWafWebAclRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsWafWebAclRuleJsonMarshaller();
        return instance;
    }
}
