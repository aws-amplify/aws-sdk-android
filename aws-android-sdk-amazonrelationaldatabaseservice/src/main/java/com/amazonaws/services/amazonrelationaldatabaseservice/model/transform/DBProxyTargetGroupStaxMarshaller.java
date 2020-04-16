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
 * StAX marshaller for POJO DBProxyTargetGroup
 */
class DBProxyTargetGroupStaxMarshaller {

    public void marshall(DBProxyTargetGroup _dBProxyTargetGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_dBProxyTargetGroup.getDBProxyName() != null) {
            prefix = _prefix + "DBProxyName";
            String dBProxyName = _dBProxyTargetGroup.getDBProxyName();
            request.addParameter(prefix, StringUtils.fromString(dBProxyName));
        }
        if (_dBProxyTargetGroup.getTargetGroupName() != null) {
            prefix = _prefix + "TargetGroupName";
            String targetGroupName = _dBProxyTargetGroup.getTargetGroupName();
            request.addParameter(prefix, StringUtils.fromString(targetGroupName));
        }
        if (_dBProxyTargetGroup.getTargetGroupArn() != null) {
            prefix = _prefix + "TargetGroupArn";
            String targetGroupArn = _dBProxyTargetGroup.getTargetGroupArn();
            request.addParameter(prefix, StringUtils.fromString(targetGroupArn));
        }
        if (_dBProxyTargetGroup.getIsDefault() != null) {
            prefix = _prefix + "IsDefault";
            Boolean isDefault = _dBProxyTargetGroup.getIsDefault();
            request.addParameter(prefix, StringUtils.fromBoolean(isDefault));
        }
        if (_dBProxyTargetGroup.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBProxyTargetGroup.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBProxyTargetGroup.getConnectionPoolConfig() != null) {
            prefix = _prefix + "ConnectionPoolConfig";
            ConnectionPoolConfigurationInfo connectionPoolConfig = _dBProxyTargetGroup
                    .getConnectionPoolConfig();
            ConnectionPoolConfigurationInfoStaxMarshaller.getInstance().marshall(
                    connectionPoolConfig, request, prefix + ".");
        }
        if (_dBProxyTargetGroup.getCreatedDate() != null) {
            prefix = _prefix + "CreatedDate";
            java.util.Date createdDate = _dBProxyTargetGroup.getCreatedDate();
            request.addParameter(prefix, StringUtils.fromDate(createdDate));
        }
        if (_dBProxyTargetGroup.getUpdatedDate() != null) {
            prefix = _prefix + "UpdatedDate";
            java.util.Date updatedDate = _dBProxyTargetGroup.getUpdatedDate();
            request.addParameter(prefix, StringUtils.fromDate(updatedDate));
        }
    }

    private static DBProxyTargetGroupStaxMarshaller instance;

    public static DBProxyTargetGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBProxyTargetGroupStaxMarshaller();
        return instance;
    }
}
