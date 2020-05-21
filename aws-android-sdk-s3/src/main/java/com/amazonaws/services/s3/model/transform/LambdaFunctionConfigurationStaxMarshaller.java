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
 * StAX marshaller for POJO LambdaFunctionConfiguration
 */
class LambdaFunctionConfigurationStaxMarshaller {

    public void marshall(LambdaFunctionConfiguration _lambdaFunctionConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_lambdaFunctionConfiguration.getId() != null) {
            prefix = _prefix + "Id";
            String id = _lambdaFunctionConfiguration.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_lambdaFunctionConfiguration.getLambdaFunctionArn() != null) {
            prefix = _prefix + "CloudFunction";
            String lambdaFunctionArn = _lambdaFunctionConfiguration.getLambdaFunctionArn();
            request.addParameter(prefix, StringUtils.fromString(lambdaFunctionArn));
        }
        if (_lambdaFunctionConfiguration.getEvents() != null) {
            prefix = _prefix + "Events";
            java.util.List<String> events = _lambdaFunctionConfiguration.getEvents();
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
        if (_lambdaFunctionConfiguration.getFilter() != null) {
            prefix = _prefix + "Filter";
            NotificationConfigurationFilter filter = _lambdaFunctionConfiguration.getFilter();
            NotificationConfigurationFilterStaxMarshaller.getInstance().marshall(filter, request,
                    prefix + ".");
        }
    }

    private static LambdaFunctionConfigurationStaxMarshaller instance;

    public static LambdaFunctionConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaFunctionConfigurationStaxMarshaller();
        return instance;
    }
}
