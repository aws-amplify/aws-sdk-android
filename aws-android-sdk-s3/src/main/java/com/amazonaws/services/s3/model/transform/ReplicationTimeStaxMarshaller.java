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
 * StAX marshaller for POJO ReplicationTime
 */
class ReplicationTimeStaxMarshaller {

    public void marshall(ReplicationTime _replicationTime, Request<?> request, String _prefix) {
        String prefix;
        if (_replicationTime.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _replicationTime.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_replicationTime.getTime() != null) {
            prefix = _prefix + "Time";
            ReplicationTimeValue time = _replicationTime.getTime();
            ReplicationTimeValueStaxMarshaller.getInstance().marshall(time, request, prefix + ".");
        }
    }

    private static ReplicationTimeStaxMarshaller instance;

    public static ReplicationTimeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTimeStaxMarshaller();
        return instance;
    }
}
