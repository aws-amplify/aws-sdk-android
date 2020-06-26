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
 * JSON marshaller for POJO RenameColumnOperation
 */
class RenameColumnOperationJsonMarshaller {

    public void marshall(RenameColumnOperation renameColumnOperation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (renameColumnOperation.getColumnName() != null) {
            String columnName = renameColumnOperation.getColumnName();
            jsonWriter.name("ColumnName");
            jsonWriter.value(columnName);
        }
        if (renameColumnOperation.getNewColumnName() != null) {
            String newColumnName = renameColumnOperation.getNewColumnName();
            jsonWriter.name("NewColumnName");
            jsonWriter.value(newColumnName);
        }
        jsonWriter.endObject();
    }

    private static RenameColumnOperationJsonMarshaller instance;

    public static RenameColumnOperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RenameColumnOperationJsonMarshaller();
        return instance;
    }
}
