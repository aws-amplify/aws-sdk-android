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
 * JSON marshaller for POJO PhoneNumber
 */
class PhoneNumberJsonMarshaller {

    public void marshall(PhoneNumber phoneNumber, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (phoneNumber.getPhoneNumberId() != null) {
            String phoneNumberId = phoneNumber.getPhoneNumberId();
            jsonWriter.name("PhoneNumberId");
            jsonWriter.value(phoneNumberId);
        }
        if (phoneNumber.getE164PhoneNumber() != null) {
            String e164PhoneNumber = phoneNumber.getE164PhoneNumber();
            jsonWriter.name("E164PhoneNumber");
            jsonWriter.value(e164PhoneNumber);
        }
        if (phoneNumber.getType() != null) {
            String type = phoneNumber.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (phoneNumber.getProductType() != null) {
            String productType = phoneNumber.getProductType();
            jsonWriter.name("ProductType");
            jsonWriter.value(productType);
        }
        if (phoneNumber.getStatus() != null) {
            String status = phoneNumber.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (phoneNumber.getCapabilities() != null) {
            PhoneNumberCapabilities capabilities = phoneNumber.getCapabilities();
            jsonWriter.name("Capabilities");
            PhoneNumberCapabilitiesJsonMarshaller.getInstance().marshall(capabilities, jsonWriter);
        }
        if (phoneNumber.getAssociations() != null) {
            java.util.List<PhoneNumberAssociation> associations = phoneNumber.getAssociations();
            jsonWriter.name("Associations");
            jsonWriter.beginArray();
            for (PhoneNumberAssociation associationsItem : associations) {
                if (associationsItem != null) {
                    PhoneNumberAssociationJsonMarshaller.getInstance().marshall(associationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (phoneNumber.getCallingName() != null) {
            String callingName = phoneNumber.getCallingName();
            jsonWriter.name("CallingName");
            jsonWriter.value(callingName);
        }
        if (phoneNumber.getCallingNameStatus() != null) {
            String callingNameStatus = phoneNumber.getCallingNameStatus();
            jsonWriter.name("CallingNameStatus");
            jsonWriter.value(callingNameStatus);
        }
        if (phoneNumber.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = phoneNumber.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (phoneNumber.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = phoneNumber.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
        }
        if (phoneNumber.getDeletionTimestamp() != null) {
            java.util.Date deletionTimestamp = phoneNumber.getDeletionTimestamp();
            jsonWriter.name("DeletionTimestamp");
            jsonWriter.value(deletionTimestamp);
        }
        jsonWriter.endObject();
    }

    private static PhoneNumberJsonMarshaller instance;

    public static PhoneNumberJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberJsonMarshaller();
        return instance;
    }
}
