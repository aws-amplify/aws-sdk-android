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
 * JSON marshaller for POJO LaunchTemplateInstanceMarketOptions
 */
class LaunchTemplateInstanceMarketOptionsJsonMarshaller {

    public void marshall(LaunchTemplateInstanceMarketOptions launchTemplateInstanceMarketOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateInstanceMarketOptions.getMarketType() != null) {
            String marketType = launchTemplateInstanceMarketOptions.getMarketType();
            jsonWriter.name("MarketType");
            jsonWriter.value(marketType);
        }
        if (launchTemplateInstanceMarketOptions.getSpotOptions() != null) {
            LaunchTemplateSpotMarketOptions spotOptions = launchTemplateInstanceMarketOptions
                    .getSpotOptions();
            jsonWriter.name("SpotOptions");
            LaunchTemplateSpotMarketOptionsJsonMarshaller.getInstance().marshall(spotOptions,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateInstanceMarketOptionsJsonMarshaller instance;

    public static LaunchTemplateInstanceMarketOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceMarketOptionsJsonMarshaller();
        return instance;
    }
}
