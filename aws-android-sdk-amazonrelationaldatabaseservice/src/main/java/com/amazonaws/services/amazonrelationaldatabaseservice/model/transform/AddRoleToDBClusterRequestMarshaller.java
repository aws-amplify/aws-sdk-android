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
 * StAX request marshaller for AddRoleToDBClusterRequest
 */
public class AddRoleToDBClusterRequestMarshaller implements
        Marshaller<Request<AddRoleToDBClusterRequest>, AddRoleToDBClusterRequest> {

    public Request<AddRoleToDBClusterRequest> marshall(
            AddRoleToDBClusterRequest addRoleToDBClusterRequest) {
        if (addRoleToDBClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AddRoleToDBClusterRequest)");
        }

        Request<AddRoleToDBClusterRequest> request = new DefaultRequest<AddRoleToDBClusterRequest>(
                addRoleToDBClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "AddRoleToDBCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (addRoleToDBClusterRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = addRoleToDBClusterRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (addRoleToDBClusterRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = addRoleToDBClusterRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (addRoleToDBClusterRequest.getFeatureName() != null) {
            prefix = "FeatureName";
            String featureName = addRoleToDBClusterRequest.getFeatureName();
            request.addParameter(prefix, StringUtils.fromString(featureName));
        }

        return request;
    }
}
