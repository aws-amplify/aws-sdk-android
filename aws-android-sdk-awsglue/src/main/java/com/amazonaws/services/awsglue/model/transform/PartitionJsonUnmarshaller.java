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
 * JSON unmarshaller for POJO Partition
 */
class PartitionJsonUnmarshaller implements Unmarshaller<Partition, JsonUnmarshallerContext> {

    public Partition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Partition partition = new Partition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Values")) {
                partition.setValues(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DatabaseName")) {
                partition.setDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableName")) {
                partition.setTableName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                partition.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastAccessTime")) {
                partition.setLastAccessTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageDescriptor")) {
                partition.setStorageDescriptor(StorageDescriptorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                partition.setParameters(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LastAnalyzedTime")) {
                partition.setLastAnalyzedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return partition;
    }

    private static PartitionJsonUnmarshaller instance;

    public static PartitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PartitionJsonUnmarshaller();
        return instance;
    }
}
