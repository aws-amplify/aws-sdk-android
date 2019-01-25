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

package com.amazonaws.services.sqs.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SendMessageBatchRequest
 */
public class SendMessageBatchRequestMarshaller implements
        Marshaller<Request<SendMessageBatchRequest>, SendMessageBatchRequest> {

    public Request<SendMessageBatchRequest> marshall(SendMessageBatchRequest sendMessageBatchRequest) {
        if (sendMessageBatchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SendMessageBatchRequest)");
        }

        Request<SendMessageBatchRequest> request = new DefaultRequest<SendMessageBatchRequest>(
                sendMessageBatchRequest, "AmazonSQS");
        request.addParameter("Action", "SendMessageBatch");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (sendMessageBatchRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = sendMessageBatchRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (sendMessageBatchRequest.getEntries() != null) {
            prefix = "SendMessageBatchRequestEntry";
            java.util.List<SendMessageBatchRequestEntry> entries = sendMessageBatchRequest
                    .getEntries();
            int entriesIndex = 1;
            String entriesPrefix = prefix;
            for (SendMessageBatchRequestEntry entriesItem : entries) {
                prefix = entriesPrefix + "." + entriesIndex;
                if (entriesItem != null) {
                    SendMessageBatchRequestEntryStaxMarshaller.getInstance().marshall(entriesItem,
                            request, prefix + ".");
                }
                entriesIndex++;
            }
            prefix = entriesPrefix;
        }

        return request;
    }
}
