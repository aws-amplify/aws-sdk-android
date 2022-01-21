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
 * JSON marshaller for POJO CallAnalyticsJob
 */
class CallAnalyticsJobJsonMarshaller {

    public void marshall(CallAnalyticsJob callAnalyticsJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (callAnalyticsJob.getCallAnalyticsJobName() != null) {
            String callAnalyticsJobName = callAnalyticsJob.getCallAnalyticsJobName();
            jsonWriter.name("CallAnalyticsJobName");
            jsonWriter.value(callAnalyticsJobName);
        }
        if (callAnalyticsJob.getCallAnalyticsJobStatus() != null) {
            String callAnalyticsJobStatus = callAnalyticsJob.getCallAnalyticsJobStatus();
            jsonWriter.name("CallAnalyticsJobStatus");
            jsonWriter.value(callAnalyticsJobStatus);
        }
        if (callAnalyticsJob.getLanguageCode() != null) {
            String languageCode = callAnalyticsJob.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (callAnalyticsJob.getMediaSampleRateHertz() != null) {
            Integer mediaSampleRateHertz = callAnalyticsJob.getMediaSampleRateHertz();
            jsonWriter.name("MediaSampleRateHertz");
            jsonWriter.value(mediaSampleRateHertz);
        }
        if (callAnalyticsJob.getMediaFormat() != null) {
            String mediaFormat = callAnalyticsJob.getMediaFormat();
            jsonWriter.name("MediaFormat");
            jsonWriter.value(mediaFormat);
        }
        if (callAnalyticsJob.getMedia() != null) {
            Media media = callAnalyticsJob.getMedia();
            jsonWriter.name("Media");
            MediaJsonMarshaller.getInstance().marshall(media, jsonWriter);
        }
        if (callAnalyticsJob.getTranscript() != null) {
            Transcript transcript = callAnalyticsJob.getTranscript();
            jsonWriter.name("Transcript");
            TranscriptJsonMarshaller.getInstance().marshall(transcript, jsonWriter);
        }
        if (callAnalyticsJob.getStartTime() != null) {
            java.util.Date startTime = callAnalyticsJob.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (callAnalyticsJob.getCreationTime() != null) {
            java.util.Date creationTime = callAnalyticsJob.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (callAnalyticsJob.getCompletionTime() != null) {
            java.util.Date completionTime = callAnalyticsJob.getCompletionTime();
            jsonWriter.name("CompletionTime");
            jsonWriter.value(completionTime);
        }
        if (callAnalyticsJob.getFailureReason() != null) {
            String failureReason = callAnalyticsJob.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (callAnalyticsJob.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = callAnalyticsJob.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (callAnalyticsJob.getIdentifiedLanguageScore() != null) {
            Float identifiedLanguageScore = callAnalyticsJob.getIdentifiedLanguageScore();
            jsonWriter.name("IdentifiedLanguageScore");
            jsonWriter.value(identifiedLanguageScore);
        }
        if (callAnalyticsJob.getSettings() != null) {
            CallAnalyticsJobSettings settings = callAnalyticsJob.getSettings();
            jsonWriter.name("Settings");
            CallAnalyticsJobSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        if (callAnalyticsJob.getChannelDefinitions() != null) {
            java.util.List<ChannelDefinition> channelDefinitions = callAnalyticsJob
                    .getChannelDefinitions();
            jsonWriter.name("ChannelDefinitions");
            jsonWriter.beginArray();
            for (ChannelDefinition channelDefinitionsItem : channelDefinitions) {
                if (channelDefinitionsItem != null) {
                    ChannelDefinitionJsonMarshaller.getInstance().marshall(channelDefinitionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CallAnalyticsJobJsonMarshaller instance;

    public static CallAnalyticsJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsJobJsonMarshaller();
        return instance;
    }
}
