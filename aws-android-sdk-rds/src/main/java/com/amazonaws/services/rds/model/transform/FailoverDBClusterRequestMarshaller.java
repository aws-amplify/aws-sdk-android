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
 * StAX request marshaller for FailoverDBClusterRequest
 */
public class FailoverDBClusterRequestMarshaller implements
        Marshaller<Request<FailoverDBClusterRequest>, FailoverDBClusterRequest> {

    public Request<FailoverDBClusterRequest> marshall(
            FailoverDBClusterRequest failoverDBClusterRequest) {
        if (failoverDBClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(FailoverDBClusterRequest)");
        }

        Request<FailoverDBClusterRequest> request = new DefaultRequest<FailoverDBClusterRequest>(
                failoverDBClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "FailoverDBCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (failoverDBClusterRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = failoverDBClusterRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (failoverDBClusterRequest.getTargetDBInstanceIdentifier() != null) {
            prefix = "TargetDBInstanceIdentifier";
            String targetDBInstanceIdentifier = failoverDBClusterRequest
                    .getTargetDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(targetDBInstanceIdentifier));
        }

        return request;
    }
}
