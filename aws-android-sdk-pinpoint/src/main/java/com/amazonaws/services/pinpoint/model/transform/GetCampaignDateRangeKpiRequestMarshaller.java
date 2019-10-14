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
 * JSON request marshaller for GetCampaignDateRangeKpiRequest
 */
public class GetCampaignDateRangeKpiRequestMarshaller implements
        Marshaller<Request<GetCampaignDateRangeKpiRequest>, GetCampaignDateRangeKpiRequest> {

    public Request<GetCampaignDateRangeKpiRequest> marshall(
            GetCampaignDateRangeKpiRequest getCampaignDateRangeKpiRequest) {
        if (getCampaignDateRangeKpiRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetCampaignDateRangeKpiRequest)");
        }

        Request<GetCampaignDateRangeKpiRequest> request = new DefaultRequest<GetCampaignDateRangeKpiRequest>(
                getCampaignDateRangeKpiRequest, "AmazonPinpoint");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/campaigns/{campaign-id}/kpis/daterange/{kpi-name}";
        uriResourcePath = uriResourcePath.replace(
                "{application-id}",
                (getCampaignDateRangeKpiRequest.getApplicationId() == null) ? "" : StringUtils
                        .fromString(getCampaignDateRangeKpiRequest.getApplicationId()));
        uriResourcePath = uriResourcePath.replace(
                "{campaign-id}",
                (getCampaignDateRangeKpiRequest.getCampaignId() == null) ? "" : StringUtils
                        .fromString(getCampaignDateRangeKpiRequest.getCampaignId()));
        if (getCampaignDateRangeKpiRequest.getEndTime() != null) {
            request.addParameter("end-time",
                    StringUtils.fromDate(getCampaignDateRangeKpiRequest.getEndTime()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{kpi-name}",
                (getCampaignDateRangeKpiRequest.getKpiName() == null) ? "" : StringUtils
                        .fromString(getCampaignDateRangeKpiRequest.getKpiName()));
        if (getCampaignDateRangeKpiRequest.getNextToken() != null) {
            request.addParameter("next-token",
                    StringUtils.fromString(getCampaignDateRangeKpiRequest.getNextToken()));
        }
        if (getCampaignDateRangeKpiRequest.getPageSize() != null) {
            request.addParameter("page-size",
                    StringUtils.fromString(getCampaignDateRangeKpiRequest.getPageSize()));
        }
        if (getCampaignDateRangeKpiRequest.getStartTime() != null) {
            request.addParameter("start-time",
                    StringUtils.fromDate(getCampaignDateRangeKpiRequest.getStartTime()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
