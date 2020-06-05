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
 * JSON marshaller for POJO DatasetImportJobSummary
 */
class DatasetImportJobSummaryJsonMarshaller {

    public void marshall(DatasetImportJobSummary datasetImportJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetImportJobSummary.getDatasetImportJobArn() != null) {
            String datasetImportJobArn = datasetImportJobSummary.getDatasetImportJobArn();
            jsonWriter.name("datasetImportJobArn");
            jsonWriter.value(datasetImportJobArn);
        }
        if (datasetImportJobSummary.getJobName() != null) {
            String jobName = datasetImportJobSummary.getJobName();
            jsonWriter.name("jobName");
            jsonWriter.value(jobName);
        }
        if (datasetImportJobSummary.getStatus() != null) {
            String status = datasetImportJobSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (datasetImportJobSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = datasetImportJobSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (datasetImportJobSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = datasetImportJobSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (datasetImportJobSummary.getFailureReason() != null) {
            String failureReason = datasetImportJobSummary.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static DatasetImportJobSummaryJsonMarshaller instance;

    public static DatasetImportJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetImportJobSummaryJsonMarshaller();
        return instance;
    }
}
