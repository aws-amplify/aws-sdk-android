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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Purchase
 */
class PurchaseJsonMarshaller {

    public void marshall(Purchase purchase, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (purchase.getCurrencyCode() != null) {
            String currencyCode = purchase.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (purchase.getDuration() != null) {
            Integer duration = purchase.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (purchase.getHostIdSet() != null) {
            java.util.List<String> hostIdSet = purchase.getHostIdSet();
            jsonWriter.name("HostIdSet");
            jsonWriter.beginArray();
            for (String hostIdSetItem : hostIdSet) {
                if (hostIdSetItem != null) {
                    jsonWriter.value(hostIdSetItem);
                }
            }
            jsonWriter.endArray();
        }
        if (purchase.getHostReservationId() != null) {
            String hostReservationId = purchase.getHostReservationId();
            jsonWriter.name("HostReservationId");
            jsonWriter.value(hostReservationId);
        }
        if (purchase.getHourlyPrice() != null) {
            String hourlyPrice = purchase.getHourlyPrice();
            jsonWriter.name("HourlyPrice");
            jsonWriter.value(hourlyPrice);
        }
        if (purchase.getInstanceFamily() != null) {
            String instanceFamily = purchase.getInstanceFamily();
            jsonWriter.name("InstanceFamily");
            jsonWriter.value(instanceFamily);
        }
        if (purchase.getPaymentOption() != null) {
            String paymentOption = purchase.getPaymentOption();
            jsonWriter.name("PaymentOption");
            jsonWriter.value(paymentOption);
        }
        if (purchase.getUpfrontPrice() != null) {
            String upfrontPrice = purchase.getUpfrontPrice();
            jsonWriter.name("UpfrontPrice");
            jsonWriter.value(upfrontPrice);
        }
        jsonWriter.endObject();
    }

    private static PurchaseJsonMarshaller instance;

    public static PurchaseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PurchaseJsonMarshaller();
        return instance;
    }
}
