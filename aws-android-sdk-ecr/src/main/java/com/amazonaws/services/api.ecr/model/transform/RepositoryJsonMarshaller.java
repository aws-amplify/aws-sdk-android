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

package com.amazonaws.services.api.ecr.model.transform;

import com.amazonaws.services.api.ecr.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Repository
 */
class RepositoryJsonMarshaller {

    public void marshall(Repository repository, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (repository.getRepositoryArn() != null) {
            String repositoryArn = repository.getRepositoryArn();
            jsonWriter.name("repositoryArn");
            jsonWriter.value(repositoryArn);
        }
        if (repository.getRegistryId() != null) {
            String registryId = repository.getRegistryId();
            jsonWriter.name("registryId");
            jsonWriter.value(registryId);
        }
        if (repository.getRepositoryName() != null) {
            String repositoryName = repository.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (repository.getRepositoryUri() != null) {
            String repositoryUri = repository.getRepositoryUri();
            jsonWriter.name("repositoryUri");
            jsonWriter.value(repositoryUri);
        }
        if (repository.getCreatedAt() != null) {
            java.util.Date createdAt = repository.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (repository.getImageTagMutability() != null) {
            String imageTagMutability = repository.getImageTagMutability();
            jsonWriter.name("imageTagMutability");
            jsonWriter.value(imageTagMutability);
        }
        if (repository.getImageScanningConfiguration() != null) {
            ImageScanningConfiguration imageScanningConfiguration = repository
                    .getImageScanningConfiguration();
            jsonWriter.name("imageScanningConfiguration");
            ImageScanningConfigurationJsonMarshaller.getInstance().marshall(
                    imageScanningConfiguration, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RepositoryJsonMarshaller instance;

    public static RepositoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryJsonMarshaller();
        return instance;
    }
}
