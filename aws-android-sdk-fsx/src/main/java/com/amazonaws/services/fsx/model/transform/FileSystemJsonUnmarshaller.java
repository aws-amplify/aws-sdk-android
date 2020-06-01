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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FileSystem
 */
class FileSystemJsonUnmarshaller implements Unmarshaller<FileSystem, JsonUnmarshallerContext> {

    public FileSystem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FileSystem fileSystem = new FileSystem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OwnerId")) {
                fileSystem.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                fileSystem.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                fileSystem.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemType")) {
                fileSystem.setFileSystemType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Lifecycle")) {
                fileSystem.setLifecycle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureDetails")) {
                fileSystem.setFailureDetails(FileSystemFailureDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageCapacity")) {
                fileSystem.setStorageCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StorageType")) {
                fileSystem.setStorageType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                fileSystem.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                fileSystem.setSubnetIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NetworkInterfaceIds")) {
                fileSystem.setNetworkInterfaceIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DNSName")) {
                fileSystem.setDNSName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                fileSystem.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceARN")) {
                fileSystem.setResourceARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                fileSystem.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("WindowsConfiguration")) {
                fileSystem.setWindowsConfiguration(WindowsFileSystemConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LustreConfiguration")) {
                fileSystem.setLustreConfiguration(LustreFileSystemConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdministrativeActions")) {
                fileSystem.setAdministrativeActions(new ListUnmarshaller<AdministrativeAction>(
                        AdministrativeActionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fileSystem;
    }

    private static FileSystemJsonUnmarshaller instance;

    public static FileSystemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemJsonUnmarshaller();
        return instance;
    }
}
