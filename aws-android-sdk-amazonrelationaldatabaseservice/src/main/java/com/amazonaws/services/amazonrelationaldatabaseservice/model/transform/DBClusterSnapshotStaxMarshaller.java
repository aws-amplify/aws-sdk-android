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
 * StAX marshaller for POJO DBClusterSnapshot
 */
class DBClusterSnapshotStaxMarshaller {

    public void marshall(DBClusterSnapshot _dBClusterSnapshot, Request<?> request, String _prefix) {
        String prefix;
        if (_dBClusterSnapshot.getAvailabilityZones() != null) {
            prefix = _prefix + "AvailabilityZones";
            java.util.List<String> availabilityZones = _dBClusterSnapshot.getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (String availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + "." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(availabilityZonesItem));
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }
        if (_dBClusterSnapshot.getDBClusterSnapshotIdentifier() != null) {
            prefix = _prefix + "DBClusterSnapshotIdentifier";
            String dBClusterSnapshotIdentifier = _dBClusterSnapshot
                    .getDBClusterSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterSnapshotIdentifier));
        }
        if (_dBClusterSnapshot.getDBClusterIdentifier() != null) {
            prefix = _prefix + "DBClusterIdentifier";
            String dBClusterIdentifier = _dBClusterSnapshot.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (_dBClusterSnapshot.getSnapshotCreateTime() != null) {
            prefix = _prefix + "SnapshotCreateTime";
            java.util.Date snapshotCreateTime = _dBClusterSnapshot.getSnapshotCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(snapshotCreateTime));
        }
        if (_dBClusterSnapshot.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _dBClusterSnapshot.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_dBClusterSnapshot.getAllocatedStorage() != null) {
            prefix = _prefix + "AllocatedStorage";
            Integer allocatedStorage = _dBClusterSnapshot.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (_dBClusterSnapshot.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBClusterSnapshot.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBClusterSnapshot.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _dBClusterSnapshot.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_dBClusterSnapshot.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _dBClusterSnapshot.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_dBClusterSnapshot.getClusterCreateTime() != null) {
            prefix = _prefix + "ClusterCreateTime";
            java.util.Date clusterCreateTime = _dBClusterSnapshot.getClusterCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(clusterCreateTime));
        }
        if (_dBClusterSnapshot.getMasterUsername() != null) {
            prefix = _prefix + "MasterUsername";
            String masterUsername = _dBClusterSnapshot.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (_dBClusterSnapshot.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _dBClusterSnapshot.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_dBClusterSnapshot.getLicenseModel() != null) {
            prefix = _prefix + "LicenseModel";
            String licenseModel = _dBClusterSnapshot.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (_dBClusterSnapshot.getSnapshotType() != null) {
            prefix = _prefix + "SnapshotType";
            String snapshotType = _dBClusterSnapshot.getSnapshotType();
            request.addParameter(prefix, StringUtils.fromString(snapshotType));
        }
        if (_dBClusterSnapshot.getPercentProgress() != null) {
            prefix = _prefix + "PercentProgress";
            Integer percentProgress = _dBClusterSnapshot.getPercentProgress();
            request.addParameter(prefix, StringUtils.fromInteger(percentProgress));
        }
        if (_dBClusterSnapshot.getStorageEncrypted() != null) {
            prefix = _prefix + "StorageEncrypted";
            Boolean storageEncrypted = _dBClusterSnapshot.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (_dBClusterSnapshot.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _dBClusterSnapshot.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_dBClusterSnapshot.getDBClusterSnapshotArn() != null) {
            prefix = _prefix + "DBClusterSnapshotArn";
            String dBClusterSnapshotArn = _dBClusterSnapshot.getDBClusterSnapshotArn();
            request.addParameter(prefix, StringUtils.fromString(dBClusterSnapshotArn));
        }
        if (_dBClusterSnapshot.getSourceDBClusterSnapshotArn() != null) {
            prefix = _prefix + "SourceDBClusterSnapshotArn";
            String sourceDBClusterSnapshotArn = _dBClusterSnapshot.getSourceDBClusterSnapshotArn();
            request.addParameter(prefix, StringUtils.fromString(sourceDBClusterSnapshotArn));
        }
        if (_dBClusterSnapshot.getIAMDatabaseAuthenticationEnabled() != null) {
            prefix = _prefix + "IAMDatabaseAuthenticationEnabled";
            Boolean iAMDatabaseAuthenticationEnabled = _dBClusterSnapshot
                    .getIAMDatabaseAuthenticationEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(iAMDatabaseAuthenticationEnabled));
        }
    }

    private static DBClusterSnapshotStaxMarshaller instance;

    public static DBClusterSnapshotStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterSnapshotStaxMarshaller();
        return instance;
    }
}
