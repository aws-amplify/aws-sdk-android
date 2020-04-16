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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Range
 */
class RangeStaxMarshaller {

    public void marshall(Range _range, Request<?> request, String _prefix) {
        String prefix;
        if (_range.getFrom() != null) {
            prefix = _prefix + "From";
            Integer from = _range.getFrom();
            request.addParameter(prefix, StringUtils.fromInteger(from));
        }
        if (_range.getTo() != null) {
            prefix = _prefix + "To";
            Integer to = _range.getTo();
            request.addParameter(prefix, StringUtils.fromInteger(to));
        }
        if (_range.getStep() != null) {
            prefix = _prefix + "Step";
            Integer step = _range.getStep();
            request.addParameter(prefix, StringUtils.fromInteger(step));
        }
    }

    private static RangeStaxMarshaller instance;

    public static RangeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RangeStaxMarshaller();
        return instance;
    }
}
