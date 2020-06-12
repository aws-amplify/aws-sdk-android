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
 * JSON request marshaller for PutIntentRequest
 */
public class PutIntentRequestMarshaller implements
        Marshaller<Request<PutIntentRequest>, PutIntentRequest> {

    public Request<PutIntentRequest> marshall(PutIntentRequest putIntentRequest) {
        if (putIntentRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutIntentRequest)");
        }

        Request<PutIntentRequest> request = new DefaultRequest<PutIntentRequest>(putIntentRequest,
                "AmazonLexModelBuildingService");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/intents/{name}/versions/$LATEST";
        uriResourcePath = uriResourcePath.replace(
                "{name}",
                (putIntentRequest.getName() == null) ? "" : StringUtils.fromString(putIntentRequest
                        .getName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putIntentRequest.getDescription() != null) {
                String description = putIntentRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (putIntentRequest.getSlots() != null) {
                java.util.List<Slot> slots = putIntentRequest.getSlots();
                jsonWriter.name("slots");
                jsonWriter.beginArray();
                for (Slot slotsItem : slots) {
                    if (slotsItem != null) {
                        SlotJsonMarshaller.getInstance().marshall(slotsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (putIntentRequest.getSampleUtterances() != null) {
                java.util.List<String> sampleUtterances = putIntentRequest.getSampleUtterances();
                jsonWriter.name("sampleUtterances");
                jsonWriter.beginArray();
                for (String sampleUtterancesItem : sampleUtterances) {
                    if (sampleUtterancesItem != null) {
                        jsonWriter.value(sampleUtterancesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (putIntentRequest.getConfirmationPrompt() != null) {
                Prompt confirmationPrompt = putIntentRequest.getConfirmationPrompt();
                jsonWriter.name("confirmationPrompt");
                PromptJsonMarshaller.getInstance().marshall(confirmationPrompt, jsonWriter);
            }
            if (putIntentRequest.getRejectionStatement() != null) {
                Statement rejectionStatement = putIntentRequest.getRejectionStatement();
                jsonWriter.name("rejectionStatement");
                StatementJsonMarshaller.getInstance().marshall(rejectionStatement, jsonWriter);
            }
            if (putIntentRequest.getFollowUpPrompt() != null) {
                FollowUpPrompt followUpPrompt = putIntentRequest.getFollowUpPrompt();
                jsonWriter.name("followUpPrompt");
                FollowUpPromptJsonMarshaller.getInstance().marshall(followUpPrompt, jsonWriter);
            }
            if (putIntentRequest.getConclusionStatement() != null) {
                Statement conclusionStatement = putIntentRequest.getConclusionStatement();
                jsonWriter.name("conclusionStatement");
                StatementJsonMarshaller.getInstance().marshall(conclusionStatement, jsonWriter);
            }
            if (putIntentRequest.getDialogCodeHook() != null) {
                CodeHook dialogCodeHook = putIntentRequest.getDialogCodeHook();
                jsonWriter.name("dialogCodeHook");
                CodeHookJsonMarshaller.getInstance().marshall(dialogCodeHook, jsonWriter);
            }
            if (putIntentRequest.getFulfillmentActivity() != null) {
                FulfillmentActivity fulfillmentActivity = putIntentRequest.getFulfillmentActivity();
                jsonWriter.name("fulfillmentActivity");
                FulfillmentActivityJsonMarshaller.getInstance().marshall(fulfillmentActivity,
                        jsonWriter);
            }
            if (putIntentRequest.getParentIntentSignature() != null) {
                String parentIntentSignature = putIntentRequest.getParentIntentSignature();
                jsonWriter.name("parentIntentSignature");
                jsonWriter.value(parentIntentSignature);
            }
            if (putIntentRequest.getChecksum() != null) {
                String checksum = putIntentRequest.getChecksum();
                jsonWriter.name("checksum");
                jsonWriter.value(checksum);
            }
            if (putIntentRequest.getCreateVersion() != null) {
                Boolean createVersion = putIntentRequest.getCreateVersion();
                jsonWriter.name("createVersion");
                jsonWriter.value(createVersion);
            }
            if (putIntentRequest.getKendraConfiguration() != null) {
                KendraConfiguration kendraConfiguration = putIntentRequest.getKendraConfiguration();
                jsonWriter.name("kendraConfiguration");
                KendraConfigurationJsonMarshaller.getInstance().marshall(kendraConfiguration,
                        jsonWriter);
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
