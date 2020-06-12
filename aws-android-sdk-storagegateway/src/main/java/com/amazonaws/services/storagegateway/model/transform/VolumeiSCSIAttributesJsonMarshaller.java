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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VolumeiSCSIAttributes
 */
class VolumeiSCSIAttributesJsonMarshaller {

    public void marshall(VolumeiSCSIAttributes volumeiSCSIAttributes, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeiSCSIAttributes.getTargetARN() != null) {
            String targetARN = volumeiSCSIAttributes.getTargetARN();
            jsonWriter.name("TargetARN");
            jsonWriter.value(targetARN);
        }
        if (volumeiSCSIAttributes.getNetworkInterfaceId() != null) {
            String networkInterfaceId = volumeiSCSIAttributes.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (volumeiSCSIAttributes.getNetworkInterfacePort() != null) {
            Integer networkInterfacePort = volumeiSCSIAttributes.getNetworkInterfacePort();
            jsonWriter.name("NetworkInterfacePort");
            jsonWriter.value(networkInterfacePort);
        }
        if (volumeiSCSIAttributes.getLunNumber() != null) {
            Integer lunNumber = volumeiSCSIAttributes.getLunNumber();
            jsonWriter.name("LunNumber");
            jsonWriter.value(lunNumber);
        }
        if (volumeiSCSIAttributes.getChapEnabled() != null) {
            Boolean chapEnabled = volumeiSCSIAttributes.getChapEnabled();
            jsonWriter.name("ChapEnabled");
            jsonWriter.value(chapEnabled);
        }
        jsonWriter.endObject();
    }

    private static VolumeiSCSIAttributesJsonMarshaller instance;

    public static VolumeiSCSIAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeiSCSIAttributesJsonMarshaller();
        return instance;
    }
}
