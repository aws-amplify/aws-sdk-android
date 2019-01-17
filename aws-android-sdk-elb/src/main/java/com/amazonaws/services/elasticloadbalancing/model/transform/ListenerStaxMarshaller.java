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
 * StAX marshaller for POJO Listener
 */
class ListenerStaxMarshaller {

    public void marshall(Listener _listener, Request<?> request, String _prefix) {
        String prefix;
        if (_listener.getProtocol() != null) {
            prefix = _prefix + "Protocol";
            String protocol = _listener.getProtocol();
            request.addParameter(prefix, StringUtils.fromString(protocol));
        }
        if (_listener.getLoadBalancerPort() != null) {
            prefix = _prefix + "LoadBalancerPort";
            Integer loadBalancerPort = _listener.getLoadBalancerPort();
            request.addParameter(prefix, StringUtils.fromInteger(loadBalancerPort));
        }
        if (_listener.getInstanceProtocol() != null) {
            prefix = _prefix + "InstanceProtocol";
            String instanceProtocol = _listener.getInstanceProtocol();
            request.addParameter(prefix, StringUtils.fromString(instanceProtocol));
        }
        if (_listener.getInstancePort() != null) {
            prefix = _prefix + "InstancePort";
            Integer instancePort = _listener.getInstancePort();
            request.addParameter(prefix, StringUtils.fromInteger(instancePort));
        }
        if (_listener.getSSLCertificateId() != null) {
            prefix = _prefix + "SSLCertificateId";
            String sSLCertificateId = _listener.getSSLCertificateId();
            request.addParameter(prefix, StringUtils.fromString(sSLCertificateId));
        }
    }

    private static ListenerStaxMarshaller instance;

    public static ListenerStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ListenerStaxMarshaller();
        return instance;
    }
}
