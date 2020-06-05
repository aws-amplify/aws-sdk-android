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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LoadBalancerDescription
 */
class LoadBalancerDescriptionStaxMarshaller {

    public void marshall(LoadBalancerDescription _loadBalancerDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_loadBalancerDescription.getLoadBalancerName() != null) {
            prefix = _prefix + "LoadBalancerName";
            String loadBalancerName = _loadBalancerDescription.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (_loadBalancerDescription.getDomain() != null) {
            prefix = _prefix + "Domain";
            String domain = _loadBalancerDescription.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (_loadBalancerDescription.getListeners() != null) {
            prefix = _prefix + "Listeners";
            java.util.List<Listener> listeners = _loadBalancerDescription.getListeners();
            int listenersIndex = 1;
            String listenersPrefix = prefix;
            for (Listener listenersItem : listeners) {
                prefix = listenersPrefix + ".member." + listenersIndex;
                if (listenersItem != null) {
                    ListenerStaxMarshaller.getInstance().marshall(listenersItem, request,
                            prefix + ".");
                }
                listenersIndex++;
            }
            prefix = listenersPrefix;
        }
    }

    private static LoadBalancerDescriptionStaxMarshaller instance;

    public static LoadBalancerDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerDescriptionStaxMarshaller();
        return instance;
    }
}
