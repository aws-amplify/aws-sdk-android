/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO CallAnalyticsJob
 */
class CallAnalyticsJobJsonUnmarshaller implements
        Unmarshaller<CallAnalyticsJob, JsonUnmarshallerContext> {

    public CallAnalyticsJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CallAnalyticsJob callAnalyticsJob = new CallAnalyticsJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CallAnalyticsJobName")) {
                callAnalyticsJob.setCallAnalyticsJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CallAnalyticsJobStatus")) {
                callAnalyticsJob.setCallAnalyticsJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LanguageCode")) {
                callAnalyticsJob.setLanguageCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaSampleRateHertz")) {
                callAnalyticsJob.setMediaSampleRateHertz(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaFormat")) {
                callAnalyticsJob.setMediaFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Media")) {
                callAnalyticsJob.setMedia(MediaJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Transcript")) {
                callAnalyticsJob.setTranscript(TranscriptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                callAnalyticsJob.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                callAnalyticsJob.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionTime")) {
                callAnalyticsJob.setCompletionTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                callAnalyticsJob.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                callAnalyticsJob.setDataAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdentifiedLanguageScore")) {
                callAnalyticsJob.setIdentifiedLanguageScore(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Settings")) {
                callAnalyticsJob.setSettings(CallAnalyticsJobSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelDefinitions")) {
                callAnalyticsJob.setChannelDefinitions(new ListUnmarshaller<ChannelDefinition>(
                        ChannelDefinitionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return callAnalyticsJob;
    }

    private static CallAnalyticsJobJsonUnmarshaller instance;

    public static CallAnalyticsJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsJobJsonUnmarshaller();
        return instance;
    }
}
