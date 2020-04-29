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
 * JSON marshaller for POJO SubscribedRuleGroupSummary
 */
class SubscribedRuleGroupSummaryJsonMarshaller {

    public void marshall(SubscribedRuleGroupSummary subscribedRuleGroupSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (subscribedRuleGroupSummary.getRuleGroupId() != null) {
            String ruleGroupId = subscribedRuleGroupSummary.getRuleGroupId();
            jsonWriter.name("RuleGroupId");
            jsonWriter.value(ruleGroupId);
        }
        if (subscribedRuleGroupSummary.getName() != null) {
            String name = subscribedRuleGroupSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (subscribedRuleGroupSummary.getMetricName() != null) {
            String metricName = subscribedRuleGroupSummary.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        jsonWriter.endObject();
    }

    private static SubscribedRuleGroupSummaryJsonMarshaller instance;

    public static SubscribedRuleGroupSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubscribedRuleGroupSummaryJsonMarshaller();
        return instance;
    }
}
