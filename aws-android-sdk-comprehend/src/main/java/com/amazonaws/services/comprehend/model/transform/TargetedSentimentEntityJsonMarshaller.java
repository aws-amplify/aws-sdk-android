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
 * JSON marshaller for POJO TargetedSentimentEntity
 */
class TargetedSentimentEntityJsonMarshaller {

    public void marshall(TargetedSentimentEntity targetedSentimentEntity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (targetedSentimentEntity.getDescriptiveMentionIndex() != null) {
            java.util.List<Integer> descriptiveMentionIndex = targetedSentimentEntity
                    .getDescriptiveMentionIndex();
            jsonWriter.name("DescriptiveMentionIndex");
            jsonWriter.beginArray();
            for (Integer descriptiveMentionIndexItem : descriptiveMentionIndex) {
                if (descriptiveMentionIndexItem != null) {
                    jsonWriter.value(descriptiveMentionIndexItem);
                }
            }
            jsonWriter.endArray();
        }
        if (targetedSentimentEntity.getMentions() != null) {
            java.util.List<TargetedSentimentMention> mentions = targetedSentimentEntity
                    .getMentions();
            jsonWriter.name("Mentions");
            jsonWriter.beginArray();
            for (TargetedSentimentMention mentionsItem : mentions) {
                if (mentionsItem != null) {
                    TargetedSentimentMentionJsonMarshaller.getInstance().marshall(mentionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TargetedSentimentEntityJsonMarshaller instance;

    public static TargetedSentimentEntityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetedSentimentEntityJsonMarshaller();
        return instance;
    }
}
