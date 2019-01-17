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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO MetricGranularityType
 */
class MetricGranularityTypeStaxMarshaller {

    public void marshall(MetricGranularityType _metricGranularityType, Request<?> request,
            String _prefix) {
        String prefix;
        if (_metricGranularityType.getGranularity() != null) {
            prefix = _prefix + "Granularity";
            String granularity = _metricGranularityType.getGranularity();
            request.addParameter(prefix, StringUtils.fromString(granularity));
        }
    }

    private static MetricGranularityTypeStaxMarshaller instance;

    public static MetricGranularityTypeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MetricGranularityTypeStaxMarshaller();
        return instance;
    }
}
