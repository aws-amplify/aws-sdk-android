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
 * StAX marshaller for POJO LambdaAction
 */
class LambdaActionStaxMarshaller {

    public void marshall(LambdaAction _lambdaAction, Request<?> request, String _prefix) {
        String prefix;
        if (_lambdaAction.getTopicArn() != null) {
            prefix = _prefix + "TopicArn";
            String topicArn = _lambdaAction.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (_lambdaAction.getFunctionArn() != null) {
            prefix = _prefix + "FunctionArn";
            String functionArn = _lambdaAction.getFunctionArn();
            request.addParameter(prefix, StringUtils.fromString(functionArn));
        }
        if (_lambdaAction.getInvocationType() != null) {
            prefix = _prefix + "InvocationType";
            String invocationType = _lambdaAction.getInvocationType();
            request.addParameter(prefix, StringUtils.fromString(invocationType));
        }
    }

    private static LambdaActionStaxMarshaller instance;

    public static LambdaActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaActionStaxMarshaller();
        return instance;
    }
}
