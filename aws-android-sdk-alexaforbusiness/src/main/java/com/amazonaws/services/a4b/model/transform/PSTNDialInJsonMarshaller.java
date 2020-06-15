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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PSTNDialIn
 */
class PSTNDialInJsonMarshaller {

    public void marshall(PSTNDialIn pSTNDialIn, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (pSTNDialIn.getCountryCode() != null) {
            String countryCode = pSTNDialIn.getCountryCode();
            jsonWriter.name("CountryCode");
            jsonWriter.value(countryCode);
        }
        if (pSTNDialIn.getPhoneNumber() != null) {
            String phoneNumber = pSTNDialIn.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (pSTNDialIn.getOneClickIdDelay() != null) {
            String oneClickIdDelay = pSTNDialIn.getOneClickIdDelay();
            jsonWriter.name("OneClickIdDelay");
            jsonWriter.value(oneClickIdDelay);
        }
        if (pSTNDialIn.getOneClickPinDelay() != null) {
            String oneClickPinDelay = pSTNDialIn.getOneClickPinDelay();
            jsonWriter.name("OneClickPinDelay");
            jsonWriter.value(oneClickPinDelay);
        }
        jsonWriter.endObject();
    }

    private static PSTNDialInJsonMarshaller instance;

    public static PSTNDialInJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PSTNDialInJsonMarshaller();
        return instance;
    }
}
