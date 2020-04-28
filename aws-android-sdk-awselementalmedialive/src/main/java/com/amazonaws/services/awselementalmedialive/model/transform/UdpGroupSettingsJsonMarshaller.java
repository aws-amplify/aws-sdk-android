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
 * JSON marshaller for POJO UdpGroupSettings
 */
class UdpGroupSettingsJsonMarshaller {

    public void marshall(UdpGroupSettings udpGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (udpGroupSettings.getInputLossAction() != null) {
            String inputLossAction = udpGroupSettings.getInputLossAction();
            jsonWriter.name("InputLossAction");
            jsonWriter.value(inputLossAction);
        }
        if (udpGroupSettings.getTimedMetadataId3Frame() != null) {
            String timedMetadataId3Frame = udpGroupSettings.getTimedMetadataId3Frame();
            jsonWriter.name("TimedMetadataId3Frame");
            jsonWriter.value(timedMetadataId3Frame);
        }
        if (udpGroupSettings.getTimedMetadataId3Period() != null) {
            Integer timedMetadataId3Period = udpGroupSettings.getTimedMetadataId3Period();
            jsonWriter.name("TimedMetadataId3Period");
            jsonWriter.value(timedMetadataId3Period);
        }
        jsonWriter.endObject();
    }

    private static UdpGroupSettingsJsonMarshaller instance;

    public static UdpGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UdpGroupSettingsJsonMarshaller();
        return instance;
    }
}
