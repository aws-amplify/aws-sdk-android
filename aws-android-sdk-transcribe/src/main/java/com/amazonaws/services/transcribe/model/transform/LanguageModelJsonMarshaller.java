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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LanguageModel
 */
class LanguageModelJsonMarshaller {

    public void marshall(LanguageModel languageModel, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (languageModel.getModelName() != null) {
            String modelName = languageModel.getModelName();
            jsonWriter.name("ModelName");
            jsonWriter.value(modelName);
        }
        if (languageModel.getCreateTime() != null) {
            java.util.Date createTime = languageModel.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (languageModel.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = languageModel.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (languageModel.getLanguageCode() != null) {
            String languageCode = languageModel.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (languageModel.getBaseModelName() != null) {
            String baseModelName = languageModel.getBaseModelName();
            jsonWriter.name("BaseModelName");
            jsonWriter.value(baseModelName);
        }
        if (languageModel.getModelStatus() != null) {
            String modelStatus = languageModel.getModelStatus();
            jsonWriter.name("ModelStatus");
            jsonWriter.value(modelStatus);
        }
        if (languageModel.getUpgradeAvailability() != null) {
            Boolean upgradeAvailability = languageModel.getUpgradeAvailability();
            jsonWriter.name("UpgradeAvailability");
            jsonWriter.value(upgradeAvailability);
        }
        if (languageModel.getFailureReason() != null) {
            String failureReason = languageModel.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (languageModel.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = languageModel.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LanguageModelJsonMarshaller instance;

    public static LanguageModelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LanguageModelJsonMarshaller();
        return instance;
    }
}
