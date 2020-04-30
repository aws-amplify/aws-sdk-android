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

package com.amazonaws.services.schemas.model.transform;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateSchemaResult
 */
public class UpdateSchemaResultJsonUnmarshaller implements
        Unmarshaller<UpdateSchemaResult, JsonUnmarshallerContext> {

    public UpdateSchemaResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSchemaResult updateSchemaResult = new UpdateSchemaResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Description")) {
                updateSchemaResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModified")) {
                updateSchemaResult.setLastModified(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaArn")) {
                updateSchemaResult.setSchemaArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaName")) {
                updateSchemaResult.setSchemaName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaVersion")) {
                updateSchemaResult.setSchemaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                updateSchemaResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Type")) {
                updateSchemaResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionCreatedDate")) {
                updateSchemaResult.setVersionCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateSchemaResult;
    }

    private static UpdateSchemaResultJsonUnmarshaller instance;

    public static UpdateSchemaResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSchemaResultJsonUnmarshaller();
        return instance;
    }
}
