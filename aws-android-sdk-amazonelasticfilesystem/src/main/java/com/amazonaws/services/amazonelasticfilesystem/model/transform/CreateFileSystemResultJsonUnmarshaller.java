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
 * JSON unmarshaller for response CreateFileSystemResult
 */
public class CreateFileSystemResultJsonUnmarshaller implements
        Unmarshaller<CreateFileSystemResult, JsonUnmarshallerContext> {

    public CreateFileSystemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateFileSystemResult createFileSystemResult = new CreateFileSystemResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OwnerId")) {
                createFileSystemResult.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationToken")) {
                createFileSystemResult.setCreationToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                createFileSystemResult.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                createFileSystemResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LifeCycleState")) {
                createFileSystemResult.setLifeCycleState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                createFileSystemResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfMountTargets")) {
                createFileSystemResult.setNumberOfMountTargets(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizeInBytes")) {
                createFileSystemResult.setSizeInBytes(FileSystemSizeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PerformanceMode")) {
                createFileSystemResult.setPerformanceMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                createFileSystemResult.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                createFileSystemResult.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ThroughputMode")) {
                createFileSystemResult.setThroughputMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedThroughputInMibps")) {
                createFileSystemResult.setProvisionedThroughputInMibps(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                createFileSystemResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createFileSystemResult;
    }

    private static CreateFileSystemResultJsonUnmarshaller instance;

    public static CreateFileSystemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFileSystemResultJsonUnmarshaller();
        return instance;
    }
}
