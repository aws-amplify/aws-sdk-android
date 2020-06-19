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
 * JSON marshaller for POJO HlsInputSettings
 */
class HlsInputSettingsJsonMarshaller {

    public void marshall(HlsInputSettings hlsInputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsInputSettings.getBandwidth() != null) {
            Integer bandwidth = hlsInputSettings.getBandwidth();
            jsonWriter.name("Bandwidth");
            jsonWriter.value(bandwidth);
        }
        if (hlsInputSettings.getBufferSegments() != null) {
            Integer bufferSegments = hlsInputSettings.getBufferSegments();
            jsonWriter.name("BufferSegments");
            jsonWriter.value(bufferSegments);
        }
        if (hlsInputSettings.getRetries() != null) {
            Integer retries = hlsInputSettings.getRetries();
            jsonWriter.name("Retries");
            jsonWriter.value(retries);
        }
        if (hlsInputSettings.getRetryInterval() != null) {
            Integer retryInterval = hlsInputSettings.getRetryInterval();
            jsonWriter.name("RetryInterval");
            jsonWriter.value(retryInterval);
        }
        jsonWriter.endObject();
    }

    private static HlsInputSettingsJsonMarshaller instance;

    public static HlsInputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsInputSettingsJsonMarshaller();
        return instance;
    }
}
