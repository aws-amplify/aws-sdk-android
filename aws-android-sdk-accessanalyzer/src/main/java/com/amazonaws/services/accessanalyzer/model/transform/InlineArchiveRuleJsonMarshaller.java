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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InlineArchiveRule
 */
class InlineArchiveRuleJsonMarshaller {

    public void marshall(InlineArchiveRule inlineArchiveRule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (inlineArchiveRule.getFilter() != null) {
            java.util.Map<String, Criterion> filter = inlineArchiveRule.getFilter();
            jsonWriter.name("filter");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Criterion> filterEntry : filter.entrySet()) {
                Criterion filterValue = filterEntry.getValue();
                if (filterValue != null) {
                    jsonWriter.name(filterEntry.getKey());
                    CriterionJsonMarshaller.getInstance().marshall(filterValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (inlineArchiveRule.getRuleName() != null) {
            String ruleName = inlineArchiveRule.getRuleName();
            jsonWriter.name("ruleName");
            jsonWriter.value(ruleName);
        }
        jsonWriter.endObject();
    }

    private static InlineArchiveRuleJsonMarshaller instance;

    public static InlineArchiveRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InlineArchiveRuleJsonMarshaller();
        return instance;
    }
}
