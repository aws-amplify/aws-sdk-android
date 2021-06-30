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
 * JSON marshaller for POJO JobTemplateSummary
 */
class JobTemplateSummaryJsonMarshaller {

    public void marshall(JobTemplateSummary jobTemplateSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (jobTemplateSummary.getJobTemplateArn() != null) {
            String jobTemplateArn = jobTemplateSummary.getJobTemplateArn();
            jsonWriter.name("jobTemplateArn");
            jsonWriter.value(jobTemplateArn);
        }
        if (jobTemplateSummary.getJobTemplateId() != null) {
            String jobTemplateId = jobTemplateSummary.getJobTemplateId();
            jsonWriter.name("jobTemplateId");
            jsonWriter.value(jobTemplateId);
        }
        if (jobTemplateSummary.getDescription() != null) {
            String description = jobTemplateSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (jobTemplateSummary.getCreatedAt() != null) {
            java.util.Date createdAt = jobTemplateSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        jsonWriter.endObject();
    }

    private static JobTemplateSummaryJsonMarshaller instance;

    public static JobTemplateSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobTemplateSummaryJsonMarshaller();
        return instance;
    }
}
