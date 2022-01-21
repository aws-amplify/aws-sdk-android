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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TranscriptionJob
 */
class TranscriptionJobJsonUnmarshaller implements
        Unmarshaller<TranscriptionJob, JsonUnmarshallerContext> {

    public TranscriptionJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TranscriptionJob transcriptionJob = new TranscriptionJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TranscriptionJobName")) {
                transcriptionJob.setTranscriptionJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TranscriptionJobStatus")) {
                transcriptionJob.setTranscriptionJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                transcriptionJob.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaSampleRateHertz")) {
                transcriptionJob.setMediaSampleRateHertz(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaFormat")) {
                transcriptionJob.setMediaFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Media")) {
                transcriptionJob.setMedia(MediaJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Transcript")) {
                transcriptionJob.setTranscript(TranscriptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                transcriptionJob.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                transcriptionJob.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTime")) {
                transcriptionJob.setCompletionTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                transcriptionJob.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Settings")) {
                transcriptionJob.setSettings(SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelSettings")) {
                transcriptionJob.setModelSettings(ModelSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobExecutionSettings")) {
                transcriptionJob.setJobExecutionSettings(JobExecutionSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentRedaction")) {
                transcriptionJob.setContentRedaction(ContentRedactionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentifyLanguage")) {
                transcriptionJob.setIdentifyLanguage(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageOptions")) {
                transcriptionJob.setLanguageOptions(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IdentifiedLanguageScore")) {
                transcriptionJob.setIdentifiedLanguageScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                transcriptionJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Subtitles")) {
                transcriptionJob.setSubtitles(SubtitlesOutputJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageIdSettings")) {
                transcriptionJob.setLanguageIdSettings(new MapUnmarshaller<LanguageIdSettings>(
                        LanguageIdSettingsJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transcriptionJob;
    }

    private static TranscriptionJobJsonUnmarshaller instance;

    public static TranscriptionJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptionJobJsonUnmarshaller();
        return instance;
    }
}
