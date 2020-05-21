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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ScanRange
 */
class ScanRangeStaxMarshaller {

    public void marshall(ScanRange _scanRange, Request<?> request, String _prefix) {
        String prefix;
        if (_scanRange.getStart() != null) {
            prefix = _prefix + "Start";
            Long start = _scanRange.getStart();
            request.addParameter(prefix, StringUtils.fromLong(start));
        }
        if (_scanRange.getEnd() != null) {
            prefix = _prefix + "End";
            Long end = _scanRange.getEnd();
            request.addParameter(prefix, StringUtils.fromLong(end));
        }
    }

    private static ScanRangeStaxMarshaller instance;

    public static ScanRangeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ScanRangeStaxMarshaller();
        return instance;
    }
}
