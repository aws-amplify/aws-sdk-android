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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyDBProxyRequest
 */
public class ModifyDBProxyRequestMarshaller implements
        Marshaller<Request<ModifyDBProxyRequest>, ModifyDBProxyRequest> {

    public Request<ModifyDBProxyRequest> marshall(ModifyDBProxyRequest modifyDBProxyRequest) {
        if (modifyDBProxyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyDBProxyRequest)");
        }

        Request<ModifyDBProxyRequest> request = new DefaultRequest<ModifyDBProxyRequest>(
                modifyDBProxyRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyDBProxy");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyDBProxyRequest.getDBProxyName() != null) {
            prefix = "DBProxyName";
            String dBProxyName = modifyDBProxyRequest.getDBProxyName();
            request.addParameter(prefix, StringUtils.fromString(dBProxyName));
        }
        if (modifyDBProxyRequest.getNewDBProxyName() != null) {
            prefix = "NewDBProxyName";
            String newDBProxyName = modifyDBProxyRequest.getNewDBProxyName();
            request.addParameter(prefix, StringUtils.fromString(newDBProxyName));
        }
        if (modifyDBProxyRequest.getAuth() != null) {
            prefix = "Auth";
            java.util.List<UserAuthConfig> auth = modifyDBProxyRequest.getAuth();
            int authIndex = 1;
            String authPrefix = prefix;
            for (UserAuthConfig authItem : auth) {
                prefix = authPrefix + ".member." + authIndex;
                if (authItem != null) {
                    UserAuthConfigStaxMarshaller.getInstance().marshall(authItem, request,
                            prefix + ".");
                }
                authIndex++;
            }
            prefix = authPrefix;
        }
        if (modifyDBProxyRequest.getRequireTLS() != null) {
            prefix = "RequireTLS";
            Boolean requireTLS = modifyDBProxyRequest.getRequireTLS();
            request.addParameter(prefix, StringUtils.fromBoolean(requireTLS));
        }
        if (modifyDBProxyRequest.getIdleClientTimeout() != null) {
            prefix = "IdleClientTimeout";
            Integer idleClientTimeout = modifyDBProxyRequest.getIdleClientTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(idleClientTimeout));
        }
        if (modifyDBProxyRequest.getDebugLogging() != null) {
            prefix = "DebugLogging";
            Boolean debugLogging = modifyDBProxyRequest.getDebugLogging();
            request.addParameter(prefix, StringUtils.fromBoolean(debugLogging));
        }
        if (modifyDBProxyRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = modifyDBProxyRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (modifyDBProxyRequest.getSecurityGroups() != null) {
            prefix = "SecurityGroups";
            java.util.List<String> securityGroups = modifyDBProxyRequest.getSecurityGroups();
            int securityGroupsIndex = 1;
            String securityGroupsPrefix = prefix;
            for (String securityGroupsItem : securityGroups) {
                prefix = securityGroupsPrefix + ".member." + securityGroupsIndex;
                if (securityGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(securityGroupsItem));
                }
                securityGroupsIndex++;
            }
            prefix = securityGroupsPrefix;
        }

        return request;
    }
}
