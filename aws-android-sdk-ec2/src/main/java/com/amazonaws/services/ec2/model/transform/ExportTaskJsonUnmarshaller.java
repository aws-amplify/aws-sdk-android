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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ExportTask
 */
class ExportTaskJsonUnmarshaller implements Unmarshaller<ExportTask, JsonUnmarshallerContext> {

    public ExportTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ExportTask exportTask = new ExportTask();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Description")) {
                exportTask.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExportTaskId")) {
                exportTask.setExportTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExportToS3Task")) {
                exportTask.setExportToS3Task(ExportToS3TaskJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceExportDetails")) {
                exportTask.setInstanceExportDetails(InstanceExportDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                exportTask.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                exportTask.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                exportTask.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return exportTask;
    }

    private static ExportTaskJsonUnmarshaller instance;

    public static ExportTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskJsonUnmarshaller();
        return instance;
    }
}
