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

package com.amazonaws.services.models.lex.model.transform;

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
import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutBotRequest
 */
public class PutBotRequestMarshaller implements Marshaller<Request<PutBotRequest>, PutBotRequest> {

    public Request<PutBotRequest> marshall(PutBotRequest putBotRequest) {
        if (putBotRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutBotRequest)");
        }

        Request<PutBotRequest> request = new DefaultRequest<PutBotRequest>(putBotRequest,
                "AmazonLexModelBuildingService");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/bots/{name}/versions/$LATEST";
        uriResourcePath = uriResourcePath.replace("{name}", (putBotRequest.getName() == null) ? ""
                : StringUtils.fromString(putBotRequest.getName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putBotRequest.getDescription() != null) {
                String description = putBotRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (putBotRequest.getIntents() != null) {
                java.util.List<Intent> intents = putBotRequest.getIntents();
                jsonWriter.name("intents");
                jsonWriter.beginArray();
                for (Intent intentsItem : intents) {
                    if (intentsItem != null) {
                        IntentJsonMarshaller.getInstance().marshall(intentsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (putBotRequest.getClarificationPrompt() != null) {
                Prompt clarificationPrompt = putBotRequest.getClarificationPrompt();
                jsonWriter.name("clarificationPrompt");
                PromptJsonMarshaller.getInstance().marshall(clarificationPrompt, jsonWriter);
            }
            if (putBotRequest.getAbortStatement() != null) {
                Statement abortStatement = putBotRequest.getAbortStatement();
                jsonWriter.name("abortStatement");
                StatementJsonMarshaller.getInstance().marshall(abortStatement, jsonWriter);
            }
            if (putBotRequest.getIdleSessionTTLInSeconds() != null) {
                Integer idleSessionTTLInSeconds = putBotRequest.getIdleSessionTTLInSeconds();
                jsonWriter.name("idleSessionTTLInSeconds");
                jsonWriter.value(idleSessionTTLInSeconds);
            }
            if (putBotRequest.getVoiceId() != null) {
                String voiceId = putBotRequest.getVoiceId();
                jsonWriter.name("voiceId");
                jsonWriter.value(voiceId);
            }
            if (putBotRequest.getChecksum() != null) {
                String checksum = putBotRequest.getChecksum();
                jsonWriter.name("checksum");
                jsonWriter.value(checksum);
            }
            if (putBotRequest.getProcessBehavior() != null) {
                String processBehavior = putBotRequest.getProcessBehavior();
                jsonWriter.name("processBehavior");
                jsonWriter.value(processBehavior);
            }
            if (putBotRequest.getLocale() != null) {
                String locale = putBotRequest.getLocale();
                jsonWriter.name("locale");
                jsonWriter.value(locale);
            }
            if (putBotRequest.getChildDirected() != null) {
                Boolean childDirected = putBotRequest.getChildDirected();
                jsonWriter.name("childDirected");
                jsonWriter.value(childDirected);
            }
            if (putBotRequest.getDetectSentiment() != null) {
                Boolean detectSentiment = putBotRequest.getDetectSentiment();
                jsonWriter.name("detectSentiment");
                jsonWriter.value(detectSentiment);
            }
            if (putBotRequest.getCreateVersion() != null) {
                Boolean createVersion = putBotRequest.getCreateVersion();
                jsonWriter.name("createVersion");
                jsonWriter.value(createVersion);
            }
            if (putBotRequest.getTags() != null) {
                java.util.List<Tag> tags = putBotRequest.getTags();
                jsonWriter.name("tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
