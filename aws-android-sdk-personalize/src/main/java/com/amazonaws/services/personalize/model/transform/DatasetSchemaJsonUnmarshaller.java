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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DatasetSchema
 */
class DatasetSchemaJsonUnmarshaller implements Unmarshaller<DatasetSchema, JsonUnmarshallerContext> {

    public DatasetSchema unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DatasetSchema datasetSchema = new DatasetSchema();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                datasetSchema.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("schemaArn")) {
                datasetSchema.setSchemaArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("schema")) {
                datasetSchema.setSchema(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDateTime")) {
                datasetSchema.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDateTime")) {
                datasetSchema.setLastUpdatedDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return datasetSchema;
    }

    private static DatasetSchemaJsonUnmarshaller instance;

    public static DatasetSchemaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetSchemaJsonUnmarshaller();
        return instance;
    }
}
