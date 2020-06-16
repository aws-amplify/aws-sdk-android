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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CustomOriginConfig
 */
class CustomOriginConfigStaxMarshaller {

    public void marshall(CustomOriginConfig _customOriginConfig, Request<?> request, String _prefix) {
        String prefix;
        if (_customOriginConfig.getHTTPPort() != null) {
            prefix = _prefix + "HTTPPort";
            Integer hTTPPort = _customOriginConfig.getHTTPPort();
            request.addParameter(prefix, StringUtils.fromInteger(hTTPPort));
        }
        if (_customOriginConfig.getHTTPSPort() != null) {
            prefix = _prefix + "HTTPSPort";
            Integer hTTPSPort = _customOriginConfig.getHTTPSPort();
            request.addParameter(prefix, StringUtils.fromInteger(hTTPSPort));
        }
        if (_customOriginConfig.getOriginProtocolPolicy() != null) {
            prefix = _prefix + "OriginProtocolPolicy";
            String originProtocolPolicy = _customOriginConfig.getOriginProtocolPolicy();
            request.addParameter(prefix, StringUtils.fromString(originProtocolPolicy));
        }
        if (_customOriginConfig.getOriginSslProtocols() != null) {
            prefix = _prefix + "OriginSslProtocols";
            OriginSslProtocols originSslProtocols = _customOriginConfig.getOriginSslProtocols();
            OriginSslProtocolsStaxMarshaller.getInstance().marshall(originSslProtocols, request,
                    prefix + ".");
        }
        if (_customOriginConfig.getOriginReadTimeout() != null) {
            prefix = _prefix + "OriginReadTimeout";
            Integer originReadTimeout = _customOriginConfig.getOriginReadTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(originReadTimeout));
        }
        if (_customOriginConfig.getOriginKeepaliveTimeout() != null) {
            prefix = _prefix + "OriginKeepaliveTimeout";
            Integer originKeepaliveTimeout = _customOriginConfig.getOriginKeepaliveTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(originKeepaliveTimeout));
        }
    }

    private static CustomOriginConfigStaxMarshaller instance;

    public static CustomOriginConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CustomOriginConfigStaxMarshaller();
        return instance;
    }
}
