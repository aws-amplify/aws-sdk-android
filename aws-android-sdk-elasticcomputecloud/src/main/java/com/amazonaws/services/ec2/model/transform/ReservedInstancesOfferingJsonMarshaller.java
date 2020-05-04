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
 * JSON marshaller for POJO ReservedInstancesOffering
 */
class ReservedInstancesOfferingJsonMarshaller {

    public void marshall(ReservedInstancesOffering reservedInstancesOffering,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservedInstancesOffering.getAvailabilityZone() != null) {
            String availabilityZone = reservedInstancesOffering.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (reservedInstancesOffering.getDuration() != null) {
            Long duration = reservedInstancesOffering.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (reservedInstancesOffering.getFixedPrice() != null) {
            Float fixedPrice = reservedInstancesOffering.getFixedPrice();
            jsonWriter.name("FixedPrice");
            jsonWriter.value(fixedPrice);
        }
        if (reservedInstancesOffering.getInstanceType() != null) {
            String instanceType = reservedInstancesOffering.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (reservedInstancesOffering.getProductDescription() != null) {
            String productDescription = reservedInstancesOffering.getProductDescription();
            jsonWriter.name("ProductDescription");
            jsonWriter.value(productDescription);
        }
        if (reservedInstancesOffering.getReservedInstancesOfferingId() != null) {
            String reservedInstancesOfferingId = reservedInstancesOffering
                    .getReservedInstancesOfferingId();
            jsonWriter.name("ReservedInstancesOfferingId");
            jsonWriter.value(reservedInstancesOfferingId);
        }
        if (reservedInstancesOffering.getUsagePrice() != null) {
            Float usagePrice = reservedInstancesOffering.getUsagePrice();
            jsonWriter.name("UsagePrice");
            jsonWriter.value(usagePrice);
        }
        if (reservedInstancesOffering.getCurrencyCode() != null) {
            String currencyCode = reservedInstancesOffering.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (reservedInstancesOffering.getInstanceTenancy() != null) {
            String instanceTenancy = reservedInstancesOffering.getInstanceTenancy();
            jsonWriter.name("InstanceTenancy");
            jsonWriter.value(instanceTenancy);
        }
        if (reservedInstancesOffering.getMarketplace() != null) {
            Boolean marketplace = reservedInstancesOffering.getMarketplace();
            jsonWriter.name("Marketplace");
            jsonWriter.value(marketplace);
        }
        if (reservedInstancesOffering.getOfferingClass() != null) {
            String offeringClass = reservedInstancesOffering.getOfferingClass();
            jsonWriter.name("OfferingClass");
            jsonWriter.value(offeringClass);
        }
        if (reservedInstancesOffering.getOfferingType() != null) {
            String offeringType = reservedInstancesOffering.getOfferingType();
            jsonWriter.name("OfferingType");
            jsonWriter.value(offeringType);
        }
        if (reservedInstancesOffering.getPricingDetails() != null) {
            java.util.List<PricingDetail> pricingDetails = reservedInstancesOffering
                    .getPricingDetails();
            jsonWriter.name("PricingDetails");
            jsonWriter.beginArray();
            for (PricingDetail pricingDetailsItem : pricingDetails) {
                if (pricingDetailsItem != null) {
                    PricingDetailJsonMarshaller.getInstance().marshall(pricingDetailsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (reservedInstancesOffering.getRecurringCharges() != null) {
            java.util.List<RecurringCharge> recurringCharges = reservedInstancesOffering
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
        if (reservedInstancesOffering.getScope() != null) {
            String scope = reservedInstancesOffering.getScope();
            jsonWriter.name("Scope");
            jsonWriter.value(scope);
        }
        jsonWriter.endObject();
    }

    private static ReservedInstancesOfferingJsonMarshaller instance;

    public static ReservedInstancesOfferingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesOfferingJsonMarshaller();
        return instance;
    }
}
