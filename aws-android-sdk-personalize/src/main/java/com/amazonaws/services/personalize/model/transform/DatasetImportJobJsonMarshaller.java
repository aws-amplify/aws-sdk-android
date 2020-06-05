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
 * JSON marshaller for POJO DatasetImportJob
 */
class DatasetImportJobJsonMarshaller {

    public void marshall(DatasetImportJob datasetImportJob, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (datasetImportJob.getJobName() != null) {
            String jobName = datasetImportJob.getJobName();
            jsonWriter.name("jobName");
            jsonWriter.value(jobName);
        }
        if (datasetImportJob.getDatasetImportJobArn() != null) {
            String datasetImportJobArn = datasetImportJob.getDatasetImportJobArn();
            jsonWriter.name("datasetImportJobArn");
            jsonWriter.value(datasetImportJobArn);
        }
        if (datasetImportJob.getDatasetArn() != null) {
            String datasetArn = datasetImportJob.getDatasetArn();
            jsonWriter.name("datasetArn");
            jsonWriter.value(datasetArn);
        }
        if (datasetImportJob.getDataSource() != null) {
            DataSource dataSource = datasetImportJob.getDataSource();
            jsonWriter.name("dataSource");
            DataSourceJsonMarshaller.getInstance().marshall(dataSource, jsonWriter);
        }
        if (datasetImportJob.getRoleArn() != null) {
            String roleArn = datasetImportJob.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (datasetImportJob.getStatus() != null) {
            String status = datasetImportJob.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (datasetImportJob.getCreationDateTime() != null) {
            java.util.Date creationDateTime = datasetImportJob.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (datasetImportJob.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = datasetImportJob.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (datasetImportJob.getFailureReason() != null) {
            String failureReason = datasetImportJob.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static DatasetImportJobJsonMarshaller instance;

    public static DatasetImportJobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetImportJobJsonMarshaller();
        return instance;
    }
}
