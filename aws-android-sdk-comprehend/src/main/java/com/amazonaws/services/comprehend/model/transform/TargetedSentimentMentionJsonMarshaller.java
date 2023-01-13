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
 * JSON marshaller for POJO TargetedSentimentMention
 */
class TargetedSentimentMentionJsonMarshaller {

    public void marshall(TargetedSentimentMention targetedSentimentMention, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (targetedSentimentMention.getScore() != null) {
            Float score = targetedSentimentMention.getScore();
            jsonWriter.name("Score");
            jsonWriter.value(score);
        }
        if (targetedSentimentMention.getGroupScore() != null) {
            Float groupScore = targetedSentimentMention.getGroupScore();
            jsonWriter.name("GroupScore");
            jsonWriter.value(groupScore);
        }
        if (targetedSentimentMention.getText() != null) {
            String text = targetedSentimentMention.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (targetedSentimentMention.getType() != null) {
            String type = targetedSentimentMention.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (targetedSentimentMention.getMentionSentiment() != null) {
            MentionSentiment mentionSentiment = targetedSentimentMention.getMentionSentiment();
            jsonWriter.name("MentionSentiment");
            MentionSentimentJsonMarshaller.getInstance().marshall(mentionSentiment, jsonWriter);
        }
        if (targetedSentimentMention.getBeginOffset() != null) {
            Integer beginOffset = targetedSentimentMention.getBeginOffset();
            jsonWriter.name("BeginOffset");
            jsonWriter.value(beginOffset);
        }
        if (targetedSentimentMention.getEndOffset() != null) {
            Integer endOffset = targetedSentimentMention.getEndOffset();
            jsonWriter.name("EndOffset");
            jsonWriter.value(endOffset);
        }
        jsonWriter.endObject();
    }

    private static TargetedSentimentMentionJsonMarshaller instance;

    public static TargetedSentimentMentionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetedSentimentMentionJsonMarshaller();
        return instance;
    }
}
