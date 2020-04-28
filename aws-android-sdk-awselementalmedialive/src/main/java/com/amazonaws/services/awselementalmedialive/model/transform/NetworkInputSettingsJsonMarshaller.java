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
 * JSON marshaller for POJO NetworkInputSettings
 */
class NetworkInputSettingsJsonMarshaller {

    public void marshall(NetworkInputSettings networkInputSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkInputSettings.getHlsInputSettings() != null) {
            HlsInputSettings hlsInputSettings = networkInputSettings.getHlsInputSettings();
            jsonWriter.name("HlsInputSettings");
            HlsInputSettingsJsonMarshaller.getInstance().marshall(hlsInputSettings, jsonWriter);
        }
        if (networkInputSettings.getServerValidation() != null) {
            String serverValidation = networkInputSettings.getServerValidation();
            jsonWriter.name("ServerValidation");
            jsonWriter.value(serverValidation);
        }
        jsonWriter.endObject();
    }

    private static NetworkInputSettingsJsonMarshaller instance;

    public static NetworkInputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInputSettingsJsonMarshaller();
        return instance;
    }
}
