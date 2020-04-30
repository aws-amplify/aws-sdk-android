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
 * JSON unmarshaller for response CreateSchemaResult
 */
public class CreateSchemaResultJsonUnmarshaller implements
        Unmarshaller<CreateSchemaResult, JsonUnmarshallerContext> {

    public CreateSchemaResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSchemaResult createSchemaResult = new CreateSchemaResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Description")) {
                createSchemaResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModified")) {
                createSchemaResult.setLastModified(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaArn")) {
                createSchemaResult.setSchemaArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaName")) {
                createSchemaResult.setSchemaName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaVersion")) {
                createSchemaResult.setSchemaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                createSchemaResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Type")) {
                createSchemaResult.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VersionCreatedDate")) {
                createSchemaResult.setVersionCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createSchemaResult;
    }

    private static CreateSchemaResultJsonUnmarshaller instance;

    public static CreateSchemaResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSchemaResultJsonUnmarshaller();
        return instance;
    }
}
