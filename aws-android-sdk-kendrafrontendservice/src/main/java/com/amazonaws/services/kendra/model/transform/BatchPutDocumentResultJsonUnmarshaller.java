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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchPutDocumentResult
 */
public class BatchPutDocumentResultJsonUnmarshaller implements
        Unmarshaller<BatchPutDocumentResult, JsonUnmarshallerContext> {

    public BatchPutDocumentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchPutDocumentResult batchPutDocumentResult = new BatchPutDocumentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FailedDocuments")) {
                batchPutDocumentResult
                        .setFailedDocuments(new ListUnmarshaller<BatchPutDocumentResponseFailedDocument>(
                                BatchPutDocumentResponseFailedDocumentJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchPutDocumentResult;
    }

    private static BatchPutDocumentResultJsonUnmarshaller instance;

    public static BatchPutDocumentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchPutDocumentResultJsonUnmarshaller();
        return instance;
    }
}
