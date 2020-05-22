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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchAssociateProjectAssetsResult
 */
public class BatchAssociateProjectAssetsResultJsonUnmarshaller implements
        Unmarshaller<BatchAssociateProjectAssetsResult, JsonUnmarshallerContext> {

    public BatchAssociateProjectAssetsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        BatchAssociateProjectAssetsResult batchAssociateProjectAssetsResult = new BatchAssociateProjectAssetsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("errors")) {
                batchAssociateProjectAssetsResult
                        .setErrors(new ListUnmarshaller<AssetErrorDetails>(
                                AssetErrorDetailsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchAssociateProjectAssetsResult;
    }

    private static BatchAssociateProjectAssetsResultJsonUnmarshaller instance;

    public static BatchAssociateProjectAssetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchAssociateProjectAssetsResultJsonUnmarshaller();
        return instance;
    }
}
