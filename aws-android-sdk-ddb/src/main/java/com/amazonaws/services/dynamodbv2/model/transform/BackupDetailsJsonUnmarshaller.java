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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO BackupDetails
 */
class BackupDetailsJsonUnmarshaller implements Unmarshaller<BackupDetails, JsonUnmarshallerContext> {

    public BackupDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BackupDetails backupDetails = new BackupDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BackupArn")) {
                backupDetails.setBackupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupName")) {
                backupDetails.setBackupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupSizeBytes")) {
                backupDetails.setBackupSizeBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupStatus")) {
                backupDetails.setBackupStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupType")) {
                backupDetails.setBackupType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupCreationDateTime")) {
                backupDetails.setBackupCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupExpiryDateTime")) {
                backupDetails.setBackupExpiryDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return backupDetails;
    }

    private static BackupDetailsJsonUnmarshaller instance;

    public static BackupDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupDetailsJsonUnmarshaller();
        return instance;
    }
}
