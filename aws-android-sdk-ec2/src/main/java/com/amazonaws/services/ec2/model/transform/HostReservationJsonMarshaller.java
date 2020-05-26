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
 * JSON marshaller for POJO HostReservation
 */
class HostReservationJsonMarshaller {

    public void marshall(HostReservation hostReservation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hostReservation.getCount() != null) {
            Integer count = hostReservation.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        if (hostReservation.getCurrencyCode() != null) {
            String currencyCode = hostReservation.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (hostReservation.getDuration() != null) {
            Integer duration = hostReservation.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (hostReservation.getEnd() != null) {
            java.util.Date end = hostReservation.getEnd();
            jsonWriter.name("End");
            jsonWriter.value(end);
        }
        if (hostReservation.getHostIdSet() != null) {
            java.util.List<String> hostIdSet = hostReservation.getHostIdSet();
            jsonWriter.name("HostIdSet");
            jsonWriter.beginArray();
            for (String hostIdSetItem : hostIdSet) {
                if (hostIdSetItem != null) {
                    jsonWriter.value(hostIdSetItem);
                }
            }
            jsonWriter.endArray();
        }
        if (hostReservation.getHostReservationId() != null) {
            String hostReservationId = hostReservation.getHostReservationId();
            jsonWriter.name("HostReservationId");
            jsonWriter.value(hostReservationId);
        }
        if (hostReservation.getHourlyPrice() != null) {
            String hourlyPrice = hostReservation.getHourlyPrice();
            jsonWriter.name("HourlyPrice");
            jsonWriter.value(hourlyPrice);
        }
        if (hostReservation.getInstanceFamily() != null) {
            String instanceFamily = hostReservation.getInstanceFamily();
            jsonWriter.name("InstanceFamily");
            jsonWriter.value(instanceFamily);
        }
        if (hostReservation.getOfferingId() != null) {
            String offeringId = hostReservation.getOfferingId();
            jsonWriter.name("OfferingId");
            jsonWriter.value(offeringId);
        }
        if (hostReservation.getPaymentOption() != null) {
            String paymentOption = hostReservation.getPaymentOption();
            jsonWriter.name("PaymentOption");
            jsonWriter.value(paymentOption);
        }
        if (hostReservation.getStart() != null) {
            java.util.Date start = hostReservation.getStart();
            jsonWriter.name("Start");
            jsonWriter.value(start);
        }
        if (hostReservation.getState() != null) {
            String state = hostReservation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (hostReservation.getUpfrontPrice() != null) {
            String upfrontPrice = hostReservation.getUpfrontPrice();
            jsonWriter.name("UpfrontPrice");
            jsonWriter.value(upfrontPrice);
        }
        if (hostReservation.getTags() != null) {
            java.util.List<Tag> tags = hostReservation.getTags();
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

    private static HostReservationJsonMarshaller instance;

    public static HostReservationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HostReservationJsonMarshaller();
        return instance;
    }
}
