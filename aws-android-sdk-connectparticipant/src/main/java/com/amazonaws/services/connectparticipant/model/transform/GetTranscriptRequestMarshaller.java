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

package com.amazonaws.services.connectparticipant.model.transform;

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
import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetTranscriptRequest
 */
public class GetTranscriptRequestMarshaller implements
        Marshaller<Request<GetTranscriptRequest>, GetTranscriptRequest> {

    public Request<GetTranscriptRequest> marshall(GetTranscriptRequest getTranscriptRequest) {
        if (getTranscriptRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetTranscriptRequest)");
        }

        Request<GetTranscriptRequest> request = new DefaultRequest<GetTranscriptRequest>(
                getTranscriptRequest, "AmazonConnectParticipant");
        request.setHttpMethod(HttpMethodName.POST);

        if (getTranscriptRequest.getConnectionToken() != null) {
            request.addHeader("X-Amz-Bearer",
                    StringUtils.fromString(getTranscriptRequest.getConnectionToken()));
        }
        String uriResourcePath = "/participant/transcript";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getTranscriptRequest.getContactId() != null) {
                String contactId = getTranscriptRequest.getContactId();
                jsonWriter.name("ContactId");
                jsonWriter.value(contactId);
            }
            if (getTranscriptRequest.getMaxResults() != null) {
                Integer maxResults = getTranscriptRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getTranscriptRequest.getNextToken() != null) {
                String nextToken = getTranscriptRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getTranscriptRequest.getScanDirection() != null) {
                String scanDirection = getTranscriptRequest.getScanDirection();
                jsonWriter.name("ScanDirection");
                jsonWriter.value(scanDirection);
            }
            if (getTranscriptRequest.getSortOrder() != null) {
                String sortOrder = getTranscriptRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }
            if (getTranscriptRequest.getStartPosition() != null) {
                StartPosition startPosition = getTranscriptRequest.getStartPosition();
                jsonWriter.name("StartPosition");
                StartPositionJsonMarshaller.getInstance().marshall(startPosition, jsonWriter);
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
