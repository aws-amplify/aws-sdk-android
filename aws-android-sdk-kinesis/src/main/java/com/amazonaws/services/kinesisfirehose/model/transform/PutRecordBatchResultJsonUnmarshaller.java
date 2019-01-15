/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response PutRecordBatchResult
 */
public class PutRecordBatchResultJsonUnmarshaller implements
        Unmarshaller<PutRecordBatchResult, JsonUnmarshallerContext> {

    public PutRecordBatchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutRecordBatchResult putRecordBatchResult = new PutRecordBatchResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FailedPutCount")) {
                putRecordBatchResult.setFailedPutCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                putRecordBatchResult.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestResponses")) {
                putRecordBatchResult
                        .setRequestResponses(new ListUnmarshaller<PutRecordBatchResponseEntry>(
                                PutRecordBatchResponseEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putRecordBatchResult;
    }

    private static PutRecordBatchResultJsonUnmarshaller instance;

    public static PutRecordBatchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutRecordBatchResultJsonUnmarshaller();
        return instance;
    }
}
