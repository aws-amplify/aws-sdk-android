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
 * StAX marshaller for POJO OriginCustomHeader
 */
class OriginCustomHeaderStaxMarshaller {

    public void marshall(OriginCustomHeader _originCustomHeader, Request<?> request, String _prefix) {
        String prefix;
        if (_originCustomHeader.getHeaderName() != null) {
            prefix = _prefix + "HeaderName";
            String headerName = _originCustomHeader.getHeaderName();
            request.addParameter(prefix, StringUtils.fromString(headerName));
        }
        if (_originCustomHeader.getHeaderValue() != null) {
            prefix = _prefix + "HeaderValue";
            String headerValue = _originCustomHeader.getHeaderValue();
            request.addParameter(prefix, StringUtils.fromString(headerValue));
        }
    }

    private static OriginCustomHeaderStaxMarshaller instance;

    public static OriginCustomHeaderStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OriginCustomHeaderStaxMarshaller();
        return instance;
    }
}
