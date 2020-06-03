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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ParameterNameValue
 */
class ParameterNameValueStaxMarshaller {

    public void marshall(ParameterNameValue _parameterNameValue, Request<?> request, String _prefix) {
        String prefix;
        if (_parameterNameValue.getParameterName() != null) {
            prefix = _prefix + "ParameterName";
            String parameterName = _parameterNameValue.getParameterName();
            request.addParameter(prefix, StringUtils.fromString(parameterName));
        }
        if (_parameterNameValue.getParameterValue() != null) {
            prefix = _prefix + "ParameterValue";
            String parameterValue = _parameterNameValue.getParameterValue();
            request.addParameter(prefix, StringUtils.fromString(parameterValue));
        }
    }

    private static ParameterNameValueStaxMarshaller instance;

    public static ParameterNameValueStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterNameValueStaxMarshaller();
        return instance;
    }
}
