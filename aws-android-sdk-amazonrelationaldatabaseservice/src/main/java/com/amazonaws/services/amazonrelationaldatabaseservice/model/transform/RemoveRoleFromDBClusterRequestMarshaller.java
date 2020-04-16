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
 * StAX request marshaller for RemoveRoleFromDBClusterRequest
 */
public class RemoveRoleFromDBClusterRequestMarshaller implements
        Marshaller<Request<RemoveRoleFromDBClusterRequest>, RemoveRoleFromDBClusterRequest> {

    public Request<RemoveRoleFromDBClusterRequest> marshall(
            RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest) {
        if (removeRoleFromDBClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RemoveRoleFromDBClusterRequest)");
        }

        Request<RemoveRoleFromDBClusterRequest> request = new DefaultRequest<RemoveRoleFromDBClusterRequest>(
                removeRoleFromDBClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RemoveRoleFromDBCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (removeRoleFromDBClusterRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = removeRoleFromDBClusterRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (removeRoleFromDBClusterRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = removeRoleFromDBClusterRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (removeRoleFromDBClusterRequest.getFeatureName() != null) {
            prefix = "FeatureName";
            String featureName = removeRoleFromDBClusterRequest.getFeatureName();
            request.addParameter(prefix, StringUtils.fromString(featureName));
        }

        return request;
    }
}
