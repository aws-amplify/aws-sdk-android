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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InstanceMetadataOptions
 */
class InstanceMetadataOptionsStaxMarshaller {

    public void marshall(InstanceMetadataOptions _instanceMetadataOptions, Request<?> request,
            String _prefix) {
        String prefix;
        if (_instanceMetadataOptions.getHttpTokens() != null) {
            prefix = _prefix + "HttpTokens";
            String httpTokens = _instanceMetadataOptions.getHttpTokens();
            request.addParameter(prefix, StringUtils.fromString(httpTokens));
        }
        if (_instanceMetadataOptions.getHttpPutResponseHopLimit() != null) {
            prefix = _prefix + "HttpPutResponseHopLimit";
            Integer httpPutResponseHopLimit = _instanceMetadataOptions.getHttpPutResponseHopLimit();
            request.addParameter(prefix, StringUtils.fromInteger(httpPutResponseHopLimit));
        }
        if (_instanceMetadataOptions.getHttpEndpoint() != null) {
            prefix = _prefix + "HttpEndpoint";
            String httpEndpoint = _instanceMetadataOptions.getHttpEndpoint();
            request.addParameter(prefix, StringUtils.fromString(httpEndpoint));
        }
    }

    private static InstanceMetadataOptionsStaxMarshaller instance;

    public static InstanceMetadataOptionsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceMetadataOptionsStaxMarshaller();
        return instance;
    }
}
