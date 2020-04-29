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
 * JSON marshaller for POJO Rule
 */
class RuleJsonMarshaller {

    public void marshall(Rule rule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rule.getRuleId() != null) {
            String ruleId = rule.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (rule.getName() != null) {
            String name = rule.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (rule.getMetricName() != null) {
            String metricName = rule.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        if (rule.getPredicates() != null) {
            java.util.List<Predicate> predicates = rule.getPredicates();
            jsonWriter.name("Predicates");
            jsonWriter.beginArray();
            for (Predicate predicatesItem : predicates) {
                if (predicatesItem != null) {
                    PredicateJsonMarshaller.getInstance().marshall(predicatesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RuleJsonMarshaller instance;

    public static RuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonMarshaller();
        return instance;
    }
}
