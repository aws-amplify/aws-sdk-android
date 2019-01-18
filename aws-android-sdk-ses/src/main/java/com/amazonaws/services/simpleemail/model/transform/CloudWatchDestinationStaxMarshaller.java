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
 * StAX marshaller for POJO CloudWatchDestination
 */
class CloudWatchDestinationStaxMarshaller {

    public void marshall(CloudWatchDestination _cloudWatchDestination, Request<?> request,
            String _prefix) {
        String prefix;
        if (_cloudWatchDestination.getDimensionConfigurations() != null) {
            prefix = _prefix + "DimensionConfigurations";
            java.util.List<CloudWatchDimensionConfiguration> dimensionConfigurations = _cloudWatchDestination
                    .getDimensionConfigurations();
            int dimensionConfigurationsIndex = 1;
            String dimensionConfigurationsPrefix = prefix;
            for (CloudWatchDimensionConfiguration dimensionConfigurationsItem : dimensionConfigurations) {
                prefix = dimensionConfigurationsPrefix + ".member." + dimensionConfigurationsIndex;
                if (dimensionConfigurationsItem != null) {
                    CloudWatchDimensionConfigurationStaxMarshaller.getInstance().marshall(
                            dimensionConfigurationsItem, request, prefix + ".");
                }
                dimensionConfigurationsIndex++;
            }
            prefix = dimensionConfigurationsPrefix;
        }
    }

    private static CloudWatchDestinationStaxMarshaller instance;

    public static CloudWatchDestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchDestinationStaxMarshaller();
        return instance;
    }
}
