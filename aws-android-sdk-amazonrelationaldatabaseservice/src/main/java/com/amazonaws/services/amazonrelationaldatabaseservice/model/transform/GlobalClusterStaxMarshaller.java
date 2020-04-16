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

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO GlobalCluster
 */
class GlobalClusterStaxMarshaller {

    public void marshall(GlobalCluster _globalCluster, Request<?> request, String _prefix) {
        String prefix;
        if (_globalCluster.getGlobalClusterIdentifier() != null) {
            prefix = _prefix + "GlobalClusterIdentifier";
            String globalClusterIdentifier = _globalCluster.getGlobalClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(globalClusterIdentifier));
        }
        if (_globalCluster.getGlobalClusterResourceId() != null) {
            prefix = _prefix + "GlobalClusterResourceId";
            String globalClusterResourceId = _globalCluster.getGlobalClusterResourceId();
            request.addParameter(prefix, StringUtils.fromString(globalClusterResourceId));
        }
        if (_globalCluster.getGlobalClusterArn() != null) {
            prefix = _prefix + "GlobalClusterArn";
            String globalClusterArn = _globalCluster.getGlobalClusterArn();
            request.addParameter(prefix, StringUtils.fromString(globalClusterArn));
        }
        if (_globalCluster.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _globalCluster.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_globalCluster.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _globalCluster.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_globalCluster.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _globalCluster.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_globalCluster.getDatabaseName() != null) {
            prefix = _prefix + "DatabaseName";
            String databaseName = _globalCluster.getDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(databaseName));
        }
        if (_globalCluster.getStorageEncrypted() != null) {
            prefix = _prefix + "StorageEncrypted";
            Boolean storageEncrypted = _globalCluster.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (_globalCluster.getDeletionProtection() != null) {
            prefix = _prefix + "DeletionProtection";
            Boolean deletionProtection = _globalCluster.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (_globalCluster.getGlobalClusterMembers() != null) {
            prefix = _prefix + "GlobalClusterMembers";
            java.util.List<GlobalClusterMember> globalClusterMembers = _globalCluster
                    .getGlobalClusterMembers();
            int globalClusterMembersIndex = 1;
            String globalClusterMembersPrefix = prefix;
            for (GlobalClusterMember globalClusterMembersItem : globalClusterMembers) {
                prefix = globalClusterMembersPrefix + "." + globalClusterMembersIndex;
                if (globalClusterMembersItem != null) {
                    GlobalClusterMemberStaxMarshaller.getInstance().marshall(
                            globalClusterMembersItem, request, prefix + ".");
                }
                globalClusterMembersIndex++;
            }
            prefix = globalClusterMembersPrefix;
        }
    }

    private static GlobalClusterStaxMarshaller instance;

    public static GlobalClusterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalClusterStaxMarshaller();
        return instance;
    }
}
