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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentClassificationJobProperties
 */
class DocumentClassificationJobPropertiesJsonMarshaller {

    public void marshall(DocumentClassificationJobProperties documentClassificationJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentClassificationJobProperties.getJobId() != null) {
            String jobId = documentClassificationJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (documentClassificationJobProperties.getJobName() != null) {
            String jobName = documentClassificationJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (documentClassificationJobProperties.getJobStatus() != null) {
            String jobStatus = documentClassificationJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (documentClassificationJobProperties.getMessage() != null) {
            String message = documentClassificationJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (documentClassificationJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = documentClassificationJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (documentClassificationJobProperties.getEndTime() != null) {
            java.util.Date endTime = documentClassificationJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (documentClassificationJobProperties.getDocumentClassifierArn() != null) {
            String documentClassifierArn = documentClassificationJobProperties
                    .getDocumentClassifierArn();
            jsonWriter.name("DocumentClassifierArn");
            jsonWriter.value(documentClassifierArn);
        }
        if (documentClassificationJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = documentClassificationJobProperties
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (documentClassificationJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = documentClassificationJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (documentClassificationJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = documentClassificationJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static DocumentClassificationJobPropertiesJsonMarshaller instance;

    public static DocumentClassificationJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassificationJobPropertiesJsonMarshaller();
        return instance;
    }
}
