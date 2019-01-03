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
 * JSON marshaller for POJO SqsAction
 */
class SqsActionJsonMarshaller {

    public void marshall(SqsAction sqsAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sqsAction.getRoleArn() != null) {
            String roleArn = sqsAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (sqsAction.getQueueUrl() != null) {
            String queueUrl = sqsAction.getQueueUrl();
            jsonWriter.name("queueUrl");
            jsonWriter.value(queueUrl);
        }
        if (sqsAction.getUseBase64() != null) {
            Boolean useBase64 = sqsAction.getUseBase64();
            jsonWriter.name("useBase64");
            jsonWriter.value(useBase64);
        }
        jsonWriter.endObject();
    }

    private static SqsActionJsonMarshaller instance;

    public static SqsActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SqsActionJsonMarshaller();
        return instance;
    }
}
