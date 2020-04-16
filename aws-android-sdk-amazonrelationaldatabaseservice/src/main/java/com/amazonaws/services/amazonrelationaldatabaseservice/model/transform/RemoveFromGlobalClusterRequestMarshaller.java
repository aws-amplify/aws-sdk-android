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
 * StAX request marshaller for RemoveFromGlobalClusterRequest
 */
public class RemoveFromGlobalClusterRequestMarshaller implements
        Marshaller<Request<RemoveFromGlobalClusterRequest>, RemoveFromGlobalClusterRequest> {

    public Request<RemoveFromGlobalClusterRequest> marshall(
            RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest) {
        if (removeFromGlobalClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RemoveFromGlobalClusterRequest)");
        }

        Request<RemoveFromGlobalClusterRequest> request = new DefaultRequest<RemoveFromGlobalClusterRequest>(
                removeFromGlobalClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RemoveFromGlobalCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (removeFromGlobalClusterRequest.getGlobalClusterIdentifier() != null) {
            prefix = "GlobalClusterIdentifier";
            String globalClusterIdentifier = removeFromGlobalClusterRequest
                    .getGlobalClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(globalClusterIdentifier));
        }
        if (removeFromGlobalClusterRequest.getDbClusterIdentifier() != null) {
            prefix = "DbClusterIdentifier";
            String dbClusterIdentifier = removeFromGlobalClusterRequest.getDbClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dbClusterIdentifier));
        }

        return request;
    }
}
