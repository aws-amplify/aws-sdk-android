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
 * JSON marshaller for POJO DataSourceSummary
 */
class DataSourceSummaryJsonMarshaller {

    public void marshall(DataSourceSummary dataSourceSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dataSourceSummary.getName() != null) {
            String name = dataSourceSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (dataSourceSummary.getId() != null) {
            String id = dataSourceSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (dataSourceSummary.getType() != null) {
            String type = dataSourceSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (dataSourceSummary.getCreatedAt() != null) {
            java.util.Date createdAt = dataSourceSummary.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (dataSourceSummary.getUpdatedAt() != null) {
            java.util.Date updatedAt = dataSourceSummary.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        if (dataSourceSummary.getStatus() != null) {
            String status = dataSourceSummary.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static DataSourceSummaryJsonMarshaller instance;

    public static DataSourceSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSourceSummaryJsonMarshaller();
        return instance;
    }
}
