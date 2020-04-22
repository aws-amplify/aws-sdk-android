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
 * JSON marshaller for POJO ReservedElasticsearchInstanceOffering
 */
class ReservedElasticsearchInstanceOfferingJsonMarshaller {

    public void marshall(
            ReservedElasticsearchInstanceOffering reservedElasticsearchInstanceOffering,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservedElasticsearchInstanceOffering.getReservedElasticsearchInstanceOfferingId() != null) {
            String reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOffering
                    .getReservedElasticsearchInstanceOfferingId();
            jsonWriter.name("ReservedElasticsearchInstanceOfferingId");
            jsonWriter.value(reservedElasticsearchInstanceOfferingId);
        }
        if (reservedElasticsearchInstanceOffering.getElasticsearchInstanceType() != null) {
            String elasticsearchInstanceType = reservedElasticsearchInstanceOffering
                    .getElasticsearchInstanceType();
            jsonWriter.name("ElasticsearchInstanceType");
            jsonWriter.value(elasticsearchInstanceType);
        }
        if (reservedElasticsearchInstanceOffering.getDuration() != null) {
            Integer duration = reservedElasticsearchInstanceOffering.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (reservedElasticsearchInstanceOffering.getFixedPrice() != null) {
            Double fixedPrice = reservedElasticsearchInstanceOffering.getFixedPrice();
            jsonWriter.name("FixedPrice");
            jsonWriter.value(fixedPrice);
        }
        if (reservedElasticsearchInstanceOffering.getUsagePrice() != null) {
            Double usagePrice = reservedElasticsearchInstanceOffering.getUsagePrice();
            jsonWriter.name("UsagePrice");
            jsonWriter.value(usagePrice);
        }
        if (reservedElasticsearchInstanceOffering.getCurrencyCode() != null) {
            String currencyCode = reservedElasticsearchInstanceOffering.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (reservedElasticsearchInstanceOffering.getPaymentOption() != null) {
            String paymentOption = reservedElasticsearchInstanceOffering.getPaymentOption();
            jsonWriter.name("PaymentOption");
            jsonWriter.value(paymentOption);
        }
        if (reservedElasticsearchInstanceOffering.getRecurringCharges() != null) {
            java.util.List<RecurringCharge> recurringCharges = reservedElasticsearchInstanceOffering
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

    private static ReservedElasticsearchInstanceOfferingJsonMarshaller instance;

    public static ReservedElasticsearchInstanceOfferingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedElasticsearchInstanceOfferingJsonMarshaller();
        return instance;
    }
}
