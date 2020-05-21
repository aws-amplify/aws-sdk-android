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
 * JSON marshaller for POJO ReportExportConfig
 */
class ReportExportConfigJsonMarshaller {

    public void marshall(ReportExportConfig reportExportConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reportExportConfig.getExportConfigType() != null) {
            String exportConfigType = reportExportConfig.getExportConfigType();
            jsonWriter.name("exportConfigType");
            jsonWriter.value(exportConfigType);
        }
        if (reportExportConfig.getS3Destination() != null) {
            S3ReportExportConfig s3Destination = reportExportConfig.getS3Destination();
            jsonWriter.name("s3Destination");
            S3ReportExportConfigJsonMarshaller.getInstance().marshall(s3Destination, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ReportExportConfigJsonMarshaller instance;

    public static ReportExportConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReportExportConfigJsonMarshaller();
        return instance;
    }
}
