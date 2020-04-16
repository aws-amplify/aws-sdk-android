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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TableVersionError
 */
class TableVersionErrorJsonMarshaller {

    public void marshall(TableVersionError tableVersionError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tableVersionError.getTableName() != null) {
            String tableName = tableVersionError.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (tableVersionError.getVersionId() != null) {
            String versionId = tableVersionError.getVersionId();
            jsonWriter.name("VersionId");
            jsonWriter.value(versionId);
        }
        if (tableVersionError.getErrorDetail() != null) {
            ErrorDetail errorDetail = tableVersionError.getErrorDetail();
            jsonWriter.name("ErrorDetail");
            ErrorDetailJsonMarshaller.getInstance().marshall(errorDetail, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TableVersionErrorJsonMarshaller instance;

    public static TableVersionErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableVersionErrorJsonMarshaller();
        return instance;
    }
}
