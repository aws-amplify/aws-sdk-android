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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TableStatistics
 */
class TableStatisticsJsonUnmarshaller implements
        Unmarshaller<TableStatistics, JsonUnmarshallerContext> {

    public TableStatistics unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TableStatistics tableStatistics = new TableStatistics();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SchemaName")) {
                tableStatistics.setSchemaName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableName")) {
                tableStatistics.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Inserts")) {
                tableStatistics.setInserts(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Deletes")) {
                tableStatistics.setDeletes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Updates")) {
                tableStatistics.setUpdates(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ddls")) {
                tableStatistics.setDdls(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadRows")) {
                tableStatistics.setFullLoadRows(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadCondtnlChkFailedRows")) {
                tableStatistics.setFullLoadCondtnlChkFailedRows(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadErrorRows")) {
                tableStatistics.setFullLoadErrorRows(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadStartTime")) {
                tableStatistics.setFullLoadStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadEndTime")) {
                tableStatistics.setFullLoadEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadReloaded")) {
                tableStatistics.setFullLoadReloaded(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdateTime")) {
                tableStatistics.setLastUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableState")) {
                tableStatistics.setTableState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidationPendingRecords")) {
                tableStatistics.setValidationPendingRecords(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidationFailedRecords")) {
                tableStatistics.setValidationFailedRecords(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidationSuspendedRecords")) {
                tableStatistics.setValidationSuspendedRecords(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidationState")) {
                tableStatistics.setValidationState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ValidationStateDetails")) {
                tableStatistics.setValidationStateDetails(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return tableStatistics;
    }

    private static TableStatisticsJsonUnmarshaller instance;

    public static TableStatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableStatisticsJsonUnmarshaller();
        return instance;
    }
}
