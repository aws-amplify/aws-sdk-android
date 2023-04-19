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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MentionSentiment
 */
class MentionSentimentJsonMarshaller {

    public void marshall(MentionSentiment mentionSentiment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mentionSentiment.getSentiment() != null) {
            String sentiment = mentionSentiment.getSentiment();
            jsonWriter.name("Sentiment");
            jsonWriter.value(sentiment);
        }
        if (mentionSentiment.getSentimentScore() != null) {
            SentimentScore sentimentScore = mentionSentiment.getSentimentScore();
            jsonWriter.name("SentimentScore");
            SentimentScoreJsonMarshaller.getInstance().marshall(sentimentScore, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MentionSentimentJsonMarshaller instance;

    public static MentionSentimentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MentionSentimentJsonMarshaller();
        return instance;
    }
}
