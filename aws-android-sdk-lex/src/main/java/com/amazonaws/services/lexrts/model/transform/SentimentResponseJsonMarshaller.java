/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SentimentResponse
 */
class SentimentResponseJsonMarshaller {

    public void marshall(SentimentResponse sentimentResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sentimentResponse.getSentimentLabel() != null) {
            String sentimentLabel = sentimentResponse.getSentimentLabel();
            jsonWriter.name("sentimentLabel");
            jsonWriter.value(sentimentLabel);
        }
        if (sentimentResponse.getSentimentScore() != null) {
            String sentimentScore = sentimentResponse.getSentimentScore();
            jsonWriter.name("sentimentScore");
            jsonWriter.value(sentimentScore);
        }
        jsonWriter.endObject();
    }

    private static SentimentResponseJsonMarshaller instance;

    public static SentimentResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SentimentResponseJsonMarshaller();
        return instance;
    }
}
