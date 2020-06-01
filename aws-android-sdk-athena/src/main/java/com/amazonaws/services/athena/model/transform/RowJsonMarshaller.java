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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Row
 */
class RowJsonMarshaller {

    public void marshall(Row row, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (row.getData() != null) {
            java.util.List<Datum> data = row.getData();
            jsonWriter.name("Data");
            jsonWriter.beginArray();
            for (Datum dataItem : data) {
                if (dataItem != null) {
                    DatumJsonMarshaller.getInstance().marshall(dataItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RowJsonMarshaller instance;

    public static RowJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RowJsonMarshaller();
        return instance;
    }
}
