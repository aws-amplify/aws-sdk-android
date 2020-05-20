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
 * JSON unmarshaller for response DescribeBackupJobResult
 */
public class DescribeBackupJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeBackupJobResult, JsonUnmarshallerContext> {

    public DescribeBackupJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBackupJobResult describeBackupJobResult = new DescribeBackupJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BackupJobId")) {
                describeBackupJobResult.setBackupJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupVaultName")) {
                describeBackupJobResult.setBackupVaultName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupVaultArn")) {
                describeBackupJobResult.setBackupVaultArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecoveryPointArn")) {
                describeBackupJobResult.setRecoveryPointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceArn")) {
                describeBackupJobResult.setResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                describeBackupJobResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionDate")) {
                describeBackupJobResult.setCompletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                describeBackupJobResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                describeBackupJobResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PercentDone")) {
                describeBackupJobResult.setPercentDone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupSizeInBytes")) {
                describeBackupJobResult.setBackupSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamRoleArn")) {
                describeBackupJobResult.setIamRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                describeBackupJobResult.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                describeBackupJobResult.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BytesTransferred")) {
                describeBackupJobResult.setBytesTransferred(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpectedCompletionDate")) {
                describeBackupJobResult.setExpectedCompletionDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartBy")) {
                describeBackupJobResult.setStartBy(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeBackupJobResult;
    }

    private static DescribeBackupJobResultJsonUnmarshaller instance;

    public static DescribeBackupJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBackupJobResultJsonUnmarshaller();
        return instance;
    }
}
