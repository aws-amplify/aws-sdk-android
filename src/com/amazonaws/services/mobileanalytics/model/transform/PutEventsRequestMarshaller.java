/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.mobileanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

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
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();

            com.amazonaws.internal.ListWithAutoConstructFlag<Event> eventsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Event>)(putEventsRequest.getEvents());
            if (eventsList != null && !(eventsList.isAutoConstruct() && eventsList.isEmpty())) {

                jsonWriter.key("events");
                jsonWriter.array();

                for (Event eventsListValue : eventsList) {
                    if (eventsListValue != null) {
                        jsonWriter.object();
                        if (eventsListValue.getEventType() != null) {
                            jsonWriter.key("eventType").value(eventsListValue.getEventType());
                        }
                        if (eventsListValue.getTimestamp() != null) {
                            jsonWriter.key("timestamp").value(eventsListValue.getTimestamp());
                        }
                        Session session = eventsListValue.getSession();
                        if (session != null) {

                            jsonWriter.key("session");
                            jsonWriter.object();

                            if (session.getId() != null) {
                                jsonWriter.key("id").value(session.getId());
                            }
                            if (session.getDuration() != null) {
                                jsonWriter.key("duration").value(session.getDuration());
                            }
                            if (session.getStartTimestamp() != null) {
                                jsonWriter.key("startTimestamp").value(session.getStartTimestamp());
                            }
                            if (session.getStopTimestamp() != null) {
                                jsonWriter.key("stopTimestamp").value(session.getStopTimestamp());
                            }
                            jsonWriter.endObject();
                        }
                        if (eventsListValue.getVersion() != null) {
                            jsonWriter.key("version").value(eventsListValue.getVersion());
                        }
                        if (eventsListValue.getAttributes() != null) {
                            jsonWriter.key("attributes");
                            jsonWriter.object();
                            for (Map.Entry<String, String> attributesListValue : eventsListValue.getAttributes().entrySet()) {
                                if (attributesListValue.getValue() != null) {
                                    jsonWriter.key(attributesListValue.getKey());

                                    jsonWriter.value(attributesListValue.getValue());
                                }
                            }
                            jsonWriter.endObject();
                        }
                        if (eventsListValue.getMetrics() != null) {
                            jsonWriter.key("metrics");
                            jsonWriter.object();
                            for (Map.Entry<String, Double> metricsListValue : eventsListValue.getMetrics().entrySet()) {
                                if (metricsListValue.getValue() != null) {
                                    jsonWriter.key(metricsListValue.getKey());

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

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
