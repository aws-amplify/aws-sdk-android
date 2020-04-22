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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DeferredMaintenanceWindow
 */
class DeferredMaintenanceWindowStaxMarshaller {

    public void marshall(DeferredMaintenanceWindow _deferredMaintenanceWindow, Request<?> request,
            String _prefix) {
        String prefix;
        if (_deferredMaintenanceWindow.getDeferMaintenanceIdentifier() != null) {
            prefix = _prefix + "DeferMaintenanceIdentifier";
            String deferMaintenanceIdentifier = _deferredMaintenanceWindow
                    .getDeferMaintenanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(deferMaintenanceIdentifier));
        }
        if (_deferredMaintenanceWindow.getDeferMaintenanceStartTime() != null) {
            prefix = _prefix + "DeferMaintenanceStartTime";
            java.util.Date deferMaintenanceStartTime = _deferredMaintenanceWindow
                    .getDeferMaintenanceStartTime();
            request.addParameter(prefix, StringUtils.fromDate(deferMaintenanceStartTime));
        }
        if (_deferredMaintenanceWindow.getDeferMaintenanceEndTime() != null) {
            prefix = _prefix + "DeferMaintenanceEndTime";
            java.util.Date deferMaintenanceEndTime = _deferredMaintenanceWindow
                    .getDeferMaintenanceEndTime();
            request.addParameter(prefix, StringUtils.fromDate(deferMaintenanceEndTime));
        }
    }

    private static DeferredMaintenanceWindowStaxMarshaller instance;

    public static DeferredMaintenanceWindowStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeferredMaintenanceWindowStaxMarshaller();
        return instance;
    }
}
