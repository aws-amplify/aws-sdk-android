/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ProvidedContext
 */
class ProvidedContextStaxMarshaller {

    public void marshall(ProvidedContext _providedContext, Request<?> request, String _prefix) {
        String prefix;
        if (_providedContext.getProviderArn() != null) {
            prefix = _prefix + "ProviderArn";
            String providerArn = _providedContext.getProviderArn();
            request.addParameter(prefix, StringUtils.fromString(providerArn));
        }
        if (_providedContext.getContextAssertion() != null) {
            prefix = _prefix + "ContextAssertion";
            String contextAssertion = _providedContext.getContextAssertion();
            request.addParameter(prefix, StringUtils.fromString(contextAssertion));
        }
    }

    private static ProvidedContextStaxMarshaller instance;

    public static ProvidedContextStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ProvidedContextStaxMarshaller();
        return instance;
    }
}
