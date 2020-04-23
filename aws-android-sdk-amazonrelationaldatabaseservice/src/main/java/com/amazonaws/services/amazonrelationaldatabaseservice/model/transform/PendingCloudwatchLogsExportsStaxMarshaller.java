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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PendingCloudwatchLogsExports
 */
class PendingCloudwatchLogsExportsStaxMarshaller {

    public void marshall(PendingCloudwatchLogsExports _pendingCloudwatchLogsExports,
            Request<?> request, String _prefix) {
        String prefix;
        if (_pendingCloudwatchLogsExports.getLogTypesToEnable() != null) {
            prefix = _prefix + "LogTypesToEnable";
            java.util.List<String> logTypesToEnable = _pendingCloudwatchLogsExports
                    .getLogTypesToEnable();
            int logTypesToEnableIndex = 1;
            String logTypesToEnablePrefix = prefix;
            for (String logTypesToEnableItem : logTypesToEnable) {
                prefix = logTypesToEnablePrefix + ".member." + logTypesToEnableIndex;
                if (logTypesToEnableItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(logTypesToEnableItem));
                }
                logTypesToEnableIndex++;
            }
            prefix = logTypesToEnablePrefix;
        }
        if (_pendingCloudwatchLogsExports.getLogTypesToDisable() != null) {
            prefix = _prefix + "LogTypesToDisable";
            java.util.List<String> logTypesToDisable = _pendingCloudwatchLogsExports
                    .getLogTypesToDisable();
            int logTypesToDisableIndex = 1;
            String logTypesToDisablePrefix = prefix;
            for (String logTypesToDisableItem : logTypesToDisable) {
                prefix = logTypesToDisablePrefix + ".member." + logTypesToDisableIndex;
                if (logTypesToDisableItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(logTypesToDisableItem));
                }
                logTypesToDisableIndex++;
            }
            prefix = logTypesToDisablePrefix;
        }
    }

    private static PendingCloudwatchLogsExportsStaxMarshaller instance;

    public static PendingCloudwatchLogsExportsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PendingCloudwatchLogsExportsStaxMarshaller();
        return instance;
    }
}
