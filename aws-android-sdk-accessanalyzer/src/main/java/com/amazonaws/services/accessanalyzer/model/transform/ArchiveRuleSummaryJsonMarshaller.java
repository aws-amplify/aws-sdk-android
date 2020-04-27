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
 * JSON marshaller for POJO ArchiveRuleSummary
 */
class ArchiveRuleSummaryJsonMarshaller {

    public void marshall(ArchiveRuleSummary archiveRuleSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (archiveRuleSummary.getCreatedAt() != null) {
            java.util.Date createdAt = archiveRuleSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (archiveRuleSummary.getFilter() != null) {
            java.util.Map<String, Criterion> filter = archiveRuleSummary.getFilter();
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
        if (archiveRuleSummary.getRuleName() != null) {
            String ruleName = archiveRuleSummary.getRuleName();
            jsonWriter.name("ruleName");
            jsonWriter.value(ruleName);
        }
        if (archiveRuleSummary.getUpdatedAt() != null) {
            java.util.Date updatedAt = archiveRuleSummary.getUpdatedAt();
            jsonWriter.name("updatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static ArchiveRuleSummaryJsonMarshaller instance;

    public static ArchiveRuleSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ArchiveRuleSummaryJsonMarshaller();
        return instance;
    }
}
