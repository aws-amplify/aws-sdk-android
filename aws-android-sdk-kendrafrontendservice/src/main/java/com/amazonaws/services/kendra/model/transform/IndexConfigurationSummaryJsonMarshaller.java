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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IndexConfigurationSummary
 */
class IndexConfigurationSummaryJsonMarshaller {

    public void marshall(IndexConfigurationSummary indexConfigurationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (indexConfigurationSummary.getName() != null) {
            String name = indexConfigurationSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (indexConfigurationSummary.getId() != null) {
            String id = indexConfigurationSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (indexConfigurationSummary.getEdition() != null) {
            String edition = indexConfigurationSummary.getEdition();
            jsonWriter.name("Edition");
            jsonWriter.value(edition);
        }
        if (indexConfigurationSummary.getCreatedAt() != null) {
            java.util.Date createdAt = indexConfigurationSummary.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (indexConfigurationSummary.getUpdatedAt() != null) {
            java.util.Date updatedAt = indexConfigurationSummary.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        if (indexConfigurationSummary.getStatus() != null) {
            String status = indexConfigurationSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static IndexConfigurationSummaryJsonMarshaller instance;

    public static IndexConfigurationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IndexConfigurationSummaryJsonMarshaller();
        return instance;
    }
}
