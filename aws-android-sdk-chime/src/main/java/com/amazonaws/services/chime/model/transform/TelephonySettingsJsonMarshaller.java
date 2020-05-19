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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TelephonySettings
 */
class TelephonySettingsJsonMarshaller {

    public void marshall(TelephonySettings telephonySettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (telephonySettings.getInboundCalling() != null) {
            Boolean inboundCalling = telephonySettings.getInboundCalling();
            jsonWriter.name("InboundCalling");
            jsonWriter.value(inboundCalling);
        }
        if (telephonySettings.getOutboundCalling() != null) {
            Boolean outboundCalling = telephonySettings.getOutboundCalling();
            jsonWriter.name("OutboundCalling");
            jsonWriter.value(outboundCalling);
        }
        if (telephonySettings.getSMS() != null) {
            Boolean sMS = telephonySettings.getSMS();
            jsonWriter.name("SMS");
            jsonWriter.value(sMS);
        }
        jsonWriter.endObject();
    }

    private static TelephonySettingsJsonMarshaller instance;

    public static TelephonySettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TelephonySettingsJsonMarshaller();
        return instance;
    }
}
