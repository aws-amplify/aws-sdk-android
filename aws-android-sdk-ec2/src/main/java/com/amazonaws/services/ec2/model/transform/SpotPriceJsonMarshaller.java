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
 * JSON marshaller for POJO SpotPrice
 */
class SpotPriceJsonMarshaller {

    public void marshall(SpotPrice spotPrice, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (spotPrice.getAvailabilityZone() != null) {
            String availabilityZone = spotPrice.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (spotPrice.getInstanceType() != null) {
            String instanceType = spotPrice.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (spotPrice.getProductDescription() != null) {
            String productDescription = spotPrice.getProductDescription();
            jsonWriter.name("ProductDescription");
            jsonWriter.value(productDescription);
        }
        if (spotPrice.getSpotPrice() != null) {
            String spotPrice = spotPrice.getSpotPrice();
            jsonWriter.name("SpotPrice");
            jsonWriter.value(spotPrice);
        }
        if (spotPrice.getTimestamp() != null) {
            java.util.Date timestamp = spotPrice.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        jsonWriter.endObject();
    }

    private static SpotPriceJsonMarshaller instance;

    public static SpotPriceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotPriceJsonMarshaller();
        return instance;
    }
}
