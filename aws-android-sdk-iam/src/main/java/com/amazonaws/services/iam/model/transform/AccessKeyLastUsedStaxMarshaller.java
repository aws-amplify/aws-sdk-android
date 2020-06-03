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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AccessKeyLastUsed
 */
class AccessKeyLastUsedStaxMarshaller {

    public void marshall(AccessKeyLastUsed _accessKeyLastUsed, Request<?> request, String _prefix) {
        String prefix;
        if (_accessKeyLastUsed.getLastUsedDate() != null) {
            prefix = _prefix + "LastUsedDate";
            java.util.Date lastUsedDate = _accessKeyLastUsed.getLastUsedDate();
            request.addParameter(prefix, StringUtils.fromDate(lastUsedDate));
        }
        if (_accessKeyLastUsed.getServiceName() != null) {
            prefix = _prefix + "ServiceName";
            String serviceName = _accessKeyLastUsed.getServiceName();
            request.addParameter(prefix, StringUtils.fromString(serviceName));
        }
        if (_accessKeyLastUsed.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _accessKeyLastUsed.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
    }

    private static AccessKeyLastUsedStaxMarshaller instance;

    public static AccessKeyLastUsedStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AccessKeyLastUsedStaxMarshaller();
        return instance;
    }
}
