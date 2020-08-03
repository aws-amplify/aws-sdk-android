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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response DeleteInventoryResult
 */
public class DeleteInventoryResultJsonUnmarshaller implements Unmarshaller<DeleteInventoryResult, JsonUnmarshallerContext> {

    public DeleteInventoryResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteInventoryResult deleteInventoryResult = new DeleteInventoryResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeletionId")) {
                deleteInventoryResult.setDeletionId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("TypeName")) {
                deleteInventoryResult.setTypeName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DeletionSummary")) {
                deleteInventoryResult.setDeletionSummary(InventoryDeletionSummaryJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return deleteInventoryResult;
    }

    private static DeleteInventoryResultJsonUnmarshaller instance;
    public static DeleteInventoryResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DeleteInventoryResultJsonUnmarshaller();
        return instance;
    }
}
