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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BlockDeviceMapping
 */
class BlockDeviceMappingJsonMarshaller {

    public void marshall(BlockDeviceMapping blockDeviceMapping, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (blockDeviceMapping.getDeviceName() != null) {
            String deviceName = blockDeviceMapping.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (blockDeviceMapping.getVirtualName() != null) {
            String virtualName = blockDeviceMapping.getVirtualName();
            jsonWriter.name("VirtualName");
            jsonWriter.value(virtualName);
        }
        if (blockDeviceMapping.getEbs() != null) {
            EbsBlockDevice ebs = blockDeviceMapping.getEbs();
            jsonWriter.name("Ebs");
            EbsBlockDeviceJsonMarshaller.getInstance().marshall(ebs, jsonWriter);
        }
        if (blockDeviceMapping.getNoDevice() != null) {
            String noDevice = blockDeviceMapping.getNoDevice();
            jsonWriter.name("NoDevice");
            jsonWriter.value(noDevice);
        }
        jsonWriter.endObject();
    }

    private static BlockDeviceMappingJsonMarshaller instance;

    public static BlockDeviceMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlockDeviceMappingJsonMarshaller();
        return instance;
    }
}
