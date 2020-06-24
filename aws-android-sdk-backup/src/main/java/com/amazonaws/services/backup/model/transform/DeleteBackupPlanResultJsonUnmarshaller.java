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
 * JSON unmarshaller for response DeleteBackupPlanResult
 */
public class DeleteBackupPlanResultJsonUnmarshaller implements
        Unmarshaller<DeleteBackupPlanResult, JsonUnmarshallerContext> {

    public DeleteBackupPlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteBackupPlanResult deleteBackupPlanResult = new DeleteBackupPlanResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BackupPlanId")) {
                deleteBackupPlanResult.setBackupPlanId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BackupPlanArn")) {
                deleteBackupPlanResult.setBackupPlanArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeletionDate")) {
                deleteBackupPlanResult.setDeletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionId")) {
                deleteBackupPlanResult.setVersionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteBackupPlanResult;
    }

    private static DeleteBackupPlanResultJsonUnmarshaller instance;

    public static DeleteBackupPlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteBackupPlanResultJsonUnmarshaller();
        return instance;
    }
}
