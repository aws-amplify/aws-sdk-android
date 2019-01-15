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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO InstanceMonitoring
 */
class InstanceMonitoringStaxMarshaller {

    public void marshall(InstanceMonitoring _instanceMonitoring, Request<?> request, String _prefix) {
        String prefix;
        if (_instanceMonitoring.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _instanceMonitoring.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
    }

    private static InstanceMonitoringStaxMarshaller instance;

    public static InstanceMonitoringStaxMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceMonitoringStaxMarshaller();
        return instance;
    }
}
