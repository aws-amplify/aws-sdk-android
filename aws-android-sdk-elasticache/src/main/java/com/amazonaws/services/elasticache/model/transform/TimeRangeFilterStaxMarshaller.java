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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TimeRangeFilter
 */
class TimeRangeFilterStaxMarshaller {

    public void marshall(TimeRangeFilter _timeRangeFilter, Request<?> request, String _prefix) {
        String prefix;
        if (_timeRangeFilter.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _timeRangeFilter.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_timeRangeFilter.getEndTime() != null) {
            prefix = _prefix + "EndTime";
            java.util.Date endTime = _timeRangeFilter.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
    }

    private static TimeRangeFilterStaxMarshaller instance;

    public static TimeRangeFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TimeRangeFilterStaxMarshaller();
        return instance;
    }
}
