/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchPutContactResult
 */
public class BatchPutContactResultJsonUnmarshaller implements
        Unmarshaller<BatchPutContactResult, JsonUnmarshallerContext> {

    public BatchPutContactResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchPutContactResult batchPutContactResult = new BatchPutContactResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SuccessfulRequestList")) {
                batchPutContactResult
                        .setSuccessfulRequestList(new ListUnmarshaller<SuccessfulRequest>(
                                SuccessfulRequestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FailedRequestList")) {
                batchPutContactResult.setFailedRequestList(new ListUnmarshaller<FailedRequest>(
                        FailedRequestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchPutContactResult;
    }

    private static BatchPutContactResultJsonUnmarshaller instance;

    public static BatchPutContactResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchPutContactResultJsonUnmarshaller();
        return instance;
    }
}
