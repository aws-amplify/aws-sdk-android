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
 * StAX marshaller for POJO Stats
 */
class StatsStaxMarshaller {

    public void marshall(Stats _stats, Request<?> request, String _prefix) {
        String prefix;
        if (_stats.getBytesScanned() != null) {
            prefix = _prefix + "BytesScanned";
            Long bytesScanned = _stats.getBytesScanned();
            request.addParameter(prefix, StringUtils.fromLong(bytesScanned));
        }
        if (_stats.getBytesProcessed() != null) {
            prefix = _prefix + "BytesProcessed";
            Long bytesProcessed = _stats.getBytesProcessed();
            request.addParameter(prefix, StringUtils.fromLong(bytesProcessed));
        }
        if (_stats.getBytesReturned() != null) {
            prefix = _prefix + "BytesReturned";
            Long bytesReturned = _stats.getBytesReturned();
            request.addParameter(prefix, StringUtils.fromLong(bytesReturned));
        }
    }

    private static StatsStaxMarshaller instance;

    public static StatsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StatsStaxMarshaller();
        return instance;
    }
}
