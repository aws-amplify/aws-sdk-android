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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FileSystem
 */
class FileSystemJsonMarshaller {

    public void marshall(FileSystem fileSystem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fileSystem.getOwnerId() != null) {
            String ownerId = fileSystem.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (fileSystem.getCreationTime() != null) {
            java.util.Date creationTime = fileSystem.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (fileSystem.getFileSystemId() != null) {
            String fileSystemId = fileSystem.getFileSystemId();
            jsonWriter.name("FileSystemId");
            jsonWriter.value(fileSystemId);
        }
        if (fileSystem.getFileSystemType() != null) {
            String fileSystemType = fileSystem.getFileSystemType();
            jsonWriter.name("FileSystemType");
            jsonWriter.value(fileSystemType);
        }
        if (fileSystem.getLifecycle() != null) {
            String lifecycle = fileSystem.getLifecycle();
            jsonWriter.name("Lifecycle");
            jsonWriter.value(lifecycle);
        }
        if (fileSystem.getFailureDetails() != null) {
            FileSystemFailureDetails failureDetails = fileSystem.getFailureDetails();
            jsonWriter.name("FailureDetails");
            FileSystemFailureDetailsJsonMarshaller.getInstance().marshall(failureDetails,
                    jsonWriter);
        }
        if (fileSystem.getStorageCapacity() != null) {
            Integer storageCapacity = fileSystem.getStorageCapacity();
            jsonWriter.name("StorageCapacity");
            jsonWriter.value(storageCapacity);
        }
        if (fileSystem.getStorageType() != null) {
            String storageType = fileSystem.getStorageType();
            jsonWriter.name("StorageType");
            jsonWriter.value(storageType);
        }
        if (fileSystem.getVpcId() != null) {
            String vpcId = fileSystem.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (fileSystem.getSubnetIds() != null) {
            java.util.List<String> subnetIds = fileSystem.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (fileSystem.getNetworkInterfaceIds() != null) {
            java.util.List<String> networkInterfaceIds = fileSystem.getNetworkInterfaceIds();
            jsonWriter.name("NetworkInterfaceIds");
            jsonWriter.beginArray();
            for (String networkInterfaceIdsItem : networkInterfaceIds) {
                if (networkInterfaceIdsItem != null) {
                    jsonWriter.value(networkInterfaceIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (fileSystem.getDNSName() != null) {
            String dNSName = fileSystem.getDNSName();
            jsonWriter.name("DNSName");
            jsonWriter.value(dNSName);
        }
        if (fileSystem.getKmsKeyId() != null) {
            String kmsKeyId = fileSystem.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (fileSystem.getResourceARN() != null) {
            String resourceARN = fileSystem.getResourceARN();
            jsonWriter.name("ResourceARN");
            jsonWriter.value(resourceARN);
        }
        if (fileSystem.getTags() != null) {
            java.util.List<Tag> tags = fileSystem.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (fileSystem.getWindowsConfiguration() != null) {
            WindowsFileSystemConfiguration windowsConfiguration = fileSystem
                    .getWindowsConfiguration();
            jsonWriter.name("WindowsConfiguration");
            WindowsFileSystemConfigurationJsonMarshaller.getInstance().marshall(
                    windowsConfiguration, jsonWriter);
        }
        if (fileSystem.getLustreConfiguration() != null) {
            LustreFileSystemConfiguration lustreConfiguration = fileSystem.getLustreConfiguration();
            jsonWriter.name("LustreConfiguration");
            LustreFileSystemConfigurationJsonMarshaller.getInstance().marshall(lustreConfiguration,
                    jsonWriter);
        }
        if (fileSystem.getAdministrativeActions() != null) {
            java.util.List<AdministrativeAction> administrativeActions = fileSystem
                    .getAdministrativeActions();
            jsonWriter.name("AdministrativeActions");
            jsonWriter.beginArray();
            for (AdministrativeAction administrativeActionsItem : administrativeActions) {
                if (administrativeActionsItem != null) {
                    AdministrativeActionJsonMarshaller.getInstance().marshall(
                            administrativeActionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FileSystemJsonMarshaller instance;

    public static FileSystemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FileSystemJsonMarshaller();
        return instance;
    }
}
