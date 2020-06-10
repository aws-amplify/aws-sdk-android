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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PendingModifiedRelationalDatabaseValues
 */
class PendingModifiedRelationalDatabaseValuesJsonMarshaller {

    public void marshall(
            PendingModifiedRelationalDatabaseValues pendingModifiedRelationalDatabaseValues,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pendingModifiedRelationalDatabaseValues.getMasterUserPassword() != null) {
            String masterUserPassword = pendingModifiedRelationalDatabaseValues
                    .getMasterUserPassword();
            jsonWriter.name("masterUserPassword");
            jsonWriter.value(masterUserPassword);
        }
        if (pendingModifiedRelationalDatabaseValues.getEngineVersion() != null) {
            String engineVersion = pendingModifiedRelationalDatabaseValues.getEngineVersion();
            jsonWriter.name("engineVersion");
            jsonWriter.value(engineVersion);
        }
        if (pendingModifiedRelationalDatabaseValues.getBackupRetentionEnabled() != null) {
            Boolean backupRetentionEnabled = pendingModifiedRelationalDatabaseValues
                    .getBackupRetentionEnabled();
            jsonWriter.name("backupRetentionEnabled");
            jsonWriter.value(backupRetentionEnabled);
        }
        jsonWriter.endObject();
    }

    private static PendingModifiedRelationalDatabaseValuesJsonMarshaller instance;

    public static PendingModifiedRelationalDatabaseValuesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PendingModifiedRelationalDatabaseValuesJsonMarshaller();
        return instance;
    }
}
