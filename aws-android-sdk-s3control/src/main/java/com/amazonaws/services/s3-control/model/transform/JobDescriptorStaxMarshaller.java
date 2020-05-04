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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO JobDescriptor
 */
class JobDescriptorStaxMarshaller {

    public void marshall(JobDescriptor _jobDescriptor, Request<?> request, String _prefix) {
        String prefix;
        if (_jobDescriptor.getJobId() != null) {
            prefix = _prefix + "JobId";
            String jobId = _jobDescriptor.getJobId();
            request.addParameter(prefix, StringUtils.fromString(jobId));
        }
        if (_jobDescriptor.getConfirmationRequired() != null) {
            prefix = _prefix + "ConfirmationRequired";
            Boolean confirmationRequired = _jobDescriptor.getConfirmationRequired();
            request.addParameter(prefix, StringUtils.fromBoolean(confirmationRequired));
        }
        if (_jobDescriptor.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _jobDescriptor.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_jobDescriptor.getJobArn() != null) {
            prefix = _prefix + "JobArn";
            String jobArn = _jobDescriptor.getJobArn();
            request.addParameter(prefix, StringUtils.fromString(jobArn));
        }
        if (_jobDescriptor.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _jobDescriptor.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_jobDescriptor.getManifest() != null) {
            prefix = _prefix + "Manifest";
            JobManifest manifest = _jobDescriptor.getManifest();
            JobManifestStaxMarshaller.getInstance().marshall(manifest, request, prefix + ".");
        }
        if (_jobDescriptor.getOperation() != null) {
            prefix = _prefix + "Operation";
            JobOperation operation = _jobDescriptor.getOperation();
            JobOperationStaxMarshaller.getInstance().marshall(operation, request, prefix + ".");
        }
        if (_jobDescriptor.getPriority() != null) {
            prefix = _prefix + "Priority";
            Integer priority = _jobDescriptor.getPriority();
            request.addParameter(prefix, StringUtils.fromInteger(priority));
        }
        if (_jobDescriptor.getProgressSummary() != null) {
            prefix = _prefix + "ProgressSummary";
            JobProgressSummary progressSummary = _jobDescriptor.getProgressSummary();
            JobProgressSummaryStaxMarshaller.getInstance().marshall(progressSummary, request, prefix + ".");
        }
        if (_jobDescriptor.getStatusUpdateReason() != null) {
            prefix = _prefix + "StatusUpdateReason";
            String statusUpdateReason = _jobDescriptor.getStatusUpdateReason();
            request.addParameter(prefix, StringUtils.fromString(statusUpdateReason));
        }
        if (_jobDescriptor.getFailureReasons() != null) {
            prefix = _prefix + "FailureReasons";
            java.util.List<JobFailure> failureReasons = _jobDescriptor.getFailureReasons();
            int failureReasonsIndex = 1;
            String failureReasonsPrefix = prefix;
            for (JobFailure failureReasonsItem : failureReasons) {
                prefix = failureReasonsPrefix + ".member." + failureReasonsIndex;
                if (failureReasonsItem != null) {
            JobFailureStaxMarshaller.getInstance().marshall(failureReasonsItem, request, prefix + ".");
                    }
                failureReasonsIndex ++;
            }
            prefix = failureReasonsPrefix;
        }
        if (_jobDescriptor.getReport() != null) {
            prefix = _prefix + "Report";
            JobReport report = _jobDescriptor.getReport();
            JobReportStaxMarshaller.getInstance().marshall(report, request, prefix + ".");
        }
        if (_jobDescriptor.getCreationTime() != null) {
            prefix = _prefix + "CreationTime";
            java.util.Date creationTime = _jobDescriptor.getCreationTime();
            request.addParameter(prefix, StringUtils.fromDate(creationTime));
        }
        if (_jobDescriptor.getTerminationDate() != null) {
            prefix = _prefix + "TerminationDate";
            java.util.Date terminationDate = _jobDescriptor.getTerminationDate();
            request.addParameter(prefix, StringUtils.fromDate(terminationDate));
        }
        if (_jobDescriptor.getRoleArn() != null) {
            prefix = _prefix + "RoleArn";
            String roleArn = _jobDescriptor.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (_jobDescriptor.getSuspendedDate() != null) {
            prefix = _prefix + "SuspendedDate";
            java.util.Date suspendedDate = _jobDescriptor.getSuspendedDate();
            request.addParameter(prefix, StringUtils.fromDate(suspendedDate));
        }
        if (_jobDescriptor.getSuspendedCause() != null) {
            prefix = _prefix + "SuspendedCause";
            String suspendedCause = _jobDescriptor.getSuspendedCause();
            request.addParameter(prefix, StringUtils.fromString(suspendedCause));
        }
    }

    private static JobDescriptorStaxMarshaller instance;
    public static JobDescriptorStaxMarshaller getInstance() {
        if (instance == null) instance = new JobDescriptorStaxMarshaller();
        return instance;
    }
}
