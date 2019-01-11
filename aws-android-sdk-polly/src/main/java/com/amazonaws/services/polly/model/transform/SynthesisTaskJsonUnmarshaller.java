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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SynthesisTask
 */
class SynthesisTaskJsonUnmarshaller implements Unmarshaller<SynthesisTask, JsonUnmarshallerContext> {

    public SynthesisTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SynthesisTask synthesisTask = new SynthesisTask();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TaskId")) {
                synthesisTask.setTaskId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskStatus")) {
                synthesisTask.setTaskStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskStatusReason")) {
                synthesisTask.setTaskStatusReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputUri")) {
                synthesisTask.setOutputUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                synthesisTask.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestCharacters")) {
                synthesisTask.setRequestCharacters(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnsTopicArn")) {
                synthesisTask.setSnsTopicArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LexiconNames")) {
                synthesisTask.setLexiconNames(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutputFormat")) {
                synthesisTask.setOutputFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SampleRate")) {
                synthesisTask.setSampleRate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SpeechMarkTypes")) {
                synthesisTask.setSpeechMarkTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TextType")) {
                synthesisTask.setTextType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VoiceId")) {
                synthesisTask.setVoiceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                synthesisTask.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return synthesisTask;
    }

    private static SynthesisTaskJsonUnmarshaller instance;

    public static SynthesisTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SynthesisTaskJsonUnmarshaller();
        return instance;
    }
}
