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
 * StAX marshaller for POJO Progress
 */
class ProgressStaxMarshaller {

    public void marshall(Progress _progress, Request<?> request, String _prefix) {
        String prefix;
        if (_progress.getBytesScanned() != null) {
            prefix = _prefix + "BytesScanned";
            Long bytesScanned = _progress.getBytesScanned();
            request.addParameter(prefix, StringUtils.fromLong(bytesScanned));
        }
        if (_progress.getBytesProcessed() != null) {
            prefix = _prefix + "BytesProcessed";
            Long bytesProcessed = _progress.getBytesProcessed();
            request.addParameter(prefix, StringUtils.fromLong(bytesProcessed));
        }
        if (_progress.getBytesReturned() != null) {
            prefix = _prefix + "BytesReturned";
            Long bytesReturned = _progress.getBytesReturned();
            request.addParameter(prefix, StringUtils.fromLong(bytesReturned));
        }
    }

    private static ProgressStaxMarshaller instance;

    public static ProgressStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ProgressStaxMarshaller();
        return instance;
    }
}
