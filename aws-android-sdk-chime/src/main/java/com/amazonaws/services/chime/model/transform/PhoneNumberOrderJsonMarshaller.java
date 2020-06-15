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
 * JSON marshaller for POJO PhoneNumberOrder
 */
class PhoneNumberOrderJsonMarshaller {

    public void marshall(PhoneNumberOrder phoneNumberOrder, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (phoneNumberOrder.getPhoneNumberOrderId() != null) {
            String phoneNumberOrderId = phoneNumberOrder.getPhoneNumberOrderId();
            jsonWriter.name("PhoneNumberOrderId");
            jsonWriter.value(phoneNumberOrderId);
        }
        if (phoneNumberOrder.getProductType() != null) {
            String productType = phoneNumberOrder.getProductType();
            jsonWriter.name("ProductType");
            jsonWriter.value(productType);
        }
        if (phoneNumberOrder.getStatus() != null) {
            String status = phoneNumberOrder.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (phoneNumberOrder.getOrderedPhoneNumbers() != null) {
            java.util.List<OrderedPhoneNumber> orderedPhoneNumbers = phoneNumberOrder
                    .getOrderedPhoneNumbers();
            jsonWriter.name("OrderedPhoneNumbers");
            jsonWriter.beginArray();
            for (OrderedPhoneNumber orderedPhoneNumbersItem : orderedPhoneNumbers) {
                if (orderedPhoneNumbersItem != null) {
                    OrderedPhoneNumberJsonMarshaller.getInstance().marshall(
                            orderedPhoneNumbersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (phoneNumberOrder.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = phoneNumberOrder.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (phoneNumberOrder.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = phoneNumberOrder.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static PhoneNumberOrderJsonMarshaller instance;

    public static PhoneNumberOrderJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberOrderJsonMarshaller();
        return instance;
    }
}
