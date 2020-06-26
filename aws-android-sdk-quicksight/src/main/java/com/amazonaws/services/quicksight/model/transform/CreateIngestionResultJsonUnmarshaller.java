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
 * JSON unmarshaller for response CreateIngestionResult
 */
public class CreateIngestionResultJsonUnmarshaller implements
        Unmarshaller<CreateIngestionResult, JsonUnmarshallerContext> {

    public CreateIngestionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIngestionResult createIngestionResult = new CreateIngestionResult();

        createIngestionResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                createIngestionResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngestionId")) {
                createIngestionResult.setIngestionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngestionStatus")) {
                createIngestionResult.setIngestionStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                createIngestionResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                createIngestionResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createIngestionResult;
    }

    private static CreateIngestionResultJsonUnmarshaller instance;

    public static CreateIngestionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIngestionResultJsonUnmarshaller();
        return instance;
    }
}
