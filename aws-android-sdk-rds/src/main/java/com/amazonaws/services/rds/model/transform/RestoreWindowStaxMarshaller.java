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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO RestoreWindow
 */
class RestoreWindowStaxMarshaller {

    public void marshall(RestoreWindow _restoreWindow, Request<?> request, String _prefix) {
        String prefix;
        if (_restoreWindow.getEarliestTime() != null) {
            prefix = _prefix + "EarliestTime";
            java.util.Date earliestTime = _restoreWindow.getEarliestTime();
            request.addParameter(prefix, StringUtils.fromDate(earliestTime));
        }
        if (_restoreWindow.getLatestTime() != null) {
            prefix = _prefix + "LatestTime";
            java.util.Date latestTime = _restoreWindow.getLatestTime();
            request.addParameter(prefix, StringUtils.fromDate(latestTime));
        }
    }

    private static RestoreWindowStaxMarshaller instance;

    public static RestoreWindowStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RestoreWindowStaxMarshaller();
        return instance;
    }
}
