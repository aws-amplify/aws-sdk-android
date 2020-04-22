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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PendingModifiedValues
 */
class PendingModifiedValuesStaxMarshaller {

    public void marshall(PendingModifiedValues _pendingModifiedValues, Request<?> request,
            String _prefix) {
        String prefix;
        if (_pendingModifiedValues.getMasterUserPassword() != null) {
            prefix = _prefix + "MasterUserPassword";
            String masterUserPassword = _pendingModifiedValues.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (_pendingModifiedValues.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _pendingModifiedValues.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_pendingModifiedValues.getNumberOfNodes() != null) {
            prefix = _prefix + "NumberOfNodes";
            Integer numberOfNodes = _pendingModifiedValues.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (_pendingModifiedValues.getClusterType() != null) {
            prefix = _prefix + "ClusterType";
            String clusterType = _pendingModifiedValues.getClusterType();
            request.addParameter(prefix, StringUtils.fromString(clusterType));
        }
        if (_pendingModifiedValues.getClusterVersion() != null) {
            prefix = _prefix + "ClusterVersion";
            String clusterVersion = _pendingModifiedValues.getClusterVersion();
            request.addParameter(prefix, StringUtils.fromString(clusterVersion));
        }
        if (_pendingModifiedValues.getAutomatedSnapshotRetentionPeriod() != null) {
            prefix = _prefix + "AutomatedSnapshotRetentionPeriod";
            Integer automatedSnapshotRetentionPeriod = _pendingModifiedValues
                    .getAutomatedSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(automatedSnapshotRetentionPeriod));
        }
        if (_pendingModifiedValues.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _pendingModifiedValues.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_pendingModifiedValues.getPubliclyAccessible() != null) {
            prefix = _prefix + "PubliclyAccessible";
            Boolean publiclyAccessible = _pendingModifiedValues.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (_pendingModifiedValues.getEnhancedVpcRouting() != null) {
            prefix = _prefix + "EnhancedVpcRouting";
            Boolean enhancedVpcRouting = _pendingModifiedValues.getEnhancedVpcRouting();
            request.addParameter(prefix, StringUtils.fromBoolean(enhancedVpcRouting));
        }
        if (_pendingModifiedValues.getMaintenanceTrackName() != null) {
            prefix = _prefix + "MaintenanceTrackName";
            String maintenanceTrackName = _pendingModifiedValues.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (_pendingModifiedValues.getEncryptionType() != null) {
            prefix = _prefix + "EncryptionType";
            String encryptionType = _pendingModifiedValues.getEncryptionType();
            request.addParameter(prefix, StringUtils.fromString(encryptionType));
        }
    }

    private static PendingModifiedValuesStaxMarshaller instance;

    public static PendingModifiedValuesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PendingModifiedValuesStaxMarshaller();
        return instance;
    }
}
