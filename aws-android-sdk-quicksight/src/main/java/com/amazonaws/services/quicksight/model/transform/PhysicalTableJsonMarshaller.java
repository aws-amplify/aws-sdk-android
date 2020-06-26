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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PhysicalTable
 */
class PhysicalTableJsonMarshaller {

    public void marshall(PhysicalTable physicalTable, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (physicalTable.getRelationalTable() != null) {
            RelationalTable relationalTable = physicalTable.getRelationalTable();
            jsonWriter.name("RelationalTable");
            RelationalTableJsonMarshaller.getInstance().marshall(relationalTable, jsonWriter);
        }
        if (physicalTable.getCustomSql() != null) {
            CustomSql customSql = physicalTable.getCustomSql();
            jsonWriter.name("CustomSql");
            CustomSqlJsonMarshaller.getInstance().marshall(customSql, jsonWriter);
        }
        if (physicalTable.getS3Source() != null) {
            S3Source s3Source = physicalTable.getS3Source();
            jsonWriter.name("S3Source");
            S3SourceJsonMarshaller.getInstance().marshall(s3Source, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PhysicalTableJsonMarshaller instance;

    public static PhysicalTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PhysicalTableJsonMarshaller();
        return instance;
    }
}
