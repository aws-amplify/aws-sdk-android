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

package com.amazonaws.services.codeartifact.model.transform;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainDescription
 */
class DomainDescriptionJsonMarshaller {

    public void marshall(DomainDescription domainDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (domainDescription.getName() != null) {
            String name = domainDescription.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (domainDescription.getOwner() != null) {
            String owner = domainDescription.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (domainDescription.getArn() != null) {
            String arn = domainDescription.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (domainDescription.getStatus() != null) {
            String status = domainDescription.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (domainDescription.getCreatedTime() != null) {
            java.util.Date createdTime = domainDescription.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        if (domainDescription.getEncryptionKey() != null) {
            String encryptionKey = domainDescription.getEncryptionKey();
            jsonWriter.name("encryptionKey");
            jsonWriter.value(encryptionKey);
        }
        if (domainDescription.getRepositoryCount() != null) {
            Integer repositoryCount = domainDescription.getRepositoryCount();
            jsonWriter.name("repositoryCount");
            jsonWriter.value(repositoryCount);
        }
        if (domainDescription.getAssetSizeBytes() != null) {
            Long assetSizeBytes = domainDescription.getAssetSizeBytes();
            jsonWriter.name("assetSizeBytes");
            jsonWriter.value(assetSizeBytes);
        }
        jsonWriter.endObject();
    }

    private static DomainDescriptionJsonMarshaller instance;

    public static DomainDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainDescriptionJsonMarshaller();
        return instance;
    }
}
