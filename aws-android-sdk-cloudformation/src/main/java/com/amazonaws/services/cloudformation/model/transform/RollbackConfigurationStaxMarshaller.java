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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO RollbackConfiguration
 */
class RollbackConfigurationStaxMarshaller {

    public void marshall(RollbackConfiguration _rollbackConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_rollbackConfiguration.getRollbackTriggers() != null) {
            prefix = _prefix + "RollbackTriggers";
            java.util.List<RollbackTrigger> rollbackTriggers = _rollbackConfiguration
                    .getRollbackTriggers();
            int rollbackTriggersIndex = 1;
            String rollbackTriggersPrefix = prefix;
            for (RollbackTrigger rollbackTriggersItem : rollbackTriggers) {
                prefix = rollbackTriggersPrefix + ".member." + rollbackTriggersIndex;
                if (rollbackTriggersItem != null) {
                    RollbackTriggerStaxMarshaller.getInstance().marshall(rollbackTriggersItem,
                            request, prefix + ".");
                }
                rollbackTriggersIndex++;
            }
            prefix = rollbackTriggersPrefix;
        }
        if (_rollbackConfiguration.getMonitoringTimeInMinutes() != null) {
            prefix = _prefix + "MonitoringTimeInMinutes";
            Integer monitoringTimeInMinutes = _rollbackConfiguration.getMonitoringTimeInMinutes();
            request.addParameter(prefix, StringUtils.fromInteger(monitoringTimeInMinutes));
        }
    }

    private static RollbackConfigurationStaxMarshaller instance;

    public static RollbackConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RollbackConfigurationStaxMarshaller();
        return instance;
    }
}
