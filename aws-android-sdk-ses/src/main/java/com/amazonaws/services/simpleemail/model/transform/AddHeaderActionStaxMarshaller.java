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
 * StAX marshaller for POJO AddHeaderAction
 */
class AddHeaderActionStaxMarshaller {

    public void marshall(AddHeaderAction _addHeaderAction, Request<?> request, String _prefix) {
        String prefix;
        if (_addHeaderAction.getHeaderName() != null) {
            prefix = _prefix + "HeaderName";
            String headerName = _addHeaderAction.getHeaderName();
            request.addParameter(prefix, StringUtils.fromString(headerName));
        }
        if (_addHeaderAction.getHeaderValue() != null) {
            prefix = _prefix + "HeaderValue";
            String headerValue = _addHeaderAction.getHeaderValue();
            request.addParameter(prefix, StringUtils.fromString(headerValue));
        }
    }

    private static AddHeaderActionStaxMarshaller instance;

    public static AddHeaderActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AddHeaderActionStaxMarshaller();
        return instance;
    }
}
