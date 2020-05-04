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
 * StAX marshaller for POJO JobListDescriptor
 */
class JobListDescriptorStaxMarshaller {

    public void marshall(JobListDescriptor _jobListDescriptor, Request<?> request, String _prefix) {
        String prefix;
        if (_jobListDescriptor.getJobId() != null) {
            prefix = _prefix + "JobId";
            String jobId = _jobListDescriptor.getJobId();
            request.addParameter(prefix, StringUtils.fromString(jobId));
        }
        if (_jobListDescriptor.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _jobListDescriptor.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_jobListDescriptor.getOperation() != null) {
            prefix = _prefix + "Operation";
            String operation = _jobListDescriptor.getOperation();
            request.addParameter(prefix, StringUtils.fromString(operation));
        }
        if (_jobListDescriptor.getPriority() != null) {
            prefix = _prefix + "Priority";
            Integer priority = _jobListDescriptor.getPriority();
            request.addParameter(prefix, StringUtils.fromInteger(priority));
        }
        if (_jobListDescriptor.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _jobListDescriptor.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_jobListDescriptor.getCreationTime() != null) {
            prefix = _prefix + "CreationTime";
            java.util.Date creationTime = _jobListDescriptor.getCreationTime();
            request.addParameter(prefix, StringUtils.fromDate(creationTime));
        }
        if (_jobListDescriptor.getTerminationDate() != null) {
            prefix = _prefix + "TerminationDate";
            java.util.Date terminationDate = _jobListDescriptor.getTerminationDate();
            request.addParameter(prefix, StringUtils.fromDate(terminationDate));
        }
        if (_jobListDescriptor.getProgressSummary() != null) {
            prefix = _prefix + "ProgressSummary";
            JobProgressSummary progressSummary = _jobListDescriptor.getProgressSummary();
            JobProgressSummaryStaxMarshaller.getInstance().marshall(progressSummary, request, prefix + ".");
        }
    }

    private static JobListDescriptorStaxMarshaller instance;
    public static JobListDescriptorStaxMarshaller getInstance() {
        if (instance == null) instance = new JobListDescriptorStaxMarshaller();
        return instance;
    }
}
