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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LoadBalancerAttributes
 */
class LoadBalancerAttributesStaxMarshaller {

    public void marshall(LoadBalancerAttributes _loadBalancerAttributes, Request<?> request,
            String _prefix) {
        String prefix;
        if (_loadBalancerAttributes.getCrossZoneLoadBalancing() != null) {
            prefix = _prefix + "CrossZoneLoadBalancing";
            CrossZoneLoadBalancing crossZoneLoadBalancing = _loadBalancerAttributes
                    .getCrossZoneLoadBalancing();
            CrossZoneLoadBalancingStaxMarshaller.getInstance().marshall(crossZoneLoadBalancing,
                    request, prefix + ".");
        }
        if (_loadBalancerAttributes.getAccessLog() != null) {
            prefix = _prefix + "AccessLog";
            AccessLog accessLog = _loadBalancerAttributes.getAccessLog();
            AccessLogStaxMarshaller.getInstance().marshall(accessLog, request, prefix + ".");
        }
        if (_loadBalancerAttributes.getConnectionDraining() != null) {
            prefix = _prefix + "ConnectionDraining";
            ConnectionDraining connectionDraining = _loadBalancerAttributes.getConnectionDraining();
            ConnectionDrainingStaxMarshaller.getInstance().marshall(connectionDraining, request,
                    prefix + ".");
        }
        if (_loadBalancerAttributes.getConnectionSettings() != null) {
            prefix = _prefix + "ConnectionSettings";
            ConnectionSettings connectionSettings = _loadBalancerAttributes.getConnectionSettings();
            ConnectionSettingsStaxMarshaller.getInstance().marshall(connectionSettings, request,
                    prefix + ".");
        }
        if (_loadBalancerAttributes.getAdditionalAttributes() != null) {
            prefix = _prefix + "AdditionalAttributes";
            java.util.List<AdditionalAttribute> additionalAttributes = _loadBalancerAttributes
                    .getAdditionalAttributes();
            int additionalAttributesIndex = 1;
            String additionalAttributesPrefix = prefix;
            for (AdditionalAttribute additionalAttributesItem : additionalAttributes) {
                prefix = additionalAttributesPrefix + ".member." + additionalAttributesIndex;
                if (additionalAttributesItem != null) {
                    AdditionalAttributeStaxMarshaller.getInstance().marshall(
                            additionalAttributesItem, request, prefix + ".");
                }
                additionalAttributesIndex++;
            }
            prefix = additionalAttributesPrefix;
        }
    }

    private static LoadBalancerAttributesStaxMarshaller instance;

    public static LoadBalancerAttributesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerAttributesStaxMarshaller();
        return instance;
    }
}
