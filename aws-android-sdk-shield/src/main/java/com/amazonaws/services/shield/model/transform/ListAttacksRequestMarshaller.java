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

package com.amazonaws.services.shield.model.transform;

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
import com.amazonaws.services.shield.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListAttacksRequest
 */
public class ListAttacksRequestMarshaller implements
        Marshaller<Request<ListAttacksRequest>, ListAttacksRequest> {

    public Request<ListAttacksRequest> marshall(ListAttacksRequest listAttacksRequest) {
        if (listAttacksRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListAttacksRequest)");
        }

        Request<ListAttacksRequest> request = new DefaultRequest<ListAttacksRequest>(
                listAttacksRequest, "AWSShield");
        String target = "AWSShield_20160616.ListAttacks";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listAttacksRequest.getResourceArns() != null) {
                java.util.List<String> resourceArns = listAttacksRequest.getResourceArns();
                jsonWriter.name("ResourceArns");
                jsonWriter.beginArray();
                for (String resourceArnsItem : resourceArns) {
                    if (resourceArnsItem != null) {
                        jsonWriter.value(resourceArnsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (listAttacksRequest.getStartTime() != null) {
                TimeRange startTime = listAttacksRequest.getStartTime();
                jsonWriter.name("StartTime");
                TimeRangeJsonMarshaller.getInstance().marshall(startTime, jsonWriter);
            }
            if (listAttacksRequest.getEndTime() != null) {
                TimeRange endTime = listAttacksRequest.getEndTime();
                jsonWriter.name("EndTime");
                TimeRangeJsonMarshaller.getInstance().marshall(endTime, jsonWriter);
            }
            if (listAttacksRequest.getNextToken() != null) {
                String nextToken = listAttacksRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listAttacksRequest.getMaxResults() != null) {
                Integer maxResults = listAttacksRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
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
