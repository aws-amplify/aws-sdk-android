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

package com.amazonaws.services.translate.model.transform;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TextTranslationJobProperties
 */
class TextTranslationJobPropertiesJsonMarshaller {

    public void marshall(TextTranslationJobProperties textTranslationJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (textTranslationJobProperties.getJobId() != null) {
            String jobId = textTranslationJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (textTranslationJobProperties.getJobName() != null) {
            String jobName = textTranslationJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (textTranslationJobProperties.getJobStatus() != null) {
            String jobStatus = textTranslationJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (textTranslationJobProperties.getJobDetails() != null) {
            JobDetails jobDetails = textTranslationJobProperties.getJobDetails();
            jsonWriter.name("JobDetails");
            JobDetailsJsonMarshaller.getInstance().marshall(jobDetails, jsonWriter);
        }
        if (textTranslationJobProperties.getSourceLanguageCode() != null) {
            String sourceLanguageCode = textTranslationJobProperties.getSourceLanguageCode();
            jsonWriter.name("SourceLanguageCode");
            jsonWriter.value(sourceLanguageCode);
        }
        if (textTranslationJobProperties.getTargetLanguageCodes() != null) {
            java.util.List<String> targetLanguageCodes = textTranslationJobProperties
                    .getTargetLanguageCodes();
            jsonWriter.name("TargetLanguageCodes");
            jsonWriter.beginArray();
            for (String targetLanguageCodesItem : targetLanguageCodes) {
                if (targetLanguageCodesItem != null) {
                    jsonWriter.value(targetLanguageCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (textTranslationJobProperties.getTerminologyNames() != null) {
            java.util.List<String> terminologyNames = textTranslationJobProperties
                    .getTerminologyNames();
            jsonWriter.name("TerminologyNames");
            jsonWriter.beginArray();
            for (String terminologyNamesItem : terminologyNames) {
                if (terminologyNamesItem != null) {
                    jsonWriter.value(terminologyNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (textTranslationJobProperties.getParallelDataNames() != null) {
            java.util.List<String> parallelDataNames = textTranslationJobProperties
                    .getParallelDataNames();
            jsonWriter.name("ParallelDataNames");
            jsonWriter.beginArray();
            for (String parallelDataNamesItem : parallelDataNames) {
                if (parallelDataNamesItem != null) {
                    jsonWriter.value(parallelDataNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (textTranslationJobProperties.getMessage() != null) {
            String message = textTranslationJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (textTranslationJobProperties.getSubmittedTime() != null) {
            java.util.Date submittedTime = textTranslationJobProperties.getSubmittedTime();
            jsonWriter.name("SubmittedTime");
            jsonWriter.value(submittedTime);
        }
        if (textTranslationJobProperties.getEndTime() != null) {
            java.util.Date endTime = textTranslationJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (textTranslationJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = textTranslationJobProperties.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (textTranslationJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = textTranslationJobProperties.getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (textTranslationJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = textTranslationJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (textTranslationJobProperties.getSettings() != null) {
            TranslationSettings settings = textTranslationJobProperties.getSettings();
            jsonWriter.name("Settings");
            TranslationSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TextTranslationJobPropertiesJsonMarshaller instance;

    public static TextTranslationJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TextTranslationJobPropertiesJsonMarshaller();
        return instance;
    }
}
