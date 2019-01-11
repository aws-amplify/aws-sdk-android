/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model.transform;

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
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for FilterLogEventsRequest
 */
public class FilterLogEventsRequestMarshaller implements
        Marshaller<Request<FilterLogEventsRequest>, FilterLogEventsRequest> {

    public Request<FilterLogEventsRequest> marshall(FilterLogEventsRequest filterLogEventsRequest) {
        if (filterLogEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(FilterLogEventsRequest)");
        }

        Request<FilterLogEventsRequest> request = new DefaultRequest<FilterLogEventsRequest>(
                filterLogEventsRequest, "AmazonCloudWatchLogs");
        String target = "Logs_20140328.FilterLogEvents";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (filterLogEventsRequest.getLogGroupName() != null) {
                String logGroupName = filterLogEventsRequest.getLogGroupName();
                jsonWriter.name("logGroupName");
                jsonWriter.value(logGroupName);
            }
            if (filterLogEventsRequest.getLogStreamNames() != null) {
                java.util.List<String> logStreamNames = filterLogEventsRequest.getLogStreamNames();
                jsonWriter.name("logStreamNames");
                jsonWriter.beginArray();
                for (String logStreamNamesItem : logStreamNames) {
                    if (logStreamNamesItem != null) {
                        jsonWriter.value(logStreamNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (filterLogEventsRequest.getLogStreamNamePrefix() != null) {
                String logStreamNamePrefix = filterLogEventsRequest.getLogStreamNamePrefix();
                jsonWriter.name("logStreamNamePrefix");
                jsonWriter.value(logStreamNamePrefix);
            }
            if (filterLogEventsRequest.getStartTime() != null) {
                Long startTime = filterLogEventsRequest.getStartTime();
                jsonWriter.name("startTime");
                jsonWriter.value(startTime);
            }
            if (filterLogEventsRequest.getEndTime() != null) {
                Long endTime = filterLogEventsRequest.getEndTime();
                jsonWriter.name("endTime");
                jsonWriter.value(endTime);
            }
            if (filterLogEventsRequest.getFilterPattern() != null) {
                String filterPattern = filterLogEventsRequest.getFilterPattern();
                jsonWriter.name("filterPattern");
                jsonWriter.value(filterPattern);
            }
            if (filterLogEventsRequest.getNextToken() != null) {
                String nextToken = filterLogEventsRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (filterLogEventsRequest.getLimit() != null) {
                Integer limit = filterLogEventsRequest.getLimit();
                jsonWriter.name("limit");
                jsonWriter.value(limit);
            }
            if (filterLogEventsRequest.getInterleaved() != null) {
                Boolean interleaved = filterLogEventsRequest.getInterleaved();
                jsonWriter.name("interleaved");
                jsonWriter.value(interleaved);
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
