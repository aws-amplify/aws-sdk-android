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
 * StAX marshaller for POJO AnalyticsConfiguration
 */
class AnalyticsConfigurationStaxMarshaller {

    public void marshall(AnalyticsConfiguration _analyticsConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_analyticsConfiguration.getId() != null) {
            prefix = _prefix + "Id";
            String id = _analyticsConfiguration.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_analyticsConfiguration.getFilter() != null) {
            prefix = _prefix + "Filter";
            AnalyticsFilter filter = _analyticsConfiguration.getFilter();
            AnalyticsFilterStaxMarshaller.getInstance().marshall(filter, request, prefix + ".");
        }
        if (_analyticsConfiguration.getStorageClassAnalysis() != null) {
            prefix = _prefix + "StorageClassAnalysis";
            StorageClassAnalysis storageClassAnalysis = _analyticsConfiguration
                    .getStorageClassAnalysis();
            StorageClassAnalysisStaxMarshaller.getInstance().marshall(storageClassAnalysis,
                    request, prefix + ".");
        }
    }

    private static AnalyticsConfigurationStaxMarshaller instance;

    public static AnalyticsConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyticsConfigurationStaxMarshaller();
        return instance;
    }
}
