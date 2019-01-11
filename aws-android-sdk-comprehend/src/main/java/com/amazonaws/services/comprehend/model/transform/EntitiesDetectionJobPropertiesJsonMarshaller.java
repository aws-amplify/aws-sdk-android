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
 * JSON marshaller for POJO EntitiesDetectionJobProperties
 */
class EntitiesDetectionJobPropertiesJsonMarshaller {

    public void marshall(EntitiesDetectionJobProperties entitiesDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entitiesDetectionJobProperties.getJobId() != null) {
            String jobId = entitiesDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (entitiesDetectionJobProperties.getJobName() != null) {
            String jobName = entitiesDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (entitiesDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = entitiesDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (entitiesDetectionJobProperties.getMessage() != null) {
            String message = entitiesDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (entitiesDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = entitiesDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (entitiesDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = entitiesDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (entitiesDetectionJobProperties.getEntityRecognizerArn() != null) {
            String entityRecognizerArn = entitiesDetectionJobProperties.getEntityRecognizerArn();
            jsonWriter.name("EntityRecognizerArn");
            jsonWriter.value(entityRecognizerArn);
        }
        if (entitiesDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = entitiesDetectionJobProperties.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (entitiesDetectionJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = entitiesDetectionJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (entitiesDetectionJobProperties.getLanguageCode() != null) {
            String languageCode = entitiesDetectionJobProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (entitiesDetectionJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = entitiesDetectionJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        jsonWriter.endObject();
    }

    private static EntitiesDetectionJobPropertiesJsonMarshaller instance;

    public static EntitiesDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntitiesDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
