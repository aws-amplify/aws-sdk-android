/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TargetedSentimentDetectionJobProperties
 */
class TargetedSentimentDetectionJobPropertiesJsonMarshaller {

    public void marshall(
            TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (targetedSentimentDetectionJobProperties.getJobId() != null) {
            String jobId = targetedSentimentDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (targetedSentimentDetectionJobProperties.getJobArn() != null) {
            String jobArn = targetedSentimentDetectionJobProperties.getJobArn();
            jsonWriter.name("JobArn");
            jsonWriter.value(jobArn);
        }
        if (targetedSentimentDetectionJobProperties.getJobName() != null) {
            String jobName = targetedSentimentDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (targetedSentimentDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = targetedSentimentDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (targetedSentimentDetectionJobProperties.getMessage() != null) {
            String message = targetedSentimentDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (targetedSentimentDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = targetedSentimentDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (targetedSentimentDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = targetedSentimentDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (targetedSentimentDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = targetedSentimentDetectionJobProperties
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (targetedSentimentDetectionJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = targetedSentimentDetectionJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (targetedSentimentDetectionJobProperties.getLanguageCode() != null) {
            String languageCode = targetedSentimentDetectionJobProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (targetedSentimentDetectionJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = targetedSentimentDetectionJobProperties
                    .getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (targetedSentimentDetectionJobProperties.getVolumeKmsKeyId() != null) {
            String volumeKmsKeyId = targetedSentimentDetectionJobProperties.getVolumeKmsKeyId();
            jsonWriter.name("VolumeKmsKeyId");
            jsonWriter.value(volumeKmsKeyId);
        }
        if (targetedSentimentDetectionJobProperties.getVpcConfig() != null) {
            VpcConfig vpcConfig = targetedSentimentDetectionJobProperties.getVpcConfig();
            jsonWriter.name("VpcConfig");
            VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TargetedSentimentDetectionJobPropertiesJsonMarshaller instance;

    public static TargetedSentimentDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetedSentimentDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
