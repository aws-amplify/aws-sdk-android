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
 * JSON marshaller for POJO SentimentDetectionJobProperties
 */
class SentimentDetectionJobPropertiesJsonMarshaller {

    public void marshall(SentimentDetectionJobProperties sentimentDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sentimentDetectionJobProperties.getJobId() != null) {
            String jobId = sentimentDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (sentimentDetectionJobProperties.getJobName() != null) {
            String jobName = sentimentDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (sentimentDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = sentimentDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (sentimentDetectionJobProperties.getMessage() != null) {
            String message = sentimentDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (sentimentDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = sentimentDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (sentimentDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = sentimentDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (sentimentDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = sentimentDetectionJobProperties.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (sentimentDetectionJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = sentimentDetectionJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (sentimentDetectionJobProperties.getLanguageCode() != null) {
            String languageCode = sentimentDetectionJobProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (sentimentDetectionJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = sentimentDetectionJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static SentimentDetectionJobPropertiesJsonMarshaller instance;

    public static SentimentDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SentimentDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
