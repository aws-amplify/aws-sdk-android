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
 * StAX marshaller for POJO DBProxyTarget
 */
class DBProxyTargetStaxMarshaller {

    public void marshall(DBProxyTarget _dBProxyTarget, Request<?> request, String _prefix) {
        String prefix;
        if (_dBProxyTarget.getTargetArn() != null) {
            prefix = _prefix + "TargetArn";
            String targetArn = _dBProxyTarget.getTargetArn();
            request.addParameter(prefix, StringUtils.fromString(targetArn));
        }
        if (_dBProxyTarget.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            String endpoint = _dBProxyTarget.getEndpoint();
            request.addParameter(prefix, StringUtils.fromString(endpoint));
        }
        if (_dBProxyTarget.getTrackedClusterId() != null) {
            prefix = _prefix + "TrackedClusterId";
            String trackedClusterId = _dBProxyTarget.getTrackedClusterId();
            request.addParameter(prefix, StringUtils.fromString(trackedClusterId));
        }
        if (_dBProxyTarget.getRdsResourceId() != null) {
            prefix = _prefix + "RdsResourceId";
            String rdsResourceId = _dBProxyTarget.getRdsResourceId();
            request.addParameter(prefix, StringUtils.fromString(rdsResourceId));
        }
        if (_dBProxyTarget.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _dBProxyTarget.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_dBProxyTarget.getType() != null) {
            prefix = _prefix + "Type";
            String type = _dBProxyTarget.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_dBProxyTarget.getTargetHealth() != null) {
            prefix = _prefix + "TargetHealth";
            TargetHealth targetHealth = _dBProxyTarget.getTargetHealth();
            TargetHealthStaxMarshaller.getInstance().marshall(targetHealth, request, prefix + ".");
        }
    }

    private static DBProxyTargetStaxMarshaller instance;

    public static DBProxyTargetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBProxyTargetStaxMarshaller();
        return instance;
    }
}
