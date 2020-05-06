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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response InferICD10CMResult
 */
public class InferICD10CMResultJsonUnmarshaller implements
        Unmarshaller<InferICD10CMResult, JsonUnmarshallerContext> {

    public InferICD10CMResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InferICD10CMResult inferICD10CMResult = new InferICD10CMResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Entities")) {
                inferICD10CMResult.setEntities(new ListUnmarshaller<ICD10CMEntity>(
                        ICD10CMEntityJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PaginationToken")) {
                inferICD10CMResult.setPaginationToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelVersion")) {
                inferICD10CMResult.setModelVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return inferICD10CMResult;
    }

    private static InferICD10CMResultJsonUnmarshaller instance;

    public static InferICD10CMResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InferICD10CMResultJsonUnmarshaller();
        return instance;
    }
}
