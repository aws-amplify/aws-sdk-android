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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO IdentityNotificationAttributes
 */
class IdentityNotificationAttributesStaxMarshaller {

    public void marshall(IdentityNotificationAttributes _identityNotificationAttributes,
            Request<?> request, String _prefix) {
        String prefix;
        if (_identityNotificationAttributes.getBounceTopic() != null) {
            prefix = _prefix + "BounceTopic";
            String bounceTopic = _identityNotificationAttributes.getBounceTopic();
            request.addParameter(prefix, StringUtils.fromString(bounceTopic));
        }
        if (_identityNotificationAttributes.getComplaintTopic() != null) {
            prefix = _prefix + "ComplaintTopic";
            String complaintTopic = _identityNotificationAttributes.getComplaintTopic();
            request.addParameter(prefix, StringUtils.fromString(complaintTopic));
        }
        if (_identityNotificationAttributes.getDeliveryTopic() != null) {
            prefix = _prefix + "DeliveryTopic";
            String deliveryTopic = _identityNotificationAttributes.getDeliveryTopic();
            request.addParameter(prefix, StringUtils.fromString(deliveryTopic));
        }
        if (_identityNotificationAttributes.getForwardingEnabled() != null) {
            prefix = _prefix + "ForwardingEnabled";
            Boolean forwardingEnabled = _identityNotificationAttributes.getForwardingEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(forwardingEnabled));
        }
        if (_identityNotificationAttributes.getHeadersInBounceNotificationsEnabled() != null) {
            prefix = _prefix + "HeadersInBounceNotificationsEnabled";
            Boolean headersInBounceNotificationsEnabled = _identityNotificationAttributes
                    .getHeadersInBounceNotificationsEnabled();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(headersInBounceNotificationsEnabled));
        }
        if (_identityNotificationAttributes.getHeadersInComplaintNotificationsEnabled() != null) {
            prefix = _prefix + "HeadersInComplaintNotificationsEnabled";
            Boolean headersInComplaintNotificationsEnabled = _identityNotificationAttributes
                    .getHeadersInComplaintNotificationsEnabled();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(headersInComplaintNotificationsEnabled));
        }
        if (_identityNotificationAttributes.getHeadersInDeliveryNotificationsEnabled() != null) {
            prefix = _prefix + "HeadersInDeliveryNotificationsEnabled";
            Boolean headersInDeliveryNotificationsEnabled = _identityNotificationAttributes
                    .getHeadersInDeliveryNotificationsEnabled();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(headersInDeliveryNotificationsEnabled));
        }
    }

    private static IdentityNotificationAttributesStaxMarshaller instance;

    public static IdentityNotificationAttributesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityNotificationAttributesStaxMarshaller();
        return instance;
    }
}
