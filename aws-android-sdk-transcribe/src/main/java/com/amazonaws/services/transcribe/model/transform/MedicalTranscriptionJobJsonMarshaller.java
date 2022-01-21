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
 * JSON marshaller for POJO MedicalTranscriptionJob
 */
class MedicalTranscriptionJobJsonMarshaller {

    public void marshall(MedicalTranscriptionJob medicalTranscriptionJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (medicalTranscriptionJob.getMedicalTranscriptionJobName() != null) {
            String medicalTranscriptionJobName = medicalTranscriptionJob
                    .getMedicalTranscriptionJobName();
            jsonWriter.name("MedicalTranscriptionJobName");
            jsonWriter.value(medicalTranscriptionJobName);
        }
        if (medicalTranscriptionJob.getTranscriptionJobStatus() != null) {
            String transcriptionJobStatus = medicalTranscriptionJob.getTranscriptionJobStatus();
            jsonWriter.name("TranscriptionJobStatus");
            jsonWriter.value(transcriptionJobStatus);
        }
        if (medicalTranscriptionJob.getLanguageCode() != null) {
            String languageCode = medicalTranscriptionJob.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (medicalTranscriptionJob.getMediaSampleRateHertz() != null) {
            Integer mediaSampleRateHertz = medicalTranscriptionJob.getMediaSampleRateHertz();
            jsonWriter.name("MediaSampleRateHertz");
            jsonWriter.value(mediaSampleRateHertz);
        }
        if (medicalTranscriptionJob.getMediaFormat() != null) {
            String mediaFormat = medicalTranscriptionJob.getMediaFormat();
            jsonWriter.name("MediaFormat");
            jsonWriter.value(mediaFormat);
        }
        if (medicalTranscriptionJob.getMedia() != null) {
            Media media = medicalTranscriptionJob.getMedia();
            jsonWriter.name("Media");
            MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
        }
        if (medicalTranscriptionJob.getTranscript() != null) {
            MedicalTranscript transcript = medicalTranscriptionJob.getTranscript();
            jsonWriter.name("Transcript");
            MedicalTranscriptJsonMarshaller.getInstance().marshall(transcript, jsonWriter);
        }
        if (medicalTranscriptionJob.getStartTime() != null) {
            java.util.Date startTime = medicalTranscriptionJob.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (medicalTranscriptionJob.getCreationTime() != null) {
            java.util.Date creationTime = medicalTranscriptionJob.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (medicalTranscriptionJob.getCompletionTime() != null) {
            java.util.Date completionTime = medicalTranscriptionJob.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (medicalTranscriptionJob.getFailureReason() != null) {
            String failureReason = medicalTranscriptionJob.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (medicalTranscriptionJob.getSettings() != null) {
            MedicalTranscriptionSetting settings = medicalTranscriptionJob.getSettings();
            jsonWriter.name("Settings");
            MedicalTranscriptionSettingJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        if (medicalTranscriptionJob.getContentIdentificationType() != null) {
            String contentIdentificationType = medicalTranscriptionJob
                    .getContentIdentificationType();
            jsonWriter.name("ContentIdentificationType");
            jsonWriter.value(contentIdentificationType);
        }
        if (medicalTranscriptionJob.getSpecialty() != null) {
            String specialty = medicalTranscriptionJob.getSpecialty();
            jsonWriter.name("Specialty");
            jsonWriter.value(specialty);
        }
        if (medicalTranscriptionJob.getType() != null) {
            String type = medicalTranscriptionJob.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (medicalTranscriptionJob.getTags() != null) {
            java.util.List<Tag> tags = medicalTranscriptionJob.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MedicalTranscriptionJobJsonMarshaller instance;

    public static MedicalTranscriptionJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionJobJsonMarshaller();
        return instance;
    }
}
