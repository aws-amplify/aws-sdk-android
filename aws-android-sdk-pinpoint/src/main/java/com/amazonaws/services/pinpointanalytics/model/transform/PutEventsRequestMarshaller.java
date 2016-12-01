/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpointanalytics.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.pinpointanalytics.model.Event;
import com.amazonaws.services.pinpointanalytics.model.PutEventsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.zip.GZIPOutputStream;

/**
 * JSON request marshaller for PutEventsRequest
 */
public class PutEventsRequestMarshaller implements
        Marshaller<Request<PutEventsRequest>, PutEventsRequest> {

    @Override
    public Request<PutEventsRequest> marshall(PutEventsRequest putEventsRequest) {
        if (putEventsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutEventsRequest)");
        }

        final Request<PutEventsRequest> request = new DefaultRequest<PutEventsRequest>(putEventsRequest,
                "AmazonPinpointAnalytics");
        request.setHttpMethod(HttpMethodName.POST);

        if (putEventsRequest.getClientContext() != null) {
            request.addHeader("x-amz-Client-Context",
                    StringUtils.fromString(putEventsRequest.getClientContext()));
        }
        if (putEventsRequest.getClientContextEncoding() != null) {
            request.addHeader("x-amz-Client-Context-Encoding",
                    StringUtils.fromString(putEventsRequest.getClientContextEncoding()));
        }
        final String uriResourcePath = "/2014-06-05/events";
        request.setResourcePath(uriResourcePath);
        try {
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final GZIPOutputStream gos = new GZIPOutputStream(baos, 8192);
            final Writer writer = new OutputStreamWriter(gos, StringUtils.UTF8);
            final AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(writer);
            jsonWriter.beginObject();

            if (putEventsRequest.getEvents() != null) {
                final java.util.List<Event> events = putEventsRequest.getEvents();
                jsonWriter.name("events");
                jsonWriter.beginArray();
                for (final Event eventsItem : events) {
                    if (eventsItem != null) {
                        EventJsonMarshaller.getInstance().marshall(eventsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
            jsonWriter.flush();
            gos.finish();
            writer.close();

            final byte[] content = baos.toByteArray();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Encoding", "gzip");
        } catch (final Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
