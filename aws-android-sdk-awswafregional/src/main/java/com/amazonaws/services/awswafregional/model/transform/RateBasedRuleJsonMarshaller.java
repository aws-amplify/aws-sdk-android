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

package com.amazonaws.services.awswafregional.model.transform;

import com.amazonaws.services.awswafregional.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RateBasedRule
 */
class RateBasedRuleJsonMarshaller {

    public void marshall(RateBasedRule rateBasedRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rateBasedRule.getRuleId() != null) {
            String ruleId = rateBasedRule.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (rateBasedRule.getName() != null) {
            String name = rateBasedRule.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (rateBasedRule.getMetricName() != null) {
            String metricName = rateBasedRule.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        if (rateBasedRule.getMatchPredicates() != null) {
            java.util.List<Predicate> matchPredicates = rateBasedRule.getMatchPredicates();
            jsonWriter.name("MatchPredicates");
            jsonWriter.beginArray();
            for (Predicate matchPredicatesItem : matchPredicates) {
                if (matchPredicatesItem != null) {
                    PredicateJsonMarshaller.getInstance().marshall(matchPredicatesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (rateBasedRule.getRateKey() != null) {
            String rateKey = rateBasedRule.getRateKey();
            jsonWriter.name("RateKey");
            jsonWriter.value(rateKey);
        }
        if (rateBasedRule.getRateLimit() != null) {
            Long rateLimit = rateBasedRule.getRateLimit();
            jsonWriter.name("RateLimit");
            jsonWriter.value(rateLimit);
        }
        jsonWriter.endObject();
    }

    private static RateBasedRuleJsonMarshaller instance;

    public static RateBasedRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RateBasedRuleJsonMarshaller();
        return instance;
    }
}
