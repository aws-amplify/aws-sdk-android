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
 * StAX request marshaller for DecreaseNodeGroupsInGlobalReplicationGroupRequest
 */
public class DecreaseNodeGroupsInGlobalReplicationGroupRequestMarshaller
        implements
        Marshaller<Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest>, DecreaseNodeGroupsInGlobalReplicationGroupRequest> {

    public Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest> marshall(
            DecreaseNodeGroupsInGlobalReplicationGroupRequest decreaseNodeGroupsInGlobalReplicationGroupRequest) {
        if (decreaseNodeGroupsInGlobalReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DecreaseNodeGroupsInGlobalReplicationGroupRequest)");
        }

        Request<DecreaseNodeGroupsInGlobalReplicationGroupRequest> request = new DefaultRequest<DecreaseNodeGroupsInGlobalReplicationGroupRequest>(
                decreaseNodeGroupsInGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "DecreaseNodeGroupsInGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            prefix = "GlobalReplicationGroupId";
            String globalReplicationGroupId = decreaseNodeGroupsInGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getNodeGroupCount() != null) {
            prefix = "NodeGroupCount";
            Integer nodeGroupCount = decreaseNodeGroupsInGlobalReplicationGroupRequest
                    .getNodeGroupCount();
            request.addParameter(prefix, StringUtils.fromInteger(nodeGroupCount));
        }
        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalNodeGroupsToRemove() != null) {
            prefix = "GlobalNodeGroupsToRemove";
            java.util.List<String> globalNodeGroupsToRemove = decreaseNodeGroupsInGlobalReplicationGroupRequest
                    .getGlobalNodeGroupsToRemove();
            int globalNodeGroupsToRemoveIndex = 1;
            String globalNodeGroupsToRemovePrefix = prefix;
            for (String globalNodeGroupsToRemoveItem : globalNodeGroupsToRemove) {
                prefix = globalNodeGroupsToRemovePrefix + "." + globalNodeGroupsToRemoveIndex;
                if (globalNodeGroupsToRemoveItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(globalNodeGroupsToRemoveItem));
                }
                globalNodeGroupsToRemoveIndex++;
            }
            prefix = globalNodeGroupsToRemovePrefix;
        }
        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getGlobalNodeGroupsToRetain() != null) {
            prefix = "GlobalNodeGroupsToRetain";
            java.util.List<String> globalNodeGroupsToRetain = decreaseNodeGroupsInGlobalReplicationGroupRequest
                    .getGlobalNodeGroupsToRetain();
            int globalNodeGroupsToRetainIndex = 1;
            String globalNodeGroupsToRetainPrefix = prefix;
            for (String globalNodeGroupsToRetainItem : globalNodeGroupsToRetain) {
                prefix = globalNodeGroupsToRetainPrefix + "." + globalNodeGroupsToRetainIndex;
                if (globalNodeGroupsToRetainItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(globalNodeGroupsToRetainItem));
                }
                globalNodeGroupsToRetainIndex++;
            }
            prefix = globalNodeGroupsToRetainPrefix;
        }
        if (decreaseNodeGroupsInGlobalReplicationGroupRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = decreaseNodeGroupsInGlobalReplicationGroupRequest
                    .getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }

        return request;
    }
}
