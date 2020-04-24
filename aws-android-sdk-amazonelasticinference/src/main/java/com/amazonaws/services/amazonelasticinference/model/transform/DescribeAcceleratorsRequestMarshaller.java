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

package com.amazonaws.services.amazonelasticinference.model.transform;

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
import com.amazonaws.services.amazonelasticinference.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DescribeAcceleratorsRequest
 */
public class DescribeAcceleratorsRequestMarshaller implements
        Marshaller<Request<DescribeAcceleratorsRequest>, DescribeAcceleratorsRequest> {

    public Request<DescribeAcceleratorsRequest> marshall(
            DescribeAcceleratorsRequest describeAcceleratorsRequest) {
        if (describeAcceleratorsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeAcceleratorsRequest)");
        }

        Request<DescribeAcceleratorsRequest> request = new DefaultRequest<DescribeAcceleratorsRequest>(
                describeAcceleratorsRequest, "AmazonElasticInference");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/describe-accelerators";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeAcceleratorsRequest.getAcceleratorIds() != null) {
                java.util.List<String> acceleratorIds = describeAcceleratorsRequest
                        .getAcceleratorIds();
                jsonWriter.name("acceleratorIds");
                jsonWriter.beginArray();
                for (String acceleratorIdsItem : acceleratorIds) {
                    if (acceleratorIdsItem != null) {
                        jsonWriter.value(acceleratorIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeAcceleratorsRequest.getFilters() != null) {
                java.util.List<Filter> filters = describeAcceleratorsRequest.getFilters();
                jsonWriter.name("filters");
                jsonWriter.beginArray();
                for (Filter filtersItem : filters) {
                    if (filtersItem != null) {
                        FilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeAcceleratorsRequest.getMaxResults() != null) {
                Integer maxResults = describeAcceleratorsRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (describeAcceleratorsRequest.getNextToken() != null) {
                String nextToken = describeAcceleratorsRequest.getNextToken();
                jsonWriter.name("nextToken");
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
