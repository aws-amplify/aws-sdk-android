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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TemplateVersionSummary
 */
class TemplateVersionSummaryJsonMarshaller {

    public void marshall(TemplateVersionSummary templateVersionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (templateVersionSummary.getArn() != null) {
            String arn = templateVersionSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (templateVersionSummary.getVersionNumber() != null) {
            Long versionNumber = templateVersionSummary.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        if (templateVersionSummary.getCreatedTime() != null) {
            java.util.Date createdTime = templateVersionSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (templateVersionSummary.getStatus() != null) {
            String status = templateVersionSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (templateVersionSummary.getDescription() != null) {
            String description = templateVersionSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static TemplateVersionSummaryJsonMarshaller instance;

    public static TemplateVersionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateVersionSummaryJsonMarshaller();
        return instance;
    }
}
