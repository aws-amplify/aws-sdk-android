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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SearchSchemaSummary
 */
class SearchSchemaSummaryJsonUnmarshaller implements
        Unmarshaller<SearchSchemaSummary, JsonUnmarshallerContext> {

    public SearchSchemaSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SearchSchemaSummary searchSchemaSummary = new SearchSchemaSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RegistryName")) {
                searchSchemaSummary.setRegistryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaArn")) {
                searchSchemaSummary.setSchemaArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaName")) {
                searchSchemaSummary.setSchemaName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaVersions")) {
                searchSchemaSummary
                        .setSchemaVersions(new ListUnmarshaller<SearchSchemaVersionSummary>(
                                SearchSchemaVersionSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchSchemaSummary;
    }

    private static SearchSchemaSummaryJsonUnmarshaller instance;

    public static SearchSchemaSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchSchemaSummaryJsonUnmarshaller();
        return instance;
    }
}
