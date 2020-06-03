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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TableVersion
 */
class TableVersionJsonMarshaller {

    public void marshall(TableVersion tableVersion, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tableVersion.getTable() != null) {
            Table table = tableVersion.getTable();
            jsonWriter.name("Table");
            TableJsonMarshaller.getInstance().marshall(table, jsonWriter);
        }
        if (tableVersion.getVersionId() != null) {
            String versionId = tableVersion.getVersionId();
            jsonWriter.name("VersionId");
            jsonWriter.value(versionId);
        }
        jsonWriter.endObject();
    }

    private static TableVersionJsonMarshaller instance;

    public static TableVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableVersionJsonMarshaller();
        return instance;
    }
}
