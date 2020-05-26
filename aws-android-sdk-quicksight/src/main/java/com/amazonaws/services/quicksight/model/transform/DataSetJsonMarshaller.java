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
 * JSON marshaller for POJO DataSet
 */
class DataSetJsonMarshaller {

    public void marshall(DataSet dataSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataSet.getArn() != null) {
            String arn = dataSet.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dataSet.getDataSetId() != null) {
            String dataSetId = dataSet.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (dataSet.getName() != null) {
            String name = dataSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (dataSet.getCreatedTime() != null) {
            java.util.Date createdTime = dataSet.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (dataSet.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = dataSet.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (dataSet.getPhysicalTableMap() != null) {
            java.util.Map<String, PhysicalTable> physicalTableMap = dataSet.getPhysicalTableMap();
            jsonWriter.name("PhysicalTableMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, PhysicalTable> physicalTableMapEntry : physicalTableMap
                    .entrySet()) {
                PhysicalTable physicalTableMapValue = physicalTableMapEntry.getValue();
                if (physicalTableMapValue != null) {
                    jsonWriter.name(physicalTableMapEntry.getKey());
                    PhysicalTableJsonMarshaller.getInstance().marshall(physicalTableMapValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (dataSet.getLogicalTableMap() != null) {
            java.util.Map<String, LogicalTable> logicalTableMap = dataSet.getLogicalTableMap();
            jsonWriter.name("LogicalTableMap");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, LogicalTable> logicalTableMapEntry : logicalTableMap
                    .entrySet()) {
                LogicalTable logicalTableMapValue = logicalTableMapEntry.getValue();
                if (logicalTableMapValue != null) {
                    jsonWriter.name(logicalTableMapEntry.getKey());
                    LogicalTableJsonMarshaller.getInstance().marshall(logicalTableMapValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (dataSet.getOutputColumns() != null) {
            java.util.List<OutputColumn> outputColumns = dataSet.getOutputColumns();
            jsonWriter.name("OutputColumns");
            jsonWriter.beginArray();
            for (OutputColumn outputColumnsItem : outputColumns) {
                if (outputColumnsItem != null) {
                    OutputColumnJsonMarshaller.getInstance()
                            .marshall(outputColumnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (dataSet.getImportMode() != null) {
            String importMode = dataSet.getImportMode();
            jsonWriter.name("ImportMode");
            jsonWriter.value(importMode);
        }
        if (dataSet.getConsumedSpiceCapacityInBytes() != null) {
            Long consumedSpiceCapacityInBytes = dataSet.getConsumedSpiceCapacityInBytes();
            jsonWriter.name("ConsumedSpiceCapacityInBytes");
            jsonWriter.value(consumedSpiceCapacityInBytes);
        }
        if (dataSet.getColumnGroups() != null) {
            java.util.List<ColumnGroup> columnGroups = dataSet.getColumnGroups();
            jsonWriter.name("ColumnGroups");
            jsonWriter.beginArray();
            for (ColumnGroup columnGroupsItem : columnGroups) {
                if (columnGroupsItem != null) {
                    ColumnGroupJsonMarshaller.getInstance().marshall(columnGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (dataSet.getRowLevelPermissionDataSet() != null) {
            RowLevelPermissionDataSet rowLevelPermissionDataSet = dataSet
                    .getRowLevelPermissionDataSet();
            jsonWriter.name("RowLevelPermissionDataSet");
            RowLevelPermissionDataSetJsonMarshaller.getInstance().marshall(
                    rowLevelPermissionDataSet, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataSetJsonMarshaller instance;

    public static DataSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSetJsonMarshaller();
        return instance;
    }
}
