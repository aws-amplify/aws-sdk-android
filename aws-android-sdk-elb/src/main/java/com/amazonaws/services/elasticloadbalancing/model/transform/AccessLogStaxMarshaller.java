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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AccessLog
 */
class AccessLogStaxMarshaller {

    public void marshall(AccessLog _accessLog, Request<?> request, String _prefix) {
        String prefix;
        if (_accessLog.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _accessLog.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_accessLog.getS3BucketName() != null) {
            prefix = _prefix + "S3BucketName";
            String s3BucketName = _accessLog.getS3BucketName();
            request.addParameter(prefix, StringUtils.fromString(s3BucketName));
        }
        if (_accessLog.getEmitInterval() != null) {
            prefix = _prefix + "EmitInterval";
            Integer emitInterval = _accessLog.getEmitInterval();
            request.addParameter(prefix, StringUtils.fromInteger(emitInterval));
        }
        if (_accessLog.getS3BucketPrefix() != null) {
            prefix = _prefix + "S3BucketPrefix";
            String s3BucketPrefix = _accessLog.getS3BucketPrefix();
            request.addParameter(prefix, StringUtils.fromString(s3BucketPrefix));
        }
    }

    private static AccessLogStaxMarshaller instance;

    public static AccessLogStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccessLogStaxMarshaller();
        return instance;
    }
}
