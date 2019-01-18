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
 * JSON marshaller for POJO FirehoseAction
 */
class FirehoseActionJsonMarshaller {

    public void marshall(FirehoseAction firehoseAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (firehoseAction.getRoleArn() != null) {
            String roleArn = firehoseAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (firehoseAction.getDeliveryStreamName() != null) {
            String deliveryStreamName = firehoseAction.getDeliveryStreamName();
            jsonWriter.name("deliveryStreamName");
            jsonWriter.value(deliveryStreamName);
        }
        if (firehoseAction.getSeparator() != null) {
            String separator = firehoseAction.getSeparator();
            jsonWriter.name("separator");
            jsonWriter.value(separator);
        }
        jsonWriter.endObject();
    }

    private static FirehoseActionJsonMarshaller instance;

    public static FirehoseActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FirehoseActionJsonMarshaller();
        return instance;
    }
}
