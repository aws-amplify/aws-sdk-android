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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BatchInferenceJob
 */
class BatchInferenceJobJsonMarshaller {

    public void marshall(BatchInferenceJob batchInferenceJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (batchInferenceJob.getJobName() != null) {
            String jobName = batchInferenceJob.getJobName();
            jsonWriter.name("jobName");
            jsonWriter.value(jobName);
        }
        if (batchInferenceJob.getBatchInferenceJobArn() != null) {
            String batchInferenceJobArn = batchInferenceJob.getBatchInferenceJobArn();
            jsonWriter.name("batchInferenceJobArn");
            jsonWriter.value(batchInferenceJobArn);
        }
        if (batchInferenceJob.getFilterArn() != null) {
            String filterArn = batchInferenceJob.getFilterArn();
            jsonWriter.name("filterArn");
            jsonWriter.value(filterArn);
        }
        if (batchInferenceJob.getFailureReason() != null) {
            String failureReason = batchInferenceJob.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        if (batchInferenceJob.getSolutionVersionArn() != null) {
            String solutionVersionArn = batchInferenceJob.getSolutionVersionArn();
            jsonWriter.name("solutionVersionArn");
            jsonWriter.value(solutionVersionArn);
        }
        if (batchInferenceJob.getNumResults() != null) {
            Integer numResults = batchInferenceJob.getNumResults();
            jsonWriter.name("numResults");
            jsonWriter.value(numResults);
        }
        if (batchInferenceJob.getJobInput() != null) {
            BatchInferenceJobInput jobInput = batchInferenceJob.getJobInput();
            jsonWriter.name("jobInput");
            BatchInferenceJobInputJsonMarshaller.getInstance().marshall(jobInput, jsonWriter);
        }
        if (batchInferenceJob.getJobOutput() != null) {
            BatchInferenceJobOutput jobOutput = batchInferenceJob.getJobOutput();
            jsonWriter.name("jobOutput");
            BatchInferenceJobOutputJsonMarshaller.getInstance().marshall(jobOutput, jsonWriter);
        }
        if (batchInferenceJob.getRoleArn() != null) {
            String roleArn = batchInferenceJob.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (batchInferenceJob.getStatus() != null) {
            String status = batchInferenceJob.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (batchInferenceJob.getCreationDateTime() != null) {
            java.util.Date creationDateTime = batchInferenceJob.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (batchInferenceJob.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = batchInferenceJob.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static BatchInferenceJobJsonMarshaller instance;

    public static BatchInferenceJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchInferenceJobJsonMarshaller();
        return instance;
    }
}
