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
        if (transcriptionJob.getStartTime() != null) {
            java.util.Date startTime = transcriptionJob.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
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
        if (transcriptionJob.getModelSettings() != null) {
            ModelSettings modelSettings = transcriptionJob.getModelSettings();
            jsonWriter.name("ModelSettings");
            ModelSettingsJsonMarshaller.getInstance().marshall(modelSettings, jsonWriter);
        }
        if (transcriptionJob.getJobExecutionSettings() != null) {
            JobExecutionSettings jobExecutionSettings = transcriptionJob.getJobExecutionSettings();
            jsonWriter.name("JobExecutionSettings");
            JobExecutionSettingsJsonMarshaller.getInstance().marshall(jobExecutionSettings,
                    jsonWriter);
        }
        if (transcriptionJob.getContentRedaction() != null) {
            ContentRedaction contentRedaction = transcriptionJob.getContentRedaction();
            jsonWriter.name("ContentRedaction");
            ContentRedactionJsonMarshaller.getInstance().marshall(contentRedaction, jsonWriter);
        }
        if (transcriptionJob.getIdentifyLanguage() != null) {
            Boolean identifyLanguage = transcriptionJob.getIdentifyLanguage();
            jsonWriter.name("IdentifyLanguage");
            jsonWriter.value(identifyLanguage);
        }
        if (transcriptionJob.getLanguageOptions() != null) {
            java.util.List<String> languageOptions = transcriptionJob.getLanguageOptions();
            jsonWriter.name("LanguageOptions");
            jsonWriter.beginArray();
            for (String languageOptionsItem : languageOptions) {
                if (languageOptionsItem != null) {
                    jsonWriter.value(languageOptionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (transcriptionJob.getIdentifiedLanguageScore() != null) {
            Float identifiedLanguageScore = transcriptionJob.getIdentifiedLanguageScore();
            jsonWriter.name("IdentifiedLanguageScore");
            jsonWriter.value(identifiedLanguageScore);
        }
        if (transcriptionJob.getTags() != null) {
            java.util.List<Tag> tags = transcriptionJob.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (transcriptionJob.getSubtitles() != null) {
            SubtitlesOutput subtitles = transcriptionJob.getSubtitles();
            jsonWriter.name("Subtitles");
            SubtitlesOutputJsonMarshaller.getInstance().marshall(subtitles, jsonWriter);
        }
        if (transcriptionJob.getLanguageIdSettings() != null) {
            java.util.Map<String, LanguageIdSettings> languageIdSettings = transcriptionJob
                    .getLanguageIdSettings();
            jsonWriter.name("LanguageIdSettings");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, LanguageIdSettings> languageIdSettingsEntry : languageIdSettings
                    .entrySet()) {
                LanguageIdSettings languageIdSettingsValue = languageIdSettingsEntry.getValue();
                if (languageIdSettingsValue != null) {
                    jsonWriter.name(languageIdSettingsEntry.getKey());
                    LanguageIdSettingsJsonMarshaller.getInstance().marshall(
                            languageIdSettingsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
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
