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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TableStatistics
 */
class TableStatisticsJsonMarshaller {

    public void marshall(TableStatistics tableStatistics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tableStatistics.getSchemaName() != null) {
            String schemaName = tableStatistics.getSchemaName();
            jsonWriter.name("SchemaName");
            jsonWriter.value(schemaName);
        }
        if (tableStatistics.getTableName() != null) {
            String tableName = tableStatistics.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (tableStatistics.getInserts() != null) {
            Long inserts = tableStatistics.getInserts();
            jsonWriter.name("Inserts");
            jsonWriter.value(inserts);
        }
        if (tableStatistics.getDeletes() != null) {
            Long deletes = tableStatistics.getDeletes();
            jsonWriter.name("Deletes");
            jsonWriter.value(deletes);
        }
        if (tableStatistics.getUpdates() != null) {
            Long updates = tableStatistics.getUpdates();
            jsonWriter.name("Updates");
            jsonWriter.value(updates);
        }
        if (tableStatistics.getDdls() != null) {
            Long ddls = tableStatistics.getDdls();
            jsonWriter.name("Ddls");
            jsonWriter.value(ddls);
        }
        if (tableStatistics.getFullLoadRows() != null) {
            Long fullLoadRows = tableStatistics.getFullLoadRows();
            jsonWriter.name("FullLoadRows");
            jsonWriter.value(fullLoadRows);
        }
        if (tableStatistics.getFullLoadCondtnlChkFailedRows() != null) {
            Long fullLoadCondtnlChkFailedRows = tableStatistics.getFullLoadCondtnlChkFailedRows();
            jsonWriter.name("FullLoadCondtnlChkFailedRows");
            jsonWriter.value(fullLoadCondtnlChkFailedRows);
        }
        if (tableStatistics.getFullLoadErrorRows() != null) {
            Long fullLoadErrorRows = tableStatistics.getFullLoadErrorRows();
            jsonWriter.name("FullLoadErrorRows");
            jsonWriter.value(fullLoadErrorRows);
        }
        if (tableStatistics.getFullLoadStartTime() != null) {
            java.util.Date fullLoadStartTime = tableStatistics.getFullLoadStartTime();
            jsonWriter.name("FullLoadStartTime");
            jsonWriter.value(fullLoadStartTime);
        }
        if (tableStatistics.getFullLoadEndTime() != null) {
            java.util.Date fullLoadEndTime = tableStatistics.getFullLoadEndTime();
            jsonWriter.name("FullLoadEndTime");
            jsonWriter.value(fullLoadEndTime);
        }
        if (tableStatistics.getFullLoadReloaded() != null) {
            Boolean fullLoadReloaded = tableStatistics.getFullLoadReloaded();
            jsonWriter.name("FullLoadReloaded");
            jsonWriter.value(fullLoadReloaded);
        }
        if (tableStatistics.getLastUpdateTime() != null) {
            java.util.Date lastUpdateTime = tableStatistics.getLastUpdateTime();
            jsonWriter.name("LastUpdateTime");
            jsonWriter.value(lastUpdateTime);
        }
        if (tableStatistics.getTableState() != null) {
            String tableState = tableStatistics.getTableState();
            jsonWriter.name("TableState");
            jsonWriter.value(tableState);
        }
        if (tableStatistics.getValidationPendingRecords() != null) {
            Long validationPendingRecords = tableStatistics.getValidationPendingRecords();
            jsonWriter.name("ValidationPendingRecords");
            jsonWriter.value(validationPendingRecords);
        }
        if (tableStatistics.getValidationFailedRecords() != null) {
            Long validationFailedRecords = tableStatistics.getValidationFailedRecords();
            jsonWriter.name("ValidationFailedRecords");
            jsonWriter.value(validationFailedRecords);
        }
        if (tableStatistics.getValidationSuspendedRecords() != null) {
            Long validationSuspendedRecords = tableStatistics.getValidationSuspendedRecords();
            jsonWriter.name("ValidationSuspendedRecords");
            jsonWriter.value(validationSuspendedRecords);
        }
        if (tableStatistics.getValidationState() != null) {
            String validationState = tableStatistics.getValidationState();
            jsonWriter.name("ValidationState");
            jsonWriter.value(validationState);
        }
        if (tableStatistics.getValidationStateDetails() != null) {
            String validationStateDetails = tableStatistics.getValidationStateDetails();
            jsonWriter.name("ValidationStateDetails");
            jsonWriter.value(validationStateDetails);
        }
        jsonWriter.endObject();
    }

    private static TableStatisticsJsonMarshaller instance;

    public static TableStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableStatisticsJsonMarshaller();
        return instance;
    }
}
