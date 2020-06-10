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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO RecommendationExportJob
 */
class RecommendationExportJobJsonUnmarshaller implements Unmarshaller<RecommendationExportJob, JsonUnmarshallerContext> {

    public RecommendationExportJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RecommendationExportJob recommendationExportJob = new RecommendationExportJob();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("jobId")) {
                recommendationExportJob.setJobId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("destination")) {
                recommendationExportJob.setDestination(ExportDestinationJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("resourceType")) {
                recommendationExportJob.setResourceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("status")) {
                recommendationExportJob.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("creationTimestamp")) {
                recommendationExportJob.setCreationTimestamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("lastUpdatedTimestamp")) {
                recommendationExportJob.setLastUpdatedTimestamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("failureReason")) {
                recommendationExportJob.setFailureReason(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recommendationExportJob;
    }

    private static RecommendationExportJobJsonUnmarshaller instance;
    public static RecommendationExportJobJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RecommendationExportJobJsonUnmarshaller();
        return instance;
    }
}
