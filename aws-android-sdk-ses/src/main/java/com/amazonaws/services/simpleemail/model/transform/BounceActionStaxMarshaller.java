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
 * StAX marshaller for POJO BounceAction
 */
class BounceActionStaxMarshaller {

    public void marshall(BounceAction _bounceAction, Request<?> request, String _prefix) {
        String prefix;
        if (_bounceAction.getTopicArn() != null) {
            prefix = _prefix + "TopicArn";
            String topicArn = _bounceAction.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (_bounceAction.getSmtpReplyCode() != null) {
            prefix = _prefix + "SmtpReplyCode";
            String smtpReplyCode = _bounceAction.getSmtpReplyCode();
            request.addParameter(prefix, StringUtils.fromString(smtpReplyCode));
        }
        if (_bounceAction.getStatusCode() != null) {
            prefix = _prefix + "StatusCode";
            String statusCode = _bounceAction.getStatusCode();
            request.addParameter(prefix, StringUtils.fromString(statusCode));
        }
        if (_bounceAction.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _bounceAction.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (_bounceAction.getSender() != null) {
            prefix = _prefix + "Sender";
            String sender = _bounceAction.getSender();
            request.addParameter(prefix, StringUtils.fromString(sender));
        }
    }

    private static BounceActionStaxMarshaller instance;

    public static BounceActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BounceActionStaxMarshaller();
        return instance;
    }
}
