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
 * JSON marshaller for POJO CustomSql
 */
class CustomSqlJsonMarshaller {

    public void marshall(CustomSql customSql, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (customSql.getDataSourceArn() != null) {
            String dataSourceArn = customSql.getDataSourceArn();
            jsonWriter.name("DataSourceArn");
            jsonWriter.value(dataSourceArn);
        }
        if (customSql.getName() != null) {
            String name = customSql.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (customSql.getSqlQuery() != null) {
            String sqlQuery = customSql.getSqlQuery();
            jsonWriter.name("SqlQuery");
            jsonWriter.value(sqlQuery);
        }
        if (customSql.getColumns() != null) {
            java.util.List<InputColumn> columns = customSql.getColumns();
            jsonWriter.name("Columns");
            jsonWriter.beginArray();
            for (InputColumn columnsItem : columns) {
                if (columnsItem != null) {
                    InputColumnJsonMarshaller.getInstance().marshall(columnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CustomSqlJsonMarshaller instance;

    public static CustomSqlJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomSqlJsonMarshaller();
        return instance;
    }
}
