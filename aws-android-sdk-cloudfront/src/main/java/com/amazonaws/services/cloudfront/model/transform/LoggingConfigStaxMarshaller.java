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
 * StAX marshaller for POJO LoggingConfig
 */
class LoggingConfigStaxMarshaller {

    public void marshall(LoggingConfig _loggingConfig, Request<?> request, String _prefix) {
        String prefix;
        if (_loggingConfig.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _loggingConfig.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_loggingConfig.getIncludeCookies() != null) {
            prefix = _prefix + "IncludeCookies";
            Boolean includeCookies = _loggingConfig.getIncludeCookies();
            request.addParameter(prefix, StringUtils.fromBoolean(includeCookies));
        }
        if (_loggingConfig.getBucket() != null) {
            prefix = _prefix + "Bucket";
            String bucket = _loggingConfig.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (_loggingConfig.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _loggingConfig.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
    }

    private static LoggingConfigStaxMarshaller instance;

    public static LoggingConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoggingConfigStaxMarshaller();
        return instance;
    }
}
