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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Deployment
 */
class DeploymentJsonMarshaller {

    public void marshall(Deployment deployment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deployment.getId() != null) {
            String id = deployment.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (deployment.getDescription() != null) {
            String description = deployment.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (deployment.getCreatedDate() != null) {
            java.util.Date createdDate = deployment.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (deployment.getApiSummary() != null) {
            java.util.Map<String, java.util.Map<String, MethodSnapshot>> apiSummary = deployment
                    .getApiSummary();
            jsonWriter.name("apiSummary");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.Map<String, MethodSnapshot>> apiSummaryEntry : apiSummary
                    .entrySet()) {
                java.util.Map<String, MethodSnapshot> apiSummaryValue = apiSummaryEntry.getValue();
                if (apiSummaryValue != null) {
                    jsonWriter.name(apiSummaryEntry.getKey());
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<String, MethodSnapshot> apiSummaryValueEntry : apiSummaryValue
                            .entrySet()) {
                        MethodSnapshot apiSummaryValueValue = apiSummaryValueEntry.getValue();
                        if (apiSummaryValueValue != null) {
                            jsonWriter.name(apiSummaryValueEntry.getKey());
                            MethodSnapshotJsonMarshaller.getInstance().marshall(
                                    apiSummaryValueValue, jsonWriter);
                        }
                    }
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static DeploymentJsonMarshaller instance;

    public static DeploymentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonMarshaller();
        return instance;
    }
}
