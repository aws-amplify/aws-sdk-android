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

package com.amazonaws.services.elasticmapreduce.model.transform;

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
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DescribeJobFlowsRequest
 */
public class DescribeJobFlowsRequestMarshaller implements
        Marshaller<Request<DescribeJobFlowsRequest>, DescribeJobFlowsRequest> {

    public Request<DescribeJobFlowsRequest> marshall(DescribeJobFlowsRequest describeJobFlowsRequest) {
        if (describeJobFlowsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeJobFlowsRequest)");
        }

        Request<DescribeJobFlowsRequest> request = new DefaultRequest<DescribeJobFlowsRequest>(
                describeJobFlowsRequest, "AmazonElasticMapReduce");
        String target = "ElasticMapReduce.DescribeJobFlows";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeJobFlowsRequest.getCreatedAfter() != null) {
                java.util.Date createdAfter = describeJobFlowsRequest.getCreatedAfter();
                jsonWriter.name("CreatedAfter");
                jsonWriter.value(createdAfter);
            }
            if (describeJobFlowsRequest.getCreatedBefore() != null) {
                java.util.Date createdBefore = describeJobFlowsRequest.getCreatedBefore();
                jsonWriter.name("CreatedBefore");
                jsonWriter.value(createdBefore);
            }
            if (describeJobFlowsRequest.getJobFlowIds() != null) {
                java.util.List<String> jobFlowIds = describeJobFlowsRequest.getJobFlowIds();
                jsonWriter.name("JobFlowIds");
                jsonWriter.beginArray();
                for (String jobFlowIdsItem : jobFlowIds) {
                    if (jobFlowIdsItem != null) {
                        jsonWriter.value(jobFlowIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeJobFlowsRequest.getJobFlowStates() != null) {
                java.util.List<String> jobFlowStates = describeJobFlowsRequest.getJobFlowStates();
                jsonWriter.name("JobFlowStates");
                jsonWriter.beginArray();
                for (String jobFlowStatesItem : jobFlowStates) {
                    if (jobFlowStatesItem != null) {
                        jsonWriter.value(jobFlowStatesItem);
                    }
                }
                jsonWriter.endArray();
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
