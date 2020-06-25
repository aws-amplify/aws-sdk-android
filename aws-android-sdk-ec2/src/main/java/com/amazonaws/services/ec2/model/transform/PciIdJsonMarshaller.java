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
 * JSON marshaller for POJO PciId
 */
class PciIdJsonMarshaller {

    public void marshall(PciId pciId, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pciId.getDeviceId() != null) {
            String deviceId = pciId.getDeviceId();
            jsonWriter.name("DeviceId");
            jsonWriter.value(deviceId);
        }
        if (pciId.getVendorId() != null) {
            String vendorId = pciId.getVendorId();
            jsonWriter.name("VendorId");
            jsonWriter.value(vendorId);
        }
        if (pciId.getSubsystemId() != null) {
            String subsystemId = pciId.getSubsystemId();
            jsonWriter.name("SubsystemId");
            jsonWriter.value(subsystemId);
        }
        if (pciId.getSubsystemVendorId() != null) {
            String subsystemVendorId = pciId.getSubsystemVendorId();
            jsonWriter.name("SubsystemVendorId");
            jsonWriter.value(subsystemVendorId);
        }
        jsonWriter.endObject();
    }

    private static PciIdJsonMarshaller instance;

    public static PciIdJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PciIdJsonMarshaller();
        return instance;
    }
}
