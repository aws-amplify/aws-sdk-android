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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO BlockDeviceMapping
 */
class BlockDeviceMappingStaxMarshaller {

    public void marshall(BlockDeviceMapping _blockDeviceMapping, Request<?> request, String _prefix) {
        String prefix;
        if (_blockDeviceMapping.getVirtualName() != null) {
            prefix = _prefix + "VirtualName";
            String virtualName = _blockDeviceMapping.getVirtualName();
            request.addParameter(prefix, StringUtils.fromString(virtualName));
        }
        if (_blockDeviceMapping.getDeviceName() != null) {
            prefix = _prefix + "DeviceName";
            String deviceName = _blockDeviceMapping.getDeviceName();
            request.addParameter(prefix, StringUtils.fromString(deviceName));
        }
        if (_blockDeviceMapping.getEbs() != null) {
            prefix = _prefix + "Ebs";
            Ebs ebs = _blockDeviceMapping.getEbs();
            EbsStaxMarshaller.getInstance().marshall(ebs, request, prefix + ".");
        }
        if (_blockDeviceMapping.getNoDevice() != null) {
            prefix = _prefix + "NoDevice";
            Boolean noDevice = _blockDeviceMapping.getNoDevice();
            request.addParameter(prefix, StringUtils.fromBoolean(noDevice));
        }
    }

    private static BlockDeviceMappingStaxMarshaller instance;

    public static BlockDeviceMappingStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BlockDeviceMappingStaxMarshaller();
        return instance;
    }
}
