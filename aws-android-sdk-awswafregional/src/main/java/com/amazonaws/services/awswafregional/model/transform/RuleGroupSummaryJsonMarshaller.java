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
 * JSON marshaller for POJO RuleGroupSummary
 */
class RuleGroupSummaryJsonMarshaller {

    public void marshall(RuleGroupSummary ruleGroupSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ruleGroupSummary.getRuleGroupId() != null) {
            String ruleGroupId = ruleGroupSummary.getRuleGroupId();
            jsonWriter.name("RuleGroupId");
            jsonWriter.value(ruleGroupId);
        }
        if (ruleGroupSummary.getName() != null) {
            String name = ruleGroupSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static RuleGroupSummaryJsonMarshaller instance;

    public static RuleGroupSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleGroupSummaryJsonMarshaller();
        return instance;
    }
}
