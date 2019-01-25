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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TranscriptionJob
 */
class TranscriptionJobJsonMarshaller {

    public void marshall(TranscriptionJob transcriptionJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transcriptionJob.getTranscriptionJobName() != null) {
            String transcriptionJobName = transcriptionJob.getTranscriptionJobName();
            jsonWriter.name("TranscriptionJobName");
            jsonWriter.value(transcriptionJobName);
        }
        if (transcriptionJob.getTranscriptionJobStatus() != null) {
            String transcriptionJobStatus = transcriptionJob.getTranscriptionJobStatus();
            jsonWriter.name("TranscriptionJobStatus");
            jsonWriter.value(transcriptionJobStatus);
        }
        if (transcriptionJob.getLanguageCode() != null) {
            String languageCode = transcriptionJob.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (transcriptionJob.getMediaSampleRateHertz() != null) {
            Integer mediaSampleRateHertz = transcriptionJob.getMediaSampleRateHertz();
            jsonWriter.name("MediaSampleRateHertz");
            jsonWriter.value(mediaSampleRateHertz);
        }
        if (transcriptionJob.getMediaFormat() != null) {
            String mediaFormat = transcriptionJob.getMediaFormat();
            jsonWriter.name("MediaFormat");
            jsonWriter.value(mediaFormat);
        }
        if (transcriptionJob.getMedia() != null) {
            Media media = transcriptionJob.getMedia();
            jsonWriter.name("Media");
            MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
        }
        if (transcriptionJob.getTranscript() != null) {
            Transcript transcript = transcriptionJob.getTranscript();
            jsonWriter.name("Transcript");
            TranscriptJsonMarshaller.getInstance().marshall(transcript, jsonWriter);
        }
        if (transcriptionJob.getCreationTime() != null) {
            java.util.Date creationTime = transcriptionJob.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transcriptionJob.getCompletionTime() != null) {
            java.util.Date completionTime = transcriptionJob.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (transcriptionJob.getFailureReason() != null) {
            String failureReason = transcriptionJob.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (transcriptionJob.getSettings() != null) {
            Settings settings = transcriptionJob.getSettings();
            jsonWriter.name("Settings");
            SettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TranscriptionJobJsonMarshaller instance;

    public static TranscriptionJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptionJobJsonMarshaller();
        return instance;
    }
}
