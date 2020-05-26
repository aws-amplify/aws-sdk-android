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
 * JSON marshaller for POJO TransformOperation
 */
class TransformOperationJsonMarshaller {

    public void marshall(TransformOperation transformOperation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transformOperation.getProjectOperation() != null) {
            ProjectOperation projectOperation = transformOperation.getProjectOperation();
            jsonWriter.name("ProjectOperation");
            ProjectOperationJsonMarshaller.getInstance().marshall(projectOperation, jsonWriter);
        }
        if (transformOperation.getFilterOperation() != null) {
            FilterOperation filterOperation = transformOperation.getFilterOperation();
            jsonWriter.name("FilterOperation");
            FilterOperationJsonMarshaller.getInstance().marshall(filterOperation, jsonWriter);
        }
        if (transformOperation.getCreateColumnsOperation() != null) {
            CreateColumnsOperation createColumnsOperation = transformOperation
                    .getCreateColumnsOperation();
            jsonWriter.name("CreateColumnsOperation");
            CreateColumnsOperationJsonMarshaller.getInstance().marshall(createColumnsOperation,
                    jsonWriter);
        }
        if (transformOperation.getRenameColumnOperation() != null) {
            RenameColumnOperation renameColumnOperation = transformOperation
                    .getRenameColumnOperation();
            jsonWriter.name("RenameColumnOperation");
            RenameColumnOperationJsonMarshaller.getInstance().marshall(renameColumnOperation,
                    jsonWriter);
        }
        if (transformOperation.getCastColumnTypeOperation() != null) {
            CastColumnTypeOperation castColumnTypeOperation = transformOperation
                    .getCastColumnTypeOperation();
            jsonWriter.name("CastColumnTypeOperation");
            CastColumnTypeOperationJsonMarshaller.getInstance().marshall(castColumnTypeOperation,
                    jsonWriter);
        }
        if (transformOperation.getTagColumnOperation() != null) {
            TagColumnOperation tagColumnOperation = transformOperation.getTagColumnOperation();
            jsonWriter.name("TagColumnOperation");
            TagColumnOperationJsonMarshaller.getInstance().marshall(tagColumnOperation, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TransformOperationJsonMarshaller instance;

    public static TransformOperationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransformOperationJsonMarshaller();
        return instance;
    }
}
