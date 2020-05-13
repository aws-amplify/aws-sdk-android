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

package com.amazonaws.services.macie2.model.transform;

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
import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetUsageStatisticsRequest
 */
public class GetUsageStatisticsRequestMarshaller implements
        Marshaller<Request<GetUsageStatisticsRequest>, GetUsageStatisticsRequest> {

    public Request<GetUsageStatisticsRequest> marshall(
            GetUsageStatisticsRequest getUsageStatisticsRequest) {
        if (getUsageStatisticsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetUsageStatisticsRequest)");
        }

        Request<GetUsageStatisticsRequest> request = new DefaultRequest<GetUsageStatisticsRequest>(
                getUsageStatisticsRequest, "AmazonMacie2");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/usage/statistics";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getUsageStatisticsRequest.getFilterBy() != null) {
                java.util.List<UsageStatisticsFilter> filterBy = getUsageStatisticsRequest
                        .getFilterBy();
                jsonWriter.name("filterBy");
                jsonWriter.beginArray();
                for (UsageStatisticsFilter filterByItem : filterBy) {
                    if (filterByItem != null) {
                        UsageStatisticsFilterJsonMarshaller.getInstance().marshall(filterByItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getUsageStatisticsRequest.getMaxResults() != null) {
                Integer maxResults = getUsageStatisticsRequest.getMaxResults();
                jsonWriter.name("maxResults");
                jsonWriter.value(maxResults);
            }
            if (getUsageStatisticsRequest.getNextToken() != null) {
                String nextToken = getUsageStatisticsRequest.getNextToken();
                jsonWriter.name("nextToken");
                jsonWriter.value(nextToken);
            }
            if (getUsageStatisticsRequest.getSortBy() != null) {
                UsageStatisticsSortBy sortBy = getUsageStatisticsRequest.getSortBy();
                jsonWriter.name("sortBy");
                UsageStatisticsSortByJsonMarshaller.getInstance().marshall(sortBy, jsonWriter);
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
