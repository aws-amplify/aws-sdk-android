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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CostCategory
 */
class CostCategoryJsonMarshaller {

    public void marshall(CostCategory costCategory, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (costCategory.getCostCategoryArn() != null) {
            String costCategoryArn = costCategory.getCostCategoryArn();
            jsonWriter.name("CostCategoryArn");
            jsonWriter.value(costCategoryArn);
        }
        if (costCategory.getEffectiveStart() != null) {
            String effectiveStart = costCategory.getEffectiveStart();
            jsonWriter.name("EffectiveStart");
            jsonWriter.value(effectiveStart);
        }
        if (costCategory.getEffectiveEnd() != null) {
            String effectiveEnd = costCategory.getEffectiveEnd();
            jsonWriter.name("EffectiveEnd");
            jsonWriter.value(effectiveEnd);
        }
        if (costCategory.getName() != null) {
            String name = costCategory.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (costCategory.getRuleVersion() != null) {
            String ruleVersion = costCategory.getRuleVersion();
            jsonWriter.name("RuleVersion");
            jsonWriter.value(ruleVersion);
        }
        if (costCategory.getRules() != null) {
            java.util.List<CostCategoryRule> rules = costCategory.getRules();
            jsonWriter.name("Rules");
            jsonWriter.beginArray();
            for (CostCategoryRule rulesItem : rules) {
                if (rulesItem != null) {
                    CostCategoryRuleJsonMarshaller.getInstance().marshall(rulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CostCategoryJsonMarshaller instance;

    public static CostCategoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CostCategoryJsonMarshaller();
        return instance;
    }
}
