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
 * JSON marshaller for POJO HlsWebdavSettings
 */
class HlsWebdavSettingsJsonMarshaller {

    public void marshall(HlsWebdavSettings hlsWebdavSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsWebdavSettings.getConnectionRetryInterval() != null) {
            Integer connectionRetryInterval = hlsWebdavSettings.getConnectionRetryInterval();
            jsonWriter.name("ConnectionRetryInterval");
            jsonWriter.value(connectionRetryInterval);
        }
        if (hlsWebdavSettings.getFilecacheDuration() != null) {
            Integer filecacheDuration = hlsWebdavSettings.getFilecacheDuration();
            jsonWriter.name("FilecacheDuration");
            jsonWriter.value(filecacheDuration);
        }
        if (hlsWebdavSettings.getHttpTransferMode() != null) {
            String httpTransferMode = hlsWebdavSettings.getHttpTransferMode();
            jsonWriter.name("HttpTransferMode");
            jsonWriter.value(httpTransferMode);
        }
        if (hlsWebdavSettings.getNumRetries() != null) {
            Integer numRetries = hlsWebdavSettings.getNumRetries();
            jsonWriter.name("NumRetries");
            jsonWriter.value(numRetries);
        }
        if (hlsWebdavSettings.getRestartDelay() != null) {
            Integer restartDelay = hlsWebdavSettings.getRestartDelay();
            jsonWriter.name("RestartDelay");
            jsonWriter.value(restartDelay);
        }
        jsonWriter.endObject();
    }

    private static HlsWebdavSettingsJsonMarshaller instance;

    public static HlsWebdavSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsWebdavSettingsJsonMarshaller();
        return instance;
    }
}
