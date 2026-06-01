/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RealTimeContactAnalysisTranscriptItemWithContent
 */
class RealTimeContactAnalysisTranscriptItemWithContentJsonMarshaller {

    public void marshall(
            RealTimeContactAnalysisTranscriptItemWithContent realTimeContactAnalysisTranscriptItemWithContent,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisTranscriptItemWithContent.getContent() != null) {
            String content = realTimeContactAnalysisTranscriptItemWithContent.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (realTimeContactAnalysisTranscriptItemWithContent.getId() != null) {
            String id = realTimeContactAnalysisTranscriptItemWithContent.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (realTimeContactAnalysisTranscriptItemWithContent.getCharacterOffsets() != null) {
            RealTimeContactAnalysisCharacterInterval characterOffsets = realTimeContactAnalysisTranscriptItemWithContent
                    .getCharacterOffsets();
            jsonWriter.name("CharacterOffsets");
            RealTimeContactAnalysisCharacterIntervalJsonMarshaller.getInstance().marshall(
                    characterOffsets, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisTranscriptItemWithContentJsonMarshaller instance;

    public static RealTimeContactAnalysisTranscriptItemWithContentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisTranscriptItemWithContentJsonMarshaller();
        return instance;
    }
}
