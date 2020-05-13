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

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO GlobalReplicationGroup
 */
class GlobalReplicationGroupStaxMarshaller {

    public void marshall(GlobalReplicationGroup _globalReplicationGroup, Request<?> request,
            String _prefix) {
        String prefix;
        if (_globalReplicationGroup.getGlobalReplicationGroupId() != null) {
            prefix = _prefix + "GlobalReplicationGroupId";
            String globalReplicationGroupId = _globalReplicationGroup.getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (_globalReplicationGroup.getGlobalReplicationGroupDescription() != null) {
            prefix = _prefix + "GlobalReplicationGroupDescription";
            String globalReplicationGroupDescription = _globalReplicationGroup
                    .getGlobalReplicationGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupDescription));
        }
        if (_globalReplicationGroup.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _globalReplicationGroup.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_globalReplicationGroup.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _globalReplicationGroup.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_globalReplicationGroup.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _globalReplicationGroup.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_globalReplicationGroup.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _globalReplicationGroup.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_globalReplicationGroup.getMembers() != null) {
            prefix = _prefix + "Members";
            java.util.List<GlobalReplicationGroupMember> members = _globalReplicationGroup
                    .getMembers();
            int membersIndex = 1;
            String membersPrefix = prefix;
            for (GlobalReplicationGroupMember membersItem : members) {
                prefix = membersPrefix + "." + membersIndex;
                if (membersItem != null) {
                    GlobalReplicationGroupMemberStaxMarshaller.getInstance().marshall(membersItem,
                            request, prefix + ".");
                }
                membersIndex++;
            }
            prefix = membersPrefix;
        }
        if (_globalReplicationGroup.getClusterEnabled() != null) {
            prefix = _prefix + "ClusterEnabled";
            Boolean clusterEnabled = _globalReplicationGroup.getClusterEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(clusterEnabled));
        }
        if (_globalReplicationGroup.getGlobalNodeGroups() != null) {
            prefix = _prefix + "GlobalNodeGroups";
            java.util.List<GlobalNodeGroup> globalNodeGroups = _globalReplicationGroup
                    .getGlobalNodeGroups();
            int globalNodeGroupsIndex = 1;
            String globalNodeGroupsPrefix = prefix;
            for (GlobalNodeGroup globalNodeGroupsItem : globalNodeGroups) {
                prefix = globalNodeGroupsPrefix + "." + globalNodeGroupsIndex;
                if (globalNodeGroupsItem != null) {
                    GlobalNodeGroupStaxMarshaller.getInstance().marshall(globalNodeGroupsItem,
                            request, prefix + ".");
                }
                globalNodeGroupsIndex++;
            }
            prefix = globalNodeGroupsPrefix;
        }
        if (_globalReplicationGroup.getAuthTokenEnabled() != null) {
            prefix = _prefix + "AuthTokenEnabled";
            Boolean authTokenEnabled = _globalReplicationGroup.getAuthTokenEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(authTokenEnabled));
        }
        if (_globalReplicationGroup.getTransitEncryptionEnabled() != null) {
            prefix = _prefix + "TransitEncryptionEnabled";
            Boolean transitEncryptionEnabled = _globalReplicationGroup
                    .getTransitEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(transitEncryptionEnabled));
        }
        if (_globalReplicationGroup.getAtRestEncryptionEnabled() != null) {
            prefix = _prefix + "AtRestEncryptionEnabled";
            Boolean atRestEncryptionEnabled = _globalReplicationGroup.getAtRestEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(atRestEncryptionEnabled));
        }
    }

    private static GlobalReplicationGroupStaxMarshaller instance;

    public static GlobalReplicationGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalReplicationGroupStaxMarshaller();
        return instance;
    }
}
