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
 * StAX request marshaller for BacktrackDBClusterRequest
 */
public class BacktrackDBClusterRequestMarshaller implements
        Marshaller<Request<BacktrackDBClusterRequest>, BacktrackDBClusterRequest> {

    public Request<BacktrackDBClusterRequest> marshall(
            BacktrackDBClusterRequest backtrackDBClusterRequest) {
        if (backtrackDBClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BacktrackDBClusterRequest)");
        }

        Request<BacktrackDBClusterRequest> request = new DefaultRequest<BacktrackDBClusterRequest>(
                backtrackDBClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "BacktrackDBCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (backtrackDBClusterRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = backtrackDBClusterRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (backtrackDBClusterRequest.getBacktrackTo() != null) {
            prefix = "BacktrackTo";
            java.util.Date backtrackTo = backtrackDBClusterRequest.getBacktrackTo();
            request.addParameter(prefix, StringUtils.fromDate(backtrackTo));
        }
        if (backtrackDBClusterRequest.getForce() != null) {
            prefix = "Force";
            Boolean force = backtrackDBClusterRequest.getForce();
            request.addParameter(prefix, StringUtils.fromBoolean(force));
        }
        if (backtrackDBClusterRequest.getUseEarliestTimeOnPointInTimeUnavailable() != null) {
            prefix = "UseEarliestTimeOnPointInTimeUnavailable";
            Boolean useEarliestTimeOnPointInTimeUnavailable = backtrackDBClusterRequest
                    .getUseEarliestTimeOnPointInTimeUnavailable();
            request.addParameter(prefix,
                    StringUtils.fromBoolean(useEarliestTimeOnPointInTimeUnavailable));
        }

        return request;
    }
}
