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
 * JSON unmarshaller for response GetBackupPlanResult
 */
public class GetBackupPlanResultJsonUnmarshaller implements
        Unmarshaller<GetBackupPlanResult, JsonUnmarshallerContext> {

    public GetBackupPlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBackupPlanResult getBackupPlanResult = new GetBackupPlanResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BackupPlan")) {
                getBackupPlanResult.setBackupPlan(BackupPlanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupPlanId")) {
                getBackupPlanResult.setBackupPlanId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupPlanArn")) {
                getBackupPlanResult.setBackupPlanArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionId")) {
                getBackupPlanResult.setVersionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatorRequestId")) {
                getBackupPlanResult.setCreatorRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                getBackupPlanResult.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeletionDate")) {
                getBackupPlanResult.setDeletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastExecutionDate")) {
                getBackupPlanResult.setLastExecutionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getBackupPlanResult;
    }

    private static GetBackupPlanResultJsonUnmarshaller instance;

    public static GetBackupPlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBackupPlanResultJsonUnmarshaller();
        return instance;
    }
}
