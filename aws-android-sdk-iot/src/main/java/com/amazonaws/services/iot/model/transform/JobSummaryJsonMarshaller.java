/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobSummary
 */
class JobSummaryJsonMarshaller {

    public void marshall(JobSummary jobSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobSummary.getJobArn() != null) {
            String jobArn = jobSummary.getJobArn();
            jsonWriter.name("jobArn");
            jsonWriter.value(jobArn);
        }
        if (jobSummary.getJobId() != null) {
            String jobId = jobSummary.getJobId();
            jsonWriter.name("jobId");
            jsonWriter.value(jobId);
        }
        if (jobSummary.getThingGroupId() != null) {
            String thingGroupId = jobSummary.getThingGroupId();
            jsonWriter.name("thingGroupId");
            jsonWriter.value(thingGroupId);
        }
        if (jobSummary.getTargetSelection() != null) {
            String targetSelection = jobSummary.getTargetSelection();
            jsonWriter.name("targetSelection");
            jsonWriter.value(targetSelection);
        }
        if (jobSummary.getStatus() != null) {
            String status = jobSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (jobSummary.getCreatedAt() != null) {
            java.util.Date createdAt = jobSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (jobSummary.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = jobSummary.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (jobSummary.getCompletedAt() != null) {
            java.util.Date completedAt = jobSummary.getCompletedAt();
            jsonWriter.name("completedAt");
            jsonWriter.value(completedAt);
        }
        jsonWriter.endObject();
    }

    private static JobSummaryJsonMarshaller instance;

    public static JobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobSummaryJsonMarshaller();
        return instance;
    }
}
