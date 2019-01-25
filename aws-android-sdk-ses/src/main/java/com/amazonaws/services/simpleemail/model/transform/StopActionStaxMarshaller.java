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
 * StAX marshaller for POJO StopAction
 */
class StopActionStaxMarshaller {

    public void marshall(StopAction _stopAction, Request<?> request, String _prefix) {
        String prefix;
        if (_stopAction.getScope() != null) {
            prefix = _prefix + "Scope";
            String scope = _stopAction.getScope();
            request.addParameter(prefix, StringUtils.fromString(scope));
        }
        if (_stopAction.getTopicArn() != null) {
            prefix = _prefix + "TopicArn";
            String topicArn = _stopAction.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
    }

    private static StopActionStaxMarshaller instance;

    public static StopActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StopActionStaxMarshaller();
        return instance;
    }
}
