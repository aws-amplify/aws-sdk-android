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
 * JSON marshaller for POJO ResultRow
 */
class ResultRowJsonMarshaller {

    public void marshall(ResultRow resultRow, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resultRow.getRowId() != null) {
            String rowId = resultRow.getRowId();
            jsonWriter.name("rowId");
            jsonWriter.value(rowId);
        }
        if (resultRow.getDataItems() != null) {
            java.util.List<DataItem> dataItems = resultRow.getDataItems();
            jsonWriter.name("dataItems");
            jsonWriter.beginArray();
            for (DataItem dataItemsItem : dataItems) {
                if (dataItemsItem != null) {
                    DataItemJsonMarshaller.getInstance().marshall(dataItemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResultRowJsonMarshaller instance;

    public static ResultRowJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResultRowJsonMarshaller();
        return instance;
    }
}
