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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Scte35DeliveryRestrictions
 */
class Scte35DeliveryRestrictionsJsonMarshaller {

    public void marshall(Scte35DeliveryRestrictions scte35DeliveryRestrictions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scte35DeliveryRestrictions.getArchiveAllowedFlag() != null) {
            String archiveAllowedFlag = scte35DeliveryRestrictions.getArchiveAllowedFlag();
            jsonWriter.name("ArchiveAllowedFlag");
            jsonWriter.value(archiveAllowedFlag);
        }
        if (scte35DeliveryRestrictions.getDeviceRestrictions() != null) {
            String deviceRestrictions = scte35DeliveryRestrictions.getDeviceRestrictions();
            jsonWriter.name("DeviceRestrictions");
            jsonWriter.value(deviceRestrictions);
        }
        if (scte35DeliveryRestrictions.getNoRegionalBlackoutFlag() != null) {
            String noRegionalBlackoutFlag = scte35DeliveryRestrictions.getNoRegionalBlackoutFlag();
            jsonWriter.name("NoRegionalBlackoutFlag");
            jsonWriter.value(noRegionalBlackoutFlag);
        }
        if (scte35DeliveryRestrictions.getWebDeliveryAllowedFlag() != null) {
            String webDeliveryAllowedFlag = scte35DeliveryRestrictions.getWebDeliveryAllowedFlag();
            jsonWriter.name("WebDeliveryAllowedFlag");
            jsonWriter.value(webDeliveryAllowedFlag);
        }
        jsonWriter.endObject();
    }

    private static Scte35DeliveryRestrictionsJsonMarshaller instance;

    public static Scte35DeliveryRestrictionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Scte35DeliveryRestrictionsJsonMarshaller();
        return instance;
    }
}
