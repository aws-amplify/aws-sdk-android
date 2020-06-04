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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DescribeVpcEndpointServiceConfigurationsRequest
 */
public class DescribeVpcEndpointServiceConfigurationsRequestMarshaller
        implements
        Marshaller<Request<DescribeVpcEndpointServiceConfigurationsRequest>, DescribeVpcEndpointServiceConfigurationsRequest> {

    public Request<DescribeVpcEndpointServiceConfigurationsRequest> marshall(
            DescribeVpcEndpointServiceConfigurationsRequest describeVpcEndpointServiceConfigurationsRequest) {
        if (describeVpcEndpointServiceConfigurationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeVpcEndpointServiceConfigurationsRequest)");
        }

        Request<DescribeVpcEndpointServiceConfigurationsRequest> request = new DefaultRequest<DescribeVpcEndpointServiceConfigurationsRequest>(
                describeVpcEndpointServiceConfigurationsRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeVpcEndpointServiceConfigurationsRequest.getDryRun() != null) {
                Boolean dryRun = describeVpcEndpointServiceConfigurationsRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (describeVpcEndpointServiceConfigurationsRequest.getServiceIds() != null) {
                java.util.List<String> serviceIds = describeVpcEndpointServiceConfigurationsRequest
                        .getServiceIds();
                jsonWriter.name("ServiceIds");
                jsonWriter.beginArray();
                for (String serviceIdsItem : serviceIds) {
                    if (serviceIdsItem != null) {
                        jsonWriter.value(serviceIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeVpcEndpointServiceConfigurationsRequest.getFilters() != null) {
                java.util.List<Filter> filters = describeVpcEndpointServiceConfigurationsRequest
                        .getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginArray();
                for (Filter filtersItem : filters) {
                    if (filtersItem != null) {
                        FilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeVpcEndpointServiceConfigurationsRequest.getMaxResults() != null) {
                Integer maxResults = describeVpcEndpointServiceConfigurationsRequest
                        .getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (describeVpcEndpointServiceConfigurationsRequest.getNextToken() != null) {
                String nextToken = describeVpcEndpointServiceConfigurationsRequest.getNextToken();
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
