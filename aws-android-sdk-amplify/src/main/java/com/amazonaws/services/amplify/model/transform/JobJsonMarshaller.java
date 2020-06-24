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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Job
 */
class JobJsonMarshaller {

    public void marshall(Job job, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (job.getSummary() != null) {
            JobSummary summary = job.getSummary();
            jsonWriter.name("summary");
            JobSummaryJsonMarshaller.getInstance().marshall(summary, jsonWriter);
        }
        if (job.getSteps() != null) {
            java.util.List<Step> steps = job.getSteps();
            jsonWriter.name("steps");
            jsonWriter.beginArray();
            for (Step stepsItem : steps) {
                if (stepsItem != null) {
                    StepJsonMarshaller.getInstance().marshall(stepsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }
}
