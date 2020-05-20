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
 * JSON unmarshaller for response ListBackupVaultsResult
 */
public class ListBackupVaultsResultJsonUnmarshaller implements
        Unmarshaller<ListBackupVaultsResult, JsonUnmarshallerContext> {

    public ListBackupVaultsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListBackupVaultsResult listBackupVaultsResult = new ListBackupVaultsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BackupVaultList")) {
                listBackupVaultsResult
                        .setBackupVaultList(new ListUnmarshaller<BackupVaultListMember>(
                                BackupVaultListMemberJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listBackupVaultsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listBackupVaultsResult;
    }

    private static ListBackupVaultsResultJsonUnmarshaller instance;

    public static ListBackupVaultsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListBackupVaultsResultJsonUnmarshaller();
        return instance;
    }
}
