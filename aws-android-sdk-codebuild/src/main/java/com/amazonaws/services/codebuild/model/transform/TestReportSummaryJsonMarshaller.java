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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TestReportSummary
 */
class TestReportSummaryJsonMarshaller {

    public void marshall(TestReportSummary testReportSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (testReportSummary.getTotal() != null) {
            Integer total = testReportSummary.getTotal();
            jsonWriter.name("total");
            jsonWriter.value(total);
        }
        if (testReportSummary.getStatusCounts() != null) {
            java.util.Map<String, Integer> statusCounts = testReportSummary.getStatusCounts();
            jsonWriter.name("statusCounts");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> statusCountsEntry : statusCounts.entrySet()) {
                Integer statusCountsValue = statusCountsEntry.getValue();
                if (statusCountsValue != null) {
                    jsonWriter.name(statusCountsEntry.getKey());
                    jsonWriter.value(statusCountsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (testReportSummary.getDurationInNanoSeconds() != null) {
            Long durationInNanoSeconds = testReportSummary.getDurationInNanoSeconds();
            jsonWriter.name("durationInNanoSeconds");
            jsonWriter.value(durationInNanoSeconds);
        }
        jsonWriter.endObject();
    }

    private static TestReportSummaryJsonMarshaller instance;

    public static TestReportSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TestReportSummaryJsonMarshaller();
        return instance;
    }
}
