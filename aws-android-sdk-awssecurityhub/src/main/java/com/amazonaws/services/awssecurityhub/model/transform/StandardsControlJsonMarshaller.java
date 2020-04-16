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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StandardsControl
 */
class StandardsControlJsonMarshaller {

    public void marshall(StandardsControl standardsControl, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (standardsControl.getStandardsControlArn() != null) {
            String standardsControlArn = standardsControl.getStandardsControlArn();
            jsonWriter.name("StandardsControlArn");
            jsonWriter.value(standardsControlArn);
        }
        if (standardsControl.getControlStatus() != null) {
            String controlStatus = standardsControl.getControlStatus();
            jsonWriter.name("ControlStatus");
            jsonWriter.value(controlStatus);
        }
        if (standardsControl.getDisabledReason() != null) {
            String disabledReason = standardsControl.getDisabledReason();
            jsonWriter.name("DisabledReason");
            jsonWriter.value(disabledReason);
        }
        if (standardsControl.getControlStatusUpdatedAt() != null) {
            java.util.Date controlStatusUpdatedAt = standardsControl.getControlStatusUpdatedAt();
            jsonWriter.name("ControlStatusUpdatedAt");
            jsonWriter.value(controlStatusUpdatedAt);
        }
        if (standardsControl.getControlId() != null) {
            String controlId = standardsControl.getControlId();
            jsonWriter.name("ControlId");
            jsonWriter.value(controlId);
        }
        if (standardsControl.getTitle() != null) {
            String title = standardsControl.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (standardsControl.getDescription() != null) {
            String description = standardsControl.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (standardsControl.getRemediationUrl() != null) {
            String remediationUrl = standardsControl.getRemediationUrl();
            jsonWriter.name("RemediationUrl");
            jsonWriter.value(remediationUrl);
        }
        if (standardsControl.getSeverityRating() != null) {
            String severityRating = standardsControl.getSeverityRating();
            jsonWriter.name("SeverityRating");
            jsonWriter.value(severityRating);
        }
        if (standardsControl.getRelatedRequirements() != null) {
            java.util.List<String> relatedRequirements = standardsControl.getRelatedRequirements();
            jsonWriter.name("RelatedRequirements");
            jsonWriter.beginArray();
            for (String relatedRequirementsItem : relatedRequirements) {
                if (relatedRequirementsItem != null) {
                    jsonWriter.value(relatedRequirementsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static StandardsControlJsonMarshaller instance;

    public static StandardsControlJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StandardsControlJsonMarshaller();
        return instance;
    }
}
