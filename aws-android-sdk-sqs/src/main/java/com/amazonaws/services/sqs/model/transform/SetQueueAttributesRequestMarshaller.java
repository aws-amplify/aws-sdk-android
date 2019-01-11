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
 * StAX request marshaller for SetQueueAttributesRequest
 */
public class SetQueueAttributesRequestMarshaller implements
        Marshaller<Request<SetQueueAttributesRequest>, SetQueueAttributesRequest> {

    public Request<SetQueueAttributesRequest> marshall(
            SetQueueAttributesRequest setQueueAttributesRequest) {
        if (setQueueAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetQueueAttributesRequest)");
        }

        Request<SetQueueAttributesRequest> request = new DefaultRequest<SetQueueAttributesRequest>(
                setQueueAttributesRequest, "AmazonSQS");
        request.addParameter("Action", "SetQueueAttributes");
        request.addParameter("Version", "2012-11-05");

        String prefix;
        if (setQueueAttributesRequest.getQueueUrl() != null) {
            prefix = "QueueUrl";
            String queueUrl = setQueueAttributesRequest.getQueueUrl();
            request.addParameter(prefix, StringUtils.fromString(queueUrl));
        }
        if (setQueueAttributesRequest.getAttributes() != null) {
            prefix = "Attribute";
            java.util.Map<String, String> attributes = setQueueAttributesRequest.getAttributes();
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

        return request;
    }
}
