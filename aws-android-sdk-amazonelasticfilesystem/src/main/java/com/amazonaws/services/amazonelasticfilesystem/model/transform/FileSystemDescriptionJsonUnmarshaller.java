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
 * JSON unmarshaller for POJO FileSystemDescription
 */
class FileSystemDescriptionJsonUnmarshaller implements
        Unmarshaller<FileSystemDescription, JsonUnmarshallerContext> {

    public FileSystemDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FileSystemDescription fileSystemDescription = new FileSystemDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OwnerId")) {
                fileSystemDescription.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationToken")) {
                fileSystemDescription.setCreationToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                fileSystemDescription.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                fileSystemDescription.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LifeCycleState")) {
                fileSystemDescription.setLifeCycleState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                fileSystemDescription.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfMountTargets")) {
                fileSystemDescription.setNumberOfMountTargets(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SizeInBytes")) {
                fileSystemDescription.setSizeInBytes(FileSystemSizeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PerformanceMode")) {
                fileSystemDescription.setPerformanceMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                fileSystemDescription.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                fileSystemDescription.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ThroughputMode")) {
                fileSystemDescription.setThroughputMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisionedThroughputInMibps")) {
                fileSystemDescription.setProvisionedThroughputInMibps(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                fileSystemDescription.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fileSystemDescription;
    }

    private static FileSystemDescriptionJsonUnmarshaller instance;

    public static FileSystemDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemDescriptionJsonUnmarshaller();
        return instance;
    }
}
