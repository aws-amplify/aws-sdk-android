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
 * JSON marshaller for POJO MappingEntry
 */
class MappingEntryJsonMarshaller {

    public void marshall(MappingEntry mappingEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mappingEntry.getSourceTable() != null) {
            String sourceTable = mappingEntry.getSourceTable();
            jsonWriter.name("SourceTable");
            jsonWriter.value(sourceTable);
        }
        if (mappingEntry.getSourcePath() != null) {
            String sourcePath = mappingEntry.getSourcePath();
            jsonWriter.name("SourcePath");
            jsonWriter.value(sourcePath);
        }
        if (mappingEntry.getSourceType() != null) {
            String sourceType = mappingEntry.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        if (mappingEntry.getTargetTable() != null) {
            String targetTable = mappingEntry.getTargetTable();
            jsonWriter.name("TargetTable");
            jsonWriter.value(targetTable);
        }
        if (mappingEntry.getTargetPath() != null) {
            String targetPath = mappingEntry.getTargetPath();
            jsonWriter.name("TargetPath");
            jsonWriter.value(targetPath);
        }
        if (mappingEntry.getTargetType() != null) {
            String targetType = mappingEntry.getTargetType();
            jsonWriter.name("TargetType");
            jsonWriter.value(targetType);
        }
        jsonWriter.endObject();
    }

    private static MappingEntryJsonMarshaller instance;

    public static MappingEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MappingEntryJsonMarshaller();
        return instance;
    }
}
