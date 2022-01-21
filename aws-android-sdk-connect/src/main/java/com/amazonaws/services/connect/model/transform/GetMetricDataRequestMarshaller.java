/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON request marshaller for GetMetricDataRequest
 */
public class GetMetricDataRequestMarshaller implements
        Marshaller<Request<GetMetricDataRequest>, GetMetricDataRequest> {

    public Request<GetMetricDataRequest> marshall(GetMetricDataRequest getMetricDataRequest) {
        if (getMetricDataRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetMetricDataRequest)");
        }

        Request<GetMetricDataRequest> request = new DefaultRequest<GetMetricDataRequest>(
                getMetricDataRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/metrics/historical/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (getMetricDataRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(getMetricDataRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getMetricDataRequest.getStartTime() != null) {
                java.util.Date startTime = getMetricDataRequest.getStartTime();
                jsonWriter.name("StartTime");
                jsonWriter.value(startTime);
            }
            if (getMetricDataRequest.getEndTime() != null) {
                java.util.Date endTime = getMetricDataRequest.getEndTime();
                jsonWriter.name("EndTime");
                jsonWriter.value(endTime);
            }
            if (getMetricDataRequest.getFilters() != null) {
                Filters filters = getMetricDataRequest.getFilters();
                jsonWriter.name("Filters");
                FiltersJsonMarshaller.getInstance().marshall(filters, jsonWriter);
            }
            if (getMetricDataRequest.getGroupings() != null) {
                java.util.List<String> groupings = getMetricDataRequest.getGroupings();
                jsonWriter.name("Groupings");
                jsonWriter.beginArray();
                for (String groupingsItem : groupings) {
                    if (groupingsItem != null) {
                        jsonWriter.value(groupingsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getMetricDataRequest.getHistoricalMetrics() != null) {
                java.util.List<HistoricalMetric> historicalMetrics = getMetricDataRequest
                        .getHistoricalMetrics();
                jsonWriter.name("HistoricalMetrics");
                jsonWriter.beginArray();
                for (HistoricalMetric historicalMetricsItem : historicalMetrics) {
                    if (historicalMetricsItem != null) {
                        HistoricalMetricJsonMarshaller.getInstance().marshall(
                                historicalMetricsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getMetricDataRequest.getNextToken() != null) {
                String nextToken = getMetricDataRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getMetricDataRequest.getMaxResults() != null) {
                Integer maxResults = getMetricDataRequest.getMaxResults();
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
