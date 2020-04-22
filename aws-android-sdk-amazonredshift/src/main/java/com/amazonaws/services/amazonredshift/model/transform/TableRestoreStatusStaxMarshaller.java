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
 * StAX marshaller for POJO TableRestoreStatus
 */
class TableRestoreStatusStaxMarshaller {

    public void marshall(TableRestoreStatus _tableRestoreStatus, Request<?> request, String _prefix) {
        String prefix;
        if (_tableRestoreStatus.getTableRestoreRequestId() != null) {
            prefix = _prefix + "TableRestoreRequestId";
            String tableRestoreRequestId = _tableRestoreStatus.getTableRestoreRequestId();
            request.addParameter(prefix, StringUtils.fromString(tableRestoreRequestId));
        }
        if (_tableRestoreStatus.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _tableRestoreStatus.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_tableRestoreStatus.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _tableRestoreStatus.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (_tableRestoreStatus.getRequestTime() != null) {
            prefix = _prefix + "RequestTime";
            java.util.Date requestTime = _tableRestoreStatus.getRequestTime();
            request.addParameter(prefix, StringUtils.fromDate(requestTime));
        }
        if (_tableRestoreStatus.getProgressInMegaBytes() != null) {
            prefix = _prefix + "ProgressInMegaBytes";
            Long progressInMegaBytes = _tableRestoreStatus.getProgressInMegaBytes();
            request.addParameter(prefix, StringUtils.fromLong(progressInMegaBytes));
        }
        if (_tableRestoreStatus.getTotalDataInMegaBytes() != null) {
            prefix = _prefix + "TotalDataInMegaBytes";
            Long totalDataInMegaBytes = _tableRestoreStatus.getTotalDataInMegaBytes();
            request.addParameter(prefix, StringUtils.fromLong(totalDataInMegaBytes));
        }
        if (_tableRestoreStatus.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _tableRestoreStatus.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_tableRestoreStatus.getSnapshotIdentifier() != null) {
            prefix = _prefix + "SnapshotIdentifier";
            String snapshotIdentifier = _tableRestoreStatus.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (_tableRestoreStatus.getSourceDatabaseName() != null) {
            prefix = _prefix + "SourceDatabaseName";
            String sourceDatabaseName = _tableRestoreStatus.getSourceDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(sourceDatabaseName));
        }
        if (_tableRestoreStatus.getSourceSchemaName() != null) {
            prefix = _prefix + "SourceSchemaName";
            String sourceSchemaName = _tableRestoreStatus.getSourceSchemaName();
            request.addParameter(prefix, StringUtils.fromString(sourceSchemaName));
        }
        if (_tableRestoreStatus.getSourceTableName() != null) {
            prefix = _prefix + "SourceTableName";
            String sourceTableName = _tableRestoreStatus.getSourceTableName();
            request.addParameter(prefix, StringUtils.fromString(sourceTableName));
        }
        if (_tableRestoreStatus.getTargetDatabaseName() != null) {
            prefix = _prefix + "TargetDatabaseName";
            String targetDatabaseName = _tableRestoreStatus.getTargetDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(targetDatabaseName));
        }
        if (_tableRestoreStatus.getTargetSchemaName() != null) {
            prefix = _prefix + "TargetSchemaName";
            String targetSchemaName = _tableRestoreStatus.getTargetSchemaName();
            request.addParameter(prefix, StringUtils.fromString(targetSchemaName));
        }
        if (_tableRestoreStatus.getNewTableName() != null) {
            prefix = _prefix + "NewTableName";
            String newTableName = _tableRestoreStatus.getNewTableName();
            request.addParameter(prefix, StringUtils.fromString(newTableName));
        }
    }

    private static TableRestoreStatusStaxMarshaller instance;

    public static TableRestoreStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TableRestoreStatusStaxMarshaller();
        return instance;
    }
}
