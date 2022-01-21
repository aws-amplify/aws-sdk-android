/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO SubtitlesOutput
 */
class SubtitlesOutputJsonMarshaller {

    public void marshall(SubtitlesOutput subtitlesOutput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (subtitlesOutput.getFormats() != null) {
            java.util.List<String> formats = subtitlesOutput.getFormats();
            jsonWriter.name("Formats");
            jsonWriter.beginArray();
            for (String formatsItem : formats) {
                if (formatsItem != null) {
                    jsonWriter.value(formatsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (subtitlesOutput.getSubtitleFileUris() != null) {
            java.util.List<String> subtitleFileUris = subtitlesOutput.getSubtitleFileUris();
            jsonWriter.name("SubtitleFileUris");
            jsonWriter.beginArray();
            for (String subtitleFileUrisItem : subtitleFileUris) {
                if (subtitleFileUrisItem != null) {
                    jsonWriter.value(subtitleFileUrisItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SubtitlesOutputJsonMarshaller instance;

    public static SubtitlesOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubtitlesOutputJsonMarshaller();
        return instance;
    }
}
