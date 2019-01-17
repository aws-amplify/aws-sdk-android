/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BackupDescription
 */
class BackupDescriptionJsonMarshaller {

    public void marshall(BackupDescription backupDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (backupDescription.getBackupDetails() != null) {
            BackupDetails backupDetails = backupDescription.getBackupDetails();
            jsonWriter.name("BackupDetails");
            BackupDetailsJsonMarshaller.getInstance().marshall(backupDetails, jsonWriter);
        }
        if (backupDescription.getSourceTableDetails() != null) {
            SourceTableDetails sourceTableDetails = backupDescription.getSourceTableDetails();
            jsonWriter.name("SourceTableDetails");
            SourceTableDetailsJsonMarshaller.getInstance().marshall(sourceTableDetails, jsonWriter);
        }
        if (backupDescription.getSourceTableFeatureDetails() != null) {
            SourceTableFeatureDetails sourceTableFeatureDetails = backupDescription
                    .getSourceTableFeatureDetails();
            jsonWriter.name("SourceTableFeatureDetails");
            SourceTableFeatureDetailsJsonMarshaller.getInstance().marshall(
                    sourceTableFeatureDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BackupDescriptionJsonMarshaller instance;

    public static BackupDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupDescriptionJsonMarshaller();
        return instance;
    }
}
