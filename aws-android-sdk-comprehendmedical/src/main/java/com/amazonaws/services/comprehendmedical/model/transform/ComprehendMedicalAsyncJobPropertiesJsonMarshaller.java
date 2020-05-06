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

package com.amazonaws.services.comprehendmedical.model.transform;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComprehendMedicalAsyncJobProperties
 */
class ComprehendMedicalAsyncJobPropertiesJsonMarshaller {

    public void marshall(ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (comprehendMedicalAsyncJobProperties.getJobId() != null) {
            String jobId = comprehendMedicalAsyncJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (comprehendMedicalAsyncJobProperties.getJobName() != null) {
            String jobName = comprehendMedicalAsyncJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (comprehendMedicalAsyncJobProperties.getJobStatus() != null) {
            String jobStatus = comprehendMedicalAsyncJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (comprehendMedicalAsyncJobProperties.getMessage() != null) {
            String message = comprehendMedicalAsyncJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (comprehendMedicalAsyncJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = comprehendMedicalAsyncJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (comprehendMedicalAsyncJobProperties.getEndTime() != null) {
            java.util.Date endTime = comprehendMedicalAsyncJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (comprehendMedicalAsyncJobProperties.getExpirationTime() != null) {
            java.util.Date expirationTime = comprehendMedicalAsyncJobProperties.getExpirationTime();
            jsonWriter.name("ExpirationTime");
            jsonWriter.value(expirationTime);
        }
        if (comprehendMedicalAsyncJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = comprehendMedicalAsyncJobProperties
                    .getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (comprehendMedicalAsyncJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = comprehendMedicalAsyncJobProperties
                    .getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (comprehendMedicalAsyncJobProperties.getLanguageCode() != null) {
            String languageCode = comprehendMedicalAsyncJobProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (comprehendMedicalAsyncJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = comprehendMedicalAsyncJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (comprehendMedicalAsyncJobProperties.getManifestFilePath() != null) {
            String manifestFilePath = comprehendMedicalAsyncJobProperties.getManifestFilePath();
            jsonWriter.name("ManifestFilePath");
            jsonWriter.value(manifestFilePath);
        }
        if (comprehendMedicalAsyncJobProperties.getKMSKey() != null) {
            String kMSKey = comprehendMedicalAsyncJobProperties.getKMSKey();
            jsonWriter.name("KMSKey");
            jsonWriter.value(kMSKey);
        }
        if (comprehendMedicalAsyncJobProperties.getModelVersion() != null) {
            String modelVersion = comprehendMedicalAsyncJobProperties.getModelVersion();
            jsonWriter.name("ModelVersion");
            jsonWriter.value(modelVersion);
        }
        jsonWriter.endObject();
    }

    private static ComprehendMedicalAsyncJobPropertiesJsonMarshaller instance;

    public static ComprehendMedicalAsyncJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComprehendMedicalAsyncJobPropertiesJsonMarshaller();
        return instance;
    }
}
