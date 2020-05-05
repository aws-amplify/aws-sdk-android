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
 * JSON marshaller for POJO ReservedInstances
 */
class ReservedInstancesJsonMarshaller {

    public void marshall(ReservedInstances reservedInstances, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reservedInstances.getAvailabilityZone() != null) {
            String availabilityZone = reservedInstances.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (reservedInstances.getDuration() != null) {
            Long duration = reservedInstances.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (reservedInstances.getEnd() != null) {
            java.util.Date end = reservedInstances.getEnd();
            jsonWriter.name("End");
            jsonWriter.value(end);
        }
        if (reservedInstances.getFixedPrice() != null) {
            Float fixedPrice = reservedInstances.getFixedPrice();
            jsonWriter.name("FixedPrice");
            jsonWriter.value(fixedPrice);
        }
        if (reservedInstances.getInstanceCount() != null) {
            Integer instanceCount = reservedInstances.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (reservedInstances.getInstanceType() != null) {
            String instanceType = reservedInstances.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (reservedInstances.getProductDescription() != null) {
            String productDescription = reservedInstances.getProductDescription();
            jsonWriter.name("ProductDescription");
            jsonWriter.value(productDescription);
        }
        if (reservedInstances.getReservedInstancesId() != null) {
            String reservedInstancesId = reservedInstances.getReservedInstancesId();
            jsonWriter.name("ReservedInstancesId");
            jsonWriter.value(reservedInstancesId);
        }
        if (reservedInstances.getStart() != null) {
            java.util.Date start = reservedInstances.getStart();
            jsonWriter.name("Start");
            jsonWriter.value(start);
        }
        if (reservedInstances.getState() != null) {
            String state = reservedInstances.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (reservedInstances.getUsagePrice() != null) {
            Float usagePrice = reservedInstances.getUsagePrice();
            jsonWriter.name("UsagePrice");
            jsonWriter.value(usagePrice);
        }
        if (reservedInstances.getCurrencyCode() != null) {
            String currencyCode = reservedInstances.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (reservedInstances.getInstanceTenancy() != null) {
            String instanceTenancy = reservedInstances.getInstanceTenancy();
            jsonWriter.name("InstanceTenancy");
            jsonWriter.value(instanceTenancy);
        }
        if (reservedInstances.getOfferingClass() != null) {
            String offeringClass = reservedInstances.getOfferingClass();
            jsonWriter.name("OfferingClass");
            jsonWriter.value(offeringClass);
        }
        if (reservedInstances.getOfferingType() != null) {
            String offeringType = reservedInstances.getOfferingType();
            jsonWriter.name("OfferingType");
            jsonWriter.value(offeringType);
        }
        if (reservedInstances.getRecurringCharges() != null) {
            java.util.List<RecurringCharge> recurringCharges = reservedInstances
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
        if (reservedInstances.getScope() != null) {
            String scope = reservedInstances.getScope();
            jsonWriter.name("Scope");
            jsonWriter.value(scope);
        }
        if (reservedInstances.getTags() != null) {
            java.util.List<Tag> tags = reservedInstances.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ReservedInstancesJsonMarshaller instance;

    public static ReservedInstancesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesJsonMarshaller();
        return instance;
    }
}
