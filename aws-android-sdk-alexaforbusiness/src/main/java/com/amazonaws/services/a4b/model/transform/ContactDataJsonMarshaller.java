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
 * JSON marshaller for POJO ContactData
 */
class ContactDataJsonMarshaller {

    public void marshall(ContactData contactData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contactData.getContactArn() != null) {
            String contactArn = contactData.getContactArn();
            jsonWriter.name("ContactArn");
            jsonWriter.value(contactArn);
        }
        if (contactData.getDisplayName() != null) {
            String displayName = contactData.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (contactData.getFirstName() != null) {
            String firstName = contactData.getFirstName();
            jsonWriter.name("FirstName");
            jsonWriter.value(firstName);
        }
        if (contactData.getLastName() != null) {
            String lastName = contactData.getLastName();
            jsonWriter.name("LastName");
            jsonWriter.value(lastName);
        }
        if (contactData.getPhoneNumber() != null) {
            String phoneNumber = contactData.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (contactData.getPhoneNumbers() != null) {
            java.util.List<PhoneNumber> phoneNumbers = contactData.getPhoneNumbers();
            jsonWriter.name("PhoneNumbers");
            jsonWriter.beginArray();
            for (PhoneNumber phoneNumbersItem : phoneNumbers) {
                if (phoneNumbersItem != null) {
                    PhoneNumberJsonMarshaller.getInstance().marshall(phoneNumbersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (contactData.getSipAddresses() != null) {
            java.util.List<SipAddress> sipAddresses = contactData.getSipAddresses();
            jsonWriter.name("SipAddresses");
            jsonWriter.beginArray();
            for (SipAddress sipAddressesItem : sipAddresses) {
                if (sipAddressesItem != null) {
                    SipAddressJsonMarshaller.getInstance().marshall(sipAddressesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ContactDataJsonMarshaller instance;

    public static ContactDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactDataJsonMarshaller();
        return instance;
    }
}
