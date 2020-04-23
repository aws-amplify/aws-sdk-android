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

package com.amazonaws.services.applicationautoscaling.model.transform;

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
import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DescribeScalableTargetsRequest
 */
public class DescribeScalableTargetsRequestMarshaller implements
        Marshaller<Request<DescribeScalableTargetsRequest>, DescribeScalableTargetsRequest> {

    public Request<DescribeScalableTargetsRequest> marshall(
            DescribeScalableTargetsRequest describeScalableTargetsRequest) {
        if (describeScalableTargetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeScalableTargetsRequest)");
        }

        Request<DescribeScalableTargetsRequest> request = new DefaultRequest<DescribeScalableTargetsRequest>(
                describeScalableTargetsRequest, "ApplicationAutoScaling");
        String target = "AnyScaleFrontendService.DescribeScalableTargets";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeScalableTargetsRequest.getServiceNamespace() != null) {
                String serviceNamespace = describeScalableTargetsRequest.getServiceNamespace();
                jsonWriter.name("ServiceNamespace");
                jsonWriter.value(serviceNamespace);
            }
            if (describeScalableTargetsRequest.getResourceIds() != null) {
                java.util.List<String> resourceIds = describeScalableTargetsRequest
                        .getResourceIds();
                jsonWriter.name("ResourceIds");
                jsonWriter.beginArray();
                for (String resourceIdsItem : resourceIds) {
                    if (resourceIdsItem != null) {
                        jsonWriter.value(resourceIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeScalableTargetsRequest.getScalableDimension() != null) {
                String scalableDimension = describeScalableTargetsRequest.getScalableDimension();
                jsonWriter.name("ScalableDimension");
                jsonWriter.value(scalableDimension);
            }
            if (describeScalableTargetsRequest.getMaxResults() != null) {
                Integer maxResults = describeScalableTargetsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (describeScalableTargetsRequest.getNextToken() != null) {
                String nextToken = describeScalableTargetsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
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
