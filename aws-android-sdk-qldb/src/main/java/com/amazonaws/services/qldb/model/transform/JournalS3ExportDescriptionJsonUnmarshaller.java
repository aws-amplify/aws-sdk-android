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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JournalS3ExportDescription
 */
class JournalS3ExportDescriptionJsonUnmarshaller implements
        Unmarshaller<JournalS3ExportDescription, JsonUnmarshallerContext> {

    public JournalS3ExportDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JournalS3ExportDescription journalS3ExportDescription = new JournalS3ExportDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LedgerName")) {
                journalS3ExportDescription.setLedgerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExportId")) {
                journalS3ExportDescription.setExportId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExportCreationTime")) {
                journalS3ExportDescription.setExportCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                journalS3ExportDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InclusiveStartTime")) {
                journalS3ExportDescription.setInclusiveStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExclusiveEndTime")) {
                journalS3ExportDescription.setExclusiveEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("S3ExportConfiguration")) {
                journalS3ExportDescription
                        .setS3ExportConfiguration(S3ExportConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("RoleArn")) {
                journalS3ExportDescription.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return journalS3ExportDescription;
    }

    private static JournalS3ExportDescriptionJsonUnmarshaller instance;

    public static JournalS3ExportDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JournalS3ExportDescriptionJsonUnmarshaller();
        return instance;
    }
}
