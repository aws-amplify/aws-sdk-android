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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RuleResult
 */
class RuleResultJsonMarshaller {

    public void marshall(RuleResult ruleResult, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ruleResult.getRuleId() != null) {
            String ruleId = ruleResult.getRuleId();
            jsonWriter.name("ruleId");
            jsonWriter.value(ruleId);
        }
        if (ruleResult.getOutcomes() != null) {
            java.util.List<String> outcomes = ruleResult.getOutcomes();
            jsonWriter.name("outcomes");
            jsonWriter.beginArray();
            for (String outcomesItem : outcomes) {
                if (outcomesItem != null) {
                    jsonWriter.value(outcomesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RuleResultJsonMarshaller instance;

    public static RuleResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleResultJsonMarshaller();
        return instance;
    }
}
