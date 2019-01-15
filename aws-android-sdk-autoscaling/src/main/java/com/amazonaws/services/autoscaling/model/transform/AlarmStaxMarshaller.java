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
 * StAX marshaller for POJO Alarm
 */
class AlarmStaxMarshaller {

    public void marshall(Alarm _alarm, Request<?> request, String _prefix) {
        String prefix;
        if (_alarm.getAlarmName() != null) {
            prefix = _prefix + "AlarmName";
            String alarmName = _alarm.getAlarmName();
            request.addParameter(prefix, StringUtils.fromString(alarmName));
        }
        if (_alarm.getAlarmARN() != null) {
            prefix = _prefix + "AlarmARN";
            String alarmARN = _alarm.getAlarmARN();
            request.addParameter(prefix, StringUtils.fromString(alarmARN));
        }
    }

    private static AlarmStaxMarshaller instance;

    public static AlarmStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AlarmStaxMarshaller();
        return instance;
    }
}
