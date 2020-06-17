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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO JobSummary
 */
class JobSummaryJsonMarshaller {

    public void marshall(JobSummary jobSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (jobSummary.getBucketDefinitions() != null) {
            java.util.List<S3BucketDefinitionForJob> bucketDefinitions = jobSummary
                    .getBucketDefinitions();
            jsonWriter.name("bucketDefinitions");
            jsonWriter.beginArray();
            for (S3BucketDefinitionForJob bucketDefinitionsItem : bucketDefinitions) {
                if (bucketDefinitionsItem != null) {
                    S3BucketDefinitionForJobJsonMarshaller.getInstance().marshall(
                            bucketDefinitionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (jobSummary.getCreatedAt() != null) {
            java.util.Date createdAt = jobSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (jobSummary.getJobId() != null) {
            String jobId = jobSummary.getJobId();
            jsonWriter.name("jobId");
            jsonWriter.value(jobId);
        }
        if (jobSummary.getJobStatus() != null) {
            String jobStatus = jobSummary.getJobStatus();
            jsonWriter.name("jobStatus");
            jsonWriter.value(jobStatus);
        }
        if (jobSummary.getJobType() != null) {
            String jobType = jobSummary.getJobType();
            jsonWriter.name("jobType");
            jsonWriter.value(jobType);
        }
        if (jobSummary.getName() != null) {
            String name = jobSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
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
