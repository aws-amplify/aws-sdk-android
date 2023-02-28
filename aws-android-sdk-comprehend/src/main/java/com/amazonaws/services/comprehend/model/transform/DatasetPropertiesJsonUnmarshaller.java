/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DatasetProperties
 */
class DatasetPropertiesJsonUnmarshaller implements
        Unmarshaller<DatasetProperties, JsonUnmarshallerContext> {

    public DatasetProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DatasetProperties datasetProperties = new DatasetProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DatasetArn")) {
                datasetProperties.setDatasetArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatasetName")) {
                datasetProperties.setDatasetName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatasetType")) {
                datasetProperties.setDatasetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatasetS3Uri")) {
                datasetProperties.setDatasetS3Uri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                datasetProperties.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                datasetProperties.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                datasetProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfDocuments")) {
                datasetProperties.setNumberOfDocuments(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                datasetProperties.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                datasetProperties.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return datasetProperties;
    }

    private static DatasetPropertiesJsonUnmarshaller instance;

    public static DatasetPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatasetPropertiesJsonUnmarshaller();
        return instance;
    }
}
