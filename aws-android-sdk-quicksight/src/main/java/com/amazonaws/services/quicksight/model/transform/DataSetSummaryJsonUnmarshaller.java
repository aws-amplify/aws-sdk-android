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
 * JSON unmarshaller for POJO DataSetSummary
 */
class DataSetSummaryJsonUnmarshaller implements
        Unmarshaller<DataSetSummary, JsonUnmarshallerContext> {

    public DataSetSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataSetSummary dataSetSummary = new DataSetSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                dataSetSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSetId")) {
                dataSetSummary.setDataSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                dataSetSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                dataSetSummary.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTime")) {
                dataSetSummary.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportMode")) {
                dataSetSummary.setImportMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RowLevelPermissionDataSet")) {
                dataSetSummary
                        .setRowLevelPermissionDataSet(RowLevelPermissionDataSetJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataSetSummary;
    }

    private static DataSetSummaryJsonUnmarshaller instance;

    public static DataSetSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSetSummaryJsonUnmarshaller();
        return instance;
    }
}
