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

package com.amazonaws.services.lexrts.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutSessionRequest
 */
public class PutSessionRequestMarshaller implements
        Marshaller<Request<PutSessionRequest>, PutSessionRequest> {

    public Request<PutSessionRequest> marshall(PutSessionRequest putSessionRequest) {
        if (putSessionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutSessionRequest)");
        }

        Request<PutSessionRequest> request = new DefaultRequest<PutSessionRequest>(
                putSessionRequest, "AmazonLexRuntime");
        request.setHttpMethod(HttpMethodName.POST);

        if (putSessionRequest.getAccept() != null) {
            request.addHeader("Accept", StringUtils.fromString(putSessionRequest.getAccept()));
        }
        String uriResourcePath = "/bot/{botName}/alias/{botAlias}/user/{userId}/session";
        uriResourcePath = uriResourcePath.replace(
                "{botName}",
                (putSessionRequest.getBotName() == null) ? "" : StringUtils
                        .fromString(putSessionRequest.getBotName()));
        uriResourcePath = uriResourcePath.replace(
                "{botAlias}",
                (putSessionRequest.getBotAlias() == null) ? "" : StringUtils
                        .fromString(putSessionRequest.getBotAlias()));
        uriResourcePath = uriResourcePath.replace(
                "{userId}",
                (putSessionRequest.getUserId() == null) ? "" : StringUtils
                        .fromString(putSessionRequest.getUserId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putSessionRequest.getSessionAttributes() != null) {
                java.util.Map<String, String> sessionAttributes = putSessionRequest
                        .getSessionAttributes();
                jsonWriter.name("sessionAttributes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> sessionAttributesEntry : sessionAttributes
                        .entrySet()) {
                    String sessionAttributesValue = sessionAttributesEntry.getValue();
                    if (sessionAttributesValue != null) {
                        jsonWriter.name(sessionAttributesEntry.getKey());
                        jsonWriter.value(sessionAttributesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putSessionRequest.getDialogAction() != null) {
                DialogAction dialogAction = putSessionRequest.getDialogAction();
                jsonWriter.name("dialogAction");
                DialogActionJsonMarshaller.getInstance().marshall(dialogAction, jsonWriter);
            }
            if (putSessionRequest.getRecentIntentSummaryView() != null) {
                java.util.List<IntentSummary> recentIntentSummaryView = putSessionRequest
                        .getRecentIntentSummaryView();
                jsonWriter.name("recentIntentSummaryView");
                jsonWriter.beginArray();
                for (IntentSummary recentIntentSummaryViewItem : recentIntentSummaryView) {
                    if (recentIntentSummaryViewItem != null) {
                        IntentSummaryJsonMarshaller.getInstance().marshall(
                                recentIntentSummaryViewItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (putSessionRequest.getActiveContexts() != null) {
                java.util.List<ActiveContext> activeContexts = putSessionRequest
                        .getActiveContexts();
                jsonWriter.name("activeContexts");
                jsonWriter.beginArray();
                for (ActiveContext activeContextsItem : activeContexts) {
                    if (activeContextsItem != null) {
                        ActiveContextJsonMarshaller.getInstance().marshall(activeContextsItem,
                                jsonWriter);
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
