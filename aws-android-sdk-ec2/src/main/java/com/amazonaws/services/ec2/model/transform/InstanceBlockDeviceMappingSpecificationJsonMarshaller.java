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
 * JSON marshaller for POJO InstanceBlockDeviceMappingSpecification
 */
class InstanceBlockDeviceMappingSpecificationJsonMarshaller {

    public void marshall(
            InstanceBlockDeviceMappingSpecification instanceBlockDeviceMappingSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceBlockDeviceMappingSpecification.getDeviceName() != null) {
            String deviceName = instanceBlockDeviceMappingSpecification.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (instanceBlockDeviceMappingSpecification.getEbs() != null) {
            EbsInstanceBlockDeviceSpecification ebs = instanceBlockDeviceMappingSpecification
                    .getEbs();
            jsonWriter.name("Ebs");
            EbsInstanceBlockDeviceSpecificationJsonMarshaller.getInstance().marshall(ebs,
                    jsonWriter);
        }
        if (instanceBlockDeviceMappingSpecification.getNoDevice() != null) {
            String noDevice = instanceBlockDeviceMappingSpecification.getNoDevice();
            jsonWriter.name("NoDevice");
            jsonWriter.value(noDevice);
        }
        if (instanceBlockDeviceMappingSpecification.getVirtualName() != null) {
            String virtualName = instanceBlockDeviceMappingSpecification.getVirtualName();
            jsonWriter.name("VirtualName");
            jsonWriter.value(virtualName);
        }
        jsonWriter.endObject();
    }

    private static InstanceBlockDeviceMappingSpecificationJsonMarshaller instance;

    public static InstanceBlockDeviceMappingSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceBlockDeviceMappingSpecificationJsonMarshaller();
        return instance;
    }
}
