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
 * StAX marshaller for POJO Message
 */
class MessageStaxMarshaller {

    public void marshall(Message _message, Request<?> request, String _prefix) {
        String prefix;
        if (_message.getSubject() != null) {
            prefix = _prefix + "Subject";
            Content subject = _message.getSubject();
            ContentStaxMarshaller.getInstance().marshall(subject, request, prefix + ".");
        }
        if (_message.getBody() != null) {
            prefix = _prefix + "Body";
            Body body = _message.getBody();
            BodyStaxMarshaller.getInstance().marshall(body, request, prefix + ".");
        }
    }

    private static MessageStaxMarshaller instance;

    public static MessageStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MessageStaxMarshaller();
        return instance;
    }
}
