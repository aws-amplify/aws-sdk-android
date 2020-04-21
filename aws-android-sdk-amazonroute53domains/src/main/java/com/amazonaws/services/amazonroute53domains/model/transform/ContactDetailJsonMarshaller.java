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

package com.amazonaws.services.amazonroute53domains.model.transform;

import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ContactDetail
 */
class ContactDetailJsonMarshaller {

    public void marshall(ContactDetail contactDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contactDetail.getFirstName() != null) {
            String firstName = contactDetail.getFirstName();
            jsonWriter.name("FirstName");
            jsonWriter.value(firstName);
        }
        if (contactDetail.getLastName() != null) {
            String lastName = contactDetail.getLastName();
            jsonWriter.name("LastName");
            jsonWriter.value(lastName);
        }
        if (contactDetail.getContactType() != null) {
            String contactType = contactDetail.getContactType();
            jsonWriter.name("ContactType");
            jsonWriter.value(contactType);
        }
        if (contactDetail.getOrganizationName() != null) {
            String organizationName = contactDetail.getOrganizationName();
            jsonWriter.name("OrganizationName");
            jsonWriter.value(organizationName);
        }
        if (contactDetail.getAddressLine1() != null) {
            String addressLine1 = contactDetail.getAddressLine1();
            jsonWriter.name("AddressLine1");
            jsonWriter.value(addressLine1);
        }
        if (contactDetail.getAddressLine2() != null) {
            String addressLine2 = contactDetail.getAddressLine2();
            jsonWriter.name("AddressLine2");
            jsonWriter.value(addressLine2);
        }
        if (contactDetail.getCity() != null) {
            String city = contactDetail.getCity();
            jsonWriter.name("City");
            jsonWriter.value(city);
        }
        if (contactDetail.getState() != null) {
            String state = contactDetail.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (contactDetail.getCountryCode() != null) {
            String countryCode = contactDetail.getCountryCode();
            jsonWriter.name("CountryCode");
            jsonWriter.value(countryCode);
        }
        if (contactDetail.getZipCode() != null) {
            String zipCode = contactDetail.getZipCode();
            jsonWriter.name("ZipCode");
            jsonWriter.value(zipCode);
        }
        if (contactDetail.getPhoneNumber() != null) {
            String phoneNumber = contactDetail.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (contactDetail.getEmail() != null) {
            String email = contactDetail.getEmail();
            jsonWriter.name("Email");
            jsonWriter.value(email);
        }
        if (contactDetail.getFax() != null) {
            String fax = contactDetail.getFax();
            jsonWriter.name("Fax");
            jsonWriter.value(fax);
        }
        if (contactDetail.getExtraParams() != null) {
            java.util.List<ExtraParam> extraParams = contactDetail.getExtraParams();
            jsonWriter.name("ExtraParams");
            jsonWriter.beginArray();
            for (ExtraParam extraParamsItem : extraParams) {
                if (extraParamsItem != null) {
                    ExtraParamJsonMarshaller.getInstance().marshall(extraParamsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ContactDetailJsonMarshaller instance;

    public static ContactDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactDetailJsonMarshaller();
        return instance;
    }
}
