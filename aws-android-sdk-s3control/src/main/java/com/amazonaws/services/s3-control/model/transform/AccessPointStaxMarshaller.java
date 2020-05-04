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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AccessPoint
 */
class AccessPointStaxMarshaller {

    public void marshall(AccessPoint _accessPoint, Request<?> request, String _prefix) {
        String prefix;
        if (_accessPoint.getName() != null) {
            prefix = _prefix + "Name";
            String name = _accessPoint.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_accessPoint.getNetworkOrigin() != null) {
            prefix = _prefix + "NetworkOrigin";
            String networkOrigin = _accessPoint.getNetworkOrigin();
            request.addParameter(prefix, StringUtils.fromString(networkOrigin));
        }
        if (_accessPoint.getVpcConfiguration() != null) {
            prefix = _prefix + "VpcConfiguration";
            VpcConfiguration vpcConfiguration = _accessPoint.getVpcConfiguration();
            VpcConfigurationStaxMarshaller.getInstance().marshall(vpcConfiguration, request, prefix + ".");
        }
        if (_accessPoint.getBucket() != null) {
            prefix = _prefix + "Bucket";
            String bucket = _accessPoint.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
    }

    private static AccessPointStaxMarshaller instance;
    public static AccessPointStaxMarshaller getInstance() {
        if (instance == null) instance = new AccessPointStaxMarshaller();
        return instance;
    }
}
