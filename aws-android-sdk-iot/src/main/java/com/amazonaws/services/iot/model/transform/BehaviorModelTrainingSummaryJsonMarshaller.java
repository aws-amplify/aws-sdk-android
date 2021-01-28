/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BehaviorModelTrainingSummary
 */
class BehaviorModelTrainingSummaryJsonMarshaller {

    public void marshall(BehaviorModelTrainingSummary behaviorModelTrainingSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (behaviorModelTrainingSummary.getSecurityProfileName() != null) {
            String securityProfileName = behaviorModelTrainingSummary.getSecurityProfileName();
            jsonWriter.name("securityProfileName");
            jsonWriter.value(securityProfileName);
        }
        if (behaviorModelTrainingSummary.getBehaviorName() != null) {
            String behaviorName = behaviorModelTrainingSummary.getBehaviorName();
            jsonWriter.name("behaviorName");
            jsonWriter.value(behaviorName);
        }
        if (behaviorModelTrainingSummary.getTrainingDataCollectionStartDate() != null) {
            java.util.Date trainingDataCollectionStartDate = behaviorModelTrainingSummary
                    .getTrainingDataCollectionStartDate();
            jsonWriter.name("trainingDataCollectionStartDate");
            jsonWriter.value(trainingDataCollectionStartDate);
        }
        if (behaviorModelTrainingSummary.getModelStatus() != null) {
            String modelStatus = behaviorModelTrainingSummary.getModelStatus();
            jsonWriter.name("modelStatus");
            jsonWriter.value(modelStatus);
        }
        if (behaviorModelTrainingSummary.getDatapointsCollectionPercentage() != null) {
            Double datapointsCollectionPercentage = behaviorModelTrainingSummary
                    .getDatapointsCollectionPercentage();
            jsonWriter.name("datapointsCollectionPercentage");
            jsonWriter.value(datapointsCollectionPercentage);
        }
        if (behaviorModelTrainingSummary.getLastModelRefreshDate() != null) {
            java.util.Date lastModelRefreshDate = behaviorModelTrainingSummary
                    .getLastModelRefreshDate();
            jsonWriter.name("lastModelRefreshDate");
            jsonWriter.value(lastModelRefreshDate);
        }
        jsonWriter.endObject();
    }

    private static BehaviorModelTrainingSummaryJsonMarshaller instance;

    public static BehaviorModelTrainingSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BehaviorModelTrainingSummaryJsonMarshaller();
        return instance;
    }
}
