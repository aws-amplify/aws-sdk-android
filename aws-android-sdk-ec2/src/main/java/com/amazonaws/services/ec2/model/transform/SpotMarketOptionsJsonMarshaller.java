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
 * JSON marshaller for POJO SpotMarketOptions
 */
class SpotMarketOptionsJsonMarshaller {

    public void marshall(SpotMarketOptions spotMarketOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (spotMarketOptions.getMaxPrice() != null) {
            String maxPrice = spotMarketOptions.getMaxPrice();
            jsonWriter.name("MaxPrice");
            jsonWriter.value(maxPrice);
        }
        if (spotMarketOptions.getSpotInstanceType() != null) {
            String spotInstanceType = spotMarketOptions.getSpotInstanceType();
            jsonWriter.name("SpotInstanceType");
            jsonWriter.value(spotInstanceType);
        }
        if (spotMarketOptions.getBlockDurationMinutes() != null) {
            Integer blockDurationMinutes = spotMarketOptions.getBlockDurationMinutes();
            jsonWriter.name("BlockDurationMinutes");
            jsonWriter.value(blockDurationMinutes);
        }
        if (spotMarketOptions.getValidUntil() != null) {
            java.util.Date validUntil = spotMarketOptions.getValidUntil();
            jsonWriter.name("ValidUntil");
            jsonWriter.value(validUntil);
        }
        if (spotMarketOptions.getInstanceInterruptionBehavior() != null) {
            String instanceInterruptionBehavior = spotMarketOptions
                    .getInstanceInterruptionBehavior();
            jsonWriter.name("InstanceInterruptionBehavior");
            jsonWriter.value(instanceInterruptionBehavior);
        }
        jsonWriter.endObject();
    }

    private static SpotMarketOptionsJsonMarshaller instance;

    public static SpotMarketOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotMarketOptionsJsonMarshaller();
        return instance;
    }
}
