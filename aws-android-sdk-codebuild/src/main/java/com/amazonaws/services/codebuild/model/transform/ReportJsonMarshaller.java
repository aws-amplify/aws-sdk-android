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
 * JSON marshaller for POJO Report
 */
class ReportJsonMarshaller {

    public void marshall(Report report, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (report.getArn() != null) {
            String arn = report.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (report.getType() != null) {
            String type = report.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (report.getName() != null) {
            String name = report.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (report.getReportGroupArn() != null) {
            String reportGroupArn = report.getReportGroupArn();
            jsonWriter.name("reportGroupArn");
            jsonWriter.value(reportGroupArn);
        }
        if (report.getExecutionId() != null) {
            String executionId = report.getExecutionId();
            jsonWriter.name("executionId");
            jsonWriter.value(executionId);
        }
        if (report.getStatus() != null) {
            String status = report.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (report.getCreated() != null) {
            java.util.Date created = report.getCreated();
            jsonWriter.name("created");
            jsonWriter.value(created);
        }
        if (report.getExpired() != null) {
            java.util.Date expired = report.getExpired();
            jsonWriter.name("expired");
            jsonWriter.value(expired);
        }
        if (report.getExportConfig() != null) {
            ReportExportConfig exportConfig = report.getExportConfig();
            jsonWriter.name("exportConfig");
            ReportExportConfigJsonMarshaller.getInstance().marshall(exportConfig, jsonWriter);
        }
        if (report.getTruncated() != null) {
            Boolean truncated = report.getTruncated();
            jsonWriter.name("truncated");
            jsonWriter.value(truncated);
        }
        if (report.getTestSummary() != null) {
            TestReportSummary testSummary = report.getTestSummary();
            jsonWriter.name("testSummary");
            TestReportSummaryJsonMarshaller.getInstance().marshall(testSummary, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReportJsonMarshaller instance;

    public static ReportJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReportJsonMarshaller();
        return instance;
    }
}
