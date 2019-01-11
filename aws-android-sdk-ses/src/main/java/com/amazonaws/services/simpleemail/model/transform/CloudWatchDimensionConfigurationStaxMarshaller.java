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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CloudWatchDimensionConfiguration
 */
class CloudWatchDimensionConfigurationStaxMarshaller {

    public void marshall(CloudWatchDimensionConfiguration _cloudWatchDimensionConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cloudWatchDimensionConfiguration.getDimensionName() != null) {
            prefix = _prefix + "DimensionName";
            String dimensionName = _cloudWatchDimensionConfiguration.getDimensionName();
            request.addParameter(prefix, StringUtils.fromString(dimensionName));
        }
        if (_cloudWatchDimensionConfiguration.getDimensionValueSource() != null) {
            prefix = _prefix + "DimensionValueSource";
            String dimensionValueSource = _cloudWatchDimensionConfiguration
                    .getDimensionValueSource();
            request.addParameter(prefix, StringUtils.fromString(dimensionValueSource));
        }
        if (_cloudWatchDimensionConfiguration.getDefaultDimensionValue() != null) {
            prefix = _prefix + "DefaultDimensionValue";
            String defaultDimensionValue = _cloudWatchDimensionConfiguration
                    .getDefaultDimensionValue();
            request.addParameter(prefix, StringUtils.fromString(defaultDimensionValue));
        }
    }

    private static CloudWatchDimensionConfigurationStaxMarshaller instance;

    public static CloudWatchDimensionConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchDimensionConfigurationStaxMarshaller();
        return instance;
    }
}
