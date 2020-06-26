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
 * JSON marshaller for POJO CastColumnTypeOperation
 */
class CastColumnTypeOperationJsonMarshaller {

    public void marshall(CastColumnTypeOperation castColumnTypeOperation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (castColumnTypeOperation.getColumnName() != null) {
            String columnName = castColumnTypeOperation.getColumnName();
            jsonWriter.name("ColumnName");
            jsonWriter.value(columnName);
        }
        if (castColumnTypeOperation.getNewColumnType() != null) {
            String newColumnType = castColumnTypeOperation.getNewColumnType();
            jsonWriter.name("NewColumnType");
            jsonWriter.value(newColumnType);
        }
        if (castColumnTypeOperation.getFormat() != null) {
            String format = castColumnTypeOperation.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        jsonWriter.endObject();
    }

    private static CastColumnTypeOperationJsonMarshaller instance;

    public static CastColumnTypeOperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CastColumnTypeOperationJsonMarshaller();
        return instance;
    }
}
