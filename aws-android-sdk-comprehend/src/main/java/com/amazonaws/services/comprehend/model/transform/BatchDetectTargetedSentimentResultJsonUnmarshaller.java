/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchDetectTargetedSentimentResult
 */
public class BatchDetectTargetedSentimentResultJsonUnmarshaller implements
        Unmarshaller<BatchDetectTargetedSentimentResult, JsonUnmarshallerContext> {

    public BatchDetectTargetedSentimentResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        BatchDetectTargetedSentimentResult batchDetectTargetedSentimentResult = new BatchDetectTargetedSentimentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ResultList")) {
                batchDetectTargetedSentimentResult
                        .setResultList(new ListUnmarshaller<BatchDetectTargetedSentimentItemResult>(
                                BatchDetectTargetedSentimentItemResultJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ErrorList")) {
                batchDetectTargetedSentimentResult
                        .setErrorList(new ListUnmarshaller<BatchItemError>(
                                BatchItemErrorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchDetectTargetedSentimentResult;
    }

    private static BatchDetectTargetedSentimentResultJsonUnmarshaller instance;

    public static BatchDetectTargetedSentimentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchDetectTargetedSentimentResultJsonUnmarshaller();
        return instance;
    }
}
