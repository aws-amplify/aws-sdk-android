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
 * JSON request marshaller for SynthesizeSpeechRequest
 */
public class SynthesizeSpeechRequestMarshaller implements
        Marshaller<Request<SynthesizeSpeechRequest>, SynthesizeSpeechRequest> {

    public Request<SynthesizeSpeechRequest> marshall(SynthesizeSpeechRequest synthesizeSpeechRequest) {
        if (synthesizeSpeechRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SynthesizeSpeechRequest)");
        }

        Request<SynthesizeSpeechRequest> request = new DefaultRequest<SynthesizeSpeechRequest>(
                synthesizeSpeechRequest, "AmazonPolly");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/speech";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (synthesizeSpeechRequest.getLexiconNames() != null) {
                java.util.List<String> lexiconNames = synthesizeSpeechRequest.getLexiconNames();
                jsonWriter.name("LexiconNames");
                jsonWriter.beginArray();
                for (String lexiconNamesItem : lexiconNames) {
                    if (lexiconNamesItem != null) {
                        jsonWriter.value(lexiconNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (synthesizeSpeechRequest.getOutputFormat() != null) {
                String outputFormat = synthesizeSpeechRequest.getOutputFormat();
                jsonWriter.name("OutputFormat");
                jsonWriter.value(outputFormat);
            }
            if (synthesizeSpeechRequest.getSampleRate() != null) {
                String sampleRate = synthesizeSpeechRequest.getSampleRate();
                jsonWriter.name("SampleRate");
                jsonWriter.value(sampleRate);
            }
            if (synthesizeSpeechRequest.getSpeechMarkTypes() != null) {
                java.util.List<String> speechMarkTypes = synthesizeSpeechRequest
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
            if (synthesizeSpeechRequest.getText() != null) {
                String text = synthesizeSpeechRequest.getText();
                jsonWriter.name("Text");
                jsonWriter.value(text);
            }
            if (synthesizeSpeechRequest.getTextType() != null) {
                String textType = synthesizeSpeechRequest.getTextType();
                jsonWriter.name("TextType");
                jsonWriter.value(textType);
            }
            if (synthesizeSpeechRequest.getVoiceId() != null) {
                String voiceId = synthesizeSpeechRequest.getVoiceId();
                jsonWriter.name("VoiceId");
                jsonWriter.value(voiceId);
            }
            if (synthesizeSpeechRequest.getLanguageCode() != null) {
                String languageCode = synthesizeSpeechRequest.getLanguageCode();
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
