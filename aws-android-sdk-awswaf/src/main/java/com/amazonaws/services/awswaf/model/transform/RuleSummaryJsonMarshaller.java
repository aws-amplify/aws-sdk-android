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
 * JSON marshaller for POJO RuleSummary
 */
class RuleSummaryJsonMarshaller {

    public void marshall(RuleSummary ruleSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ruleSummary.getRuleId() != null) {
            String ruleId = ruleSummary.getRuleId();
            jsonWriter.name("RuleId");
            jsonWriter.value(ruleId);
        }
        if (ruleSummary.getName() != null) {
            String name = ruleSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static RuleSummaryJsonMarshaller instance;

    public static RuleSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleSummaryJsonMarshaller();
        return instance;
    }
}
