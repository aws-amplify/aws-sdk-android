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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SystemStatus
 */
class SystemStatusStaxMarshaller {

    public void marshall(SystemStatus _systemStatus, Request<?> request, String _prefix) {
        String prefix;
        if (_systemStatus.getCPUUtilization() != null) {
            prefix = _prefix + "CPUUtilization";
            CPUUtilization cPUUtilization = _systemStatus.getCPUUtilization();
            CPUUtilizationStaxMarshaller.getInstance().marshall(cPUUtilization, request,
                    prefix + ".");
        }
        if (_systemStatus.getLoadAverage() != null) {
            prefix = _prefix + "LoadAverage";
            java.util.List<Double> loadAverage = _systemStatus.getLoadAverage();
            int loadAverageIndex = 1;
            String loadAveragePrefix = prefix;
            for (Double loadAverageItem : loadAverage) {
                prefix = loadAveragePrefix + ".member." + loadAverageIndex;
                if (loadAverageItem != null) {
                    request.addParameter(prefix, StringUtils.fromDouble(loadAverageItem));
                }
                loadAverageIndex++;
            }
            prefix = loadAveragePrefix;
        }
    }

    private static SystemStatusStaxMarshaller instance;

    public static SystemStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SystemStatusStaxMarshaller();
        return instance;
    }
}
