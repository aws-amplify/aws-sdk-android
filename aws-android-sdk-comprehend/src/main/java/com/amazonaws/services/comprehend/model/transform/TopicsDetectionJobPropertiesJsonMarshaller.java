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
 * JSON marshaller for POJO TopicsDetectionJobProperties
 */
class TopicsDetectionJobPropertiesJsonMarshaller {

    public void marshall(TopicsDetectionJobProperties topicsDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (topicsDetectionJobProperties.getJobId() != null) {
            String jobId = topicsDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (topicsDetectionJobProperties.getJobName() != null) {
            String jobName = topicsDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (topicsDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = topicsDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (topicsDetectionJobProperties.getMessage() != null) {
            String message = topicsDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (topicsDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = topicsDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (topicsDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = topicsDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (topicsDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = topicsDetectionJobProperties.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (topicsDetectionJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = topicsDetectionJobProperties.getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (topicsDetectionJobProperties.getNumberOfTopics() != null) {
            Integer numberOfTopics = topicsDetectionJobProperties.getNumberOfTopics();
            jsonWriter.name("NumberOfTopics");
            jsonWriter.value(numberOfTopics);
        }
        jsonWriter.endObject();
    }

    private static TopicsDetectionJobPropertiesJsonMarshaller instance;

    public static TopicsDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicsDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
