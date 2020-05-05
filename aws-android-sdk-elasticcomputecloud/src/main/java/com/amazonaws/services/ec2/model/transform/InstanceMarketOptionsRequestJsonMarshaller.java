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
 * JSON marshaller for POJO InstanceMarketOptionsRequest
 */
class InstanceMarketOptionsRequestJsonMarshaller {

    public void marshall(InstanceMarketOptionsRequest instanceMarketOptionsRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceMarketOptionsRequest.getMarketType() != null) {
            String marketType = instanceMarketOptionsRequest.getMarketType();
            jsonWriter.name("MarketType");
            jsonWriter.value(marketType);
        }
        if (instanceMarketOptionsRequest.getSpotOptions() != null) {
            SpotMarketOptions spotOptions = instanceMarketOptionsRequest.getSpotOptions();
            jsonWriter.name("SpotOptions");
            SpotMarketOptionsJsonMarshaller.getInstance().marshall(spotOptions, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceMarketOptionsRequestJsonMarshaller instance;

    public static InstanceMarketOptionsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceMarketOptionsRequestJsonMarshaller();
        return instance;
    }
}
