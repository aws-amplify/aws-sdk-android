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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO MetricsConfiguration
 */
class MetricsConfigurationStaxMarshaller {

    public void marshall(MetricsConfiguration _metricsConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_metricsConfiguration.getId() != null) {
            prefix = _prefix + "Id";
            String id = _metricsConfiguration.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_metricsConfiguration.getFilter() != null) {
            prefix = _prefix + "Filter";
            MetricsFilter filter = _metricsConfiguration.getFilter();
            MetricsFilterStaxMarshaller.getInstance().marshall(filter, request, prefix + ".");
        }
    }

    private static MetricsConfigurationStaxMarshaller instance;

    public static MetricsConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MetricsConfigurationStaxMarshaller();
        return instance;
    }
}
