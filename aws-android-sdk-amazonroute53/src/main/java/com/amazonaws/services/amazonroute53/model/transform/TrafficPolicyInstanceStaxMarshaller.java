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
 * StAX marshaller for POJO TrafficPolicyInstance
 */
class TrafficPolicyInstanceStaxMarshaller {

    public void marshall(TrafficPolicyInstance _trafficPolicyInstance, Request<?> request,
            String _prefix) {
        String prefix;
        if (_trafficPolicyInstance.getId() != null) {
            prefix = _prefix + "Id";
            String id = _trafficPolicyInstance.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_trafficPolicyInstance.getHostedZoneId() != null) {
            prefix = _prefix + "HostedZoneId";
            String hostedZoneId = _trafficPolicyInstance.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
        if (_trafficPolicyInstance.getName() != null) {
            prefix = _prefix + "Name";
            String name = _trafficPolicyInstance.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_trafficPolicyInstance.getTTL() != null) {
            prefix = _prefix + "TTL";
            Long tTL = _trafficPolicyInstance.getTTL();
            request.addParameter(prefix, StringUtils.fromLong(tTL));
        }
        if (_trafficPolicyInstance.getState() != null) {
            prefix = _prefix + "State";
            String state = _trafficPolicyInstance.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
        if (_trafficPolicyInstance.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _trafficPolicyInstance.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (_trafficPolicyInstance.getTrafficPolicyId() != null) {
            prefix = _prefix + "TrafficPolicyId";
            String trafficPolicyId = _trafficPolicyInstance.getTrafficPolicyId();
            request.addParameter(prefix, StringUtils.fromString(trafficPolicyId));
        }
        if (_trafficPolicyInstance.getTrafficPolicyVersion() != null) {
            prefix = _prefix + "TrafficPolicyVersion";
            Integer trafficPolicyVersion = _trafficPolicyInstance.getTrafficPolicyVersion();
            request.addParameter(prefix, StringUtils.fromInteger(trafficPolicyVersion));
        }
        if (_trafficPolicyInstance.getTrafficPolicyType() != null) {
            prefix = _prefix + "TrafficPolicyType";
            String trafficPolicyType = _trafficPolicyInstance.getTrafficPolicyType();
            request.addParameter(prefix, StringUtils.fromString(trafficPolicyType));
        }
    }

    private static TrafficPolicyInstanceStaxMarshaller instance;

    public static TrafficPolicyInstanceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficPolicyInstanceStaxMarshaller();
        return instance;
    }
}
