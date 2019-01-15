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
 * StAX request marshaller for DescribeAlarmsForMetricRequest
 */
public class DescribeAlarmsForMetricRequestMarshaller implements
        Marshaller<Request<DescribeAlarmsForMetricRequest>, DescribeAlarmsForMetricRequest> {

    public Request<DescribeAlarmsForMetricRequest> marshall(
            DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) {
        if (describeAlarmsForMetricRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeAlarmsForMetricRequest)");
        }

        Request<DescribeAlarmsForMetricRequest> request = new DefaultRequest<DescribeAlarmsForMetricRequest>(
                describeAlarmsForMetricRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DescribeAlarmsForMetric");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (describeAlarmsForMetricRequest.getMetricName() != null) {
            prefix = "MetricName";
            String metricName = describeAlarmsForMetricRequest.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (describeAlarmsForMetricRequest.getNamespace() != null) {
            prefix = "Namespace";
            String namespace = describeAlarmsForMetricRequest.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (describeAlarmsForMetricRequest.getStatistic() != null) {
            prefix = "Statistic";
            String statistic = describeAlarmsForMetricRequest.getStatistic();
            request.addParameter(prefix, StringUtils.fromString(statistic));
        }
        if (describeAlarmsForMetricRequest.getDimensions() != null) {
            prefix = "Dimensions";
            java.util.List<Dimension> dimensions = describeAlarmsForMetricRequest.getDimensions();
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
        if (describeAlarmsForMetricRequest.getPeriod() != null) {
            prefix = "Period";
            Integer period = describeAlarmsForMetricRequest.getPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(period));
        }
        if (describeAlarmsForMetricRequest.getUnit() != null) {
            prefix = "Unit";
            String unit = describeAlarmsForMetricRequest.getUnit();
            request.addParameter(prefix, StringUtils.fromString(unit));
        }

        return request;
    }
}
