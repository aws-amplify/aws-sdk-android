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
 * StAX marshaller for POJO AliasTarget
 */
class AliasTargetStaxMarshaller {

    public void marshall(AliasTarget _aliasTarget, Request<?> request, String _prefix) {
        String prefix;
        if (_aliasTarget.getHostedZoneId() != null) {
            prefix = _prefix + "HostedZoneId";
            String hostedZoneId = _aliasTarget.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
        if (_aliasTarget.getDNSName() != null) {
            prefix = _prefix + "DNSName";
            String dNSName = _aliasTarget.getDNSName();
            request.addParameter(prefix, StringUtils.fromString(dNSName));
        }
        if (_aliasTarget.getEvaluateTargetHealth() != null) {
            prefix = _prefix + "EvaluateTargetHealth";
            Boolean evaluateTargetHealth = _aliasTarget.getEvaluateTargetHealth();
            request.addParameter(prefix, StringUtils.fromBoolean(evaluateTargetHealth));
        }
    }

    private static AliasTargetStaxMarshaller instance;

    public static AliasTargetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AliasTargetStaxMarshaller();
        return instance;
    }
}
