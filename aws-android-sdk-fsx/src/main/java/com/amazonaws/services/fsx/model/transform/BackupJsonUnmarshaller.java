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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Backup
 */
class BackupJsonUnmarshaller implements Unmarshaller<Backup, JsonUnmarshallerContext> {

    public Backup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Backup backup = new Backup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BackupId")) {
                backup.setBackupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                backup.setLifecycle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureDetails")) {
                backup.setFailureDetails(BackupFailureDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                backup.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgressPercent")) {
                backup.setProgressPercent(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                backup.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                backup.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceARN")) {
                backup.setResourceARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                backup.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FileSystem")) {
                backup.setFileSystem(FileSystemJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DirectoryInformation")) {
                backup.setDirectoryInformation(ActiveDirectoryBackupAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return backup;
    }

    private static BackupJsonUnmarshaller instance;

    public static BackupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupJsonUnmarshaller();
        return instance;
    }
}
