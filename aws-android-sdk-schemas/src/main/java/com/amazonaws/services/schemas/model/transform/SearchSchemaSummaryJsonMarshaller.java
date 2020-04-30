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

package com.amazonaws.services.schemas.model.transform;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchSchemaSummary
 */
class SearchSchemaSummaryJsonMarshaller {

    public void marshall(SearchSchemaSummary searchSchemaSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (searchSchemaSummary.getRegistryName() != null) {
            String registryName = searchSchemaSummary.getRegistryName();
            jsonWriter.name("RegistryName");
            jsonWriter.value(registryName);
        }
        if (searchSchemaSummary.getSchemaArn() != null) {
            String schemaArn = searchSchemaSummary.getSchemaArn();
            jsonWriter.name("SchemaArn");
            jsonWriter.value(schemaArn);
        }
        if (searchSchemaSummary.getSchemaName() != null) {
            String schemaName = searchSchemaSummary.getSchemaName();
            jsonWriter.name("SchemaName");
            jsonWriter.value(schemaName);
        }
        if (searchSchemaSummary.getSchemaVersions() != null) {
            java.util.List<SearchSchemaVersionSummary> schemaVersions = searchSchemaSummary
                    .getSchemaVersions();
            jsonWriter.name("SchemaVersions");
            jsonWriter.beginArray();
            for (SearchSchemaVersionSummary schemaVersionsItem : schemaVersions) {
                if (schemaVersionsItem != null) {
                    SearchSchemaVersionSummaryJsonMarshaller.getInstance().marshall(
                            schemaVersionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SearchSchemaSummaryJsonMarshaller instance;

    public static SearchSchemaSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchSchemaSummaryJsonMarshaller();
        return instance;
    }
}
