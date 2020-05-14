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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceBlockDeviceMapping
 */
class InstanceBlockDeviceMappingJsonMarshaller {

    public void marshall(InstanceBlockDeviceMapping instanceBlockDeviceMapping,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceBlockDeviceMapping.getDeviceName() != null) {
            String deviceName = instanceBlockDeviceMapping.getDeviceName();
            jsonWriter.name("deviceName");
            jsonWriter.value(deviceName);
        }
        if (instanceBlockDeviceMapping.getEbs() != null) {
            EbsInstanceBlockDeviceSpecification ebs = instanceBlockDeviceMapping.getEbs();
            jsonWriter.name("ebs");
            EbsInstanceBlockDeviceSpecificationJsonMarshaller.getInstance().marshall(ebs,
                    jsonWriter);
        }
        if (instanceBlockDeviceMapping.getVirtualName() != null) {
            String virtualName = instanceBlockDeviceMapping.getVirtualName();
            jsonWriter.name("virtualName");
            jsonWriter.value(virtualName);
        }
        if (instanceBlockDeviceMapping.getNoDevice() != null) {
            String noDevice = instanceBlockDeviceMapping.getNoDevice();
            jsonWriter.name("noDevice");
            jsonWriter.value(noDevice);
        }
        jsonWriter.endObject();
    }

    private static InstanceBlockDeviceMappingJsonMarshaller instance;

    public static InstanceBlockDeviceMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceBlockDeviceMappingJsonMarshaller();
        return instance;
    }
}
