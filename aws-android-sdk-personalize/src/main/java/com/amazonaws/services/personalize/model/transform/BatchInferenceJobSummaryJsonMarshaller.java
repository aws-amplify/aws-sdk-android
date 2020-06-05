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
 * JSON marshaller for POJO BatchInferenceJobSummary
 */
class BatchInferenceJobSummaryJsonMarshaller {

    public void marshall(BatchInferenceJobSummary batchInferenceJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (batchInferenceJobSummary.getBatchInferenceJobArn() != null) {
            String batchInferenceJobArn = batchInferenceJobSummary.getBatchInferenceJobArn();
            jsonWriter.name("batchInferenceJobArn");
            jsonWriter.value(batchInferenceJobArn);
        }
        if (batchInferenceJobSummary.getJobName() != null) {
            String jobName = batchInferenceJobSummary.getJobName();
            jsonWriter.name("jobName");
            jsonWriter.value(jobName);
        }
        if (batchInferenceJobSummary.getStatus() != null) {
            String status = batchInferenceJobSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (batchInferenceJobSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = batchInferenceJobSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (batchInferenceJobSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = batchInferenceJobSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (batchInferenceJobSummary.getFailureReason() != null) {
            String failureReason = batchInferenceJobSummary.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        if (batchInferenceJobSummary.getSolutionVersionArn() != null) {
            String solutionVersionArn = batchInferenceJobSummary.getSolutionVersionArn();
            jsonWriter.name("solutionVersionArn");
            jsonWriter.value(solutionVersionArn);
        }
        jsonWriter.endObject();
    }

    private static BatchInferenceJobSummaryJsonMarshaller instance;

    public static BatchInferenceJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchInferenceJobSummaryJsonMarshaller();
        return instance;
    }
}
