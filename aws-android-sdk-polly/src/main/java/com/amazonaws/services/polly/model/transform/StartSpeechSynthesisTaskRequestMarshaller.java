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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartSpeechSynthesisTaskRequest
 */
public class StartSpeechSynthesisTaskRequestMarshaller implements
        Marshaller<Request<StartSpeechSynthesisTaskRequest>, StartSpeechSynthesisTaskRequest> {

    public Request<StartSpeechSynthesisTaskRequest> marshall(
            StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest) {
        if (startSpeechSynthesisTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartSpeechSynthesisTaskRequest)");
        }

        Request<StartSpeechSynthesisTaskRequest> request = new DefaultRequest<StartSpeechSynthesisTaskRequest>(
                startSpeechSynthesisTaskRequest, "AmazonPolly");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/synthesisTasks";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startSpeechSynthesisTaskRequest.getLexiconNames() != null) {
                java.util.List<String> lexiconNames = startSpeechSynthesisTaskRequest
                        .getLexiconNames();
                jsonWriter.name("LexiconNames");
                jsonWriter.beginArray();
                for (String lexiconNamesItem : lexiconNames) {
                    if (lexiconNamesItem != null) {
                        jsonWriter.value(lexiconNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startSpeechSynthesisTaskRequest.getOutputFormat() != null) {
                String outputFormat = startSpeechSynthesisTaskRequest.getOutputFormat();
                jsonWriter.name("OutputFormat");
                jsonWriter.value(outputFormat);
            }
            if (startSpeechSynthesisTaskRequest.getOutputS3BucketName() != null) {
                String outputS3BucketName = startSpeechSynthesisTaskRequest.getOutputS3BucketName();
                jsonWriter.name("OutputS3BucketName");
                jsonWriter.value(outputS3BucketName);
            }
            if (startSpeechSynthesisTaskRequest.getOutputS3KeyPrefix() != null) {
                String outputS3KeyPrefix = startSpeechSynthesisTaskRequest.getOutputS3KeyPrefix();
                jsonWriter.name("OutputS3KeyPrefix");
                jsonWriter.value(outputS3KeyPrefix);
            }
            if (startSpeechSynthesisTaskRequest.getSampleRate() != null) {
                String sampleRate = startSpeechSynthesisTaskRequest.getSampleRate();
                jsonWriter.name("SampleRate");
                jsonWriter.value(sampleRate);
            }
            if (startSpeechSynthesisTaskRequest.getSnsTopicArn() != null) {
                String snsTopicArn = startSpeechSynthesisTaskRequest.getSnsTopicArn();
                jsonWriter.name("SnsTopicArn");
                jsonWriter.value(snsTopicArn);
            }
            if (startSpeechSynthesisTaskRequest.getSpeechMarkTypes() != null) {
                java.util.List<String> speechMarkTypes = startSpeechSynthesisTaskRequest
                        .getSpeechMarkTypes();
                jsonWriter.name("SpeechMarkTypes");
                jsonWriter.beginArray();
                for (String speechMarkTypesItem : speechMarkTypes) {
                    if (speechMarkTypesItem != null) {
                        jsonWriter.value(speechMarkTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startSpeechSynthesisTaskRequest.getText() != null) {
                String text = startSpeechSynthesisTaskRequest.getText();
                jsonWriter.name("Text");
                jsonWriter.value(text);
            }
            if (startSpeechSynthesisTaskRequest.getTextType() != null) {
                String textType = startSpeechSynthesisTaskRequest.getTextType();
                jsonWriter.name("TextType");
                jsonWriter.value(textType);
            }
            if (startSpeechSynthesisTaskRequest.getVoiceId() != null) {
                String voiceId = startSpeechSynthesisTaskRequest.getVoiceId();
                jsonWriter.name("VoiceId");
                jsonWriter.value(voiceId);
            }
            if (startSpeechSynthesisTaskRequest.getLanguageCode() != null) {
                String languageCode = startSpeechSynthesisTaskRequest.getLanguageCode();
                jsonWriter.name("LanguageCode");
                jsonWriter.value(languageCode);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
