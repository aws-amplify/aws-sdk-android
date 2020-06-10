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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecommendationExportJob
 */
class RecommendationExportJobJsonMarshaller {

    public void marshall(RecommendationExportJob recommendationExportJob, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recommendationExportJob.getJobId() != null) {
            String jobId = recommendationExportJob.getJobId();
            jsonWriter.name("jobId");
            jsonWriter.value(jobId);
        }
        if (recommendationExportJob.getDestination() != null) {
            ExportDestination destination = recommendationExportJob.getDestination();
            jsonWriter.name("destination");
            ExportDestinationJsonMarshaller.getInstance().marshall(destination, jsonWriter);
        }
        if (recommendationExportJob.getResourceType() != null) {
            String resourceType = recommendationExportJob.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (recommendationExportJob.getStatus() != null) {
            String status = recommendationExportJob.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (recommendationExportJob.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = recommendationExportJob.getCreationTimestamp();
            jsonWriter.name("creationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (recommendationExportJob.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = recommendationExportJob.getLastUpdatedTimestamp();
            jsonWriter.name("lastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (recommendationExportJob.getFailureReason() != null) {
            String failureReason = recommendationExportJob.getFailureReason();
            jsonWriter.name("failureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static RecommendationExportJobJsonMarshaller instance;
    public static RecommendationExportJobJsonMarshaller getInstance() {
        if (instance == null) instance = new RecommendationExportJobJsonMarshaller();
        return instance;
    }
}
