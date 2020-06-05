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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LambdaFunctionAssociation
 */
class LambdaFunctionAssociationStaxMarshaller {

    public void marshall(LambdaFunctionAssociation _lambdaFunctionAssociation, Request<?> request,
            String _prefix) {
        String prefix;
        if (_lambdaFunctionAssociation.getLambdaFunctionARN() != null) {
            prefix = _prefix + "LambdaFunctionARN";
            String lambdaFunctionARN = _lambdaFunctionAssociation.getLambdaFunctionARN();
            request.addParameter(prefix, StringUtils.fromString(lambdaFunctionARN));
        }
        if (_lambdaFunctionAssociation.getEventType() != null) {
            prefix = _prefix + "EventType";
            String eventType = _lambdaFunctionAssociation.getEventType();
            request.addParameter(prefix, StringUtils.fromString(eventType));
        }
        if (_lambdaFunctionAssociation.getIncludeBody() != null) {
            prefix = _prefix + "IncludeBody";
            Boolean includeBody = _lambdaFunctionAssociation.getIncludeBody();
            request.addParameter(prefix, StringUtils.fromBoolean(includeBody));
        }
    }

    private static LambdaFunctionAssociationStaxMarshaller instance;

    public static LambdaFunctionAssociationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaFunctionAssociationStaxMarshaller();
        return instance;
    }
}
