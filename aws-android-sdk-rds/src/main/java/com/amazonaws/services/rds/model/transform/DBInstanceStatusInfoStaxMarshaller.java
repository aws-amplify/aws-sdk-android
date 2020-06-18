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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DBInstanceStatusInfo
 */
class DBInstanceStatusInfoStaxMarshaller {

    public void marshall(DBInstanceStatusInfo _dBInstanceStatusInfo, Request<?> request,
            String _prefix) {
        String prefix;
        if (_dBInstanceStatusInfo.getStatusType() != null) {
            prefix = _prefix + "StatusType";
            String statusType = _dBInstanceStatusInfo.getStatusType();
            request.addParameter(prefix, StringUtils.fromString(statusType));
        }
        if (_dBInstanceStatusInfo.getNormal() != null) {
            prefix = _prefix + "Normal";
            Boolean normal = _dBInstanceStatusInfo.getNormal();
            request.addParameter(prefix, StringUtils.fromBoolean(normal));
        }
        if (_dBInstanceStatusInfo.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBInstanceStatusInfo.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBInstanceStatusInfo.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _dBInstanceStatusInfo.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
    }

    private static DBInstanceStatusInfoStaxMarshaller instance;

    public static DBInstanceStatusInfoStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceStatusInfoStaxMarshaller();
        return instance;
    }
}
