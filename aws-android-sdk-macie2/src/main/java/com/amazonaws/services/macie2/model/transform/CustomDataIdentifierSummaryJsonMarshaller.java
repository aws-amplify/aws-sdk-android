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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomDataIdentifierSummary
 */
class CustomDataIdentifierSummaryJsonMarshaller {

    public void marshall(CustomDataIdentifierSummary customDataIdentifierSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (customDataIdentifierSummary.getArn() != null) {
            String arn = customDataIdentifierSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (customDataIdentifierSummary.getCreatedAt() != null) {
            java.util.Date createdAt = customDataIdentifierSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (customDataIdentifierSummary.getDescription() != null) {
            String description = customDataIdentifierSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (customDataIdentifierSummary.getId() != null) {
            String id = customDataIdentifierSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (customDataIdentifierSummary.getName() != null) {
            String name = customDataIdentifierSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static CustomDataIdentifierSummaryJsonMarshaller instance;

    public static CustomDataIdentifierSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomDataIdentifierSummaryJsonMarshaller();
        return instance;
    }
}
