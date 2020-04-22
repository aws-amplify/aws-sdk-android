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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReservedElasticsearchInstance
 */
class ReservedElasticsearchInstanceJsonMarshaller {

    public void marshall(ReservedElasticsearchInstance reservedElasticsearchInstance,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservedElasticsearchInstance.getReservationName() != null) {
            String reservationName = reservedElasticsearchInstance.getReservationName();
            jsonWriter.name("ReservationName");
            jsonWriter.value(reservationName);
        }
        if (reservedElasticsearchInstance.getReservedElasticsearchInstanceId() != null) {
            String reservedElasticsearchInstanceId = reservedElasticsearchInstance
                    .getReservedElasticsearchInstanceId();
            jsonWriter.name("ReservedElasticsearchInstanceId");
            jsonWriter.value(reservedElasticsearchInstanceId);
        }
        if (reservedElasticsearchInstance.getReservedElasticsearchInstanceOfferingId() != null) {
            String reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstance
                    .getReservedElasticsearchInstanceOfferingId();
            jsonWriter.name("ReservedElasticsearchInstanceOfferingId");
            jsonWriter.value(reservedElasticsearchInstanceOfferingId);
        }
        if (reservedElasticsearchInstance.getElasticsearchInstanceType() != null) {
            String elasticsearchInstanceType = reservedElasticsearchInstance
                    .getElasticsearchInstanceType();
            jsonWriter.name("ElasticsearchInstanceType");
            jsonWriter.value(elasticsearchInstanceType);
        }
        if (reservedElasticsearchInstance.getStartTime() != null) {
            java.util.Date startTime = reservedElasticsearchInstance.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (reservedElasticsearchInstance.getDuration() != null) {
            Integer duration = reservedElasticsearchInstance.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (reservedElasticsearchInstance.getFixedPrice() != null) {
            Double fixedPrice = reservedElasticsearchInstance.getFixedPrice();
            jsonWriter.name("FixedPrice");
            jsonWriter.value(fixedPrice);
        }
        if (reservedElasticsearchInstance.getUsagePrice() != null) {
            Double usagePrice = reservedElasticsearchInstance.getUsagePrice();
            jsonWriter.name("UsagePrice");
            jsonWriter.value(usagePrice);
        }
        if (reservedElasticsearchInstance.getCurrencyCode() != null) {
            String currencyCode = reservedElasticsearchInstance.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (reservedElasticsearchInstance.getElasticsearchInstanceCount() != null) {
            Integer elasticsearchInstanceCount = reservedElasticsearchInstance
                    .getElasticsearchInstanceCount();
            jsonWriter.name("ElasticsearchInstanceCount");
            jsonWriter.value(elasticsearchInstanceCount);
        }
        if (reservedElasticsearchInstance.getState() != null) {
            String state = reservedElasticsearchInstance.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (reservedElasticsearchInstance.getPaymentOption() != null) {
            String paymentOption = reservedElasticsearchInstance.getPaymentOption();
            jsonWriter.name("PaymentOption");
            jsonWriter.value(paymentOption);
        }
        if (reservedElasticsearchInstance.getRecurringCharges() != null) {
            java.util.List<RecurringCharge> recurringCharges = reservedElasticsearchInstance
                    .getRecurringCharges();
            jsonWriter.name("RecurringCharges");
            jsonWriter.beginArray();
            for (RecurringCharge recurringChargesItem : recurringCharges) {
                if (recurringChargesItem != null) {
                    RecurringChargeJsonMarshaller.getInstance().marshall(recurringChargesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ReservedElasticsearchInstanceJsonMarshaller instance;

    public static ReservedElasticsearchInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedElasticsearchInstanceJsonMarshaller();
        return instance;
    }
}
