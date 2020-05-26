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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DataSet
 */
class DataSetJsonUnmarshaller implements Unmarshaller<DataSet, JsonUnmarshallerContext> {

    public DataSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataSet dataSet = new DataSet();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                dataSet.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSetId")) {
                dataSet.setDataSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                dataSet.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                dataSet.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTime")) {
                dataSet.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhysicalTableMap")) {
                dataSet.setPhysicalTableMap(new MapUnmarshaller<PhysicalTable>(
                        PhysicalTableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LogicalTableMap")) {
                dataSet.setLogicalTableMap(new MapUnmarshaller<LogicalTable>(
                        LogicalTableJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutputColumns")) {
                dataSet.setOutputColumns(new ListUnmarshaller<OutputColumn>(
                        OutputColumnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ImportMode")) {
                dataSet.setImportMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConsumedSpiceCapacityInBytes")) {
                dataSet.setConsumedSpiceCapacityInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ColumnGroups")) {
                dataSet.setColumnGroups(new ListUnmarshaller<ColumnGroup>(
                        ColumnGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RowLevelPermissionDataSet")) {
                dataSet.setRowLevelPermissionDataSet(RowLevelPermissionDataSetJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataSet;
    }

    private static DataSetJsonUnmarshaller instance;

    public static DataSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSetJsonUnmarshaller();
        return instance;
    }
}
