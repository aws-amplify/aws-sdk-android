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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO StorageDescriptor
 */
class StorageDescriptorJsonUnmarshaller implements
        Unmarshaller<StorageDescriptor, JsonUnmarshallerContext> {

    public StorageDescriptor unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StorageDescriptor storageDescriptor = new StorageDescriptor();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Columns")) {
                storageDescriptor.setColumns(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Location")) {
                storageDescriptor.setLocation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputFormat")) {
                storageDescriptor.setInputFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputFormat")) {
                storageDescriptor.setOutputFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Compressed")) {
                storageDescriptor.setCompressed(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfBuckets")) {
                storageDescriptor.setNumberOfBuckets(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SerdeInfo")) {
                storageDescriptor.setSerdeInfo(SerDeInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BucketColumns")) {
                storageDescriptor.setBucketColumns(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SortColumns")) {
                storageDescriptor.setSortColumns(new ListUnmarshaller<Order>(OrderJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Parameters")) {
                storageDescriptor.setParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SkewedInfo")) {
                storageDescriptor.setSkewedInfo(SkewedInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StoredAsSubDirectories")) {
                storageDescriptor.setStoredAsSubDirectories(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return storageDescriptor;
    }

    private static StorageDescriptorJsonUnmarshaller instance;

    public static StorageDescriptorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StorageDescriptorJsonUnmarshaller();
        return instance;
    }
}
