/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LambdaInvokeOperation
 */
class LambdaInvokeOperationStaxMarshaller {

    public void marshall(LambdaInvokeOperation _lambdaInvokeOperation, Request<?> request, String _prefix) {
        String prefix;
        if (_lambdaInvokeOperation.getFunctionArn() != null) {
            prefix = _prefix + "FunctionArn";
            String functionArn = _lambdaInvokeOperation.getFunctionArn();
            request.addParameter(prefix, StringUtils.fromString(functionArn));
        }
    }

    private static LambdaInvokeOperationStaxMarshaller instance;
    public static LambdaInvokeOperationStaxMarshaller getInstance() {
        if (instance == null) instance = new LambdaInvokeOperationStaxMarshaller();
        return instance;
    }
}
