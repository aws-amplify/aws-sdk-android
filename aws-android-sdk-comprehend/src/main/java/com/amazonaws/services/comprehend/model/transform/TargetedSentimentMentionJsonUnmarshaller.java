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
 * JSON unmarshaller for POJO TargetedSentimentMention
 */
class TargetedSentimentMentionJsonUnmarshaller implements
        Unmarshaller<TargetedSentimentMention, JsonUnmarshallerContext> {

    public TargetedSentimentMention unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TargetedSentimentMention targetedSentimentMention = new TargetedSentimentMention();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Score")) {
                targetedSentimentMention.setScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupScore")) {
                targetedSentimentMention.setGroupScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Text")) {
                targetedSentimentMention.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                targetedSentimentMention.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MentionSentiment")) {
                targetedSentimentMention.setMentionSentiment(MentionSentimentJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("BeginOffset")) {
                targetedSentimentMention.setBeginOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndOffset")) {
                targetedSentimentMention.setEndOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return targetedSentimentMention;
    }

    private static TargetedSentimentMentionJsonUnmarshaller instance;

    public static TargetedSentimentMentionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetedSentimentMentionJsonUnmarshaller();
        return instance;
    }
}
