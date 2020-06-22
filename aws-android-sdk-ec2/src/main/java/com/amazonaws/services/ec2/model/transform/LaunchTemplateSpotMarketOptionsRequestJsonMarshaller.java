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
 * JSON marshaller for POJO LaunchTemplateSpotMarketOptionsRequest
 */
class LaunchTemplateSpotMarketOptionsRequestJsonMarshaller {

    public void marshall(
            LaunchTemplateSpotMarketOptionsRequest launchTemplateSpotMarketOptionsRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateSpotMarketOptionsRequest.getMaxPrice() != null) {
            String maxPrice = launchTemplateSpotMarketOptionsRequest.getMaxPrice();
            jsonWriter.name("MaxPrice");
            jsonWriter.value(maxPrice);
        }
        if (launchTemplateSpotMarketOptionsRequest.getSpotInstanceType() != null) {
            String spotInstanceType = launchTemplateSpotMarketOptionsRequest.getSpotInstanceType();
            jsonWriter.name("SpotInstanceType");
            jsonWriter.value(spotInstanceType);
        }
        if (launchTemplateSpotMarketOptionsRequest.getBlockDurationMinutes() != null) {
            Integer blockDurationMinutes = launchTemplateSpotMarketOptionsRequest
                    .getBlockDurationMinutes();
            jsonWriter.name("BlockDurationMinutes");
            jsonWriter.value(blockDurationMinutes);
        }
        if (launchTemplateSpotMarketOptionsRequest.getValidUntil() != null) {
            java.util.Date validUntil = launchTemplateSpotMarketOptionsRequest.getValidUntil();
            jsonWriter.name("ValidUntil");
            jsonWriter.value(validUntil);
        }
        if (launchTemplateSpotMarketOptionsRequest.getInstanceInterruptionBehavior() != null) {
            String instanceInterruptionBehavior = launchTemplateSpotMarketOptionsRequest
                    .getInstanceInterruptionBehavior();
            jsonWriter.name("InstanceInterruptionBehavior");
            jsonWriter.value(instanceInterruptionBehavior);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateSpotMarketOptionsRequestJsonMarshaller instance;

    public static LaunchTemplateSpotMarketOptionsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateSpotMarketOptionsRequestJsonMarshaller();
        return instance;
    }
}
