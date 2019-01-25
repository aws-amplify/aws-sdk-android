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
 * JSON marshaller for POJO SentimentScore
 */
class SentimentScoreJsonMarshaller {

    public void marshall(SentimentScore sentimentScore, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sentimentScore.getPositive() != null) {
            Float positive = sentimentScore.getPositive();
            jsonWriter.name("Positive");
            jsonWriter.value(positive);
        }
        if (sentimentScore.getNegative() != null) {
            Float negative = sentimentScore.getNegative();
            jsonWriter.name("Negative");
            jsonWriter.value(negative);
        }
        if (sentimentScore.getNeutral() != null) {
            Float neutral = sentimentScore.getNeutral();
            jsonWriter.name("Neutral");
            jsonWriter.value(neutral);
        }
        if (sentimentScore.getMixed() != null) {
            Float mixed = sentimentScore.getMixed();
            jsonWriter.name("Mixed");
            jsonWriter.value(mixed);
        }
        jsonWriter.endObject();
    }

    private static SentimentScoreJsonMarshaller instance;

    public static SentimentScoreJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SentimentScoreJsonMarshaller();
        return instance;
    }
}
