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
 * JSON marshaller for POJO KeyPhrasesDetectionJobProperties
 */
class KeyPhrasesDetectionJobPropertiesJsonMarshaller {

    public void marshall(KeyPhrasesDetectionJobProperties keyPhrasesDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (keyPhrasesDetectionJobProperties.getJobId() != null) {
            String jobId = keyPhrasesDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (keyPhrasesDetectionJobProperties.getJobName() != null) {
            String jobName = keyPhrasesDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (keyPhrasesDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = keyPhrasesDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (keyPhrasesDetectionJobProperties.getMessage() != null) {
            String message = keyPhrasesDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (keyPhrasesDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = keyPhrasesDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (keyPhrasesDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = keyPhrasesDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (keyPhrasesDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = keyPhrasesDetectionJobProperties.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (keyPhrasesDetectionJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = keyPhrasesDetectionJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (keyPhrasesDetectionJobProperties.getLanguageCode() != null) {
            String languageCode = keyPhrasesDetectionJobProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (keyPhrasesDetectionJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = keyPhrasesDetectionJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static KeyPhrasesDetectionJobPropertiesJsonMarshaller instance;

    public static KeyPhrasesDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KeyPhrasesDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
