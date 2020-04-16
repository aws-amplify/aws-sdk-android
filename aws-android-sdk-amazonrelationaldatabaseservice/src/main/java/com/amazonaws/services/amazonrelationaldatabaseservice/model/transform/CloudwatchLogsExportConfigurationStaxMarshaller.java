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
 * StAX marshaller for POJO CloudwatchLogsExportConfiguration
 */
class CloudwatchLogsExportConfigurationStaxMarshaller {

    public void marshall(CloudwatchLogsExportConfiguration _cloudwatchLogsExportConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cloudwatchLogsExportConfiguration.getEnableLogTypes() != null) {
            prefix = _prefix + "EnableLogTypes";
            java.util.List<String> enableLogTypes = _cloudwatchLogsExportConfiguration
                    .getEnableLogTypes();
            int enableLogTypesIndex = 1;
            String enableLogTypesPrefix = prefix;
            for (String enableLogTypesItem : enableLogTypes) {
                prefix = enableLogTypesPrefix + ".member." + enableLogTypesIndex;
                if (enableLogTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(enableLogTypesItem));
                }
                enableLogTypesIndex++;
            }
            prefix = enableLogTypesPrefix;
        }
        if (_cloudwatchLogsExportConfiguration.getDisableLogTypes() != null) {
            prefix = _prefix + "DisableLogTypes";
            java.util.List<String> disableLogTypes = _cloudwatchLogsExportConfiguration
                    .getDisableLogTypes();
            int disableLogTypesIndex = 1;
            String disableLogTypesPrefix = prefix;
            for (String disableLogTypesItem : disableLogTypes) {
                prefix = disableLogTypesPrefix + ".member." + disableLogTypesIndex;
                if (disableLogTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(disableLogTypesItem));
                }
                disableLogTypesIndex++;
            }
            prefix = disableLogTypesPrefix;
        }
    }

    private static CloudwatchLogsExportConfigurationStaxMarshaller instance;

    public static CloudwatchLogsExportConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudwatchLogsExportConfigurationStaxMarshaller();
        return instance;
    }
}
