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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO QueryLoggingConfig
 */
class QueryLoggingConfigStaxMarshaller {

    public void marshall(QueryLoggingConfig _queryLoggingConfig, Request<?> request, String _prefix) {
        String prefix;
        if (_queryLoggingConfig.getId() != null) {
            prefix = _prefix + "Id";
            String id = _queryLoggingConfig.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_queryLoggingConfig.getHostedZoneId() != null) {
            prefix = _prefix + "HostedZoneId";
            String hostedZoneId = _queryLoggingConfig.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
        if (_queryLoggingConfig.getCloudWatchLogsLogGroupArn() != null) {
            prefix = _prefix + "CloudWatchLogsLogGroupArn";
            String cloudWatchLogsLogGroupArn = _queryLoggingConfig.getCloudWatchLogsLogGroupArn();
            request.addParameter(prefix, StringUtils.fromString(cloudWatchLogsLogGroupArn));
        }
    }

    private static QueryLoggingConfigStaxMarshaller instance;

    public static QueryLoggingConfigStaxMarshaller getInstance() {
        if (instance == null)
            instance = new QueryLoggingConfigStaxMarshaller();
        return instance;
    }
}
