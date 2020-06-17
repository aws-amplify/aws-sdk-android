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
 * JSON marshaller for POJO LaunchTemplateBlockDeviceMappingRequest
 */
class LaunchTemplateBlockDeviceMappingRequestJsonMarshaller {

    public void marshall(
            LaunchTemplateBlockDeviceMappingRequest launchTemplateBlockDeviceMappingRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateBlockDeviceMappingRequest.getDeviceName() != null) {
            String deviceName = launchTemplateBlockDeviceMappingRequest.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (launchTemplateBlockDeviceMappingRequest.getVirtualName() != null) {
            String virtualName = launchTemplateBlockDeviceMappingRequest.getVirtualName();
            jsonWriter.name("VirtualName");
            jsonWriter.value(virtualName);
        }
        if (launchTemplateBlockDeviceMappingRequest.getEbs() != null) {
            LaunchTemplateEbsBlockDeviceRequest ebs = launchTemplateBlockDeviceMappingRequest
                    .getEbs();
            jsonWriter.name("Ebs");
            LaunchTemplateEbsBlockDeviceRequestJsonMarshaller.getInstance().marshall(ebs,
                    jsonWriter);
        }
        if (launchTemplateBlockDeviceMappingRequest.getNoDevice() != null) {
            String noDevice = launchTemplateBlockDeviceMappingRequest.getNoDevice();
            jsonWriter.name("NoDevice");
            jsonWriter.value(noDevice);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateBlockDeviceMappingRequestJsonMarshaller instance;

    public static LaunchTemplateBlockDeviceMappingRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateBlockDeviceMappingRequestJsonMarshaller();
        return instance;
    }
}
