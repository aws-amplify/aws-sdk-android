/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for DescribeLogGroupsRequest
 */
public class DescribeLogGroupsRequestMarshaller implements
        Marshaller<Request<DescribeLogGroupsRequest>, DescribeLogGroupsRequest> {

    public Request<DescribeLogGroupsRequest> marshall(
            DescribeLogGroupsRequest describeLogGroupsRequest) {
        if (describeLogGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLogGroupsRequest)");
        }

        Request<DescribeLogGroupsRequest> request = new DefaultRequest<DescribeLogGroupsRequest>(
                describeLogGroupsRequest, "AmazonCloudWatchLogs");
        String target = "Logs_20140328.DescribeLogGroups";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeLogGroupsRequest.getLogGroupNamePrefix() != null) {
                String logGroupNamePrefix = describeLogGroupsRequest.getLogGroupNamePrefix();
                jsonWriter.name("logGroupNamePrefix");
                jsonWriter.value(logGroupNamePrefix);
            }
            if (describeLogGroupsRequest.getNextToken() != null) {
                String nextToken = describeLogGroupsRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (describeLogGroupsRequest.getLimit() != null) {
                Integer limit = describeLogGroupsRequest.getLimit();
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
