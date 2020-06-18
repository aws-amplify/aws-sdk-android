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
 * StAX request marshaller for DeregisterDBProxyTargetsRequest
 */
public class DeregisterDBProxyTargetsRequestMarshaller implements
        Marshaller<Request<DeregisterDBProxyTargetsRequest>, DeregisterDBProxyTargetsRequest> {

    public Request<DeregisterDBProxyTargetsRequest> marshall(
            DeregisterDBProxyTargetsRequest deregisterDBProxyTargetsRequest) {
        if (deregisterDBProxyTargetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeregisterDBProxyTargetsRequest)");
        }

        Request<DeregisterDBProxyTargetsRequest> request = new DefaultRequest<DeregisterDBProxyTargetsRequest>(
                deregisterDBProxyTargetsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DeregisterDBProxyTargets");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (deregisterDBProxyTargetsRequest.getDBProxyName() != null) {
            prefix = "DBProxyName";
            String dBProxyName = deregisterDBProxyTargetsRequest.getDBProxyName();
            request.addParameter(prefix, StringUtils.fromString(dBProxyName));
        }
        if (deregisterDBProxyTargetsRequest.getTargetGroupName() != null) {
            prefix = "TargetGroupName";
            String targetGroupName = deregisterDBProxyTargetsRequest.getTargetGroupName();
            request.addParameter(prefix, StringUtils.fromString(targetGroupName));
        }
        if (deregisterDBProxyTargetsRequest.getDBInstanceIdentifiers() != null) {
            prefix = "DBInstanceIdentifiers";
            java.util.List<String> dBInstanceIdentifiers = deregisterDBProxyTargetsRequest
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
        if (deregisterDBProxyTargetsRequest.getDBClusterIdentifiers() != null) {
            prefix = "DBClusterIdentifiers";
            java.util.List<String> dBClusterIdentifiers = deregisterDBProxyTargetsRequest
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
