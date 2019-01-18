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
 * StAX request marshaller for DeleteMessageBatchRequest
 */
public class DeleteMessageBatchRequestMarshaller implements
        Marshaller<Request<DeleteMessageBatchRequest>, DeleteMessageBatchRequest> {

    public Request<DeleteMessageBatchRequest> marshall(
            DeleteMessageBatchRequest deleteMessageBatchRequest) {
        if (deleteMessageBatchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteMessageBatchRequest)");
        }

        Request<DeleteMessageBatchRequest> request = new DefaultRequest<DeleteMessageBatchRequest>(
                deleteMessageBatchRequest, "AmazonSQS");
        request.addParameter("Action", "DeleteMessageBatch");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (deleteMessageBatchRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = deleteMessageBatchRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (deleteMessageBatchRequest.getEntries() != null) {
            prefix = "DeleteMessageBatchRequestEntry";
            java.util.List<DeleteMessageBatchRequestEntry> entries = deleteMessageBatchRequest
                    .getEntries();
            int entriesIndex = 1;
            String entriesPrefix = prefix;
            for (DeleteMessageBatchRequestEntry entriesItem : entries) {
                prefix = entriesPrefix + "." + entriesIndex;
                if (entriesItem != null) {
                    DeleteMessageBatchRequestEntryStaxMarshaller.getInstance().marshall(
                            entriesItem, request, prefix + ".");
                }
                entriesIndex++;
            }
            prefix = entriesPrefix;
        }

        return request;
    }
}
