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
 * JSON unmarshaller for response DescribeRestoreJobResult
 */
public class DescribeRestoreJobResultJsonUnmarshaller implements
        Unmarshaller<DescribeRestoreJobResult, JsonUnmarshallerContext> {

    public DescribeRestoreJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRestoreJobResult describeRestoreJobResult = new DescribeRestoreJobResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RestoreJobId")) {
                describeRestoreJobResult.setRestoreJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecoveryPointArn")) {
                describeRestoreJobResult.setRecoveryPointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                describeRestoreJobResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionDate")) {
                describeRestoreJobResult.setCompletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeRestoreJobResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                describeRestoreJobResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PercentDone")) {
                describeRestoreJobResult.setPercentDone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupSizeInBytes")) {
                describeRestoreJobResult.setBackupSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IamRoleArn")) {
                describeRestoreJobResult.setIamRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpectedCompletionTimeMinutes")) {
                describeRestoreJobResult.setExpectedCompletionTimeMinutes(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedResourceArn")) {
                describeRestoreJobResult.setCreatedResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeRestoreJobResult;
    }

    private static DescribeRestoreJobResultJsonUnmarshaller instance;

    public static DescribeRestoreJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRestoreJobResultJsonUnmarshaller();
        return instance;
    }
}
