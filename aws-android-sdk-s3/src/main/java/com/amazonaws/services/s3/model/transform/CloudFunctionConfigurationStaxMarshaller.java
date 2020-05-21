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
 * StAX marshaller for POJO CloudFunctionConfiguration
 */
class CloudFunctionConfigurationStaxMarshaller {

    public void marshall(CloudFunctionConfiguration _cloudFunctionConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cloudFunctionConfiguration.getId() != null) {
            prefix = _prefix + "Id";
            String id = _cloudFunctionConfiguration.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_cloudFunctionConfiguration.getEvent() != null) {
            prefix = _prefix + "Event";
            String event = _cloudFunctionConfiguration.getEvent();
            request.addParameter(prefix, StringUtils.fromString(event));
        }
        if (_cloudFunctionConfiguration.getEvents() != null) {
            prefix = _prefix + "Events";
            java.util.List<String> events = _cloudFunctionConfiguration.getEvents();
            int eventsIndex = 1;
            String eventsPrefix = prefix;
            for (String eventsItem : events) {
                prefix = eventsPrefix + ".member." + eventsIndex;
                if (eventsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(eventsItem));
                }
                eventsIndex++;
            }
            prefix = eventsPrefix;
        }
        if (_cloudFunctionConfiguration.getCloudFunction() != null) {
            prefix = _prefix + "CloudFunction";
            String cloudFunction = _cloudFunctionConfiguration.getCloudFunction();
            request.addParameter(prefix, StringUtils.fromString(cloudFunction));
        }
        if (_cloudFunctionConfiguration.getInvocationRole() != null) {
            prefix = _prefix + "InvocationRole";
            String invocationRole = _cloudFunctionConfiguration.getInvocationRole();
            request.addParameter(prefix, StringUtils.fromString(invocationRole));
        }
    }

    private static CloudFunctionConfigurationStaxMarshaller instance;

    public static CloudFunctionConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudFunctionConfigurationStaxMarshaller();
        return instance;
    }
}
