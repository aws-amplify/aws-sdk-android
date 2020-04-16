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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateDBProxyRequest
 */
public class CreateDBProxyRequestMarshaller implements
        Marshaller<Request<CreateDBProxyRequest>, CreateDBProxyRequest> {

    public Request<CreateDBProxyRequest> marshall(CreateDBProxyRequest createDBProxyRequest) {
        if (createDBProxyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDBProxyRequest)");
        }

        Request<CreateDBProxyRequest> request = new DefaultRequest<CreateDBProxyRequest>(
                createDBProxyRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateDBProxy");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createDBProxyRequest.getDBProxyName() != null) {
            prefix = "DBProxyName";
            String dBProxyName = createDBProxyRequest.getDBProxyName();
            request.addParameter(prefix, StringUtils.fromString(dBProxyName));
        }
        if (createDBProxyRequest.getEngineFamily() != null) {
            prefix = "EngineFamily";
            String engineFamily = createDBProxyRequest.getEngineFamily();
            request.addParameter(prefix, StringUtils.fromString(engineFamily));
        }
        if (createDBProxyRequest.getAuth() != null) {
            prefix = "Auth";
            java.util.List<UserAuthConfig> auth = createDBProxyRequest.getAuth();
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
        if (createDBProxyRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = createDBProxyRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (createDBProxyRequest.getVpcSubnetIds() != null) {
            prefix = "VpcSubnetIds";
            java.util.List<String> vpcSubnetIds = createDBProxyRequest.getVpcSubnetIds();
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
        if (createDBProxyRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = createDBProxyRequest
                    .getVpcSecurityGroupIds();
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
        if (createDBProxyRequest.getRequireTLS() != null) {
            prefix = "RequireTLS";
            Boolean requireTLS = createDBProxyRequest.getRequireTLS();
            request.addParameter(prefix, StringUtils.fromBoolean(requireTLS));
        }
        if (createDBProxyRequest.getIdleClientTimeout() != null) {
            prefix = "IdleClientTimeout";
            Integer idleClientTimeout = createDBProxyRequest.getIdleClientTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(idleClientTimeout));
        }
        if (createDBProxyRequest.getDebugLogging() != null) {
            prefix = "DebugLogging";
            Boolean debugLogging = createDBProxyRequest.getDebugLogging();
            request.addParameter(prefix, StringUtils.fromBoolean(debugLogging));
        }
        if (createDBProxyRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createDBProxyRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
