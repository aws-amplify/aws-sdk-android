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
 * StAX request marshaller for RegisterDBProxyTargetsRequest
 */
public class RegisterDBProxyTargetsRequestMarshaller implements
        Marshaller<Request<RegisterDBProxyTargetsRequest>, RegisterDBProxyTargetsRequest> {

    public Request<RegisterDBProxyTargetsRequest> marshall(
            RegisterDBProxyTargetsRequest registerDBProxyTargetsRequest) {
        if (registerDBProxyTargetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RegisterDBProxyTargetsRequest)");
        }

        Request<RegisterDBProxyTargetsRequest> request = new DefaultRequest<RegisterDBProxyTargetsRequest>(
                registerDBProxyTargetsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RegisterDBProxyTargets");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (registerDBProxyTargetsRequest.getDBProxyName() != null) {
            prefix = "DBProxyName";
            String dBProxyName = registerDBProxyTargetsRequest.getDBProxyName();
            request.addParameter(prefix, StringUtils.fromString(dBProxyName));
        }
        if (registerDBProxyTargetsRequest.getTargetGroupName() != null) {
            prefix = "TargetGroupName";
            String targetGroupName = registerDBProxyTargetsRequest.getTargetGroupName();
            request.addParameter(prefix, StringUtils.fromString(targetGroupName));
        }
        if (registerDBProxyTargetsRequest.getDBInstanceIdentifiers() != null) {
            prefix = "DBInstanceIdentifiers";
            java.util.List<String> dBInstanceIdentifiers = registerDBProxyTargetsRequest
                    .getDBInstanceIdentifiers();
            int dBInstanceIdentifiersIndex = 1;
            String dBInstanceIdentifiersPrefix = prefix;
            for (String dBInstanceIdentifiersItem : dBInstanceIdentifiers) {
                prefix = dBInstanceIdentifiersPrefix + ".member." + dBInstanceIdentifiersIndex;
                if (dBInstanceIdentifiersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifiersItem));
                }
                dBInstanceIdentifiersIndex++;
            }
            prefix = dBInstanceIdentifiersPrefix;
        }
        if (registerDBProxyTargetsRequest.getDBClusterIdentifiers() != null) {
            prefix = "DBClusterIdentifiers";
            java.util.List<String> dBClusterIdentifiers = registerDBProxyTargetsRequest
                    .getDBClusterIdentifiers();
            int dBClusterIdentifiersIndex = 1;
            String dBClusterIdentifiersPrefix = prefix;
            for (String dBClusterIdentifiersItem : dBClusterIdentifiers) {
                prefix = dBClusterIdentifiersPrefix + ".member." + dBClusterIdentifiersIndex;
                if (dBClusterIdentifiersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifiersItem));
                }
                dBClusterIdentifiersIndex++;
            }
            prefix = dBClusterIdentifiersPrefix;
        }

        return request;
    }
}
