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
 * StAX marshaller for POJO Origin
 */
class OriginStaxMarshaller {

    public void marshall(Origin _origin, Request<?> request, String _prefix) {
        String prefix;
        if (_origin.getId() != null) {
            prefix = _prefix + "Id";
            String id = _origin.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_origin.getDomainName() != null) {
            prefix = _prefix + "DomainName";
            String domainName = _origin.getDomainName();
            request.addParameter(prefix, StringUtils.fromString(domainName));
        }
        if (_origin.getOriginPath() != null) {
            prefix = _prefix + "OriginPath";
            String originPath = _origin.getOriginPath();
            request.addParameter(prefix, StringUtils.fromString(originPath));
        }
        if (_origin.getCustomHeaders() != null) {
            prefix = _prefix + "CustomHeaders";
            CustomHeaders customHeaders = _origin.getCustomHeaders();
            CustomHeadersStaxMarshaller.getInstance()
                    .marshall(customHeaders, request, prefix + ".");
        }
        if (_origin.getS3OriginConfig() != null) {
            prefix = _prefix + "S3OriginConfig";
            S3OriginConfig s3OriginConfig = _origin.getS3OriginConfig();
            S3OriginConfigStaxMarshaller.getInstance().marshall(s3OriginConfig, request,
                    prefix + ".");
        }
        if (_origin.getCustomOriginConfig() != null) {
            prefix = _prefix + "CustomOriginConfig";
            CustomOriginConfig customOriginConfig = _origin.getCustomOriginConfig();
            CustomOriginConfigStaxMarshaller.getInstance().marshall(customOriginConfig, request,
                    prefix + ".");
        }
        if (_origin.getConnectionAttempts() != null) {
            prefix = _prefix + "ConnectionAttempts";
            Integer connectionAttempts = _origin.getConnectionAttempts();
            request.addParameter(prefix, StringUtils.fromInteger(connectionAttempts));
        }
        if (_origin.getConnectionTimeout() != null) {
            prefix = _prefix + "ConnectionTimeout";
            Integer connectionTimeout = _origin.getConnectionTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(connectionTimeout));
        }
    }

    private static OriginStaxMarshaller instance;

    public static OriginStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OriginStaxMarshaller();
        return instance;
    }
}
