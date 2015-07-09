/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mobileanalytics.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;
import java.util.zip.GZIPOutputStream;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.mobileanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * Put Events Request Marshaller
 */
public class PutEventsRequestMarshaller implements Marshaller<Request<PutEventsRequest>, PutEventsRequest> {

    public Request<PutEventsRequest> marshall(PutEventsRequest putEventsRequest) {
    if (putEventsRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<PutEventsRequest> request = new DefaultRequest<PutEventsRequest>(putEventsRequest, "AmazonMobileAnalytics");
        String target = "AmazonMobileAnalytics.PutEvents";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        if (putEventsRequest.getClientContext() != null)
          request.addHeader("x-amz-Client-Context", StringUtils.fromString(putEventsRequest.getClientContext()));
        
        if (putEventsRequest.getClientContextEncoding() != null)
          request.addHeader("x-amz-Client-Context-Encoding", StringUtils.fromString(putEventsRequest.getClientContextEncoding()));
        
        String uriResourcePath = "/2014-06-05/events"; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            GZIPOutputStream gos = new GZIPOutputStream(baos, 8192);
            Writer writer = new OutputStreamWriter(gos, StringUtils.UTF8);
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(writer);

            jsonWriter.beginObject();

            com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Event>)(putEventsRequest.getEvents());
            if (eventsList != null && !(eventsList.isAutoConstruct() && eventsList.isEmpty())) {

                jsonWriter.name("events");
                jsonWriter.beginArray();

                for (Event eventsListValue : eventsList) {
                    if (eventsListValue != null) {
                        jsonWriter.beginObject();
                        if (eventsListValue.getEventType() != null) {
                            jsonWriter.name("eventType").value(eventsListValue.getEventType());
                        }
                        if (eventsListValue.getTimestamp() != null) {
                            jsonWriter.name("timestamp").value(eventsListValue.getTimestamp());
                        }
                        Session session = eventsListValue.getSession();
                        if (session != null) {

                            jsonWriter.name("session");
                            jsonWriter.beginObject();

                            if (session.getId() != null) {
                                jsonWriter.name("id").value(session.getId());
                            }
                            if (session.getDuration() != null) {
                                jsonWriter.name("duration").value(session.getDuration());
                            }
                            if (session.getStartTimestamp() != null) {
                                jsonWriter.name("startTimestamp").value(session.getStartTimestamp());
                            }
                            if (session.getStopTimestamp() != null) {
                                jsonWriter.name("stopTimestamp").value(session.getStopTimestamp());
                            }
                            jsonWriter.endObject();
                        }
                        if (eventsListValue.getVersion() != null) {
                            jsonWriter.name("version").value(eventsListValue.getVersion());
                        }
                        if (eventsListValue.getAttributes() != null) {
                            jsonWriter.name("attributes");
                            jsonWriter.beginObject();
                            for (Map.Entry<String, String> attributesListValue : eventsListValue.getAttributes().entrySet()) {
                                if (attributesListValue.getValue() != null) {
                                    jsonWriter.name(attributesListValue.getKey());

                                    jsonWriter.value(attributesListValue.getValue());
                                }
                            }
                            jsonWriter.endObject();
                        }
                        if (eventsListValue.getMetrics() != null) {
                            jsonWriter.name("metrics");
                            jsonWriter.beginObject();
                            for (Map.Entry<String, Double> metricsListValue : eventsListValue.getMetrics().entrySet()) {
                                if (metricsListValue.getValue() != null) {
                                    jsonWriter.name(metricsListValue.getKey());

                                    jsonWriter.value(metricsListValue.getValue());
                                }
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
            jsonWriter.flush();
            gos.finish();
            writer.close();

            byte[] content = baos.toByteArray();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
            request.addHeader("Content-Encoding", "gzip");
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
