/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iotdata.model.transform;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RetainedMessageSummary
 */
class RetainedMessageSummaryJsonMarshaller {

    public void marshall(RetainedMessageSummary retainedMessageSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (retainedMessageSummary.getTopic() != null) {
            String topic = retainedMessageSummary.getTopic();
            jsonWriter.name("topic");
            jsonWriter.value(topic);
        }
        if (retainedMessageSummary.getPayloadSize() != null) {
            Long payloadSize = retainedMessageSummary.getPayloadSize();
            jsonWriter.name("payloadSize");
            jsonWriter.value(payloadSize);
        }
        if (retainedMessageSummary.getQos() != null) {
            Integer qos = retainedMessageSummary.getQos();
            jsonWriter.name("qos");
            jsonWriter.value(qos);
        }
        if (retainedMessageSummary.getLastModifiedTime() != null) {
            Long lastModifiedTime = retainedMessageSummary.getLastModifiedTime();
            jsonWriter.name("lastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        jsonWriter.endObject();
    }

    private static RetainedMessageSummaryJsonMarshaller instance;

    public static RetainedMessageSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RetainedMessageSummaryJsonMarshaller();
        return instance;
    }
}
