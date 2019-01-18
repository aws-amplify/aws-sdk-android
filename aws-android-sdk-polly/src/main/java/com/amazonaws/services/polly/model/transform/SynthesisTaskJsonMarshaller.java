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

package com.amazonaws.services.polly.model.transform;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SynthesisTask
 */
class SynthesisTaskJsonMarshaller {

    public void marshall(SynthesisTask synthesisTask, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (synthesisTask.getTaskId() != null) {
            String taskId = synthesisTask.getTaskId();
            jsonWriter.name("TaskId");
            jsonWriter.value(taskId);
        }
        if (synthesisTask.getTaskStatus() != null) {
            String taskStatus = synthesisTask.getTaskStatus();
            jsonWriter.name("TaskStatus");
            jsonWriter.value(taskStatus);
        }
        if (synthesisTask.getTaskStatusReason() != null) {
            String taskStatusReason = synthesisTask.getTaskStatusReason();
            jsonWriter.name("TaskStatusReason");
            jsonWriter.value(taskStatusReason);
        }
        if (synthesisTask.getOutputUri() != null) {
            String outputUri = synthesisTask.getOutputUri();
            jsonWriter.name("OutputUri");
            jsonWriter.value(outputUri);
        }
        if (synthesisTask.getCreationTime() != null) {
            java.util.Date creationTime = synthesisTask.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (synthesisTask.getRequestCharacters() != null) {
            Integer requestCharacters = synthesisTask.getRequestCharacters();
            jsonWriter.name("RequestCharacters");
            jsonWriter.value(requestCharacters);
        }
        if (synthesisTask.getSnsTopicArn() != null) {
            String snsTopicArn = synthesisTask.getSnsTopicArn();
            jsonWriter.name("SnsTopicArn");
            jsonWriter.value(snsTopicArn);
        }
        if (synthesisTask.getLexiconNames() != null) {
            java.util.List<String> lexiconNames = synthesisTask.getLexiconNames();
            jsonWriter.name("LexiconNames");
            jsonWriter.beginArray();
            for (String lexiconNamesItem : lexiconNames) {
                if (lexiconNamesItem != null) {
                    jsonWriter.value(lexiconNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (synthesisTask.getOutputFormat() != null) {
            String outputFormat = synthesisTask.getOutputFormat();
            jsonWriter.name("OutputFormat");
            jsonWriter.value(outputFormat);
        }
        if (synthesisTask.getSampleRate() != null) {
            String sampleRate = synthesisTask.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        if (synthesisTask.getSpeechMarkTypes() != null) {
            java.util.List<String> speechMarkTypes = synthesisTask.getSpeechMarkTypes();
            jsonWriter.name("SpeechMarkTypes");
            jsonWriter.beginArray();
            for (String speechMarkTypesItem : speechMarkTypes) {
                if (speechMarkTypesItem != null) {
                    jsonWriter.value(speechMarkTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (synthesisTask.getTextType() != null) {
            String textType = synthesisTask.getTextType();
            jsonWriter.name("TextType");
            jsonWriter.value(textType);
        }
        if (synthesisTask.getVoiceId() != null) {
            String voiceId = synthesisTask.getVoiceId();
            jsonWriter.name("VoiceId");
            jsonWriter.value(voiceId);
        }
        if (synthesisTask.getLanguageCode() != null) {
            String languageCode = synthesisTask.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        jsonWriter.endObject();
    }

    private static SynthesisTaskJsonMarshaller instance;

    public static SynthesisTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SynthesisTaskJsonMarshaller();
        return instance;
    }
}
