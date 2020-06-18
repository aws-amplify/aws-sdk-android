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
 * StAX marshaller for POJO DBSecurityGroupMembership
 */
class DBSecurityGroupMembershipStaxMarshaller {

    public void marshall(DBSecurityGroupMembership _dBSecurityGroupMembership, Request<?> request,
            String _prefix) {
        String prefix;
        if (_dBSecurityGroupMembership.getDBSecurityGroupName() != null) {
            prefix = _prefix + "DBSecurityGroupName";
            String dBSecurityGroupName = _dBSecurityGroupMembership.getDBSecurityGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupName));
        }
        if (_dBSecurityGroupMembership.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBSecurityGroupMembership.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static DBSecurityGroupMembershipStaxMarshaller instance;

    public static DBSecurityGroupMembershipStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBSecurityGroupMembershipStaxMarshaller();
        return instance;
    }
}
