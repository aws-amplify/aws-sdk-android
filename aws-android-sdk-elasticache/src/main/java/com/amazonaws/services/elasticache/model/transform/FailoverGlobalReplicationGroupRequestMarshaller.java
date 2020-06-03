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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for FailoverGlobalReplicationGroupRequest
 */
public class FailoverGlobalReplicationGroupRequestMarshaller
        implements
        Marshaller<Request<FailoverGlobalReplicationGroupRequest>, FailoverGlobalReplicationGroupRequest> {

    public Request<FailoverGlobalReplicationGroupRequest> marshall(
            FailoverGlobalReplicationGroupRequest failoverGlobalReplicationGroupRequest) {
        if (failoverGlobalReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(FailoverGlobalReplicationGroupRequest)");
        }

        Request<FailoverGlobalReplicationGroupRequest> request = new DefaultRequest<FailoverGlobalReplicationGroupRequest>(
                failoverGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "FailoverGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (failoverGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            prefix = "GlobalReplicationGroupId";
            String globalReplicationGroupId = failoverGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (failoverGlobalReplicationGroupRequest.getPrimaryRegion() != null) {
            prefix = "PrimaryRegion";
            String primaryRegion = failoverGlobalReplicationGroupRequest.getPrimaryRegion();
            request.addParameter(prefix, StringUtils.fromString(primaryRegion));
        }
        if (failoverGlobalReplicationGroupRequest.getPrimaryReplicationGroupId() != null) {
            prefix = "PrimaryReplicationGroupId";
            String primaryReplicationGroupId = failoverGlobalReplicationGroupRequest
                    .getPrimaryReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(primaryReplicationGroupId));
        }

        return request;
    }
}
