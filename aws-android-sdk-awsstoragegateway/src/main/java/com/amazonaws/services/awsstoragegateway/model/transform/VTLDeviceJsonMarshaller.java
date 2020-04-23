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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VTLDevice
 */
class VTLDeviceJsonMarshaller {

    public void marshall(VTLDevice vTLDevice, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vTLDevice.getVTLDeviceARN() != null) {
            String vTLDeviceARN = vTLDevice.getVTLDeviceARN();
            jsonWriter.name("VTLDeviceARN");
            jsonWriter.value(vTLDeviceARN);
        }
        if (vTLDevice.getVTLDeviceType() != null) {
            String vTLDeviceType = vTLDevice.getVTLDeviceType();
            jsonWriter.name("VTLDeviceType");
            jsonWriter.value(vTLDeviceType);
        }
        if (vTLDevice.getVTLDeviceVendor() != null) {
            String vTLDeviceVendor = vTLDevice.getVTLDeviceVendor();
            jsonWriter.name("VTLDeviceVendor");
            jsonWriter.value(vTLDeviceVendor);
        }
        if (vTLDevice.getVTLDeviceProductIdentifier() != null) {
            String vTLDeviceProductIdentifier = vTLDevice.getVTLDeviceProductIdentifier();
            jsonWriter.name("VTLDeviceProductIdentifier");
            jsonWriter.value(vTLDeviceProductIdentifier);
        }
        if (vTLDevice.getDeviceiSCSIAttributes() != null) {
            DeviceiSCSIAttributes deviceiSCSIAttributes = vTLDevice.getDeviceiSCSIAttributes();
            jsonWriter.name("DeviceiSCSIAttributes");
            DeviceiSCSIAttributesJsonMarshaller.getInstance().marshall(deviceiSCSIAttributes,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static VTLDeviceJsonMarshaller instance;

    public static VTLDeviceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VTLDeviceJsonMarshaller();
        return instance;
    }
}
