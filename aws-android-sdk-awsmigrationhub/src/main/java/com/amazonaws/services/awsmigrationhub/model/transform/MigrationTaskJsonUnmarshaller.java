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

package com.amazonaws.services.awsmigrationhub.model.transform;

import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MigrationTask
 */
class MigrationTaskJsonUnmarshaller implements Unmarshaller<MigrationTask, JsonUnmarshallerContext> {

    public MigrationTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MigrationTask migrationTask = new MigrationTask();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProgressUpdateStream")) {
                migrationTask.setProgressUpdateStream(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MigrationTaskName")) {
                migrationTask.setMigrationTaskName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Task")) {
                migrationTask.setTask(TaskJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateDateTime")) {
                migrationTask.setUpdateDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceAttributeList")) {
                migrationTask.setResourceAttributeList(new ListUnmarshaller<ResourceAttribute>(
                        ResourceAttributeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return migrationTask;
    }

    private static MigrationTaskJsonUnmarshaller instance;

    public static MigrationTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MigrationTaskJsonUnmarshaller();
        return instance;
    }
}
