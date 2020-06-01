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
 * JSON marshaller for POJO LabelingJobForWorkteamSummary
 */
class LabelingJobForWorkteamSummaryJsonMarshaller {

    public void marshall(LabelingJobForWorkteamSummary labelingJobForWorkteamSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (labelingJobForWorkteamSummary.getLabelingJobName() != null) {
            String labelingJobName = labelingJobForWorkteamSummary.getLabelingJobName();
            jsonWriter.name("LabelingJobName");
            jsonWriter.value(labelingJobName);
        }
        if (labelingJobForWorkteamSummary.getJobReferenceCode() != null) {
            String jobReferenceCode = labelingJobForWorkteamSummary.getJobReferenceCode();
            jsonWriter.name("JobReferenceCode");
            jsonWriter.value(jobReferenceCode);
        }
        if (labelingJobForWorkteamSummary.getWorkRequesterAccountId() != null) {
            String workRequesterAccountId = labelingJobForWorkteamSummary
                    .getWorkRequesterAccountId();
            jsonWriter.name("WorkRequesterAccountId");
            jsonWriter.value(workRequesterAccountId);
        }
        if (labelingJobForWorkteamSummary.getCreationTime() != null) {
            java.util.Date creationTime = labelingJobForWorkteamSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (labelingJobForWorkteamSummary.getLabelCounters() != null) {
            LabelCountersForWorkteam labelCounters = labelingJobForWorkteamSummary
                    .getLabelCounters();
            jsonWriter.name("LabelCounters");
            LabelCountersForWorkteamJsonMarshaller.getInstance()
                    .marshall(labelCounters, jsonWriter);
        }
        if (labelingJobForWorkteamSummary.getNumberOfHumanWorkersPerDataObject() != null) {
            Integer numberOfHumanWorkersPerDataObject = labelingJobForWorkteamSummary
                    .getNumberOfHumanWorkersPerDataObject();
            jsonWriter.name("NumberOfHumanWorkersPerDataObject");
            jsonWriter.value(numberOfHumanWorkersPerDataObject);
        }
        jsonWriter.endObject();
    }

    private static LabelingJobForWorkteamSummaryJsonMarshaller instance;

    public static LabelingJobForWorkteamSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobForWorkteamSummaryJsonMarshaller();
        return instance;
    }
}
