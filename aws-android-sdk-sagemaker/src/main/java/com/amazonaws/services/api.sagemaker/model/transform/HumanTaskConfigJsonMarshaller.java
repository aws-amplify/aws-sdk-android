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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HumanTaskConfig
 */
class HumanTaskConfigJsonMarshaller {

    public void marshall(HumanTaskConfig humanTaskConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (humanTaskConfig.getWorkteamArn() != null) {
            String workteamArn = humanTaskConfig.getWorkteamArn();
            jsonWriter.name("WorkteamArn");
            jsonWriter.value(workteamArn);
        }
        if (humanTaskConfig.getUiConfig() != null) {
            UiConfig uiConfig = humanTaskConfig.getUiConfig();
            jsonWriter.name("UiConfig");
            UiConfigJsonMarshaller.getInstance().marshall(uiConfig, jsonWriter);
        }
        if (humanTaskConfig.getPreHumanTaskLambdaArn() != null) {
            String preHumanTaskLambdaArn = humanTaskConfig.getPreHumanTaskLambdaArn();
            jsonWriter.name("PreHumanTaskLambdaArn");
            jsonWriter.value(preHumanTaskLambdaArn);
        }
        if (humanTaskConfig.getTaskKeywords() != null) {
            java.util.List<String> taskKeywords = humanTaskConfig.getTaskKeywords();
            jsonWriter.name("TaskKeywords");
            jsonWriter.beginArray();
            for (String taskKeywordsItem : taskKeywords) {
                if (taskKeywordsItem != null) {
                    jsonWriter.value(taskKeywordsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (humanTaskConfig.getTaskTitle() != null) {
            String taskTitle = humanTaskConfig.getTaskTitle();
            jsonWriter.name("TaskTitle");
            jsonWriter.value(taskTitle);
        }
        if (humanTaskConfig.getTaskDescription() != null) {
            String taskDescription = humanTaskConfig.getTaskDescription();
            jsonWriter.name("TaskDescription");
            jsonWriter.value(taskDescription);
        }
        if (humanTaskConfig.getNumberOfHumanWorkersPerDataObject() != null) {
            Integer numberOfHumanWorkersPerDataObject = humanTaskConfig
                    .getNumberOfHumanWorkersPerDataObject();
            jsonWriter.name("NumberOfHumanWorkersPerDataObject");
            jsonWriter.value(numberOfHumanWorkersPerDataObject);
        }
        if (humanTaskConfig.getTaskTimeLimitInSeconds() != null) {
            Integer taskTimeLimitInSeconds = humanTaskConfig.getTaskTimeLimitInSeconds();
            jsonWriter.name("TaskTimeLimitInSeconds");
            jsonWriter.value(taskTimeLimitInSeconds);
        }
        if (humanTaskConfig.getTaskAvailabilityLifetimeInSeconds() != null) {
            Integer taskAvailabilityLifetimeInSeconds = humanTaskConfig
                    .getTaskAvailabilityLifetimeInSeconds();
            jsonWriter.name("TaskAvailabilityLifetimeInSeconds");
            jsonWriter.value(taskAvailabilityLifetimeInSeconds);
        }
        if (humanTaskConfig.getMaxConcurrentTaskCount() != null) {
            Integer maxConcurrentTaskCount = humanTaskConfig.getMaxConcurrentTaskCount();
            jsonWriter.name("MaxConcurrentTaskCount");
            jsonWriter.value(maxConcurrentTaskCount);
        }
        if (humanTaskConfig.getAnnotationConsolidationConfig() != null) {
            AnnotationConsolidationConfig annotationConsolidationConfig = humanTaskConfig
                    .getAnnotationConsolidationConfig();
            jsonWriter.name("AnnotationConsolidationConfig");
            AnnotationConsolidationConfigJsonMarshaller.getInstance().marshall(
                    annotationConsolidationConfig, jsonWriter);
        }
        if (humanTaskConfig.getPublicWorkforceTaskPrice() != null) {
            PublicWorkforceTaskPrice publicWorkforceTaskPrice = humanTaskConfig
                    .getPublicWorkforceTaskPrice();
            jsonWriter.name("PublicWorkforceTaskPrice");
            PublicWorkforceTaskPriceJsonMarshaller.getInstance().marshall(publicWorkforceTaskPrice,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HumanTaskConfigJsonMarshaller instance;

    public static HumanTaskConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HumanTaskConfigJsonMarshaller();
        return instance;
    }
}
