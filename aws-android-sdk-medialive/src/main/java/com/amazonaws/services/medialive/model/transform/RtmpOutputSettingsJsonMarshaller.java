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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RtmpOutputSettings
 */
class RtmpOutputSettingsJsonMarshaller {

    public void marshall(RtmpOutputSettings rtmpOutputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (rtmpOutputSettings.getCertificateMode() != null) {
            String certificateMode = rtmpOutputSettings.getCertificateMode();
            jsonWriter.name("CertificateMode");
            jsonWriter.value(certificateMode);
        }
        if (rtmpOutputSettings.getConnectionRetryInterval() != null) {
            Integer connectionRetryInterval = rtmpOutputSettings.getConnectionRetryInterval();
            jsonWriter.name("ConnectionRetryInterval");
            jsonWriter.value(connectionRetryInterval);
        }
        if (rtmpOutputSettings.getDestination() != null) {
            OutputLocationRef destination = rtmpOutputSettings.getDestination();
            jsonWriter.name("Destination");
            OutputLocationRefJsonMarshaller.getInstance().marshall(destination, jsonWriter);
        }
        if (rtmpOutputSettings.getNumRetries() != null) {
            Integer numRetries = rtmpOutputSettings.getNumRetries();
            jsonWriter.name("NumRetries");
            jsonWriter.value(numRetries);
        }
        jsonWriter.endObject();
    }

    private static RtmpOutputSettingsJsonMarshaller instance;

    public static RtmpOutputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RtmpOutputSettingsJsonMarshaller();
        return instance;
    }
}
