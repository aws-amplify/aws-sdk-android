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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
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
        if (jobSummary.getCommitId() != null) {
            String commitId = jobSummary.getCommitId();
            jsonWriter.name("commitId");
            jsonWriter.value(commitId);
        }
        if (jobSummary.getCommitMessage() != null) {
            String commitMessage = jobSummary.getCommitMessage();
            jsonWriter.name("commitMessage");
            jsonWriter.value(commitMessage);
        }
        if (jobSummary.getCommitTime() != null) {
            java.util.Date commitTime = jobSummary.getCommitTime();
            jsonWriter.name("commitTime");
            jsonWriter.value(commitTime);
        }
        if (jobSummary.getStartTime() != null) {
            java.util.Date startTime = jobSummary.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (jobSummary.getStatus() != null) {
            String status = jobSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (jobSummary.getEndTime() != null) {
            java.util.Date endTime = jobSummary.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (jobSummary.getJobType() != null) {
            String jobType = jobSummary.getJobType();
            jsonWriter.name("jobType");
            jsonWriter.value(jobType);
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
