/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetMetricDataV2Request
 */
public class GetMetricDataV2RequestMarshaller implements
        Marshaller<Request<GetMetricDataV2Request>, GetMetricDataV2Request> {

    public Request<GetMetricDataV2Request> marshall(GetMetricDataV2Request getMetricDataV2Request) {
        if (getMetricDataV2Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetMetricDataV2Request)");
        }

        Request<GetMetricDataV2Request> request = new DefaultRequest<GetMetricDataV2Request>(
                getMetricDataV2Request, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/metrics/data";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getMetricDataV2Request.getResourceArn() != null) {
                String resourceArn = getMetricDataV2Request.getResourceArn();
                jsonWriter.name("ResourceArn");
                jsonWriter.value(resourceArn);
            }
            if (getMetricDataV2Request.getStartTime() != null) {
                java.util.Date startTime = getMetricDataV2Request.getStartTime();
                jsonWriter.name("StartTime");
                jsonWriter.value(startTime);
            }
            if (getMetricDataV2Request.getEndTime() != null) {
                java.util.Date endTime = getMetricDataV2Request.getEndTime();
                jsonWriter.name("EndTime");
                jsonWriter.value(endTime);
            }
            if (getMetricDataV2Request.getFilters() != null) {
                java.util.List<FilterV2> filters = getMetricDataV2Request.getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginArray();
                for (FilterV2 filtersItem : filters) {
                    if (filtersItem != null) {
                        FilterV2JsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getMetricDataV2Request.getGroupings() != null) {
                java.util.List<String> groupings = getMetricDataV2Request.getGroupings();
                jsonWriter.name("Groupings");
                jsonWriter.beginArray();
                for (String groupingsItem : groupings) {
                    if (groupingsItem != null) {
                        jsonWriter.value(groupingsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getMetricDataV2Request.getMetrics() != null) {
                java.util.List<MetricV2> metrics = getMetricDataV2Request.getMetrics();
                jsonWriter.name("Metrics");
                jsonWriter.beginArray();
                for (MetricV2 metricsItem : metrics) {
                    if (metricsItem != null) {
                        MetricV2JsonMarshaller.getInstance().marshall(metricsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getMetricDataV2Request.getNextToken() != null) {
                String nextToken = getMetricDataV2Request.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getMetricDataV2Request.getMaxResults() != null) {
                Integer maxResults = getMetricDataV2Request.getMaxResults();
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
