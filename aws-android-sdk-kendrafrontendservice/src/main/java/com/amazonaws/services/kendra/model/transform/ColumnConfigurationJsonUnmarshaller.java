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
 * JSON unmarshaller for POJO ColumnConfiguration
 */
class ColumnConfigurationJsonUnmarshaller implements
        Unmarshaller<ColumnConfiguration, JsonUnmarshallerContext> {

    public ColumnConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ColumnConfiguration columnConfiguration = new ColumnConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DocumentIdColumnName")) {
                columnConfiguration.setDocumentIdColumnName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentDataColumnName")) {
                columnConfiguration.setDocumentDataColumnName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DocumentTitleColumnName")) {
                columnConfiguration.setDocumentTitleColumnName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FieldMappings")) {
                columnConfiguration
                        .setFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                                DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ChangeDetectingColumns")) {
                columnConfiguration.setChangeDetectingColumns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return columnConfiguration;
    }

    private static ColumnConfigurationJsonUnmarshaller instance;

    public static ColumnConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColumnConfigurationJsonUnmarshaller();
        return instance;
    }
}
