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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsSqsQueueDetails
 */
class AwsSqsQueueDetailsJsonMarshaller {

    public void marshall(AwsSqsQueueDetails awsSqsQueueDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsSqsQueueDetails.getKmsDataKeyReusePeriodSeconds() != null) {
            Integer kmsDataKeyReusePeriodSeconds = awsSqsQueueDetails
                    .getKmsDataKeyReusePeriodSeconds();
            jsonWriter.name("KmsDataKeyReusePeriodSeconds");
            jsonWriter.value(kmsDataKeyReusePeriodSeconds);
        }
        if (awsSqsQueueDetails.getKmsMasterKeyId() != null) {
            String kmsMasterKeyId = awsSqsQueueDetails.getKmsMasterKeyId();
            jsonWriter.name("KmsMasterKeyId");
            jsonWriter.value(kmsMasterKeyId);
        }
        if (awsSqsQueueDetails.getQueueName() != null) {
            String queueName = awsSqsQueueDetails.getQueueName();
            jsonWriter.name("QueueName");
            jsonWriter.value(queueName);
        }
        if (awsSqsQueueDetails.getDeadLetterTargetArn() != null) {
            String deadLetterTargetArn = awsSqsQueueDetails.getDeadLetterTargetArn();
            jsonWriter.name("DeadLetterTargetArn");
            jsonWriter.value(deadLetterTargetArn);
        }
        jsonWriter.endObject();
    }

    private static AwsSqsQueueDetailsJsonMarshaller instance;

    public static AwsSqsQueueDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsSqsQueueDetailsJsonMarshaller();
        return instance;
    }
}
