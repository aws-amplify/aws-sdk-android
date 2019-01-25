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
 * StAX request marshaller for SetSubscriptionAttributesRequest
 */
public class SetSubscriptionAttributesRequestMarshaller implements
        Marshaller<Request<SetSubscriptionAttributesRequest>, SetSubscriptionAttributesRequest> {

    public Request<SetSubscriptionAttributesRequest> marshall(
            SetSubscriptionAttributesRequest setSubscriptionAttributesRequest) {
        if (setSubscriptionAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SetSubscriptionAttributesRequest)");
        }

        Request<SetSubscriptionAttributesRequest> request = new DefaultRequest<SetSubscriptionAttributesRequest>(
                setSubscriptionAttributesRequest, "AmazonSNS");
        request.addParameter("Action", "SetSubscriptionAttributes");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (setSubscriptionAttributesRequest.getSubscriptionArn() != null) {
            prefix = "SubscriptionArn";
            String subscriptionArn = setSubscriptionAttributesRequest.getSubscriptionArn();
            request.addParameter(prefix, StringUtils.fromString(subscriptionArn));
        }
        if (setSubscriptionAttributesRequest.getAttributeName() != null) {
            prefix = "AttributeName";
            String attributeName = setSubscriptionAttributesRequest.getAttributeName();
            request.addParameter(prefix, StringUtils.fromString(attributeName));
        }
        if (setSubscriptionAttributesRequest.getAttributeValue() != null) {
            prefix = "AttributeValue";
            String attributeValue = setSubscriptionAttributesRequest.getAttributeValue();
            request.addParameter(prefix, StringUtils.fromString(attributeValue));
        }

        return request;
    }
}
