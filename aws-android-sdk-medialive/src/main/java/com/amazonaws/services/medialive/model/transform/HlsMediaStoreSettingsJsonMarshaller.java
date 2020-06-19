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
 * JSON marshaller for POJO HlsMediaStoreSettings
 */
class HlsMediaStoreSettingsJsonMarshaller {

    public void marshall(HlsMediaStoreSettings hlsMediaStoreSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsMediaStoreSettings.getConnectionRetryInterval() != null) {
            Integer connectionRetryInterval = hlsMediaStoreSettings.getConnectionRetryInterval();
            jsonWriter.name("ConnectionRetryInterval");
            jsonWriter.value(connectionRetryInterval);
        }
        if (hlsMediaStoreSettings.getFilecacheDuration() != null) {
            Integer filecacheDuration = hlsMediaStoreSettings.getFilecacheDuration();
            jsonWriter.name("FilecacheDuration");
            jsonWriter.value(filecacheDuration);
        }
        if (hlsMediaStoreSettings.getMediaStoreStorageClass() != null) {
            String mediaStoreStorageClass = hlsMediaStoreSettings.getMediaStoreStorageClass();
            jsonWriter.name("MediaStoreStorageClass");
            jsonWriter.value(mediaStoreStorageClass);
        }
        if (hlsMediaStoreSettings.getNumRetries() != null) {
            Integer numRetries = hlsMediaStoreSettings.getNumRetries();
            jsonWriter.name("NumRetries");
            jsonWriter.value(numRetries);
        }
        if (hlsMediaStoreSettings.getRestartDelay() != null) {
            Integer restartDelay = hlsMediaStoreSettings.getRestartDelay();
            jsonWriter.name("RestartDelay");
            jsonWriter.value(restartDelay);
        }
        jsonWriter.endObject();
    }

    private static HlsMediaStoreSettingsJsonMarshaller instance;

    public static HlsMediaStoreSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsMediaStoreSettingsJsonMarshaller();
        return instance;
    }
}
