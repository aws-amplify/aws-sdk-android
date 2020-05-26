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
 * JSON marshaller for POJO LaunchTemplateSpotMarketOptions
 */
class LaunchTemplateSpotMarketOptionsJsonMarshaller {

    public void marshall(LaunchTemplateSpotMarketOptions launchTemplateSpotMarketOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateSpotMarketOptions.getMaxPrice() != null) {
            String maxPrice = launchTemplateSpotMarketOptions.getMaxPrice();
            jsonWriter.name("MaxPrice");
            jsonWriter.value(maxPrice);
        }
        if (launchTemplateSpotMarketOptions.getSpotInstanceType() != null) {
            String spotInstanceType = launchTemplateSpotMarketOptions.getSpotInstanceType();
            jsonWriter.name("SpotInstanceType");
            jsonWriter.value(spotInstanceType);
        }
        if (launchTemplateSpotMarketOptions.getBlockDurationMinutes() != null) {
            Integer blockDurationMinutes = launchTemplateSpotMarketOptions
                    .getBlockDurationMinutes();
            jsonWriter.name("BlockDurationMinutes");
            jsonWriter.value(blockDurationMinutes);
        }
        if (launchTemplateSpotMarketOptions.getValidUntil() != null) {
            java.util.Date validUntil = launchTemplateSpotMarketOptions.getValidUntil();
            jsonWriter.name("ValidUntil");
            jsonWriter.value(validUntil);
        }
        if (launchTemplateSpotMarketOptions.getInstanceInterruptionBehavior() != null) {
            String instanceInterruptionBehavior = launchTemplateSpotMarketOptions
                    .getInstanceInterruptionBehavior();
            jsonWriter.name("InstanceInterruptionBehavior");
            jsonWriter.value(instanceInterruptionBehavior);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateSpotMarketOptionsJsonMarshaller instance;

    public static LaunchTemplateSpotMarketOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateSpotMarketOptionsJsonMarshaller();
        return instance;
    }
}
