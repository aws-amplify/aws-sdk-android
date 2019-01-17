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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchDetectSentimentItemResult
 */
class BatchDetectSentimentItemResultJsonMarshaller {

    public void marshall(BatchDetectSentimentItemResult batchDetectSentimentItemResult,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (batchDetectSentimentItemResult.getIndex() != null) {
            Integer index = batchDetectSentimentItemResult.getIndex();
            jsonWriter.name("Index");
            jsonWriter.value(index);
        }
        if (batchDetectSentimentItemResult.getSentiment() != null) {
            String sentiment = batchDetectSentimentItemResult.getSentiment();
            jsonWriter.name("Sentiment");
            jsonWriter.value(sentiment);
        }
        if (batchDetectSentimentItemResult.getSentimentScore() != null) {
            SentimentScore sentimentScore = batchDetectSentimentItemResult.getSentimentScore();
            jsonWriter.name("SentimentScore");
            SentimentScoreJsonMarshaller.getInstance().marshall(sentimentScore, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BatchDetectSentimentItemResultJsonMarshaller instance;

    public static BatchDetectSentimentItemResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchDetectSentimentItemResultJsonMarshaller();
        return instance;
    }
}
