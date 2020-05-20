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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrafficRoutingConfig
 */
class TrafficRoutingConfigJsonMarshaller {

    public void marshall(TrafficRoutingConfig trafficRoutingConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trafficRoutingConfig.getType() != null) {
            String type = trafficRoutingConfig.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (trafficRoutingConfig.getTimeBasedCanary() != null) {
            TimeBasedCanary timeBasedCanary = trafficRoutingConfig.getTimeBasedCanary();
            jsonWriter.name("timeBasedCanary");
            TimeBasedCanaryJsonMarshaller.getInstance().marshall(timeBasedCanary, jsonWriter);
        }
        if (trafficRoutingConfig.getTimeBasedLinear() != null) {
            TimeBasedLinear timeBasedLinear = trafficRoutingConfig.getTimeBasedLinear();
            jsonWriter.name("timeBasedLinear");
            TimeBasedLinearJsonMarshaller.getInstance().marshall(timeBasedLinear, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrafficRoutingConfigJsonMarshaller instance;

    public static TrafficRoutingConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficRoutingConfigJsonMarshaller();
        return instance;
    }
}
