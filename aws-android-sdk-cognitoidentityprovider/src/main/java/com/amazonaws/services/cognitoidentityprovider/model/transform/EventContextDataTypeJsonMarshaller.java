/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventContextDataType
 */
class EventContextDataTypeJsonMarshaller {

    public void marshall(EventContextDataType eventContextDataType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventContextDataType.getIpAddress() != null) {
            String ipAddress = eventContextDataType.getIpAddress();
            jsonWriter.name("IpAddress");
            jsonWriter.value(ipAddress);
        }
        if (eventContextDataType.getDeviceName() != null) {
            String deviceName = eventContextDataType.getDeviceName();
            jsonWriter.name("DeviceName");
            jsonWriter.value(deviceName);
        }
        if (eventContextDataType.getTimezone() != null) {
            String timezone = eventContextDataType.getTimezone();
            jsonWriter.name("Timezone");
            jsonWriter.value(timezone);
        }
        if (eventContextDataType.getCity() != null) {
            String city = eventContextDataType.getCity();
            jsonWriter.name("City");
            jsonWriter.value(city);
        }
        if (eventContextDataType.getCountry() != null) {
            String country = eventContextDataType.getCountry();
            jsonWriter.name("Country");
            jsonWriter.value(country);
        }
        jsonWriter.endObject();
    }

    private static EventContextDataTypeJsonMarshaller instance;

    public static EventContextDataTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventContextDataTypeJsonMarshaller();
        return instance;
    }
}
