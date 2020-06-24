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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RepositoryMetadata
 */
class RepositoryMetadataJsonMarshaller {

    public void marshall(RepositoryMetadata repositoryMetadata, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (repositoryMetadata.getAccountId() != null) {
            String accountId = repositoryMetadata.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (repositoryMetadata.getRepositoryId() != null) {
            String repositoryId = repositoryMetadata.getRepositoryId();
            jsonWriter.name("repositoryId");
            jsonWriter.value(repositoryId);
        }
        if (repositoryMetadata.getRepositoryName() != null) {
            String repositoryName = repositoryMetadata.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (repositoryMetadata.getRepositoryDescription() != null) {
            String repositoryDescription = repositoryMetadata.getRepositoryDescription();
            jsonWriter.name("repositoryDescription");
            jsonWriter.value(repositoryDescription);
        }
        if (repositoryMetadata.getDefaultBranch() != null) {
            String defaultBranch = repositoryMetadata.getDefaultBranch();
            jsonWriter.name("defaultBranch");
            jsonWriter.value(defaultBranch);
        }
        if (repositoryMetadata.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = repositoryMetadata.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (repositoryMetadata.getCreationDate() != null) {
            java.util.Date creationDate = repositoryMetadata.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (repositoryMetadata.getCloneUrlHttp() != null) {
            String cloneUrlHttp = repositoryMetadata.getCloneUrlHttp();
            jsonWriter.name("cloneUrlHttp");
            jsonWriter.value(cloneUrlHttp);
        }
        if (repositoryMetadata.getCloneUrlSsh() != null) {
            String cloneUrlSsh = repositoryMetadata.getCloneUrlSsh();
            jsonWriter.name("cloneUrlSsh");
            jsonWriter.value(cloneUrlSsh);
        }
        if (repositoryMetadata.getArn() != null) {
            String arn = repositoryMetadata.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        jsonWriter.endObject();
    }

    private static RepositoryMetadataJsonMarshaller instance;

    public static RepositoryMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryMetadataJsonMarshaller();
        return instance;
    }
}
