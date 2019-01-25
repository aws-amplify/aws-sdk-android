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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NumberValidateResponse
 */
class NumberValidateResponseJsonMarshaller {

    public void marshall(NumberValidateResponse numberValidateResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (numberValidateResponse.getCarrier() != null) {
            String carrier = numberValidateResponse.getCarrier();
            jsonWriter.name("Carrier");
            jsonWriter.value(carrier);
        }
        if (numberValidateResponse.getCity() != null) {
            String city = numberValidateResponse.getCity();
            jsonWriter.name("City");
            jsonWriter.value(city);
        }
        if (numberValidateResponse.getCleansedPhoneNumberE164() != null) {
            String cleansedPhoneNumberE164 = numberValidateResponse.getCleansedPhoneNumberE164();
            jsonWriter.name("CleansedPhoneNumberE164");
            jsonWriter.value(cleansedPhoneNumberE164);
        }
        if (numberValidateResponse.getCleansedPhoneNumberNational() != null) {
            String cleansedPhoneNumberNational = numberValidateResponse
                    .getCleansedPhoneNumberNational();
            jsonWriter.name("CleansedPhoneNumberNational");
            jsonWriter.value(cleansedPhoneNumberNational);
        }
        if (numberValidateResponse.getCountry() != null) {
            String country = numberValidateResponse.getCountry();
            jsonWriter.name("Country");
            jsonWriter.value(country);
        }
        if (numberValidateResponse.getCountryCodeIso2() != null) {
            String countryCodeIso2 = numberValidateResponse.getCountryCodeIso2();
            jsonWriter.name("CountryCodeIso2");
            jsonWriter.value(countryCodeIso2);
        }
        if (numberValidateResponse.getCountryCodeNumeric() != null) {
            String countryCodeNumeric = numberValidateResponse.getCountryCodeNumeric();
            jsonWriter.name("CountryCodeNumeric");
            jsonWriter.value(countryCodeNumeric);
        }
        if (numberValidateResponse.getCounty() != null) {
            String county = numberValidateResponse.getCounty();
            jsonWriter.name("County");
            jsonWriter.value(county);
        }
        if (numberValidateResponse.getOriginalCountryCodeIso2() != null) {
            String originalCountryCodeIso2 = numberValidateResponse.getOriginalCountryCodeIso2();
            jsonWriter.name("OriginalCountryCodeIso2");
            jsonWriter.value(originalCountryCodeIso2);
        }
        if (numberValidateResponse.getOriginalPhoneNumber() != null) {
            String originalPhoneNumber = numberValidateResponse.getOriginalPhoneNumber();
            jsonWriter.name("OriginalPhoneNumber");
            jsonWriter.value(originalPhoneNumber);
        }
        if (numberValidateResponse.getPhoneType() != null) {
            String phoneType = numberValidateResponse.getPhoneType();
            jsonWriter.name("PhoneType");
            jsonWriter.value(phoneType);
        }
        if (numberValidateResponse.getPhoneTypeCode() != null) {
            Integer phoneTypeCode = numberValidateResponse.getPhoneTypeCode();
            jsonWriter.name("PhoneTypeCode");
            jsonWriter.value(phoneTypeCode);
        }
        if (numberValidateResponse.getTimezone() != null) {
            String timezone = numberValidateResponse.getTimezone();
            jsonWriter.name("Timezone");
            jsonWriter.value(timezone);
        }
        if (numberValidateResponse.getZipCode() != null) {
            String zipCode = numberValidateResponse.getZipCode();
            jsonWriter.name("ZipCode");
            jsonWriter.value(zipCode);
        }
        jsonWriter.endObject();
    }

    private static NumberValidateResponseJsonMarshaller instance;

    public static NumberValidateResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NumberValidateResponseJsonMarshaller();
        return instance;
    }
}
