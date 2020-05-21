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
 * StAX marshaller for POJO LoggingEnabled
 */
class LoggingEnabledStaxMarshaller {

    public void marshall(LoggingEnabled _loggingEnabled, Request<?> request, String _prefix) {
        String prefix;
        if (_loggingEnabled.getTargetBucket() != null) {
            prefix = _prefix + "TargetBucket";
            String targetBucket = _loggingEnabled.getTargetBucket();
            request.addParameter(prefix, StringUtils.fromString(targetBucket));
        }
        if (_loggingEnabled.getTargetGrants() != null) {
            prefix = _prefix + "TargetGrants";
            java.util.List<TargetGrant> targetGrants = _loggingEnabled.getTargetGrants();
            int targetGrantsIndex = 1;
            String targetGrantsPrefix = prefix;
            for (TargetGrant targetGrantsItem : targetGrants) {
                prefix = targetGrantsPrefix + "." + targetGrantsIndex;
                if (targetGrantsItem != null) {
                    TargetGrantStaxMarshaller.getInstance().marshall(targetGrantsItem, request,
                            prefix + ".");
                }
                targetGrantsIndex++;
            }
            prefix = targetGrantsPrefix;
        }
        if (_loggingEnabled.getTargetPrefix() != null) {
            prefix = _prefix + "TargetPrefix";
            String targetPrefix = _loggingEnabled.getTargetPrefix();
            request.addParameter(prefix, StringUtils.fromString(targetPrefix));
        }
    }

    private static LoggingEnabledStaxMarshaller instance;

    public static LoggingEnabledStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LoggingEnabledStaxMarshaller();
        return instance;
    }
}
