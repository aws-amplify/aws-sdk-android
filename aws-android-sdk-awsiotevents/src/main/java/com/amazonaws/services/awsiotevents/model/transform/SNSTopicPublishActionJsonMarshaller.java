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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SNSTopicPublishAction
 */
class SNSTopicPublishActionJsonMarshaller {

    public void marshall(SNSTopicPublishAction sNSTopicPublishAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sNSTopicPublishAction.getTargetArn() != null) {
            String targetArn = sNSTopicPublishAction.getTargetArn();
            jsonWriter.name("targetArn");
            jsonWriter.value(targetArn);
        }
        if (sNSTopicPublishAction.getPayload() != null) {
            Payload payload = sNSTopicPublishAction.getPayload();
            jsonWriter.name("payload");
            PayloadJsonMarshaller.getInstance().marshall(payload, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SNSTopicPublishActionJsonMarshaller instance;

    public static SNSTopicPublishActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SNSTopicPublishActionJsonMarshaller();
        return instance;
    }
}
