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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Error
 */
class ErrorStaxMarshaller {

    public void marshall(Error _error, Request<?> request, String _prefix) {
        String prefix;
        if (_error.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _error.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_error.getVersionId() != null) {
            prefix = _prefix + "VersionId";
            String versionId = _error.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
        if (_error.getCode() != null) {
            prefix = _prefix + "Code";
            String code = _error.getCode();
            request.addParameter(prefix, StringUtils.fromString(code));
        }
        if (_error.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _error.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
    }

    private static ErrorStaxMarshaller instance;

    public static ErrorStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ErrorStaxMarshaller();
        return instance;
    }
}
