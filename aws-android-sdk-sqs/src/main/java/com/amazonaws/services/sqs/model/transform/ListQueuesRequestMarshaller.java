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
 * StAX request marshaller for ListQueuesRequest
 */
public class ListQueuesRequestMarshaller implements
        Marshaller<Request<ListQueuesRequest>, ListQueuesRequest> {

    public Request<ListQueuesRequest> marshall(ListQueuesRequest listQueuesRequest) {
        if (listQueuesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListQueuesRequest)");
        }

        Request<ListQueuesRequest> request = new DefaultRequest<ListQueuesRequest>(
                listQueuesRequest, "AmazonSQS");
        request.addParameter("Action", "ListQueues");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (listQueuesRequest.getQueueNamePrefix() != null) {
            prefix = "QueueNamePrefix";
            String queueNamePrefix = listQueuesRequest.getQueueNamePrefix();
            request.addParameter(prefix, StringUtils.fromString(queueNamePrefix));
        }

        return request;
    }
}
