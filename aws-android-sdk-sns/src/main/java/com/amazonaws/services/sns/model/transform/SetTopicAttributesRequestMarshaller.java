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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SetTopicAttributesRequest
 */
public class SetTopicAttributesRequestMarshaller implements
        Marshaller<Request<SetTopicAttributesRequest>, SetTopicAttributesRequest> {

    public Request<SetTopicAttributesRequest> marshall(
            SetTopicAttributesRequest setTopicAttributesRequest) {
        if (setTopicAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetTopicAttributesRequest)");
        }

        Request<SetTopicAttributesRequest> request = new DefaultRequest<SetTopicAttributesRequest>(
                setTopicAttributesRequest, "AmazonSNS");
        request.addParameter("Action", "SetTopicAttributes");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (setTopicAttributesRequest.getTopicArn() != null) {
            prefix = "TopicArn";
            String topicArn = setTopicAttributesRequest.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (setTopicAttributesRequest.getAttributeName() != null) {
            prefix = "AttributeName";
            String attributeName = setTopicAttributesRequest.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (setTopicAttributesRequest.getAttributeValue() != null) {
            prefix = "AttributeValue";
            String attributeValue = setTopicAttributesRequest.getAttributeValue();
            request.addParameter(prefix, StringUtils.fromString(attributeValue));
        }

        return request;
    }
}
