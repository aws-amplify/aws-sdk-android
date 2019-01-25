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

package com.amazonaws.services.cloudwatch.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetMetricStatisticsRequest
 */
public class GetMetricStatisticsRequestMarshaller implements
        Marshaller<Request<GetMetricStatisticsRequest>, GetMetricStatisticsRequest> {

    public Request<GetMetricStatisticsRequest> marshall(
            GetMetricStatisticsRequest getMetricStatisticsRequest) {
        if (getMetricStatisticsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetMetricStatisticsRequest)");
        }

        Request<GetMetricStatisticsRequest> request = new DefaultRequest<GetMetricStatisticsRequest>(
                getMetricStatisticsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "GetMetricStatistics");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (getMetricStatisticsRequest.getNamespace() != null) {
            prefix = "Namespace";
            String namespace = getMetricStatisticsRequest.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (getMetricStatisticsRequest.getMetricName() != null) {
            prefix = "MetricName";
            String metricName = getMetricStatisticsRequest.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (getMetricStatisticsRequest.getDimensions() != null) {
            prefix = "Dimensions";
            java.util.List<Dimension> dimensions = getMetricStatisticsRequest.getDimensions();
            int dimensionsIndex = 1;
            String dimensionsPrefix = prefix;
            for (Dimension dimensionsItem : dimensions) {
                prefix = dimensionsPrefix + ".member." + dimensionsIndex;
                if (dimensionsItem != null) {
                    DimensionStaxMarshaller.getInstance().marshall(dimensionsItem, request,
                            prefix + ".");
                }
                dimensionsIndex++;
            }
            prefix = dimensionsPrefix;
        }
        if (getMetricStatisticsRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = getMetricStatisticsRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (getMetricStatisticsRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = getMetricStatisticsRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (getMetricStatisticsRequest.getPeriod() != null) {
            prefix = "Period";
            Integer period = getMetricStatisticsRequest.getPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(period));
        }
        if (getMetricStatisticsRequest.getStatistics() != null) {
            prefix = "Statistics";
            java.util.List<String> statistics = getMetricStatisticsRequest.getStatistics();
            int statisticsIndex = 1;
            String statisticsPrefix = prefix;
            for (String statisticsItem : statistics) {
                prefix = statisticsPrefix + ".member." + statisticsIndex;
                if (statisticsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(statisticsItem));
                }
                statisticsIndex++;
            }
            prefix = statisticsPrefix;
        }
        if (getMetricStatisticsRequest.getUnit() != null) {
            prefix = "Unit";
            String unit = getMetricStatisticsRequest.getUnit();
            request.addParameter(prefix, StringUtils.fromString(unit));
        }

        return request;
    }
}
