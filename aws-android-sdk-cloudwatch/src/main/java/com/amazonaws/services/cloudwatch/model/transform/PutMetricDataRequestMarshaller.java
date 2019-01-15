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
 * StAX request marshaller for PutMetricDataRequest
 */
public class PutMetricDataRequestMarshaller implements
        Marshaller<Request<PutMetricDataRequest>, PutMetricDataRequest> {

    public Request<PutMetricDataRequest> marshall(PutMetricDataRequest putMetricDataRequest) {
        if (putMetricDataRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutMetricDataRequest)");
        }

        Request<PutMetricDataRequest> request = new DefaultRequest<PutMetricDataRequest>(
                putMetricDataRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutMetricData");
        request.addParameter("Version", "2010-08-01");

        String prefix;
        if (putMetricDataRequest.getNamespace() != null) {
            prefix = "Namespace";
            String namespace = putMetricDataRequest.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (putMetricDataRequest.getMetricData() != null) {
            prefix = "MetricData";
            java.util.List<MetricDatum> metricData = putMetricDataRequest.getMetricData();
            int metricDataIndex = 1;
            String metricDataPrefix = prefix;
            for (MetricDatum metricDataItem : metricData) {
                prefix = metricDataPrefix + ".member." + metricDataIndex;
                if (metricDataItem != null) {
                    MetricDatumStaxMarshaller.getInstance().marshall(metricDataItem, request,
                            prefix + ".");
                }
                metricDataIndex++;
            }
            prefix = metricDataPrefix;
        }

        return request;
    }
}
