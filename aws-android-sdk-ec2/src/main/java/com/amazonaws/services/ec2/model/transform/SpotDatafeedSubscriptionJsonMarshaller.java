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
 * JSON marshaller for POJO SpotDatafeedSubscription
 */
class SpotDatafeedSubscriptionJsonMarshaller {

    public void marshall(SpotDatafeedSubscription spotDatafeedSubscription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (spotDatafeedSubscription.getBucket() != null) {
            String bucket = spotDatafeedSubscription.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (spotDatafeedSubscription.getFault() != null) {
            SpotInstanceStateFault fault = spotDatafeedSubscription.getFault();
            jsonWriter.name("Fault");
            SpotInstanceStateFaultJsonMarshaller.getInstance().marshall(fault, jsonWriter);
        }
        if (spotDatafeedSubscription.getOwnerId() != null) {
            String ownerId = spotDatafeedSubscription.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (spotDatafeedSubscription.getPrefix() != null) {
            String prefix = spotDatafeedSubscription.getPrefix();
            jsonWriter.name("Prefix");
            jsonWriter.value(prefix);
        }
        if (spotDatafeedSubscription.getState() != null) {
            String state = spotDatafeedSubscription.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static SpotDatafeedSubscriptionJsonMarshaller instance;

    public static SpotDatafeedSubscriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotDatafeedSubscriptionJsonMarshaller();
        return instance;
    }
}
