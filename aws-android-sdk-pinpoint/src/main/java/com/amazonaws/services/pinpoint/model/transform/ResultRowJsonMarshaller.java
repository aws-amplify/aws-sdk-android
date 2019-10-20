/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResultRow
 */
class ResultRowJsonMarshaller {

    public void marshall(ResultRow resultRow, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resultRow.getGroupedBys() != null) {
            java.util.List<ResultRowValue> groupedBys = resultRow.getGroupedBys();
            jsonWriter.name("GroupedBys");
            jsonWriter.beginArray();
            for (ResultRowValue groupedBysItem : groupedBys) {
                if (groupedBysItem != null) {
                    ResultRowValueJsonMarshaller.getInstance().marshall(groupedBysItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (resultRow.getValues() != null) {
            java.util.List<ResultRowValue> values = resultRow.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (ResultRowValue valuesItem : values) {
                if (valuesItem != null) {
                    ResultRowValueJsonMarshaller.getInstance().marshall(valuesItem, jsonWriter);
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
