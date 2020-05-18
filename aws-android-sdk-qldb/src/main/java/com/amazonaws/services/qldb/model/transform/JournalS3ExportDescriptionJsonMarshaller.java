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

package com.amazonaws.services.qldb.model.transform;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JournalS3ExportDescription
 */
class JournalS3ExportDescriptionJsonMarshaller {

    public void marshall(JournalS3ExportDescription journalS3ExportDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (journalS3ExportDescription.getLedgerName() != null) {
            String ledgerName = journalS3ExportDescription.getLedgerName();
            jsonWriter.name("LedgerName");
            jsonWriter.value(ledgerName);
        }
        if (journalS3ExportDescription.getExportId() != null) {
            String exportId = journalS3ExportDescription.getExportId();
            jsonWriter.name("ExportId");
            jsonWriter.value(exportId);
        }
        if (journalS3ExportDescription.getExportCreationTime() != null) {
            java.util.Date exportCreationTime = journalS3ExportDescription.getExportCreationTime();
            jsonWriter.name("ExportCreationTime");
            jsonWriter.value(exportCreationTime);
        }
        if (journalS3ExportDescription.getStatus() != null) {
            String status = journalS3ExportDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (journalS3ExportDescription.getInclusiveStartTime() != null) {
            java.util.Date inclusiveStartTime = journalS3ExportDescription.getInclusiveStartTime();
            jsonWriter.name("InclusiveStartTime");
            jsonWriter.value(inclusiveStartTime);
        }
        if (journalS3ExportDescription.getExclusiveEndTime() != null) {
            java.util.Date exclusiveEndTime = journalS3ExportDescription.getExclusiveEndTime();
            jsonWriter.name("ExclusiveEndTime");
            jsonWriter.value(exclusiveEndTime);
        }
        if (journalS3ExportDescription.getS3ExportConfiguration() != null) {
            S3ExportConfiguration s3ExportConfiguration = journalS3ExportDescription
                    .getS3ExportConfiguration();
            jsonWriter.name("S3ExportConfiguration");
            S3ExportConfigurationJsonMarshaller.getInstance().marshall(s3ExportConfiguration,
                    jsonWriter);
        }
        if (journalS3ExportDescription.getRoleArn() != null) {
            String roleArn = journalS3ExportDescription.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static JournalS3ExportDescriptionJsonMarshaller instance;

    public static JournalS3ExportDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JournalS3ExportDescriptionJsonMarshaller();
        return instance;
    }
}
