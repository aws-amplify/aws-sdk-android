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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO RefreshPreferences
 */
class RefreshPreferencesStaxMarshaller {

    public void marshall(RefreshPreferences _refreshPreferences, Request<?> request, String _prefix) {
        String prefix;
        if (_refreshPreferences.getMinHealthyPercentage() != null) {
            prefix = _prefix + "MinHealthyPercentage";
            Integer minHealthyPercentage = _refreshPreferences.getMinHealthyPercentage();
            request.addParameter(prefix, StringUtils.fromInteger(minHealthyPercentage));
        }
        if (_refreshPreferences.getInstanceWarmup() != null) {
            prefix = _prefix + "InstanceWarmup";
            Integer instanceWarmup = _refreshPreferences.getInstanceWarmup();
            request.addParameter(prefix, StringUtils.fromInteger(instanceWarmup));
        }
    }

    private static RefreshPreferencesStaxMarshaller instance;

    public static RefreshPreferencesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RefreshPreferencesStaxMarshaller();
        return instance;
    }
}
