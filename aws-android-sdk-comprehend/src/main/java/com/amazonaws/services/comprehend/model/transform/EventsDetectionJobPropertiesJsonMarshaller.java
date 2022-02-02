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
 * JSON marshaller for POJO EventsDetectionJobProperties
 */
class EventsDetectionJobPropertiesJsonMarshaller {

    public void marshall(EventsDetectionJobProperties eventsDetectionJobProperties,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventsDetectionJobProperties.getJobId() != null) {
            String jobId = eventsDetectionJobProperties.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (eventsDetectionJobProperties.getJobArn() != null) {
            String jobArn = eventsDetectionJobProperties.getJobArn();
            jsonWriter.name("JobArn");
            jsonWriter.value(jobArn);
        }
        if (eventsDetectionJobProperties.getJobName() != null) {
            String jobName = eventsDetectionJobProperties.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (eventsDetectionJobProperties.getJobStatus() != null) {
            String jobStatus = eventsDetectionJobProperties.getJobStatus();
            jsonWriter.name("JobStatus");
            jsonWriter.value(jobStatus);
        }
        if (eventsDetectionJobProperties.getMessage() != null) {
            String message = eventsDetectionJobProperties.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (eventsDetectionJobProperties.getSubmitTime() != null) {
            java.util.Date submitTime = eventsDetectionJobProperties.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        if (eventsDetectionJobProperties.getEndTime() != null) {
            java.util.Date endTime = eventsDetectionJobProperties.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (eventsDetectionJobProperties.getInputDataConfig() != null) {
            InputDataConfig inputDataConfig = eventsDetectionJobProperties.getInputDataConfig();
            jsonWriter.name("InputDataConfig");
            InputDataConfigJsonMarshaller.getInstance().marshall(inputDataConfig, jsonWriter);
        }
        if (eventsDetectionJobProperties.getOutputDataConfig() != null) {
            OutputDataConfig outputDataConfig = eventsDetectionJobProperties.getOutputDataConfig();
            jsonWriter.name("OutputDataConfig");
            OutputDataConfigJsonMarshaller.getInstance().marshall(outputDataConfig, jsonWriter);
        }
        if (eventsDetectionJobProperties.getLanguageCode() != null) {
            String languageCode = eventsDetectionJobProperties.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (eventsDetectionJobProperties.getDataAccessRoleArn() != null) {
            String dataAccessRoleArn = eventsDetectionJobProperties.getDataAccessRoleArn();
            jsonWriter.name("DataAccessRoleArn");
            jsonWriter.value(dataAccessRoleArn);
        }
        if (eventsDetectionJobProperties.getTargetEventTypes() != null) {
            java.util.List<String> targetEventTypes = eventsDetectionJobProperties
                    .getTargetEventTypes();
            jsonWriter.name("TargetEventTypes");
            jsonWriter.beginArray();
            for (String targetEventTypesItem : targetEventTypes) {
                if (targetEventTypesItem != null) {
                    jsonWriter.value(targetEventTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EventsDetectionJobPropertiesJsonMarshaller instance;

    public static EventsDetectionJobPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventsDetectionJobPropertiesJsonMarshaller();
        return instance;
    }
}
