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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SolutionVersion
 */
class SolutionVersionJsonMarshaller {

    public void marshall(SolutionVersion solutionVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (solutionVersion.getSolutionVersionArn() != null) {
            String solutionVersionArn = solutionVersion.getSolutionVersionArn();
            jsonWriter.name("solutionVersionArn");
            jsonWriter.value(solutionVersionArn);
        }
        if (solutionVersion.getSolutionArn() != null) {
            String solutionArn = solutionVersion.getSolutionArn();
            jsonWriter.name("solutionArn");
            jsonWriter.value(solutionArn);
        }
        if (solutionVersion.getPerformHPO() != null) {
            Boolean performHPO = solutionVersion.getPerformHPO();
            jsonWriter.name("performHPO");
            jsonWriter.value(performHPO);
        }
        if (solutionVersion.getPerformAutoML() != null) {
            Boolean performAutoML = solutionVersion.getPerformAutoML();
            jsonWriter.name("performAutoML");
            jsonWriter.value(performAutoML);
        }
        if (solutionVersion.getRecipeArn() != null) {
            String recipeArn = solutionVersion.getRecipeArn();
            jsonWriter.name("recipeArn");
            jsonWriter.value(recipeArn);
        }
        if (solutionVersion.getEventType() != null) {
            String eventType = solutionVersion.getEventType();
            jsonWriter.name("eventType");
            jsonWriter.value(eventType);
        }
        if (solutionVersion.getDatasetGroupArn() != null) {
            String datasetGroupArn = solutionVersion.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (solutionVersion.getSolutionConfig() != null) {
            SolutionConfig solutionConfig = solutionVersion.getSolutionConfig();
            jsonWriter.name("solutionConfig");
            SolutionConfigJsonMarshaller.getInstance().marshall(solutionConfig, jsonWriter);
        }
        if (solutionVersion.getTrainingHours() != null) {
            Double trainingHours = solutionVersion.getTrainingHours();
            jsonWriter.name("trainingHours");
            jsonWriter.value(trainingHours);
        }
        if (solutionVersion.getTrainingMode() != null) {
            String trainingMode = solutionVersion.getTrainingMode();
            jsonWriter.name("trainingMode");
            jsonWriter.value(trainingMode);
        }
        if (solutionVersion.getTunedHPOParams() != null) {
            TunedHPOParams tunedHPOParams = solutionVersion.getTunedHPOParams();
            jsonWriter.name("tunedHPOParams");
            TunedHPOParamsJsonMarshaller.getInstance().marshall(tunedHPOParams, jsonWriter);
        }
        if (solutionVersion.getStatus() != null) {
            String status = solutionVersion.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (solutionVersion.getFailureReason() != null) {
            String failureReason = solutionVersion.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        if (solutionVersion.getCreationDateTime() != null) {
            java.util.Date creationDateTime = solutionVersion.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (solutionVersion.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = solutionVersion.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static SolutionVersionJsonMarshaller instance;

    public static SolutionVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SolutionVersionJsonMarshaller();
        return instance;
    }
}
