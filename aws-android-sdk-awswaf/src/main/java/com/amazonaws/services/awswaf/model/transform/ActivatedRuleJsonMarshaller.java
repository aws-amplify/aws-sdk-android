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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ActivatedRule
 */
class ActivatedRuleJsonMarshaller {

    public void marshall(ActivatedRule activatedRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (activatedRule.getPriority() != null) {
            Integer priority = activatedRule.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (activatedRule.getRuleId() != null) {
            String ruleId = activatedRule.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (activatedRule.getAction() != null) {
            WafAction action = activatedRule.getAction();
            jsonWriter.name("Action");
            WafActionJsonMarshaller.getInstance().marshall(action, jsonWriter);
        }
        if (activatedRule.getOverrideAction() != null) {
            WafOverrideAction overrideAction = activatedRule.getOverrideAction();
            jsonWriter.name("OverrideAction");
            WafOverrideActionJsonMarshaller.getInstance().marshall(overrideAction, jsonWriter);
        }
        if (activatedRule.getType() != null) {
            String type = activatedRule.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (activatedRule.getExcludedRules() != null) {
            java.util.List<ExcludedRule> excludedRules = activatedRule.getExcludedRules();
            jsonWriter.name("ExcludedRules");
            jsonWriter.beginArray();
            for (ExcludedRule excludedRulesItem : excludedRules) {
                if (excludedRulesItem != null) {
                    ExcludedRuleJsonMarshaller.getInstance()
                            .marshall(excludedRulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ActivatedRuleJsonMarshaller instance;

    public static ActivatedRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivatedRuleJsonMarshaller();
        return instance;
    }
}
