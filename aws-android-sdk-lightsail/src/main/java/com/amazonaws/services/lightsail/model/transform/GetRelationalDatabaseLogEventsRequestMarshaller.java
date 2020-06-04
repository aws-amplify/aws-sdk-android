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

package com.amazonaws.services.lightsail.model.transform;

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
import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetRelationalDatabaseLogEventsRequest
 */
public class GetRelationalDatabaseLogEventsRequestMarshaller
        implements
        Marshaller<Request<GetRelationalDatabaseLogEventsRequest>, GetRelationalDatabaseLogEventsRequest> {

    public Request<GetRelationalDatabaseLogEventsRequest> marshall(
            GetRelationalDatabaseLogEventsRequest getRelationalDatabaseLogEventsRequest) {
        if (getRelationalDatabaseLogEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetRelationalDatabaseLogEventsRequest)");
        }

        Request<GetRelationalDatabaseLogEventsRequest> request = new DefaultRequest<GetRelationalDatabaseLogEventsRequest>(
                getRelationalDatabaseLogEventsRequest, "AmazonLightsail");
        String target = "Lightsail_20161128.GetRelationalDatabaseLogEvents";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getRelationalDatabaseLogEventsRequest.getRelationalDatabaseName() != null) {
                String relationalDatabaseName = getRelationalDatabaseLogEventsRequest
                        .getRelationalDatabaseName();
                jsonWriter.name("relationalDatabaseName");
                jsonWriter.value(relationalDatabaseName);
            }
            if (getRelationalDatabaseLogEventsRequest.getLogStreamName() != null) {
                String logStreamName = getRelationalDatabaseLogEventsRequest.getLogStreamName();
                jsonWriter.name("logStreamName");
                jsonWriter.value(logStreamName);
            }
            if (getRelationalDatabaseLogEventsRequest.getStartTime() != null) {
                java.util.Date startTime = getRelationalDatabaseLogEventsRequest.getStartTime();
                jsonWriter.name("startTime");
                jsonWriter.value(startTime);
            }
            if (getRelationalDatabaseLogEventsRequest.getEndTime() != null) {
                java.util.Date endTime = getRelationalDatabaseLogEventsRequest.getEndTime();
                jsonWriter.name("endTime");
                jsonWriter.value(endTime);
            }
            if (getRelationalDatabaseLogEventsRequest.getStartFromHead() != null) {
                Boolean startFromHead = getRelationalDatabaseLogEventsRequest.getStartFromHead();
                jsonWriter.name("startFromHead");
                jsonWriter.value(startFromHead);
            }
            if (getRelationalDatabaseLogEventsRequest.getPageToken() != null) {
                String pageToken = getRelationalDatabaseLogEventsRequest.getPageToken();
                jsonWriter.name("pageToken");
                jsonWriter.value(pageToken);
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
