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
 * JSON marshaller for POJO ReportGroup
 */
class ReportGroupJsonMarshaller {

    public void marshall(ReportGroup reportGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reportGroup.getArn() != null) {
            String arn = reportGroup.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (reportGroup.getName() != null) {
            String name = reportGroup.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (reportGroup.getType() != null) {
            String type = reportGroup.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (reportGroup.getExportConfig() != null) {
            ReportExportConfig exportConfig = reportGroup.getExportConfig();
            jsonWriter.name("exportConfig");
            ReportExportConfigJsonMarshaller.getInstance().marshall(exportConfig, jsonWriter);
        }
        if (reportGroup.getCreated() != null) {
            java.util.Date created = reportGroup.getCreated();
            jsonWriter.name("created");
            jsonWriter.value(created);
        }
        if (reportGroup.getLastModified() != null) {
            java.util.Date lastModified = reportGroup.getLastModified();
            jsonWriter.name("lastModified");
            jsonWriter.value(lastModified);
        }
        jsonWriter.endObject();
    }

    private static ReportGroupJsonMarshaller instance;

    public static ReportGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReportGroupJsonMarshaller();
        return instance;
    }
}
