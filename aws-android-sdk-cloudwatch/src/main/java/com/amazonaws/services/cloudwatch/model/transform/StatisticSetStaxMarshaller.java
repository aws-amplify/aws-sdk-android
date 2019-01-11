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
 * StAX marshaller for POJO StatisticSet
 */
class StatisticSetStaxMarshaller {

    public void marshall(StatisticSet _statisticSet, Request<?> request, String _prefix) {
        String prefix;
        if (_statisticSet.getSampleCount() != null) {
            prefix = _prefix + "SampleCount";
            Double sampleCount = _statisticSet.getSampleCount();
            request.addParameter(prefix, StringUtils.fromDouble(sampleCount));
        }
        if (_statisticSet.getSum() != null) {
            prefix = _prefix + "Sum";
            Double sum = _statisticSet.getSum();
            request.addParameter(prefix, StringUtils.fromDouble(sum));
        }
        if (_statisticSet.getMinimum() != null) {
            prefix = _prefix + "Minimum";
            Double minimum = _statisticSet.getMinimum();
            request.addParameter(prefix, StringUtils.fromDouble(minimum));
        }
        if (_statisticSet.getMaximum() != null) {
            prefix = _prefix + "Maximum";
            Double maximum = _statisticSet.getMaximum();
            request.addParameter(prefix, StringUtils.fromDouble(maximum));
        }
    }

    private static StatisticSetStaxMarshaller instance;

    public static StatisticSetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StatisticSetStaxMarshaller();
        return instance;
    }
}
