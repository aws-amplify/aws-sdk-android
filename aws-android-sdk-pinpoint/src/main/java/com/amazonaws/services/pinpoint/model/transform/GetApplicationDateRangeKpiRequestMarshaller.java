/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

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
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetApplicationDateRangeKpiRequest
 */
public class GetApplicationDateRangeKpiRequestMarshaller implements
        Marshaller<Request<GetApplicationDateRangeKpiRequest>, GetApplicationDateRangeKpiRequest> {

    public Request<GetApplicationDateRangeKpiRequest> marshall(
            GetApplicationDateRangeKpiRequest getApplicationDateRangeKpiRequest) {
        if (getApplicationDateRangeKpiRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetApplicationDateRangeKpiRequest)");
        }

        Request<GetApplicationDateRangeKpiRequest> request = new DefaultRequest<GetApplicationDateRangeKpiRequest>(
                getApplicationDateRangeKpiRequest, "AmazonPinpoint");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/kpis/daterange/{kpi-name}";
        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (getApplicationDateRangeKpiRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(getApplicationDateRangeKpiRequest.getApplicationId()));
        if (getApplicationDateRangeKpiRequest.getEndTime() != null) {
            request.addParameter("end-time",
                    StringUtils.fromDate(getApplicationDateRangeKpiRequest.getEndTime()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{kpi-name}",
                (getApplicationDateRangeKpiRequest.getKpiName() == null) ? "" : StringUtils
                        .fromString(getApplicationDateRangeKpiRequest.getKpiName()));
        if (getApplicationDateRangeKpiRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(getApplicationDateRangeKpiRequest.getNextToken()));
        }
        if (getApplicationDateRangeKpiRequest.getPageSize() != null) {
            request.addParameter("page-size",
                    StringUtils.fromString(getApplicationDateRangeKpiRequest.getPageSize()));
        }
        if (getApplicationDateRangeKpiRequest.getStartTime() != null) {
            request.addParameter("start-time",
                    StringUtils.fromDate(getApplicationDateRangeKpiRequest.getStartTime()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
