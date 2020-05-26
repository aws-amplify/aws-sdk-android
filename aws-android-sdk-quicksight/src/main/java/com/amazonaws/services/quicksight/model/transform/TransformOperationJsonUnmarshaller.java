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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TransformOperation
 */
class TransformOperationJsonUnmarshaller implements
        Unmarshaller<TransformOperation, JsonUnmarshallerContext> {

    public TransformOperation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransformOperation transformOperation = new TransformOperation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProjectOperation")) {
                transformOperation.setProjectOperation(ProjectOperationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterOperation")) {
                transformOperation.setFilterOperation(FilterOperationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateColumnsOperation")) {
                transformOperation.setCreateColumnsOperation(CreateColumnsOperationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RenameColumnOperation")) {
                transformOperation.setRenameColumnOperation(RenameColumnOperationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CastColumnTypeOperation")) {
                transformOperation
                        .setCastColumnTypeOperation(CastColumnTypeOperationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TagColumnOperation")) {
                transformOperation.setTagColumnOperation(TagColumnOperationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transformOperation;
    }

    private static TransformOperationJsonUnmarshaller instance;

    public static TransformOperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransformOperationJsonUnmarshaller();
        return instance;
    }
}
