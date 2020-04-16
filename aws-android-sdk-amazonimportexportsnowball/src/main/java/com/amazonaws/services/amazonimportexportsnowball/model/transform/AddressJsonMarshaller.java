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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Address
 */
class AddressJsonMarshaller {

    public void marshall(Address address, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (address.getAddressId() != null) {
            String addressId = address.getAddressId();
            jsonWriter.name("AddressId");
            jsonWriter.value(addressId);
        }
        if (address.getName() != null) {
            String name = address.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (address.getCompany() != null) {
            String company = address.getCompany();
            jsonWriter.name("Company");
            jsonWriter.value(company);
        }
        if (address.getStreet1() != null) {
            String street1 = address.getStreet1();
            jsonWriter.name("Street1");
            jsonWriter.value(street1);
        }
        if (address.getStreet2() != null) {
            String street2 = address.getStreet2();
            jsonWriter.name("Street2");
            jsonWriter.value(street2);
        }
        if (address.getStreet3() != null) {
            String street3 = address.getStreet3();
            jsonWriter.name("Street3");
            jsonWriter.value(street3);
        }
        if (address.getCity() != null) {
            String city = address.getCity();
            jsonWriter.name("City");
            jsonWriter.value(city);
        }
        if (address.getStateOrProvince() != null) {
            String stateOrProvince = address.getStateOrProvince();
            jsonWriter.name("StateOrProvince");
            jsonWriter.value(stateOrProvince);
        }
        if (address.getPrefectureOrDistrict() != null) {
            String prefectureOrDistrict = address.getPrefectureOrDistrict();
            jsonWriter.name("PrefectureOrDistrict");
            jsonWriter.value(prefectureOrDistrict);
        }
        if (address.getLandmark() != null) {
            String landmark = address.getLandmark();
            jsonWriter.name("Landmark");
            jsonWriter.value(landmark);
        }
        if (address.getCountry() != null) {
            String country = address.getCountry();
            jsonWriter.name("Country");
            jsonWriter.value(country);
        }
        if (address.getPostalCode() != null) {
            String postalCode = address.getPostalCode();
            jsonWriter.name("PostalCode");
            jsonWriter.value(postalCode);
        }
        if (address.getPhoneNumber() != null) {
            String phoneNumber = address.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (address.getIsRestricted() != null) {
            Boolean isRestricted = address.getIsRestricted();
            jsonWriter.name("IsRestricted");
            jsonWriter.value(isRestricted);
        }
        jsonWriter.endObject();
    }

    private static AddressJsonMarshaller instance;

    public static AddressJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AddressJsonMarshaller();
        return instance;
    }
}
