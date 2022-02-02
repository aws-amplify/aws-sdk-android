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
 * JSON marshaller for POJO PiiEntitiesDetectionJobProperties
 */
class PiiEntitiesDetectionJobPropertiesJsonMarshaller {

    public void marshall(PiiEntitiesDetectionJobProperties piiEntitiesDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (piiEntitiesDetectionJobProperties.getJobId() != null) {
            String jobId = piiEntitiesDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (piiEntitiesDetectionJobProperties.getJobArn() != null) {
            String jobArn = piiEntitiesDetectionJobProperties.getJobArn();
            jsonWriter.name("JobArn");
            jsonWriter.value(jobArn);
        }
        if (piiEntitiesDetectionJobProperties.getJobName() != null) {
            String jobName = piiEntitiesDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (piiEntitiesDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = piiEntitiesDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (piiEntitiesDetectionJobProperties.getMessage() != null) {
            String message = piiEntitiesDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (piiEntitiesDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = piiEntitiesDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (piiEntitiesDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = piiEntitiesDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (piiEntitiesDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = piiEntitiesDetectionJobProperties
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (piiEntitiesDetectionJobProperties.getOutputDataConfig() != null) {
            PiiOutputDataConfig outputDataConfig = piiEntitiesDetectionJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            PiiOutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (piiEntitiesDetectionJobProperties.getRedactionConfig() != null) {
            RedactionConfig redactionConfig = piiEntitiesDetectionJobProperties
                    .getRedactionConfig();
            jsonWriter.name("RedactionConfig");
            RedactionConfigJsonMarshaller.getInstance().marshall(redactionConfig, jsonWriter);
        }
        if (piiEntitiesDetectionJobProperties.getLanguageCode() != null) {
            String languageCode = piiEntitiesDetectionJobProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (piiEntitiesDetectionJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = piiEntitiesDetectionJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (piiEntitiesDetectionJobProperties.getMode() != null) {
            String mode = piiEntitiesDetectionJobProperties.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        jsonWriter.endObject();
    }

    private static PiiEntitiesDetectionJobPropertiesJsonMarshaller instance;

    public static PiiEntitiesDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PiiEntitiesDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
