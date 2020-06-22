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
 * StAX marshaller for POJO DBInstanceRole
 */
class DBInstanceRoleStaxMarshaller {

    public void marshall(DBInstanceRole _dBInstanceRole, Request<?> request, String _prefix) {
        String prefix;
        if (_dBInstanceRole.getRoleArn() != null) {
            prefix = _prefix + "RoleArn";
            String roleArn = _dBInstanceRole.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (_dBInstanceRole.getFeatureName() != null) {
            prefix = _prefix + "FeatureName";
            String featureName = _dBInstanceRole.getFeatureName();
            request.addParameter(prefix, StringUtils.fromString(featureName));
        }
        if (_dBInstanceRole.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBInstanceRole.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static DBInstanceRoleStaxMarshaller instance;

    public static DBInstanceRoleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceRoleStaxMarshaller();
        return instance;
    }
}
