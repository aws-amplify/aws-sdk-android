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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateFileSystemResult
 */
public class UpdateFileSystemResultJsonUnmarshaller implements
        Unmarshaller<UpdateFileSystemResult, JsonUnmarshallerContext> {

    public UpdateFileSystemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateFileSystemResult updateFileSystemResult = new UpdateFileSystemResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OwnerId")) {
                updateFileSystemResult.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationToken")) {
                updateFileSystemResult.setCreationToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                updateFileSystemResult.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                updateFileSystemResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LifeCycleState")) {
                updateFileSystemResult.setLifeCycleState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updateFileSystemResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfMountTargets")) {
                updateFileSystemResult.setNumberOfMountTargets(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizeInBytes")) {
                updateFileSystemResult.setSizeInBytes(FileSystemSizeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PerformanceMode")) {
                updateFileSystemResult.setPerformanceMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                updateFileSystemResult.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                updateFileSystemResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ThroughputMode")) {
                updateFileSystemResult.setThroughputMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedThroughputInMibps")) {
                updateFileSystemResult.setProvisionedThroughputInMibps(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                updateFileSystemResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateFileSystemResult;
    }

    private static UpdateFileSystemResultJsonUnmarshaller instance;

    public static UpdateFileSystemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateFileSystemResultJsonUnmarshaller();
        return instance;
    }
}
