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
 * StAX marshaller for POJO SNSAction
 */
class SNSActionStaxMarshaller {

    public void marshall(SNSAction _sNSAction, Request<?> request, String _prefix) {
        String prefix;
        if (_sNSAction.getTopicArn() != null) {
            prefix = _prefix + "TopicArn";
            String topicArn = _sNSAction.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (_sNSAction.getEncoding() != null) {
            prefix = _prefix + "Encoding";
            String encoding = _sNSAction.getEncoding();
            request.addParameter(prefix, StringUtils.fromString(encoding));
        }
    }

    private static SNSActionStaxMarshaller instance;

    public static SNSActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SNSActionStaxMarshaller();
        return instance;
    }
}
