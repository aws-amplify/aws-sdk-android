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
 * StAX marshaller for POJO Datapoint
 */
class DatapointStaxMarshaller {

    public void marshall(Datapoint _datapoint, Request<?> request, String _prefix) {
        String prefix;
        if (_datapoint.getTimestamp() != null) {
            prefix = _prefix + "Timestamp";
            java.util.Date timestamp = _datapoint.getTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(timestamp));
        }
        if (_datapoint.getSampleCount() != null) {
            prefix = _prefix + "SampleCount";
            Double sampleCount = _datapoint.getSampleCount();
            request.addParameter(prefix, StringUtils.fromDouble(sampleCount));
        }
        if (_datapoint.getAverage() != null) {
            prefix = _prefix + "Average";
            Double average = _datapoint.getAverage();
            request.addParameter(prefix, StringUtils.fromDouble(average));
        }
        if (_datapoint.getSum() != null) {
            prefix = _prefix + "Sum";
            Double sum = _datapoint.getSum();
            request.addParameter(prefix, StringUtils.fromDouble(sum));
        }
        if (_datapoint.getMinimum() != null) {
            prefix = _prefix + "Minimum";
            Double minimum = _datapoint.getMinimum();
            request.addParameter(prefix, StringUtils.fromDouble(minimum));
        }
        if (_datapoint.getMaximum() != null) {
            prefix = _prefix + "Maximum";
            Double maximum = _datapoint.getMaximum();
            request.addParameter(prefix, StringUtils.fromDouble(maximum));
        }
        if (_datapoint.getUnit() != null) {
            prefix = _prefix + "Unit";
            String unit = _datapoint.getUnit();
            request.addParameter(prefix, StringUtils.fromString(unit));
        }
    }

    private static DatapointStaxMarshaller instance;

    public static DatapointStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DatapointStaxMarshaller();
        return instance;
    }
}
