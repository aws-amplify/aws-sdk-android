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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackSetOperationPreferences
 */
class StackSetOperationPreferencesStaxMarshaller {

    public void marshall(StackSetOperationPreferences _stackSetOperationPreferences,
            Request<?> request, String _prefix) {
        String prefix;
        if (_stackSetOperationPreferences.getRegionOrder() != null) {
            prefix = _prefix + "RegionOrder";
            java.util.List<String> regionOrder = _stackSetOperationPreferences.getRegionOrder();
            int regionOrderIndex = 1;
            String regionOrderPrefix = prefix;
            for (String regionOrderItem : regionOrder) {
                prefix = regionOrderPrefix + ".member." + regionOrderIndex;
                if (regionOrderItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(regionOrderItem));
                }
                regionOrderIndex++;
            }
            prefix = regionOrderPrefix;
        }
        if (_stackSetOperationPreferences.getFailureToleranceCount() != null) {
            prefix = _prefix + "FailureToleranceCount";
            Integer failureToleranceCount = _stackSetOperationPreferences
                    .getFailureToleranceCount();
            request.addParameter(prefix, StringUtils.fromInteger(failureToleranceCount));
        }
        if (_stackSetOperationPreferences.getFailureTolerancePercentage() != null) {
            prefix = _prefix + "FailureTolerancePercentage";
            Integer failureTolerancePercentage = _stackSetOperationPreferences
                    .getFailureTolerancePercentage();
            request.addParameter(prefix, StringUtils.fromInteger(failureTolerancePercentage));
        }
        if (_stackSetOperationPreferences.getMaxConcurrentCount() != null) {
            prefix = _prefix + "MaxConcurrentCount";
            Integer maxConcurrentCount = _stackSetOperationPreferences.getMaxConcurrentCount();
            request.addParameter(prefix, StringUtils.fromInteger(maxConcurrentCount));
        }
        if (_stackSetOperationPreferences.getMaxConcurrentPercentage() != null) {
            prefix = _prefix + "MaxConcurrentPercentage";
            Integer maxConcurrentPercentage = _stackSetOperationPreferences
                    .getMaxConcurrentPercentage();
            request.addParameter(prefix, StringUtils.fromInteger(maxConcurrentPercentage));
        }
    }

    private static StackSetOperationPreferencesStaxMarshaller instance;

    public static StackSetOperationPreferencesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackSetOperationPreferencesStaxMarshaller();
        return instance;
    }
}
