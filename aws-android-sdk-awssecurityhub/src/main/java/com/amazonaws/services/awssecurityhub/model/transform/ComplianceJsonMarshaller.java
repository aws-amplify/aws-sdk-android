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
 * JSON marshaller for POJO Compliance
 */
class ComplianceJsonMarshaller {

    public void marshall(Compliance compliance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (compliance.getStatus() != null) {
            String status = compliance.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (compliance.getRelatedRequirements() != null) {
            java.util.List<String> relatedRequirements = compliance.getRelatedRequirements();
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

    private static ComplianceJsonMarshaller instance;

    public static ComplianceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComplianceJsonMarshaller();
        return instance;
    }
}
