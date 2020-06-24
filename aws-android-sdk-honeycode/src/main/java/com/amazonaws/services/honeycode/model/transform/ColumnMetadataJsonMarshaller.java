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

package com.amazonaws.services.honeycode.model.transform;

import com.amazonaws.services.honeycode.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ColumnMetadata
 */
class ColumnMetadataJsonMarshaller {

    public void marshall(ColumnMetadata columnMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (columnMetadata.getName() != null) {
            String name = columnMetadata.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (columnMetadata.getFormat() != null) {
            String format = columnMetadata.getFormat();
            jsonWriter.name("format");
            jsonWriter.value(format);
        }
        jsonWriter.endObject();
    }

    private static ColumnMetadataJsonMarshaller instance;

    public static ColumnMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnMetadataJsonMarshaller();
        return instance;
    }
}
