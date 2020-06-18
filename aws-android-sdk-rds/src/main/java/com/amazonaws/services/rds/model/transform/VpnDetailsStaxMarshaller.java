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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO VpnDetails
 */
class VpnDetailsStaxMarshaller {

    public void marshall(VpnDetails _vpnDetails, Request<?> request, String _prefix) {
        String prefix;
        if (_vpnDetails.getVpnId() != null) {
            prefix = _prefix + "VpnId";
            String vpnId = _vpnDetails.getVpnId();
            request.addParameter(prefix, StringUtils.fromString(vpnId));
        }
        if (_vpnDetails.getVpnTunnelOriginatorIP() != null) {
            prefix = _prefix + "VpnTunnelOriginatorIP";
            String vpnTunnelOriginatorIP = _vpnDetails.getVpnTunnelOriginatorIP();
            request.addParameter(prefix, StringUtils.fromString(vpnTunnelOriginatorIP));
        }
        if (_vpnDetails.getVpnGatewayIp() != null) {
            prefix = _prefix + "VpnGatewayIp";
            String vpnGatewayIp = _vpnDetails.getVpnGatewayIp();
            request.addParameter(prefix, StringUtils.fromString(vpnGatewayIp));
        }
        if (_vpnDetails.getVpnPSK() != null) {
            prefix = _prefix + "VpnPSK";
            String vpnPSK = _vpnDetails.getVpnPSK();
            request.addParameter(prefix, StringUtils.fromString(vpnPSK));
        }
        if (_vpnDetails.getVpnName() != null) {
            prefix = _prefix + "VpnName";
            String vpnName = _vpnDetails.getVpnName();
            request.addParameter(prefix, StringUtils.fromString(vpnName));
        }
        if (_vpnDetails.getVpnState() != null) {
            prefix = _prefix + "VpnState";
            String vpnState = _vpnDetails.getVpnState();
            request.addParameter(prefix, StringUtils.fromString(vpnState));
        }
    }

    private static VpnDetailsStaxMarshaller instance;

    public static VpnDetailsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new VpnDetailsStaxMarshaller();
        return instance;
    }
}
