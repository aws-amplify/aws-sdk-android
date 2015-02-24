/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * Dataset JSON Unmarshaller
 */
public class DatasetJsonUnmarshaller implements Unmarshaller<Dataset, JsonUnmarshallerContext> {

    public Dataset unmarshall(JsonUnmarshallerContext context) throws Exception {
        Dataset dataset = new Dataset();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            
            if (name.equals("IdentityId")) {
                dataset.setIdentityId(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("DatasetName")) {
                dataset.setDatasetName(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("CreationDate")) {
                dataset.setCreationDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("LastModifiedDate")) {
                dataset.setLastModifiedDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("LastModifiedBy")) {
                dataset.setLastModifiedBy(StringJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("DataStorage")) {
                dataset.setDataStorage(LongJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            if (name.equals("NumRecords")) {
                dataset.setNumRecords(LongJsonUnmarshaller.getInstance().unmarshall(context));
            } else 
            {
                reader.skipValue();
            }
            
        }
        reader.endObject();
        
        return dataset;
    }

    private static DatasetJsonUnmarshaller instance;
    public static DatasetJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DatasetJsonUnmarshaller();
        return instance;
    }
}
    