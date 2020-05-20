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
 * JSON marshaller for POJO HlsAkamaiSettings
 */
class HlsAkamaiSettingsJsonMarshaller {

    public void marshall(HlsAkamaiSettings hlsAkamaiSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsAkamaiSettings.getConnectionRetryInterval() != null) {
            Integer connectionRetryInterval = hlsAkamaiSettings.getConnectionRetryInterval();
            jsonWriter.name("ConnectionRetryInterval");
            jsonWriter.value(connectionRetryInterval);
        }
        if (hlsAkamaiSettings.getFilecacheDuration() != null) {
            Integer filecacheDuration = hlsAkamaiSettings.getFilecacheDuration();
            jsonWriter.name("FilecacheDuration");
            jsonWriter.value(filecacheDuration);
        }
        if (hlsAkamaiSettings.getHttpTransferMode() != null) {
            String httpTransferMode = hlsAkamaiSettings.getHttpTransferMode();
            jsonWriter.name("HttpTransferMode");
            jsonWriter.value(httpTransferMode);
        }
        if (hlsAkamaiSettings.getNumRetries() != null) {
            Integer numRetries = hlsAkamaiSettings.getNumRetries();
            jsonWriter.name("NumRetries");
            jsonWriter.value(numRetries);
        }
        if (hlsAkamaiSettings.getRestartDelay() != null) {
            Integer restartDelay = hlsAkamaiSettings.getRestartDelay();
            jsonWriter.name("RestartDelay");
            jsonWriter.value(restartDelay);
        }
        if (hlsAkamaiSettings.getSalt() != null) {
            String salt = hlsAkamaiSettings.getSalt();
            jsonWriter.name("Salt");
            jsonWriter.value(salt);
        }
        if (hlsAkamaiSettings.getToken() != null) {
            String token = hlsAkamaiSettings.getToken();
            jsonWriter.name("Token");
            jsonWriter.value(token);
        }
        jsonWriter.endObject();
    }

    private static HlsAkamaiSettingsJsonMarshaller instance;

    public static HlsAkamaiSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsAkamaiSettingsJsonMarshaller();
        return instance;
    }
}
