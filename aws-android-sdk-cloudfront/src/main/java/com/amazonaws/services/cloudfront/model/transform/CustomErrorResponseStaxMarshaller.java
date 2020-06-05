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
 * StAX marshaller for POJO CustomErrorResponse
 */
class CustomErrorResponseStaxMarshaller {

    public void marshall(CustomErrorResponse _customErrorResponse, Request<?> request,
            String _prefix) {
        String prefix;
        if (_customErrorResponse.getErrorCode() != null) {
            prefix = _prefix + "ErrorCode";
            Integer errorCode = _customErrorResponse.getErrorCode();
            request.addParameter(prefix, StringUtils.fromInteger(errorCode));
        }
        if (_customErrorResponse.getResponsePagePath() != null) {
            prefix = _prefix + "ResponsePagePath";
            String responsePagePath = _customErrorResponse.getResponsePagePath();
            request.addParameter(prefix, StringUtils.fromString(responsePagePath));
        }
        if (_customErrorResponse.getResponseCode() != null) {
            prefix = _prefix + "ResponseCode";
            String responseCode = _customErrorResponse.getResponseCode();
            request.addParameter(prefix, StringUtils.fromString(responseCode));
        }
        if (_customErrorResponse.getErrorCachingMinTTL() != null) {
            prefix = _prefix + "ErrorCachingMinTTL";
            Long errorCachingMinTTL = _customErrorResponse.getErrorCachingMinTTL();
            request.addParameter(prefix, StringUtils.fromLong(errorCachingMinTTL));
        }
    }

    private static CustomErrorResponseStaxMarshaller instance;

    public static CustomErrorResponseStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CustomErrorResponseStaxMarshaller();
        return instance;
    }
}
