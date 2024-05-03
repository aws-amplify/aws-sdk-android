/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateContactEvaluationRequest
 */
public class UpdateContactEvaluationRequestMarshaller implements
        Marshaller<Request<UpdateContactEvaluationRequest>, UpdateContactEvaluationRequest> {

    public Request<UpdateContactEvaluationRequest> marshall(
            UpdateContactEvaluationRequest updateContactEvaluationRequest) {
        if (updateContactEvaluationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateContactEvaluationRequest)");
        }

        Request<UpdateContactEvaluationRequest> request = new DefaultRequest<UpdateContactEvaluationRequest>(
                updateContactEvaluationRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/contact-evaluations/{InstanceId}/{EvaluationId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (updateContactEvaluationRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(updateContactEvaluationRequest.getInstanceId()));
        uriResourcePath = uriResourcePath.replace(
                "{EvaluationId}",
                (updateContactEvaluationRequest.getEvaluationId() == null) ? "" : StringUtils
                        .fromString(updateContactEvaluationRequest.getEvaluationId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateContactEvaluationRequest.getAnswers() != null) {
                java.util.Map<String, EvaluationAnswerInput> answers = updateContactEvaluationRequest
                        .getAnswers();
                jsonWriter.name("Answers");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, EvaluationAnswerInput> answersEntry : answers
                        .entrySet()) {
                    EvaluationAnswerInput answersValue = answersEntry.getValue();
                    if (answersValue != null) {
                        jsonWriter.name(answersEntry.getKey());
                        EvaluationAnswerInputJsonMarshaller.getInstance().marshall(answersValue,
                                jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }
            if (updateContactEvaluationRequest.getNotes() != null) {
                java.util.Map<String, EvaluationNote> notes = updateContactEvaluationRequest
                        .getNotes();
                jsonWriter.name("Notes");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, EvaluationNote> notesEntry : notes.entrySet()) {
                    EvaluationNote notesValue = notesEntry.getValue();
                    if (notesValue != null) {
                        jsonWriter.name(notesEntry.getKey());
                        EvaluationNoteJsonMarshaller.getInstance().marshall(notesValue, jsonWriter);
                    }
                }
                jsonWriter.endObject();
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
