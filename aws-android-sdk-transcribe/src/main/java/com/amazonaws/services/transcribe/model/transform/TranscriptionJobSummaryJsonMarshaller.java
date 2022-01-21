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
 * JSON marshaller for POJO TranscriptionJobSummary
 */
class TranscriptionJobSummaryJsonMarshaller {

    public void marshall(TranscriptionJobSummary transcriptionJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transcriptionJobSummary.getTranscriptionJobName() != null) {
            String transcriptionJobName = transcriptionJobSummary.getTranscriptionJobName();
            jsonWriter.name("TranscriptionJobName");
            jsonWriter.value(transcriptionJobName);
        }
        if (transcriptionJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = transcriptionJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transcriptionJobSummary.getStartTime() != null) {
            java.util.Date startTime = transcriptionJobSummary.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (transcriptionJobSummary.getCompletionTime() != null) {
            java.util.Date completionTime = transcriptionJobSummary.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (transcriptionJobSummary.getLanguageCode() != null) {
            String languageCode = transcriptionJobSummary.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (transcriptionJobSummary.getTranscriptionJobStatus() != null) {
            String transcriptionJobStatus = transcriptionJobSummary.getTranscriptionJobStatus();
            jsonWriter.name("TranscriptionJobStatus");
            jsonWriter.value(transcriptionJobStatus);
        }
        if (transcriptionJobSummary.getFailureReason() != null) {
            String failureReason = transcriptionJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (transcriptionJobSummary.getOutputLocationType() != null) {
            String outputLocationType = transcriptionJobSummary.getOutputLocationType();
            jsonWriter.name("OutputLocationType");
            jsonWriter.value(outputLocationType);
        }
        if (transcriptionJobSummary.getContentRedaction() != null) {
            ContentRedaction contentRedaction = transcriptionJobSummary.getContentRedaction();
            jsonWriter.name("ContentRedaction");
            ContentRedactionJsonMarshaller.getInstance().marshall(contentRedaction, jsonWriter);
        }
        if (transcriptionJobSummary.getModelSettings() != null) {
            ModelSettings modelSettings = transcriptionJobSummary.getModelSettings();
            jsonWriter.name("ModelSettings");
            ModelSettingsJsonMarshaller.getInstance().marshall(modelSettings, jsonWriter);
        }
        if (transcriptionJobSummary.getIdentifyLanguage() != null) {
            Boolean identifyLanguage = transcriptionJobSummary.getIdentifyLanguage();
            jsonWriter.name("IdentifyLanguage");
            jsonWriter.value(identifyLanguage);
        }
        if (transcriptionJobSummary.getIdentifiedLanguageScore() != null) {
            Float identifiedLanguageScore = transcriptionJobSummary.getIdentifiedLanguageScore();
            jsonWriter.name("IdentifiedLanguageScore");
            jsonWriter.value(identifiedLanguageScore);
        }
        jsonWriter.endObject();
    }

    private static TranscriptionJobSummaryJsonMarshaller instance;

    public static TranscriptionJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptionJobSummaryJsonMarshaller();
        return instance;
    }
}
