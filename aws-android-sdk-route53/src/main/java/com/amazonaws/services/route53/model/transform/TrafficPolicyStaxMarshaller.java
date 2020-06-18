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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TrafficPolicy
 */
class TrafficPolicyStaxMarshaller {

    public void marshall(TrafficPolicy _trafficPolicy, Request<?> request, String _prefix) {
        String prefix;
        if (_trafficPolicy.getId() != null) {
            prefix = _prefix + "Id";
            String id = _trafficPolicy.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_trafficPolicy.getVersion() != null) {
            prefix = _prefix + "Version";
            Integer version = _trafficPolicy.getVersion();
            request.addParameter(prefix, StringUtils.fromInteger(version));
        }
        if (_trafficPolicy.getName() != null) {
            prefix = _prefix + "Name";
            String name = _trafficPolicy.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_trafficPolicy.getType() != null) {
            prefix = _prefix + "Type";
            String type = _trafficPolicy.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_trafficPolicy.getDocument() != null) {
            prefix = _prefix + "Document";
            String document = _trafficPolicy.getDocument();
            request.addParameter(prefix, StringUtils.fromString(document));
        }
        if (_trafficPolicy.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _trafficPolicy.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
    }

    private static TrafficPolicyStaxMarshaller instance;

    public static TrafficPolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficPolicyStaxMarshaller();
        return instance;
    }
}
