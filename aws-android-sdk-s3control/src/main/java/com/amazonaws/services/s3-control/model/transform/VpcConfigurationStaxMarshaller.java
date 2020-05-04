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
 * StAX marshaller for POJO VpcConfiguration
 */
class VpcConfigurationStaxMarshaller {

    public void marshall(VpcConfiguration _vpcConfiguration, Request<?> request, String _prefix) {
        String prefix;
        if (_vpcConfiguration.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _vpcConfiguration.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
    }

    private static VpcConfigurationStaxMarshaller instance;
    public static VpcConfigurationStaxMarshaller getInstance() {
        if (instance == null) instance = new VpcConfigurationStaxMarshaller();
        return instance;
    }
}
