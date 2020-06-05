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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ApplicationMetrics
 */
class ApplicationMetricsStaxMarshaller {

    public void marshall(ApplicationMetrics _applicationMetrics, Request<?> request, String _prefix) {
        String prefix;
        if (_applicationMetrics.getDuration() != null) {
            prefix = _prefix + "Duration";
            Integer duration = _applicationMetrics.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (_applicationMetrics.getRequestCount() != null) {
            prefix = _prefix + "RequestCount";
            Integer requestCount = _applicationMetrics.getRequestCount();
            request.addParameter(prefix, StringUtils.fromInteger(requestCount));
        }
        if (_applicationMetrics.getStatusCodes() != null) {
            prefix = _prefix + "StatusCodes";
            StatusCodes statusCodes = _applicationMetrics.getStatusCodes();
            StatusCodesStaxMarshaller.getInstance().marshall(statusCodes, request, prefix + ".");
        }
        if (_applicationMetrics.getLatency() != null) {
            prefix = _prefix + "Latency";
            Latency latency = _applicationMetrics.getLatency();
            LatencyStaxMarshaller.getInstance().marshall(latency, request, prefix + ".");
        }
    }

    private static ApplicationMetricsStaxMarshaller instance;

    public static ApplicationMetricsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationMetricsStaxMarshaller();
        return instance;
    }
}
