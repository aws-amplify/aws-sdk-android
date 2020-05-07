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
 * JSON request marshaller for StartQueryRequest
 */
public class StartQueryRequestMarshaller implements
        Marshaller<Request<StartQueryRequest>, StartQueryRequest> {

    public Request<StartQueryRequest> marshall(StartQueryRequest startQueryRequest) {
        if (startQueryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartQueryRequest)");
        }

        Request<StartQueryRequest> request = new DefaultRequest<StartQueryRequest>(
                startQueryRequest, "AmazonCloudWatchLogs");
        String target = "Logs_20140328.StartQuery";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startQueryRequest.getLogGroupName() != null) {
                String logGroupName = startQueryRequest.getLogGroupName();
                jsonWriter.name("logGroupName");
                jsonWriter.value(logGroupName);
            }
            if (startQueryRequest.getLogGroupNames() != null) {
                java.util.List<String> logGroupNames = startQueryRequest.getLogGroupNames();
                jsonWriter.name("logGroupNames");
                jsonWriter.beginArray();
                for (String logGroupNamesItem : logGroupNames) {
                    if (logGroupNamesItem != null) {
                        jsonWriter.value(logGroupNamesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (startQueryRequest.getStartTime() != null) {
                Long startTime = startQueryRequest.getStartTime();
                jsonWriter.name("startTime");
                jsonWriter.value(startTime);
            }
            if (startQueryRequest.getEndTime() != null) {
                Long endTime = startQueryRequest.getEndTime();
                jsonWriter.name("endTime");
                jsonWriter.value(endTime);
            }
            if (startQueryRequest.getQueryString() != null) {
                String queryString = startQueryRequest.getQueryString();
                jsonWriter.name("queryString");
                jsonWriter.value(queryString);
            }
            if (startQueryRequest.getLimit() != null) {
                Integer limit = startQueryRequest.getLimit();
                jsonWriter.name("limit");
                jsonWriter.value(limit);
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
