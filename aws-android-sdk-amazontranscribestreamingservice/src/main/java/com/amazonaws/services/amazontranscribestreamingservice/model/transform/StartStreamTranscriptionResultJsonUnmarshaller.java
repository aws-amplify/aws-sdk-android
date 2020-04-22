/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazontranscribestreamingservice.model.transform;

import com.amazonaws.services.amazontranscribestreamingservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response StartStreamTranscriptionResult
 */
public class StartStreamTranscriptionResultJsonUnmarshaller implements
        Unmarshaller<StartStreamTranscriptionResult, JsonUnmarshallerContext> {

    public StartStreamTranscriptionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        StartStreamTranscriptionResult startStreamTranscriptionResult = new StartStreamTranscriptionResult();

        if (context.getHeader("x-amzn-request-id") != null)
            startStreamTranscriptionResult.setRequestId(context.getHeader("x-amzn-request-id"));
        if (context.getHeader("x-amzn-transcribe-language-code") != null)
            startStreamTranscriptionResult.setLanguageCode(context
                    .getHeader("x-amzn-transcribe-language-code"));
        if (context.getHeader("x-amzn-transcribe-sample-rate") != null)
            startStreamTranscriptionResult.setMediaSampleRateHertz(context
                    .getHeader("x-amzn-transcribe-sample-rate"));
        if (context.getHeader("x-amzn-transcribe-media-encoding") != null)
            startStreamTranscriptionResult.setMediaEncoding(context
                    .getHeader("x-amzn-transcribe-media-encoding"));
        if (context.getHeader("x-amzn-transcribe-vocabulary-name") != null)
            startStreamTranscriptionResult.setVocabularyName(context
                    .getHeader("x-amzn-transcribe-vocabulary-name"));
        if (context.getHeader("x-amzn-transcribe-session-id") != null)
            startStreamTranscriptionResult.setSessionId(context
                    .getHeader("x-amzn-transcribe-session-id"));
        return startStreamTranscriptionResult;
    }

    private static StartStreamTranscriptionResultJsonUnmarshaller instance;

    public static StartStreamTranscriptionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartStreamTranscriptionResultJsonUnmarshaller();
        return instance;
    }
}
