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
 * JSON marshaller for POJO Contact
 */
class ContactJsonMarshaller {

    public void marshall(Contact contact, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contact.getContactArn() != null) {
            String contactArn = contact.getContactArn();
            jsonWriter.name("ContactArn");
            jsonWriter.value(contactArn);
        }
        if (contact.getDisplayName() != null) {
            String displayName = contact.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (contact.getFirstName() != null) {
            String firstName = contact.getFirstName();
            jsonWriter.name("FirstName");
            jsonWriter.value(firstName);
        }
        if (contact.getLastName() != null) {
            String lastName = contact.getLastName();
            jsonWriter.name("LastName");
            jsonWriter.value(lastName);
        }
        if (contact.getPhoneNumber() != null) {
            String phoneNumber = contact.getPhoneNumber();
            jsonWriter.name("PhoneNumber");
            jsonWriter.value(phoneNumber);
        }
        if (contact.getPhoneNumbers() != null) {
            java.util.List<PhoneNumber> phoneNumbers = contact.getPhoneNumbers();
            jsonWriter.name("PhoneNumbers");
            jsonWriter.beginArray();
            for (PhoneNumber phoneNumbersItem : phoneNumbers) {
                if (phoneNumbersItem != null) {
                    PhoneNumberJsonMarshaller.getInstance().marshall(phoneNumbersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (contact.getSipAddresses() != null) {
            java.util.List<SipAddress> sipAddresses = contact.getSipAddresses();
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

    private static ContactJsonMarshaller instance;

    public static ContactJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactJsonMarshaller();
        return instance;
    }
}
