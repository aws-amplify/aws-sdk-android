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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DvbNitSettings
 */
class DvbNitSettingsJsonMarshaller {

    public void marshall(DvbNitSettings dvbNitSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dvbNitSettings.getNetworkId() != null) {
            Integer networkId = dvbNitSettings.getNetworkId();
            jsonWriter.name("NetworkId");
            jsonWriter.value(networkId);
        }
        if (dvbNitSettings.getNetworkName() != null) {
            String networkName = dvbNitSettings.getNetworkName();
            jsonWriter.name("NetworkName");
            jsonWriter.value(networkName);
        }
        if (dvbNitSettings.getNitInterval() != null) {
            Integer nitInterval = dvbNitSettings.getNitInterval();
            jsonWriter.name("NitInterval");
            jsonWriter.value(nitInterval);
        }
        jsonWriter.endObject();
    }

    private static DvbNitSettingsJsonMarshaller instance;

    public static DvbNitSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DvbNitSettingsJsonMarshaller();
        return instance;
    }
}
