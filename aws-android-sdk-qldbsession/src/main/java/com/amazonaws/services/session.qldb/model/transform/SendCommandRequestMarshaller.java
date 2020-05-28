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

package com.amazonaws.services.session.qldb.model.transform;

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
import com.amazonaws.services.session.qldb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for SendCommandRequest
 */
public class SendCommandRequestMarshaller implements
        Marshaller<Request<SendCommandRequest>, SendCommandRequest> {

    public Request<SendCommandRequest> marshall(SendCommandRequest sendCommandRequest) {
        if (sendCommandRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendCommandRequest)");
        }

        Request<SendCommandRequest> request = new DefaultRequest<SendCommandRequest>(
                sendCommandRequest, "AmazonQLDBSession");
        String target = "QLDBSession.SendCommand";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (sendCommandRequest.getSessionToken() != null) {
                String sessionToken = sendCommandRequest.getSessionToken();
                jsonWriter.name("SessionToken");
                jsonWriter.value(sessionToken);
            }
            if (sendCommandRequest.getStartSession() != null) {
                StartSessionRequest startSession = sendCommandRequest.getStartSession();
                jsonWriter.name("StartSession");
                StartSessionRequestJsonMarshaller.getInstance().marshall(startSession, jsonWriter);
            }
            if (sendCommandRequest.getStartTransaction() != null) {
                StartTransactionRequest startTransaction = sendCommandRequest.getStartTransaction();
                jsonWriter.name("StartTransaction");
                StartTransactionRequestJsonMarshaller.getInstance().marshall(startTransaction,
                        jsonWriter);
            }
            if (sendCommandRequest.getEndSession() != null) {
                EndSessionRequest endSession = sendCommandRequest.getEndSession();
                jsonWriter.name("EndSession");
                EndSessionRequestJsonMarshaller.getInstance().marshall(endSession, jsonWriter);
            }
            if (sendCommandRequest.getCommitTransaction() != null) {
                CommitTransactionRequest commitTransaction = sendCommandRequest
                        .getCommitTransaction();
                jsonWriter.name("CommitTransaction");
                CommitTransactionRequestJsonMarshaller.getInstance().marshall(commitTransaction,
                        jsonWriter);
            }
            if (sendCommandRequest.getAbortTransaction() != null) {
                AbortTransactionRequest abortTransaction = sendCommandRequest.getAbortTransaction();
                jsonWriter.name("AbortTransaction");
                AbortTransactionRequestJsonMarshaller.getInstance().marshall(abortTransaction,
                        jsonWriter);
            }
            if (sendCommandRequest.getExecuteStatement() != null) {
                ExecuteStatementRequest executeStatement = sendCommandRequest.getExecuteStatement();
                jsonWriter.name("ExecuteStatement");
                ExecuteStatementRequestJsonMarshaller.getInstance().marshall(executeStatement,
                        jsonWriter);
            }
            if (sendCommandRequest.getFetchPage() != null) {
                FetchPageRequest fetchPage = sendCommandRequest.getFetchPage();
                jsonWriter.name("FetchPage");
                FetchPageRequestJsonMarshaller.getInstance().marshall(fetchPage, jsonWriter);
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
