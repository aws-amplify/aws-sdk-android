/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

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
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateFleetMetricRequest
 */
public class UpdateFleetMetricRequestMarshaller implements
        Marshaller<Request<UpdateFleetMetricRequest>, UpdateFleetMetricRequest> {

    public Request<UpdateFleetMetricRequest> marshall(
            UpdateFleetMetricRequest updateFleetMetricRequest) {
        if (updateFleetMetricRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateFleetMetricRequest)");
        }

        Request<UpdateFleetMetricRequest> request = new DefaultRequest<UpdateFleetMetricRequest>(
                updateFleetMetricRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/fleet-metric/{metricName}";
        uriResourcePath = uriResourcePath.replace(
                "{metricName}",
                (updateFleetMetricRequest.getMetricName() == null) ? "" : StringUtils
                        .fromString(updateFleetMetricRequest.getMetricName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateFleetMetricRequest.getQueryString() != null) {
                String queryString = updateFleetMetricRequest.getQueryString();
                jsonWriter.name("queryString");
                jsonWriter.value(queryString);
            }
            if (updateFleetMetricRequest.getAggregationType() != null) {
                AggregationType aggregationType = updateFleetMetricRequest.getAggregationType();
                jsonWriter.name("aggregationType");
                AggregationTypeJsonMarshaller.getInstance().marshall(aggregationType, jsonWriter);
            }
            if (updateFleetMetricRequest.getPeriod() != null) {
                Integer period = updateFleetMetricRequest.getPeriod();
                jsonWriter.name("period");
                jsonWriter.value(period);
            }
            if (updateFleetMetricRequest.getAggregationField() != null) {
                String aggregationField = updateFleetMetricRequest.getAggregationField();
                jsonWriter.name("aggregationField");
                jsonWriter.value(aggregationField);
            }
            if (updateFleetMetricRequest.getDescription() != null) {
                String description = updateFleetMetricRequest.getDescription();
                jsonWriter.name("description");
                jsonWriter.value(description);
            }
            if (updateFleetMetricRequest.getQueryVersion() != null) {
                String queryVersion = updateFleetMetricRequest.getQueryVersion();
                jsonWriter.name("queryVersion");
                jsonWriter.value(queryVersion);
            }
            if (updateFleetMetricRequest.getIndexName() != null) {
                String indexName = updateFleetMetricRequest.getIndexName();
                jsonWriter.name("indexName");
                jsonWriter.value(indexName);
            }
            if (updateFleetMetricRequest.getUnit() != null) {
                String unit = updateFleetMetricRequest.getUnit();
                jsonWriter.name("unit");
                jsonWriter.value(unit);
            }
            if (updateFleetMetricRequest.getExpectedVersion() != null) {
                Long expectedVersion = updateFleetMetricRequest.getExpectedVersion();
                jsonWriter.name("expectedVersion");
                jsonWriter.value(expectedVersion);
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
