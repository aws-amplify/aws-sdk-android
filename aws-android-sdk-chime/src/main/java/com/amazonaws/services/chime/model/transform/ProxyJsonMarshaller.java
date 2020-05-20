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
 * JSON marshaller for POJO Proxy
 */
class ProxyJsonMarshaller {

    public void marshall(Proxy proxy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (proxy.getDefaultSessionExpiryMinutes() != null) {
            Integer defaultSessionExpiryMinutes = proxy.getDefaultSessionExpiryMinutes();
            jsonWriter.name("DefaultSessionExpiryMinutes");
            jsonWriter.value(defaultSessionExpiryMinutes);
        }
        if (proxy.getDisabled() != null) {
            Boolean disabled = proxy.getDisabled();
            jsonWriter.name("Disabled");
            jsonWriter.value(disabled);
        }
        if (proxy.getFallBackPhoneNumber() != null) {
            String fallBackPhoneNumber = proxy.getFallBackPhoneNumber();
            jsonWriter.name("FallBackPhoneNumber");
            jsonWriter.value(fallBackPhoneNumber);
        }
        if (proxy.getPhoneNumberCountries() != null) {
            java.util.List<String> phoneNumberCountries = proxy.getPhoneNumberCountries();
            jsonWriter.name("PhoneNumberCountries");
            jsonWriter.beginArray();
            for (String phoneNumberCountriesItem : phoneNumberCountries) {
                if (phoneNumberCountriesItem != null) {
                    jsonWriter.value(phoneNumberCountriesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProxyJsonMarshaller instance;

    public static ProxyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProxyJsonMarshaller();
        return instance;
    }
}
