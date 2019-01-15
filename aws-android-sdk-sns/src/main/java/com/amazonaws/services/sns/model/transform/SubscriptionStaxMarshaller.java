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

import com.amazonaws.Request;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Subscription
 */
class SubscriptionStaxMarshaller {

    public void marshall(Subscription _subscription, Request<?> request, String _prefix) {
        String prefix;
        if (_subscription.getSubscriptionArn() != null) {
            prefix = _prefix + "SubscriptionArn";
            String subscriptionArn = _subscription.getSubscriptionArn();
            request.addParameter(prefix, StringUtils.fromString(subscriptionArn));
        }
        if (_subscription.getOwner() != null) {
            prefix = _prefix + "Owner";
            String owner = _subscription.getOwner();
            request.addParameter(prefix, StringUtils.fromString(owner));
        }
        if (_subscription.getProtocol() != null) {
            prefix = _prefix + "Protocol";
            String protocol = _subscription.getProtocol();
            request.addParameter(prefix, StringUtils.fromString(protocol));
        }
        if (_subscription.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            String endpoint = _subscription.getEndpoint();
            request.addParameter(prefix, StringUtils.fromString(endpoint));
        }
        if (_subscription.getTopicArn() != null) {
            prefix = _prefix + "TopicArn";
            String topicArn = _subscription.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
    }

    private static SubscriptionStaxMarshaller instance;

    public static SubscriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SubscriptionStaxMarshaller();
        return instance;
    }
}
