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
 * StAX marshaller for POJO ExportTask
 */
class ExportTaskStaxMarshaller {

    public void marshall(ExportTask _exportTask, Request<?> request, String _prefix) {
        String prefix;
        if (_exportTask.getExportTaskIdentifier() != null) {
            prefix = _prefix + "ExportTaskIdentifier";
            String exportTaskIdentifier = _exportTask.getExportTaskIdentifier();
            request.addParameter(prefix, StringUtils.fromString(exportTaskIdentifier));
        }
        if (_exportTask.getSourceArn() != null) {
            prefix = _prefix + "SourceArn";
            String sourceArn = _exportTask.getSourceArn();
            request.addParameter(prefix, StringUtils.fromString(sourceArn));
        }
        if (_exportTask.getExportOnly() != null) {
            prefix = _prefix + "ExportOnly";
            java.util.List<String> exportOnly = _exportTask.getExportOnly();
            int exportOnlyIndex = 1;
            String exportOnlyPrefix = prefix;
            for (String exportOnlyItem : exportOnly) {
                prefix = exportOnlyPrefix + ".member." + exportOnlyIndex;
                if (exportOnlyItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(exportOnlyItem));
                }
                exportOnlyIndex++;
            }
            prefix = exportOnlyPrefix;
        }
        if (_exportTask.getSnapshotTime() != null) {
            prefix = _prefix + "SnapshotTime";
            java.util.Date snapshotTime = _exportTask.getSnapshotTime();
            request.addParameter(prefix, StringUtils.fromDate(snapshotTime));
        }
        if (_exportTask.getTaskStartTime() != null) {
            prefix = _prefix + "TaskStartTime";
            java.util.Date taskStartTime = _exportTask.getTaskStartTime();
            request.addParameter(prefix, StringUtils.fromDate(taskStartTime));
        }
        if (_exportTask.getTaskEndTime() != null) {
            prefix = _prefix + "TaskEndTime";
            java.util.Date taskEndTime = _exportTask.getTaskEndTime();
            request.addParameter(prefix, StringUtils.fromDate(taskEndTime));
        }
        if (_exportTask.getS3Bucket() != null) {
            prefix = _prefix + "S3Bucket";
            String s3Bucket = _exportTask.getS3Bucket();
            request.addParameter(prefix, StringUtils.fromString(s3Bucket));
        }
        if (_exportTask.getS3Prefix() != null) {
            prefix = _prefix + "S3Prefix";
            String s3Prefix = _exportTask.getS3Prefix();
            request.addParameter(prefix, StringUtils.fromString(s3Prefix));
        }
        if (_exportTask.getIamRoleArn() != null) {
            prefix = _prefix + "IamRoleArn";
            String iamRoleArn = _exportTask.getIamRoleArn();
            request.addParameter(prefix, StringUtils.fromString(iamRoleArn));
        }
        if (_exportTask.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _exportTask.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_exportTask.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _exportTask.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_exportTask.getPercentProgress() != null) {
            prefix = _prefix + "PercentProgress";
            Integer percentProgress = _exportTask.getPercentProgress();
            request.addParameter(prefix, StringUtils.fromInteger(percentProgress));
        }
        if (_exportTask.getTotalExtractedDataInGB() != null) {
            prefix = _prefix + "TotalExtractedDataInGB";
            Integer totalExtractedDataInGB = _exportTask.getTotalExtractedDataInGB();
            request.addParameter(prefix, StringUtils.fromInteger(totalExtractedDataInGB));
        }
        if (_exportTask.getFailureCause() != null) {
            prefix = _prefix + "FailureCause";
            String failureCause = _exportTask.getFailureCause();
            request.addParameter(prefix, StringUtils.fromString(failureCause));
        }
        if (_exportTask.getWarningMessage() != null) {
            prefix = _prefix + "WarningMessage";
            String warningMessage = _exportTask.getWarningMessage();
            request.addParameter(prefix, StringUtils.fromString(warningMessage));
        }
    }

    private static ExportTaskStaxMarshaller instance;

    public static ExportTaskStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ExportTaskStaxMarshaller();
        return instance;
    }
}
