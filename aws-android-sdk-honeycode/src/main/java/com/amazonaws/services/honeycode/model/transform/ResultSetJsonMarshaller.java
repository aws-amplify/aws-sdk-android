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

package com.amazonaws.services.honeycode.model.transform;

import com.amazonaws.services.honeycode.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResultSet
 */
class ResultSetJsonMarshaller {

    public void marshall(ResultSet resultSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resultSet.getHeaders() != null) {
            java.util.List<ColumnMetadata> headers = resultSet.getHeaders();
            jsonWriter.name("headers");
            jsonWriter.beginArray();
            for (ColumnMetadata headersItem : headers) {
                if (headersItem != null) {
                    ColumnMetadataJsonMarshaller.getInstance().marshall(headersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (resultSet.getRows() != null) {
            java.util.List<ResultRow> rows = resultSet.getRows();
            jsonWriter.name("rows");
            jsonWriter.beginArray();
            for (ResultRow rowsItem : rows) {
                if (rowsItem != null) {
                    ResultRowJsonMarshaller.getInstance().marshall(rowsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResultSetJsonMarshaller instance;

    public static ResultSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResultSetJsonMarshaller();
        return instance;
    }
}
