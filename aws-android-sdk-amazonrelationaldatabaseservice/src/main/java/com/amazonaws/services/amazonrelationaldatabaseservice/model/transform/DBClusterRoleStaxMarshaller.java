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
 * StAX marshaller for POJO DBClusterRole
 */
class DBClusterRoleStaxMarshaller {

    public void marshall(DBClusterRole _dBClusterRole, Request<?> request, String _prefix) {
        String prefix;
        if (_dBClusterRole.getRoleArn() != null) {
            prefix = _prefix + "RoleArn";
            String roleArn = _dBClusterRole.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (_dBClusterRole.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBClusterRole.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBClusterRole.getFeatureName() != null) {
            prefix = _prefix + "FeatureName";
            String featureName = _dBClusterRole.getFeatureName();
            request.addParameter(prefix, StringUtils.fromString(featureName));
        }
    }

    private static DBClusterRoleStaxMarshaller instance;

    public static DBClusterRoleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterRoleStaxMarshaller();
        return instance;
    }
}
