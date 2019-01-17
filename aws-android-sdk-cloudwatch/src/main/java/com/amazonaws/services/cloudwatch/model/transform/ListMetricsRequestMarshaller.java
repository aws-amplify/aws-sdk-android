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
 * StAX request marshaller for ListMetricsRequest
 */
public class ListMetricsRequestMarshaller implements
        Marshaller<Request<ListMetricsRequest>, ListMetricsRequest> {

    public Request<ListMetricsRequest> marshall(ListMetricsRequest listMetricsRequest) {
        if (listMetricsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListMetricsRequest)");
        }

        Request<ListMetricsRequest> request = new DefaultRequest<ListMetricsRequest>(
                listMetricsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "ListMetrics");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (listMetricsRequest.getNamespace() != null) {
            prefix = "Namespace";
            String namespace = listMetricsRequest.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (listMetricsRequest.getMetricName() != null) {
            prefix = "MetricName";
            String metricName = listMetricsRequest.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (listMetricsRequest.getDimensions() != null) {
            prefix = "Dimensions";
            java.util.List<DimensionFilter> dimensions = listMetricsRequest.getDimensions();
            int dimensionsIndex = 1;
            String dimensionsPrefix = prefix;
            for (DimensionFilter dimensionsItem : dimensions) {
                prefix = dimensionsPrefix + ".member." + dimensionsIndex;
                if (dimensionsItem != null) {
                    DimensionFilterStaxMarshaller.getInstance().marshall(dimensionsItem, request,
                            prefix + ".");
                }
                dimensionsIndex++;
            }
            prefix = dimensionsPrefix;
        }
        if (listMetricsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listMetricsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
