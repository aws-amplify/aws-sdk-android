/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IotAnalyticsAction
 */
class IotAnalyticsActionJsonMarshaller {

    public void marshall(IotAnalyticsAction iotAnalyticsAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (iotAnalyticsAction.getChannelArn() != null) {
            String channelArn = iotAnalyticsAction.getChannelArn();
            jsonWriter.name("channelArn");
            jsonWriter.value(channelArn);
        }
        if (iotAnalyticsAction.getChannelName() != null) {
            String channelName = iotAnalyticsAction.getChannelName();
            jsonWriter.name("channelName");
            jsonWriter.value(channelName);
        }
        if (iotAnalyticsAction.getRoleArn() != null) {
            String roleArn = iotAnalyticsAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static IotAnalyticsActionJsonMarshaller instance;

    public static IotAnalyticsActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IotAnalyticsActionJsonMarshaller();
        return instance;
    }
}
