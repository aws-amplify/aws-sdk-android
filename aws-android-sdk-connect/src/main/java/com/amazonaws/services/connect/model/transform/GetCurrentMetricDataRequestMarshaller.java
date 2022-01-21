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
 * JSON request marshaller for GetCurrentMetricDataRequest
 */
public class GetCurrentMetricDataRequestMarshaller implements
        Marshaller<Request<GetCurrentMetricDataRequest>, GetCurrentMetricDataRequest> {

    public Request<GetCurrentMetricDataRequest> marshall(
            GetCurrentMetricDataRequest getCurrentMetricDataRequest) {
        if (getCurrentMetricDataRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetCurrentMetricDataRequest)");
        }

        Request<GetCurrentMetricDataRequest> request = new DefaultRequest<GetCurrentMetricDataRequest>(
                getCurrentMetricDataRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/metrics/current/{InstanceId}";
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (getCurrentMetricDataRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(getCurrentMetricDataRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getCurrentMetricDataRequest.getFilters() != null) {
                Filters filters = getCurrentMetricDataRequest.getFilters();
                jsonWriter.name("Filters");
                FiltersJsonMarshaller.getInstance().marshall(filters, jsonWriter);
            }
            if (getCurrentMetricDataRequest.getGroupings() != null) {
                java.util.List<String> groupings = getCurrentMetricDataRequest.getGroupings();
                jsonWriter.name("Groupings");
                jsonWriter.beginArray();
                for (String groupingsItem : groupings) {
                    if (groupingsItem != null) {
                        jsonWriter.value(groupingsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (getCurrentMetricDataRequest.getCurrentMetrics() != null) {
                java.util.List<CurrentMetric> currentMetrics = getCurrentMetricDataRequest
                        .getCurrentMetrics();
                jsonWriter.name("CurrentMetrics");
                jsonWriter.beginArray();
                for (CurrentMetric currentMetricsItem : currentMetrics) {
                    if (currentMetricsItem != null) {
                        CurrentMetricJsonMarshaller.getInstance().marshall(currentMetricsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (getCurrentMetricDataRequest.getNextToken() != null) {
                String nextToken = getCurrentMetricDataRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getCurrentMetricDataRequest.getMaxResults() != null) {
                Integer maxResults = getCurrentMetricDataRequest.getMaxResults();
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
