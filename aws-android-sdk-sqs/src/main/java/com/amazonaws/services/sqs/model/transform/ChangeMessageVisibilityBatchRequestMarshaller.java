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
 * StAX request marshaller for ChangeMessageVisibilityBatchRequest
 */
public class ChangeMessageVisibilityBatchRequestMarshaller
        implements
        Marshaller<Request<ChangeMessageVisibilityBatchRequest>, ChangeMessageVisibilityBatchRequest> {

    public Request<ChangeMessageVisibilityBatchRequest> marshall(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) {
        if (changeMessageVisibilityBatchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ChangeMessageVisibilityBatchRequest)");
        }

        Request<ChangeMessageVisibilityBatchRequest> request = new DefaultRequest<ChangeMessageVisibilityBatchRequest>(
                changeMessageVisibilityBatchRequest, "AmazonSQS");
        request.addParameter("Action", "ChangeMessageVisibilityBatch");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (changeMessageVisibilityBatchRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = changeMessageVisibilityBatchRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (changeMessageVisibilityBatchRequest.getEntries() != null) {
            prefix = "ChangeMessageVisibilityBatchRequestEntry";
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries = changeMessageVisibilityBatchRequest
                    .getEntries();
            int entriesIndex = 1;
            String entriesPrefix = prefix;
            for (ChangeMessageVisibilityBatchRequestEntry entriesItem : entries) {
                prefix = entriesPrefix + "." + entriesIndex;
                if (entriesItem != null) {
                    ChangeMessageVisibilityBatchRequestEntryStaxMarshaller.getInstance().marshall(
                            entriesItem, request, prefix + ".");
                }
                entriesIndex++;
            }
            prefix = entriesPrefix;
        }

        return request;
    }
}
