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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EFSVolumeConfiguration
 */
class EFSVolumeConfigurationJsonMarshaller {

    public void marshall(EFSVolumeConfiguration eFSVolumeConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eFSVolumeConfiguration.getFileSystemId() != null) {
            String fileSystemId = eFSVolumeConfiguration.getFileSystemId();
            jsonWriter.name("fileSystemId");
            jsonWriter.value(fileSystemId);
        }
        if (eFSVolumeConfiguration.getRootDirectory() != null) {
            String rootDirectory = eFSVolumeConfiguration.getRootDirectory();
            jsonWriter.name("rootDirectory");
            jsonWriter.value(rootDirectory);
        }
        if (eFSVolumeConfiguration.getTransitEncryption() != null) {
            String transitEncryption = eFSVolumeConfiguration.getTransitEncryption();
            jsonWriter.name("transitEncryption");
            jsonWriter.value(transitEncryption);
        }
        if (eFSVolumeConfiguration.getTransitEncryptionPort() != null) {
            Integer transitEncryptionPort = eFSVolumeConfiguration.getTransitEncryptionPort();
            jsonWriter.name("transitEncryptionPort");
            jsonWriter.value(transitEncryptionPort);
        }
        if (eFSVolumeConfiguration.getAuthorizationConfig() != null) {
            EFSAuthorizationConfig authorizationConfig = eFSVolumeConfiguration
                    .getAuthorizationConfig();
            jsonWriter.name("authorizationConfig");
            EFSAuthorizationConfigJsonMarshaller.getInstance().marshall(authorizationConfig,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EFSVolumeConfigurationJsonMarshaller instance;

    public static EFSVolumeConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EFSVolumeConfigurationJsonMarshaller();
        return instance;
    }
}
