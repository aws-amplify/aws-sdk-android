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
 * JSON marshaller for POJO Solution
 */
class SolutionJsonMarshaller {

    public void marshall(Solution solution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (solution.getName() != null) {
            String name = solution.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (solution.getSolutionArn() != null) {
            String solutionArn = solution.getSolutionArn();
            jsonWriter.name("solutionArn");
            jsonWriter.value(solutionArn);
        }
        if (solution.getPerformHPO() != null) {
            Boolean performHPO = solution.getPerformHPO();
            jsonWriter.name("performHPO");
            jsonWriter.value(performHPO);
        }
        if (solution.getPerformAutoML() != null) {
            Boolean performAutoML = solution.getPerformAutoML();
            jsonWriter.name("performAutoML");
            jsonWriter.value(performAutoML);
        }
        if (solution.getRecipeArn() != null) {
            String recipeArn = solution.getRecipeArn();
            jsonWriter.name("recipeArn");
            jsonWriter.value(recipeArn);
        }
        if (solution.getDatasetGroupArn() != null) {
            String datasetGroupArn = solution.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (solution.getEventType() != null) {
            String eventType = solution.getEventType();
            jsonWriter.name("eventType");
            jsonWriter.value(eventType);
        }
        if (solution.getSolutionConfig() != null) {
            SolutionConfig solutionConfig = solution.getSolutionConfig();
            jsonWriter.name("solutionConfig");
            SolutionConfigJsonMarshaller.getInstance().marshall(solutionConfig, jsonWriter);
        }
        if (solution.getAutoMLResult() != null) {
            AutoMLResult autoMLResult = solution.getAutoMLResult();
            jsonWriter.name("autoMLResult");
            AutoMLResultJsonMarshaller.getInstance().marshall(autoMLResult, jsonWriter);
        }
        if (solution.getStatus() != null) {
            String status = solution.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (solution.getCreationDateTime() != null) {
            java.util.Date creationDateTime = solution.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (solution.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = solution.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        if (solution.getLatestSolutionVersion() != null) {
            SolutionVersionSummary latestSolutionVersion = solution.getLatestSolutionVersion();
            jsonWriter.name("latestSolutionVersion");
            SolutionVersionSummaryJsonMarshaller.getInstance().marshall(latestSolutionVersion,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SolutionJsonMarshaller instance;

    public static SolutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SolutionJsonMarshaller();
        return instance;
    }
}
