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
 * StAX request marshaller for ModifyGlobalReplicationGroupRequest
 */
public class ModifyGlobalReplicationGroupRequestMarshaller
        implements
        Marshaller<Request<ModifyGlobalReplicationGroupRequest>, ModifyGlobalReplicationGroupRequest> {

    public Request<ModifyGlobalReplicationGroupRequest> marshall(
            ModifyGlobalReplicationGroupRequest modifyGlobalReplicationGroupRequest) {
        if (modifyGlobalReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyGlobalReplicationGroupRequest)");
        }

        Request<ModifyGlobalReplicationGroupRequest> request = new DefaultRequest<ModifyGlobalReplicationGroupRequest>(
                modifyGlobalReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyGlobalReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (modifyGlobalReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            prefix = "GlobalReplicationGroupId";
            String globalReplicationGroupId = modifyGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (modifyGlobalReplicationGroupRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = modifyGlobalReplicationGroupRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }
        if (modifyGlobalReplicationGroupRequest.getCacheNodeType() != null) {
            prefix = "CacheNodeType";
            String cacheNodeType = modifyGlobalReplicationGroupRequest.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (modifyGlobalReplicationGroupRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = modifyGlobalReplicationGroupRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (modifyGlobalReplicationGroupRequest.getGlobalReplicationGroupDescription() != null) {
            prefix = "GlobalReplicationGroupDescription";
            String globalReplicationGroupDescription = modifyGlobalReplicationGroupRequest
                    .getGlobalReplicationGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupDescription));
        }
        if (modifyGlobalReplicationGroupRequest.getAutomaticFailoverEnabled() != null) {
            prefix = "AutomaticFailoverEnabled";
            Boolean automaticFailoverEnabled = modifyGlobalReplicationGroupRequest
                    .getAutomaticFailoverEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(automaticFailoverEnabled));
        }

        return request;
    }
}
