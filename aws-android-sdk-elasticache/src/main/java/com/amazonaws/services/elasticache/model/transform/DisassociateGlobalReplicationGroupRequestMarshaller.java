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
 * StAX request marshaller for DisassociateGlobalReplicationGroupRequest
 */
public class DisassociateGlobalReplicationGroupRequestMarshaller
        implements
        Marshaller<Request<DisassociateGlobalReplicationGroupRequest>, DisassociateGlobalReplicationGroupRequest> {

    public Request<DisassociateGlobalReplicationGroupRequest> marshall(
            DisassociateGlobalReplicationGroupRequest disassociateGlobalReplicationGroupRequest) {
        if (disassociateGlobalReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DisassociateGlobalReplicationGroupRequest)");
        }

        Request<DisassociateGlobalReplicationGroupRequest> request = new DefaultRequest<DisassociateGlobalReplicationGroupRequest>(
                disassociateGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "DisassociateGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (disassociateGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            prefix = "GlobalReplicationGroupId";
            String globalReplicationGroupId = disassociateGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (disassociateGlobalReplicationGroupRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = disassociateGlobalReplicationGroupRequest
                    .getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (disassociateGlobalReplicationGroupRequest.getReplicationGroupRegion() != null) {
            prefix = "ReplicationGroupRegion";
            String replicationGroupRegion = disassociateGlobalReplicationGroupRequest
                    .getReplicationGroupRegion();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupRegion));
        }

        return request;
    }
}
