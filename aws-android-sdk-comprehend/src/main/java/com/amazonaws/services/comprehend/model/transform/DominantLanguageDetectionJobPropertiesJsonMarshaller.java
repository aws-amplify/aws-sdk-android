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
 * JSON marshaller for POJO DominantLanguageDetectionJobProperties
 */
class DominantLanguageDetectionJobPropertiesJsonMarshaller {

    public void marshall(
            DominantLanguageDetectionJobProperties dominantLanguageDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dominantLanguageDetectionJobProperties.getJobId() != null) {
            String jobId = dominantLanguageDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (dominantLanguageDetectionJobProperties.getJobName() != null) {
            String jobName = dominantLanguageDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (dominantLanguageDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = dominantLanguageDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (dominantLanguageDetectionJobProperties.getMessage() != null) {
            String message = dominantLanguageDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (dominantLanguageDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = dominantLanguageDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (dominantLanguageDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = dominantLanguageDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (dominantLanguageDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = dominantLanguageDetectionJobProperties
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (dominantLanguageDetectionJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = dominantLanguageDetectionJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (dominantLanguageDetectionJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = dominantLanguageDetectionJobProperties
                    .getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static DominantLanguageDetectionJobPropertiesJsonMarshaller instance;

    public static DominantLanguageDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DominantLanguageDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
