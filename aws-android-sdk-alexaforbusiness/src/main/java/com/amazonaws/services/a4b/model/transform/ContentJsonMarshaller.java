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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Content
 */
class ContentJsonMarshaller {

    public void marshall(Content content, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (content.getTextList() != null) {
            java.util.List<Text> textList = content.getTextList();
            jsonWriter.name("TextList");
            jsonWriter.beginArray();
            for (Text textListItem : textList) {
                if (textListItem != null) {
                    TextJsonMarshaller.getInstance().marshall(textListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (content.getSsmlList() != null) {
            java.util.List<Ssml> ssmlList = content.getSsmlList();
            jsonWriter.name("SsmlList");
            jsonWriter.beginArray();
            for (Ssml ssmlListItem : ssmlList) {
                if (ssmlListItem != null) {
                    SsmlJsonMarshaller.getInstance().marshall(ssmlListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (content.getAudioList() != null) {
            java.util.List<Audio> audioList = content.getAudioList();
            jsonWriter.name("AudioList");
            jsonWriter.beginArray();
            for (Audio audioListItem : audioList) {
                if (audioListItem != null) {
                    AudioJsonMarshaller.getInstance().marshall(audioListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ContentJsonMarshaller instance;

    public static ContentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContentJsonMarshaller();
        return instance;
    }
}
