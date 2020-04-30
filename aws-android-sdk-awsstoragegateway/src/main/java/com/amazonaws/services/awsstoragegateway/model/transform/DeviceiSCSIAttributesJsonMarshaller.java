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
 * JSON marshaller for POJO DeviceiSCSIAttributes
 */
class DeviceiSCSIAttributesJsonMarshaller {

    public void marshall(DeviceiSCSIAttributes deviceiSCSIAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deviceiSCSIAttributes.getTargetARN() != null) {
            String targetARN = deviceiSCSIAttributes.getTargetARN();
            jsonWriter.name("TargetARN");
            jsonWriter.value(targetARN);
        }
        if (deviceiSCSIAttributes.getNetworkInterfaceId() != null) {
            String networkInterfaceId = deviceiSCSIAttributes.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (deviceiSCSIAttributes.getNetworkInterfacePort() != null) {
            Integer networkInterfacePort = deviceiSCSIAttributes.getNetworkInterfacePort();
            jsonWriter.name("NetworkInterfacePort");
            jsonWriter.value(networkInterfacePort);
        }
        if (deviceiSCSIAttributes.getChapEnabled() != null) {
            Boolean chapEnabled = deviceiSCSIAttributes.getChapEnabled();
            jsonWriter.name("ChapEnabled");
            jsonWriter.value(chapEnabled);
        }
        jsonWriter.endObject();
    }

    private static DeviceiSCSIAttributesJsonMarshaller instance;

    public static DeviceiSCSIAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceiSCSIAttributesJsonMarshaller();
        return instance;
    }
}
