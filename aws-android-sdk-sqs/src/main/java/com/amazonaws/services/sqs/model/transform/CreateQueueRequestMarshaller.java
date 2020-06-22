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
 * StAX request marshaller for CreateQueueRequest
 */
public class CreateQueueRequestMarshaller implements
        Marshaller<Request<CreateQueueRequest>, CreateQueueRequest> {

    public Request<CreateQueueRequest> marshall(CreateQueueRequest createQueueRequest) {
        if (createQueueRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateQueueRequest)");
        }

        Request<CreateQueueRequest> request = new DefaultRequest<CreateQueueRequest>(
                createQueueRequest, "AmazonSimpleQueueService");
        request.addParameter("Action", "CreateQueue");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (createQueueRequest.getQueueName() != null) {
            prefix = "QueueName";
            String queueName = createQueueRequest.getQueueName();
            request.addParameter(prefix, StringUtils.fromString(queueName));
        }
        if (createQueueRequest.getAttributes() != null) {
            prefix = "Attribute";
            java.util.Map<String, String> attributes = createQueueRequest.getAttributes();
            int attributesIndex = 1;
            String attributesPrefix = prefix + ".";
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                prefix = attributesPrefix + attributesIndex;
                if (attributesEntry.getKey() != null) {
                    request.addParameter(prefix + ".Name",
                            StringUtils.fromString(attributesEntry.getKey()));
                }
                prefix += ".Value";
                if (attributesEntry.getValue() != null) {
                    String attributesValue = attributesEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(attributesValue));
                }
                attributesIndex++;
            }
            prefix = attributesPrefix;
        }
        if (createQueueRequest.getTags() != null) {
            prefix = "Tag";
            java.util.Map<String, String> tags = createQueueRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix + ".";
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                prefix = tagsPrefix + tagsIndex;
                if (tagsEntry.getKey() != null) {
                    request.addParameter(prefix + ".Key",
                            StringUtils.fromString(tagsEntry.getKey()));
                }
                prefix += ".Value";
                if (tagsEntry.getValue() != null) {
                    String tagsValue = tagsEntry.getValue();
                    request.addParameter(prefix, StringUtils.fromString(tagsValue));
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
