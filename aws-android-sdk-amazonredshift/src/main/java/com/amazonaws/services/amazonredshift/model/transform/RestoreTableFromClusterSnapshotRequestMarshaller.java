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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for RestoreTableFromClusterSnapshotRequest
 */
public class RestoreTableFromClusterSnapshotRequestMarshaller
        implements
        Marshaller<Request<RestoreTableFromClusterSnapshotRequest>, RestoreTableFromClusterSnapshotRequest> {

    public Request<RestoreTableFromClusterSnapshotRequest> marshall(
            RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest) {
        if (restoreTableFromClusterSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreTableFromClusterSnapshotRequest)");
        }

        Request<RestoreTableFromClusterSnapshotRequest> request = new DefaultRequest<RestoreTableFromClusterSnapshotRequest>(
                restoreTableFromClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "RestoreTableFromClusterSnapshot");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (restoreTableFromClusterSnapshotRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = restoreTableFromClusterSnapshotRequest
                    .getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (restoreTableFromClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            prefix = "SnapshotIdentifier";
            String snapshotIdentifier = restoreTableFromClusterSnapshotRequest
                    .getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (restoreTableFromClusterSnapshotRequest.getSourceDatabaseName() != null) {
            prefix = "SourceDatabaseName";
            String sourceDatabaseName = restoreTableFromClusterSnapshotRequest
                    .getSourceDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(sourceDatabaseName));
        }
        if (restoreTableFromClusterSnapshotRequest.getSourceSchemaName() != null) {
            prefix = "SourceSchemaName";
            String sourceSchemaName = restoreTableFromClusterSnapshotRequest.getSourceSchemaName();
            request.addParameter(prefix, StringUtils.fromString(sourceSchemaName));
        }
        if (restoreTableFromClusterSnapshotRequest.getSourceTableName() != null) {
            prefix = "SourceTableName";
            String sourceTableName = restoreTableFromClusterSnapshotRequest.getSourceTableName();
            request.addParameter(prefix, StringUtils.fromString(sourceTableName));
        }
        if (restoreTableFromClusterSnapshotRequest.getTargetDatabaseName() != null) {
            prefix = "TargetDatabaseName";
            String targetDatabaseName = restoreTableFromClusterSnapshotRequest
                    .getTargetDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(targetDatabaseName));
        }
        if (restoreTableFromClusterSnapshotRequest.getTargetSchemaName() != null) {
            prefix = "TargetSchemaName";
            String targetSchemaName = restoreTableFromClusterSnapshotRequest.getTargetSchemaName();
            request.addParameter(prefix, StringUtils.fromString(targetSchemaName));
        }
        if (restoreTableFromClusterSnapshotRequest.getNewTableName() != null) {
            prefix = "NewTableName";
            String newTableName = restoreTableFromClusterSnapshotRequest.getNewTableName();
            request.addParameter(prefix, StringUtils.fromString(newTableName));
        }

        return request;
    }
}
