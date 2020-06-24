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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ResultRow
 */
class ResultRowJsonUnmarshaller implements Unmarshaller<ResultRow, JsonUnmarshallerContext> {

    public ResultRow unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ResultRow resultRow = new ResultRow();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("rowId")) {
                resultRow.setRowId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dataItems")) {
                resultRow.setDataItems(new ListUnmarshaller<DataItem>(DataItemJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return resultRow;
    }

    private static ResultRowJsonUnmarshaller instance;

    public static ResultRowJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResultRowJsonUnmarshaller();
        return instance;
    }
}
