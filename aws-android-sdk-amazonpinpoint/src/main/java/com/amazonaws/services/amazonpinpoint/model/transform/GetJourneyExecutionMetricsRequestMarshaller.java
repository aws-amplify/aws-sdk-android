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

package com.amazonaws.services.amazonpinpoint.model.transform;

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
import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetJourneyExecutionMetricsRequest
 */
public class GetJourneyExecutionMetricsRequestMarshaller implements
        Marshaller<Request<GetJourneyExecutionMetricsRequest>, GetJourneyExecutionMetricsRequest> {

    public Request<GetJourneyExecutionMetricsRequest> marshall(
            GetJourneyExecutionMetricsRequest getJourneyExecutionMetricsRequest) {
        if (getJourneyExecutionMetricsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetJourneyExecutionMetricsRequest)");
        }

        Request<GetJourneyExecutionMetricsRequest> request = new DefaultRequest<GetJourneyExecutionMetricsRequest>(
                getJourneyExecutionMetricsRequest, "AmazonPinpoint");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/journeys/{journey-id}/execution-metrics";
        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (getJourneyExecutionMetricsRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(getJourneyExecutionMetricsRequest.getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{journey-id}",
                (getJourneyExecutionMetricsRequest.getJourneyId() == null) ? "" : StringUtils
                        .fromString(getJourneyExecutionMetricsRequest.getJourneyId()));
        if (getJourneyExecutionMetricsRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(getJourneyExecutionMetricsRequest.getNextToken()));
        }
        if (getJourneyExecutionMetricsRequest.getPageSize() != null) {
            request.addParameter("page-size",
                    StringUtils.fromString(getJourneyExecutionMetricsRequest.getPageSize()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
