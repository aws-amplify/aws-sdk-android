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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelationalTable
 */
class RelationalTableJsonMarshaller {

    public void marshall(RelationalTable relationalTable, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (relationalTable.getDataSourceArn() != null) {
            String dataSourceArn = relationalTable.getDataSourceArn();
            jsonWriter.name("DataSourceArn");
            jsonWriter.value(dataSourceArn);
        }
        if (relationalTable.getSchema() != null) {
            String schema = relationalTable.getSchema();
            jsonWriter.name("Schema");
            jsonWriter.value(schema);
        }
        if (relationalTable.getName() != null) {
            String name = relationalTable.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (relationalTable.getInputColumns() != null) {
            java.util.List<InputColumn> inputColumns = relationalTable.getInputColumns();
            jsonWriter.name("InputColumns");
            jsonWriter.beginArray();
            for (InputColumn inputColumnsItem : inputColumns) {
                if (inputColumnsItem != null) {
                    InputColumnJsonMarshaller.getInstance().marshall(inputColumnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RelationalTableJsonMarshaller instance;

    public static RelationalTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalTableJsonMarshaller();
        return instance;
    }
}
