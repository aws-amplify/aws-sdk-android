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
 * StAX request marshaller for CreateGlobalReplicationGroupRequest
 */
public class CreateGlobalReplicationGroupRequestMarshaller
        implements
        Marshaller<Request<CreateGlobalReplicationGroupRequest>, CreateGlobalReplicationGroupRequest> {

    public Request<CreateGlobalReplicationGroupRequest> marshall(
            CreateGlobalReplicationGroupRequest createGlobalReplicationGroupRequest) {
        if (createGlobalReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateGlobalReplicationGroupRequest)");
        }

        Request<CreateGlobalReplicationGroupRequest> request = new DefaultRequest<CreateGlobalReplicationGroupRequest>(
                createGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (createGlobalReplicationGroupRequest.getGlobalReplicationGroupIdSuffix() != null) {
            prefix = "GlobalReplicationGroupIdSuffix";
            String globalReplicationGroupIdSuffix = createGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupIdSuffix();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupIdSuffix));
        }
        if (createGlobalReplicationGroupRequest.getGlobalReplicationGroupDescription() != null) {
            prefix = "GlobalReplicationGroupDescription";
            String globalReplicationGroupDescription = createGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupDescription));
        }
        if (createGlobalReplicationGroupRequest.getPrimaryReplicationGroupId() != null) {
            prefix = "PrimaryReplicationGroupId";
            String primaryReplicationGroupId = createGlobalReplicationGroupRequest
                    .getPrimaryReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(primaryReplicationGroupId));
        }

        return request;
    }
}
