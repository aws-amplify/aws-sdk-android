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
 * StAX marshaller for POJO VPC
 */
class VPCStaxMarshaller {

    public void marshall(VPC _vPC, Request<?> request, String _prefix) {
        String prefix;
        if (_vPC.getVPCRegion() != null) {
            prefix = _prefix + "VPCRegion";
            String vPCRegion = _vPC.getVPCRegion();
            request.addParameter(prefix, StringUtils.fromString(vPCRegion));
        }
        if (_vPC.getVPCId() != null) {
            prefix = _prefix + "VPCId";
            String vPCId = _vPC.getVPCId();
            request.addParameter(prefix, StringUtils.fromString(vPCId));
        }
    }

    private static VPCStaxMarshaller instance;

    public static VPCStaxMarshaller getInstance() {
        if (instance == null)
            instance = new VPCStaxMarshaller();
        return instance;
    }
}
