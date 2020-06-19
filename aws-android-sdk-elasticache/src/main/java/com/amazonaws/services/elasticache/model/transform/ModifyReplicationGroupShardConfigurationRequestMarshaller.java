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
 * StAX request marshaller for ModifyReplicationGroupShardConfigurationRequest
 */
public class ModifyReplicationGroupShardConfigurationRequestMarshaller
        implements
        Marshaller<Request<ModifyReplicationGroupShardConfigurationRequest>, ModifyReplicationGroupShardConfigurationRequest> {

    public Request<ModifyReplicationGroupShardConfigurationRequest> marshall(
            ModifyReplicationGroupShardConfigurationRequest modifyReplicationGroupShardConfigurationRequest) {
        if (modifyReplicationGroupShardConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyReplicationGroupShardConfigurationRequest)");
        }

        Request<ModifyReplicationGroupShardConfigurationRequest> request = new DefaultRequest<ModifyReplicationGroupShardConfigurationRequest>(
                modifyReplicationGroupShardConfigurationRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyReplicationGroupShardConfiguration");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (modifyReplicationGroupShardConfigurationRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = modifyReplicationGroupShardConfigurationRequest
                    .getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (modifyReplicationGroupShardConfigurationRequest.getNodeGroupCount() != null) {
            prefix = "NodeGroupCount";
            Integer nodeGroupCount = modifyReplicationGroupShardConfigurationRequest
                    .getNodeGroupCount();
            request.addParameter(prefix, StringUtils.fromInteger(nodeGroupCount));
        }
        if (modifyReplicationGroupShardConfigurationRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = modifyReplicationGroupShardConfigurationRequest
                    .getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }
        if (modifyReplicationGroupShardConfigurationRequest.getReshardingConfiguration() != null) {
            prefix = "ReshardingConfiguration";
            java.util.List<ReshardingConfiguration> reshardingConfiguration = modifyReplicationGroupShardConfigurationRequest
                    .getReshardingConfiguration();
            int reshardingConfigurationIndex = 1;
            String reshardingConfigurationPrefix = prefix;
            for (ReshardingConfiguration reshardingConfigurationItem : reshardingConfiguration) {
                prefix = reshardingConfigurationPrefix + "." + reshardingConfigurationIndex;
                if (reshardingConfigurationItem != null) {
                    ReshardingConfigurationStaxMarshaller.getInstance().marshall(
                            reshardingConfigurationItem, request, prefix + ".");
                }
                reshardingConfigurationIndex++;
            }
            prefix = reshardingConfigurationPrefix;
        }
        if (modifyReplicationGroupShardConfigurationRequest.getNodeGroupsToRemove() != null) {
            prefix = "NodeGroupsToRemove";
            java.util.List<String> nodeGroupsToRemove = modifyReplicationGroupShardConfigurationRequest
                    .getNodeGroupsToRemove();
            int nodeGroupsToRemoveIndex = 1;
            String nodeGroupsToRemovePrefix = prefix;
            for (String nodeGroupsToRemoveItem : nodeGroupsToRemove) {
                prefix = nodeGroupsToRemovePrefix + "." + nodeGroupsToRemoveIndex;
                if (nodeGroupsToRemoveItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(nodeGroupsToRemoveItem));
                }
                nodeGroupsToRemoveIndex++;
            }
            prefix = nodeGroupsToRemovePrefix;
        }
        if (modifyReplicationGroupShardConfigurationRequest.getNodeGroupsToRetain() != null) {
            prefix = "NodeGroupsToRetain";
            java.util.List<String> nodeGroupsToRetain = modifyReplicationGroupShardConfigurationRequest
                    .getNodeGroupsToRetain();
            int nodeGroupsToRetainIndex = 1;
            String nodeGroupsToRetainPrefix = prefix;
            for (String nodeGroupsToRetainItem : nodeGroupsToRetain) {
                prefix = nodeGroupsToRetainPrefix + "." + nodeGroupsToRetainIndex;
                if (nodeGroupsToRetainItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(nodeGroupsToRetainItem));
                }
                nodeGroupsToRetainIndex++;
            }
            prefix = nodeGroupsToRetainPrefix;
        }

        return request;
    }
}
