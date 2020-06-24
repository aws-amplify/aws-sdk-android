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

package com.amazonaws.services.backup.model.transform;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeRecoveryPointResult
 */
public class DescribeRecoveryPointResultJsonUnmarshaller implements
        Unmarshaller<DescribeRecoveryPointResult, JsonUnmarshallerContext> {

    public DescribeRecoveryPointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRecoveryPointResult describeRecoveryPointResult = new DescribeRecoveryPointResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RecoveryPointArn")) {
                describeRecoveryPointResult.setRecoveryPointArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupVaultName")) {
                describeRecoveryPointResult.setBackupVaultName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupVaultArn")) {
                describeRecoveryPointResult.setBackupVaultArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceArn")) {
                describeRecoveryPointResult.setResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                describeRecoveryPointResult.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                describeRecoveryPointResult.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamRoleArn")) {
                describeRecoveryPointResult.setIamRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeRecoveryPointResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                describeRecoveryPointResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionDate")) {
                describeRecoveryPointResult.setCompletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupSizeInBytes")) {
                describeRecoveryPointResult.setBackupSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CalculatedLifecycle")) {
                describeRecoveryPointResult
                        .setCalculatedLifecycle(CalculatedLifecycleJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                describeRecoveryPointResult.setLifecycle(LifecycleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionKeyArn")) {
                describeRecoveryPointResult.setEncryptionKeyArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsEncrypted")) {
                describeRecoveryPointResult.setIsEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageClass")) {
                describeRecoveryPointResult.setStorageClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastRestoreTime")) {
                describeRecoveryPointResult.setLastRestoreTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeRecoveryPointResult;
    }

    private static DescribeRecoveryPointResultJsonUnmarshaller instance;

    public static DescribeRecoveryPointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRecoveryPointResultJsonUnmarshaller();
        return instance;
    }
}
