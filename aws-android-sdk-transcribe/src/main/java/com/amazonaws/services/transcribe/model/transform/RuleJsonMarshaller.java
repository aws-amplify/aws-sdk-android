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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Rule
 */
class RuleJsonMarshaller {

    public void marshall(Rule rule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rule.getNonTalkTimeFilter() != null) {
            NonTalkTimeFilter nonTalkTimeFilter = rule.getNonTalkTimeFilter();
            jsonWriter.name("NonTalkTimeFilter");
            NonTalkTimeFilterJsonMarshaller.getInstance().marshall(nonTalkTimeFilter, jsonWriter);
        }
        if (rule.getInterruptionFilter() != null) {
            InterruptionFilter interruptionFilter = rule.getInterruptionFilter();
            jsonWriter.name("InterruptionFilter");
            InterruptionFilterJsonMarshaller.getInstance().marshall(interruptionFilter, jsonWriter);
        }
        if (rule.getTranscriptFilter() != null) {
            TranscriptFilter transcriptFilter = rule.getTranscriptFilter();
            jsonWriter.name("TranscriptFilter");
            TranscriptFilterJsonMarshaller.getInstance().marshall(transcriptFilter, jsonWriter);
        }
        if (rule.getSentimentFilter() != null) {
            SentimentFilter sentimentFilter = rule.getSentimentFilter();
            jsonWriter.name("SentimentFilter");
            SentimentFilterJsonMarshaller.getInstance().marshall(sentimentFilter, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RuleJsonMarshaller instance;

    public static RuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonMarshaller();
        return instance;
    }
}
