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
 * JSON marshaller for POJO Offering
 */
class OfferingJsonMarshaller {

    public void marshall(Offering offering, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (offering.getArn() != null) {
            String arn = offering.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (offering.getCurrencyCode() != null) {
            String currencyCode = offering.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (offering.getDuration() != null) {
            Integer duration = offering.getDuration();
            jsonWriter.name("Duration");
            jsonWriter.value(duration);
        }
        if (offering.getDurationUnits() != null) {
            String durationUnits = offering.getDurationUnits();
            jsonWriter.name("DurationUnits");
            jsonWriter.value(durationUnits);
        }
        if (offering.getFixedPrice() != null) {
            Double fixedPrice = offering.getFixedPrice();
            jsonWriter.name("FixedPrice");
            jsonWriter.value(fixedPrice);
        }
        if (offering.getOfferingDescription() != null) {
            String offeringDescription = offering.getOfferingDescription();
            jsonWriter.name("OfferingDescription");
            jsonWriter.value(offeringDescription);
        }
        if (offering.getOfferingId() != null) {
            String offeringId = offering.getOfferingId();
            jsonWriter.name("OfferingId");
            jsonWriter.value(offeringId);
        }
        if (offering.getOfferingType() != null) {
            String offeringType = offering.getOfferingType();
            jsonWriter.name("OfferingType");
            jsonWriter.value(offeringType);
        }
        if (offering.getRegion() != null) {
            String region = offering.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (offering.getResourceSpecification() != null) {
            ReservationResourceSpecification resourceSpecification = offering
                    .getResourceSpecification();
            jsonWriter.name("ResourceSpecification");
            ReservationResourceSpecificationJsonMarshaller.getInstance().marshall(
                    resourceSpecification, jsonWriter);
        }
        if (offering.getUsagePrice() != null) {
            Double usagePrice = offering.getUsagePrice();
            jsonWriter.name("UsagePrice");
            jsonWriter.value(usagePrice);
        }
        jsonWriter.endObject();
    }

    private static OfferingJsonMarshaller instance;

    public static OfferingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OfferingJsonMarshaller();
        return instance;
    }
}
