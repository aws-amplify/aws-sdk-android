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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DataSourceToIndexFieldMapping
 */
class DataSourceToIndexFieldMappingJsonUnmarshaller implements
        Unmarshaller<DataSourceToIndexFieldMapping, JsonUnmarshallerContext> {

    public DataSourceToIndexFieldMapping unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataSourceToIndexFieldMapping dataSourceToIndexFieldMapping = new DataSourceToIndexFieldMapping();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DataSourceFieldName")) {
                dataSourceToIndexFieldMapping.setDataSourceFieldName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DateFieldFormat")) {
                dataSourceToIndexFieldMapping.setDateFieldFormat(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexFieldName")) {
                dataSourceToIndexFieldMapping.setIndexFieldName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataSourceToIndexFieldMapping;
    }

    private static DataSourceToIndexFieldMappingJsonUnmarshaller instance;

    public static DataSourceToIndexFieldMappingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceToIndexFieldMappingJsonUnmarshaller();
        return instance;
    }
}
