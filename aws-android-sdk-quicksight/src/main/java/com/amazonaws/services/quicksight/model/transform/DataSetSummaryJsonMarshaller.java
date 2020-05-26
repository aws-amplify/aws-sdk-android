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
 * JSON marshaller for POJO DataSetSummary
 */
class DataSetSummaryJsonMarshaller {

    public void marshall(DataSetSummary dataSetSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataSetSummary.getArn() != null) {
            String arn = dataSetSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dataSetSummary.getDataSetId() != null) {
            String dataSetId = dataSetSummary.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (dataSetSummary.getName() != null) {
            String name = dataSetSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (dataSetSummary.getCreatedTime() != null) {
            java.util.Date createdTime = dataSetSummary.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (dataSetSummary.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = dataSetSummary.getLastUpdatedTime();
            jsonWriter.name("LastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (dataSetSummary.getImportMode() != null) {
            String importMode = dataSetSummary.getImportMode();
            jsonWriter.name("ImportMode");
            jsonWriter.value(importMode);
        }
        if (dataSetSummary.getRowLevelPermissionDataSet() != null) {
            RowLevelPermissionDataSet rowLevelPermissionDataSet = dataSetSummary
                    .getRowLevelPermissionDataSet();
            jsonWriter.name("RowLevelPermissionDataSet");
            RowLevelPermissionDataSetJsonMarshaller.getInstance().marshall(
                    rowLevelPermissionDataSet, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DataSetSummaryJsonMarshaller instance;

    public static DataSetSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSetSummaryJsonMarshaller();
        return instance;
    }
}
