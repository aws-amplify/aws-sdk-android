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
 * JSON marshaller for POJO MultiplexVideoSettings
 */
class MultiplexVideoSettingsJsonMarshaller {

    public void marshall(MultiplexVideoSettings multiplexVideoSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (multiplexVideoSettings.getConstantBitrate() != null) {
            Integer constantBitrate = multiplexVideoSettings.getConstantBitrate();
            jsonWriter.name("ConstantBitrate");
            jsonWriter.value(constantBitrate);
        }
        if (multiplexVideoSettings.getStatmuxSettings() != null) {
            MultiplexStatmuxVideoSettings statmuxSettings = multiplexVideoSettings
                    .getStatmuxSettings();
            jsonWriter.name("StatmuxSettings");
            MultiplexStatmuxVideoSettingsJsonMarshaller.getInstance().marshall(statmuxSettings,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MultiplexVideoSettingsJsonMarshaller instance;

    public static MultiplexVideoSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexVideoSettingsJsonMarshaller();
        return instance;
    }
}
