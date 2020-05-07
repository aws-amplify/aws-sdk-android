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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Report
 */
class ReportJsonUnmarshaller implements Unmarshaller<Report, JsonUnmarshallerContext> {

    public Report unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Report report = new Report();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                report.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                report.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                report.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("reportGroupArn")) {
                report.setReportGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("executionId")) {
                report.setExecutionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                report.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("created")) {
                report.setCreated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("expired")) {
                report.setExpired(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("exportConfig")) {
                report.setExportConfig(ReportExportConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("truncated")) {
                report.setTruncated(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("testSummary")) {
                report.setTestSummary(TestReportSummaryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return report;
    }

    private static ReportJsonUnmarshaller instance;

    public static ReportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportJsonUnmarshaller();
        return instance;
    }
}
