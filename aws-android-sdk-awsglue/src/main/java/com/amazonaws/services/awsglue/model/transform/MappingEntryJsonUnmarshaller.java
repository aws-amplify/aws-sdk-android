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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MappingEntry
 */
class MappingEntryJsonUnmarshaller implements Unmarshaller<MappingEntry, JsonUnmarshallerContext> {

    public MappingEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MappingEntry mappingEntry = new MappingEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SourceTable")) {
                mappingEntry.setSourceTable(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourcePath")) {
                mappingEntry.setSourcePath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceType")) {
                mappingEntry.setSourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetTable")) {
                mappingEntry.setTargetTable(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetPath")) {
                mappingEntry.setTargetPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetType")) {
                mappingEntry.setTargetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mappingEntry;
    }

    private static MappingEntryJsonUnmarshaller instance;

    public static MappingEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MappingEntryJsonUnmarshaller();
        return instance;
    }
}
