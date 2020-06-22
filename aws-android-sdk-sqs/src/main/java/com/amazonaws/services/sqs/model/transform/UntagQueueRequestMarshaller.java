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

package com.amazonaws.services.sqs.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for UntagQueueRequest
 */
public class UntagQueueRequestMarshaller implements
        Marshaller<Request<UntagQueueRequest>, UntagQueueRequest> {

    public Request<UntagQueueRequest> marshall(UntagQueueRequest untagQueueRequest) {
        if (untagQueueRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UntagQueueRequest)");
        }

        Request<UntagQueueRequest> request = new DefaultRequest<UntagQueueRequest>(
                untagQueueRequest, "AmazonSimpleQueueService");
        request.addParameter("Action", "UntagQueue");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (untagQueueRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = untagQueueRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (untagQueueRequest.getTagKeys() != null) {
            prefix = "TagKey";
            java.util.List<String> tagKeys = untagQueueRequest.getTagKeys();
            int tagKeysIndex = 1;
            String tagKeysPrefix = prefix;
            for (String tagKeysItem : tagKeys) {
                prefix = tagKeysPrefix + "." + tagKeysIndex;
                if (tagKeysItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(tagKeysItem));
                }
                tagKeysIndex++;
            }
            prefix = tagKeysPrefix;
        }

        return request;
    }
}
