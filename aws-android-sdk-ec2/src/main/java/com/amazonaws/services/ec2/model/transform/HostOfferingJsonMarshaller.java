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
 * JSON marshaller for POJO HostOffering
 */
class HostOfferingJsonMarshaller {

    public void marshall(HostOffering hostOffering, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hostOffering.getCurrencyCode() != null) {
            String currencyCode = hostOffering.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (hostOffering.getDuration() != null) {
            Integer duration = hostOffering.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (hostOffering.getHourlyPrice() != null) {
            String hourlyPrice = hostOffering.getHourlyPrice();
            jsonWriter.name("HourlyPrice");
            jsonWriter.value(hourlyPrice);
        }
        if (hostOffering.getInstanceFamily() != null) {
            String instanceFamily = hostOffering.getInstanceFamily();
            jsonWriter.name("InstanceFamily");
            jsonWriter.value(instanceFamily);
        }
        if (hostOffering.getOfferingId() != null) {
            String offeringId = hostOffering.getOfferingId();
            jsonWriter.name("OfferingId");
            jsonWriter.value(offeringId);
        }
        if (hostOffering.getPaymentOption() != null) {
            String paymentOption = hostOffering.getPaymentOption();
            jsonWriter.name("PaymentOption");
            jsonWriter.value(paymentOption);
        }
        if (hostOffering.getUpfrontPrice() != null) {
            String upfrontPrice = hostOffering.getUpfrontPrice();
            jsonWriter.name("UpfrontPrice");
            jsonWriter.value(upfrontPrice);
        }
        jsonWriter.endObject();
    }

    private static HostOfferingJsonMarshaller instance;

    public static HostOfferingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HostOfferingJsonMarshaller();
        return instance;
    }
}
