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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Reservation
 */
class ReservationJsonMarshaller {

    public void marshall(Reservation reservation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservation.getArn() != null) {
            String arn = reservation.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (reservation.getCount() != null) {
            Integer count = reservation.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        if (reservation.getCurrencyCode() != null) {
            String currencyCode = reservation.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (reservation.getDuration() != null) {
            Integer duration = reservation.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (reservation.getDurationUnits() != null) {
            String durationUnits = reservation.getDurationUnits();
            jsonWriter.name("DurationUnits");
            jsonWriter.value(durationUnits);
        }
        if (reservation.getEnd() != null) {
            String end = reservation.getEnd();
            jsonWriter.name("End");
            jsonWriter.value(end);
        }
        if (reservation.getFixedPrice() != null) {
            Double fixedPrice = reservation.getFixedPrice();
            jsonWriter.name("FixedPrice");
            jsonWriter.value(fixedPrice);
        }
        if (reservation.getName() != null) {
            String name = reservation.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (reservation.getOfferingDescription() != null) {
            String offeringDescription = reservation.getOfferingDescription();
            jsonWriter.name("OfferingDescription");
            jsonWriter.value(offeringDescription);
        }
        if (reservation.getOfferingId() != null) {
            String offeringId = reservation.getOfferingId();
            jsonWriter.name("OfferingId");
            jsonWriter.value(offeringId);
        }
        if (reservation.getOfferingType() != null) {
            String offeringType = reservation.getOfferingType();
            jsonWriter.name("OfferingType");
            jsonWriter.value(offeringType);
        }
        if (reservation.getRegion() != null) {
            String region = reservation.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (reservation.getReservationId() != null) {
            String reservationId = reservation.getReservationId();
            jsonWriter.name("ReservationId");
            jsonWriter.value(reservationId);
        }
        if (reservation.getResourceSpecification() != null) {
            ReservationResourceSpecification resourceSpecification = reservation
                    .getResourceSpecification();
            jsonWriter.name("ResourceSpecification");
            ReservationResourceSpecificationJsonMarshaller.getInstance().marshall(
                    resourceSpecification, jsonWriter);
        }
        if (reservation.getStart() != null) {
            String start = reservation.getStart();
            jsonWriter.name("Start");
            jsonWriter.value(start);
        }
        if (reservation.getState() != null) {
            String state = reservation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (reservation.getTags() != null) {
            java.util.Map<String, String> tags = reservation.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (reservation.getUsagePrice() != null) {
            Double usagePrice = reservation.getUsagePrice();
            jsonWriter.name("UsagePrice");
            jsonWriter.value(usagePrice);
        }
        jsonWriter.endObject();
    }

    private static ReservationJsonMarshaller instance;

    public static ReservationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationJsonMarshaller();
        return instance;
    }
}
