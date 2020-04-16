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
 * StAX marshaller for POJO DBProxy
 */
class DBProxyStaxMarshaller {

    public void marshall(DBProxy _dBProxy, Request<?> request, String _prefix) {
        String prefix;
        if (_dBProxy.getDBProxyName() != null) {
            prefix = _prefix + "DBProxyName";
            String dBProxyName = _dBProxy.getDBProxyName();
            request.addParameter(prefix, StringUtils.fromString(dBProxyName));
        }
        if (_dBProxy.getDBProxyArn() != null) {
            prefix = _prefix + "DBProxyArn";
            String dBProxyArn = _dBProxy.getDBProxyArn();
            request.addParameter(prefix, StringUtils.fromString(dBProxyArn));
        }
        if (_dBProxy.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBProxy.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBProxy.getEngineFamily() != null) {
            prefix = _prefix + "EngineFamily";
            String engineFamily = _dBProxy.getEngineFamily();
            request.addParameter(prefix, StringUtils.fromString(engineFamily));
        }
        if (_dBProxy.getVpcSecurityGroupIds() != null) {
            prefix = _prefix + "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = _dBProxy.getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsIndex = 1;
            String vpcSecurityGroupIdsPrefix = prefix;
            for (String vpcSecurityGroupIdsItem : vpcSecurityGroupIds) {
                prefix = vpcSecurityGroupIdsPrefix + ".member." + vpcSecurityGroupIdsIndex;
                if (vpcSecurityGroupIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(vpcSecurityGroupIdsItem));
                }
                vpcSecurityGroupIdsIndex++;
            }
            prefix = vpcSecurityGroupIdsPrefix;
        }
        if (_dBProxy.getVpcSubnetIds() != null) {
            prefix = _prefix + "VpcSubnetIds";
            java.util.List<String> vpcSubnetIds = _dBProxy.getVpcSubnetIds();
            int vpcSubnetIdsIndex = 1;
            String vpcSubnetIdsPrefix = prefix;
            for (String vpcSubnetIdsItem : vpcSubnetIds) {
                prefix = vpcSubnetIdsPrefix + ".member." + vpcSubnetIdsIndex;
                if (vpcSubnetIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(vpcSubnetIdsItem));
                }
                vpcSubnetIdsIndex++;
            }
            prefix = vpcSubnetIdsPrefix;
        }
        if (_dBProxy.getAuth() != null) {
            prefix = _prefix + "Auth";
            java.util.List<UserAuthConfigInfo> auth = _dBProxy.getAuth();
            int authIndex = 1;
            String authPrefix = prefix;
            for (UserAuthConfigInfo authItem : auth) {
                prefix = authPrefix + ".member." + authIndex;
                if (authItem != null) {
                    UserAuthConfigInfoStaxMarshaller.getInstance().marshall(authItem, request,
                            prefix + ".");
                }
                authIndex++;
            }
            prefix = authPrefix;
        }
        if (_dBProxy.getRoleArn() != null) {
            prefix = _prefix + "RoleArn";
            String roleArn = _dBProxy.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (_dBProxy.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            String endpoint = _dBProxy.getEndpoint();
            request.addParameter(prefix, StringUtils.fromString(endpoint));
        }
        if (_dBProxy.getRequireTLS() != null) {
            prefix = _prefix + "RequireTLS";
            Boolean requireTLS = _dBProxy.getRequireTLS();
            request.addParameter(prefix, StringUtils.fromBoolean(requireTLS));
        }
        if (_dBProxy.getIdleClientTimeout() != null) {
            prefix = _prefix + "IdleClientTimeout";
            Integer idleClientTimeout = _dBProxy.getIdleClientTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(idleClientTimeout));
        }
        if (_dBProxy.getDebugLogging() != null) {
            prefix = _prefix + "DebugLogging";
            Boolean debugLogging = _dBProxy.getDebugLogging();
            request.addParameter(prefix, StringUtils.fromBoolean(debugLogging));
        }
        if (_dBProxy.getCreatedDate() != null) {
            prefix = _prefix + "CreatedDate";
            java.util.Date createdDate = _dBProxy.getCreatedDate();
            request.addParameter(prefix, StringUtils.fromDate(createdDate));
        }
        if (_dBProxy.getUpdatedDate() != null) {
            prefix = _prefix + "UpdatedDate";
            java.util.Date updatedDate = _dBProxy.getUpdatedDate();
            request.addParameter(prefix, StringUtils.fromDate(updatedDate));
        }
    }

    private static DBProxyStaxMarshaller instance;

    public static DBProxyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBProxyStaxMarshaller();
        return instance;
    }
}
