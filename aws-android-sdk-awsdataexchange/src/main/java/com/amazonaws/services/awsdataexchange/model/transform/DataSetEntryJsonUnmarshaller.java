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

package com.amazonaws.services.awsdataexchange.model.transform;

import com.amazonaws.services.awsdataexchange.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DataSetEntry
 */
class DataSetEntryJsonUnmarshaller implements Unmarshaller<DataSetEntry, JsonUnmarshallerContext> {

    public DataSetEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DataSetEntry dataSetEntry = new DataSetEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                dataSetEntry.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssetType")) {
                dataSetEntry.setAssetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                dataSetEntry.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                dataSetEntry.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                dataSetEntry.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                dataSetEntry.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Origin")) {
                dataSetEntry.setOrigin(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginDetails")) {
                dataSetEntry.setOriginDetails(OriginDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceId")) {
                dataSetEntry.setSourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedAt")) {
                dataSetEntry.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dataSetEntry;
    }

    private static DataSetEntryJsonUnmarshaller instance;

    public static DataSetEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSetEntryJsonUnmarshaller();
        return instance;
    }
}
