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
 * JSON marshaller for POJO HumanLoopConfig
 */
class HumanLoopConfigJsonMarshaller {

    public void marshall(HumanLoopConfig humanLoopConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (humanLoopConfig.getWorkteamArn() != null) {
            String workteamArn = humanLoopConfig.getWorkteamArn();
            jsonWriter.name("WorkteamArn");
            jsonWriter.value(workteamArn);
        }
        if (humanLoopConfig.getHumanTaskUiArn() != null) {
            String humanTaskUiArn = humanLoopConfig.getHumanTaskUiArn();
            jsonWriter.name("HumanTaskUiArn");
            jsonWriter.value(humanTaskUiArn);
        }
        if (humanLoopConfig.getTaskTitle() != null) {
            String taskTitle = humanLoopConfig.getTaskTitle();
            jsonWriter.name("TaskTitle");
            jsonWriter.value(taskTitle);
        }
        if (humanLoopConfig.getTaskDescription() != null) {
            String taskDescription = humanLoopConfig.getTaskDescription();
            jsonWriter.name("TaskDescription");
            jsonWriter.value(taskDescription);
        }
        if (humanLoopConfig.getTaskCount() != null) {
            Integer taskCount = humanLoopConfig.getTaskCount();
            jsonWriter.name("TaskCount");
            jsonWriter.value(taskCount);
        }
        if (humanLoopConfig.getTaskAvailabilityLifetimeInSeconds() != null) {
            Integer taskAvailabilityLifetimeInSeconds = humanLoopConfig
                    .getTaskAvailabilityLifetimeInSeconds();
            jsonWriter.name("TaskAvailabilityLifetimeInSeconds");
            jsonWriter.value(taskAvailabilityLifetimeInSeconds);
        }
        if (humanLoopConfig.getTaskTimeLimitInSeconds() != null) {
            Integer taskTimeLimitInSeconds = humanLoopConfig.getTaskTimeLimitInSeconds();
            jsonWriter.name("TaskTimeLimitInSeconds");
            jsonWriter.value(taskTimeLimitInSeconds);
        }
        if (humanLoopConfig.getTaskKeywords() != null) {
            java.util.List<String> taskKeywords = humanLoopConfig.getTaskKeywords();
            jsonWriter.name("TaskKeywords");
            jsonWriter.beginArray();
            for (String taskKeywordsItem : taskKeywords) {
                if (taskKeywordsItem != null) {
                    jsonWriter.value(taskKeywordsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (humanLoopConfig.getPublicWorkforceTaskPrice() != null) {
            PublicWorkforceTaskPrice publicWorkforceTaskPrice = humanLoopConfig
                    .getPublicWorkforceTaskPrice();
            jsonWriter.name("PublicWorkforceTaskPrice");
            PublicWorkforceTaskPriceJsonMarshaller.getInstance().marshall(publicWorkforceTaskPrice,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HumanLoopConfigJsonMarshaller instance;

    public static HumanLoopConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HumanLoopConfigJsonMarshaller();
        return instance;
    }
}
