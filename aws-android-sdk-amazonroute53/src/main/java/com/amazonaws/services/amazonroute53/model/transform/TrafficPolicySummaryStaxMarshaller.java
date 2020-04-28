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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TrafficPolicySummary
 */
class TrafficPolicySummaryStaxMarshaller {

    public void marshall(TrafficPolicySummary _trafficPolicySummary, Request<?> request,
            String _prefix) {
        String prefix;
        if (_trafficPolicySummary.getId() != null) {
            prefix = _prefix + "Id";
            String id = _trafficPolicySummary.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_trafficPolicySummary.getName() != null) {
            prefix = _prefix + "Name";
            String name = _trafficPolicySummary.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_trafficPolicySummary.getType() != null) {
            prefix = _prefix + "Type";
            String type = _trafficPolicySummary.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_trafficPolicySummary.getLatestVersion() != null) {
            prefix = _prefix + "LatestVersion";
            Integer latestVersion = _trafficPolicySummary.getLatestVersion();
            request.addParameter(prefix, StringUtils.fromInteger(latestVersion));
        }
        if (_trafficPolicySummary.getTrafficPolicyCount() != null) {
            prefix = _prefix + "TrafficPolicyCount";
            Integer trafficPolicyCount = _trafficPolicySummary.getTrafficPolicyCount();
            request.addParameter(prefix, StringUtils.fromInteger(trafficPolicyCount));
        }
    }

    private static TrafficPolicySummaryStaxMarshaller instance;

    public static TrafficPolicySummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficPolicySummaryStaxMarshaller();
        return instance;
    }
}
