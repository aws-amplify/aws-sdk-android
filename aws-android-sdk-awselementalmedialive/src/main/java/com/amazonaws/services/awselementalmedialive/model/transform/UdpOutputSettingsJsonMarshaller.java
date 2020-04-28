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
 * JSON marshaller for POJO UdpOutputSettings
 */
class UdpOutputSettingsJsonMarshaller {

    public void marshall(UdpOutputSettings udpOutputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (udpOutputSettings.getBufferMsec() != null) {
            Integer bufferMsec = udpOutputSettings.getBufferMsec();
            jsonWriter.name("BufferMsec");
            jsonWriter.value(bufferMsec);
        }
        if (udpOutputSettings.getContainerSettings() != null) {
            UdpContainerSettings containerSettings = udpOutputSettings.getContainerSettings();
            jsonWriter.name("ContainerSettings");
            UdpContainerSettingsJsonMarshaller.getInstance()
                    .marshall(containerSettings, jsonWriter);
        }
        if (udpOutputSettings.getDestination() != null) {
            OutputLocationRef destination = udpOutputSettings.getDestination();
            jsonWriter.name("Destination");
            OutputLocationRefJsonMarshaller.getInstance().marshall(destination, jsonWriter);
        }
        if (udpOutputSettings.getFecOutputSettings() != null) {
            FecOutputSettings fecOutputSettings = udpOutputSettings.getFecOutputSettings();
            jsonWriter.name("FecOutputSettings");
            FecOutputSettingsJsonMarshaller.getInstance().marshall(fecOutputSettings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UdpOutputSettingsJsonMarshaller instance;

    public static UdpOutputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UdpOutputSettingsJsonMarshaller();
        return instance;
    }
}
