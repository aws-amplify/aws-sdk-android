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

package com.amazonaws.services.cloudwatch.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AlarmHistoryItem
 */
class AlarmHistoryItemStaxMarshaller {

    public void marshall(AlarmHistoryItem _alarmHistoryItem, Request<?> request, String _prefix) {
        String prefix;
        if (_alarmHistoryItem.getAlarmName() != null) {
            prefix = _prefix + "AlarmName";
            String alarmName = _alarmHistoryItem.getAlarmName();
            request.addParameter(prefix, StringUtils.fromString(alarmName));
        }
        if (_alarmHistoryItem.getTimestamp() != null) {
            prefix = _prefix + "Timestamp";
            java.util.Date timestamp = _alarmHistoryItem.getTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(timestamp));
        }
        if (_alarmHistoryItem.getHistoryItemType() != null) {
            prefix = _prefix + "HistoryItemType";
            String historyItemType = _alarmHistoryItem.getHistoryItemType();
            request.addParameter(prefix, StringUtils.fromString(historyItemType));
        }
        if (_alarmHistoryItem.getHistorySummary() != null) {
            prefix = _prefix + "HistorySummary";
            String historySummary = _alarmHistoryItem.getHistorySummary();
            request.addParameter(prefix, StringUtils.fromString(historySummary));
        }
        if (_alarmHistoryItem.getHistoryData() != null) {
            prefix = _prefix + "HistoryData";
            String historyData = _alarmHistoryItem.getHistoryData();
            request.addParameter(prefix, StringUtils.fromString(historyData));
        }
    }

    private static AlarmHistoryItemStaxMarshaller instance;

    public static AlarmHistoryItemStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AlarmHistoryItemStaxMarshaller();
        return instance;
    }
}
