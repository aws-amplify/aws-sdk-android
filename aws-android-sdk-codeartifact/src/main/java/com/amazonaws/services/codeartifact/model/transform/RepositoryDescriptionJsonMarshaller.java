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
 * JSON marshaller for POJO RepositoryDescription
 */
class RepositoryDescriptionJsonMarshaller {

    public void marshall(RepositoryDescription repositoryDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (repositoryDescription.getName() != null) {
            String name = repositoryDescription.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (repositoryDescription.getAdministratorAccount() != null) {
            String administratorAccount = repositoryDescription.getAdministratorAccount();
            jsonWriter.name("administratorAccount");
            jsonWriter.value(administratorAccount);
        }
        if (repositoryDescription.getDomainName() != null) {
            String domainName = repositoryDescription.getDomainName();
            jsonWriter.name("domainName");
            jsonWriter.value(domainName);
        }
        if (repositoryDescription.getDomainOwner() != null) {
            String domainOwner = repositoryDescription.getDomainOwner();
            jsonWriter.name("domainOwner");
            jsonWriter.value(domainOwner);
        }
        if (repositoryDescription.getArn() != null) {
            String arn = repositoryDescription.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (repositoryDescription.getDescription() != null) {
            String description = repositoryDescription.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (repositoryDescription.getUpstreams() != null) {
            java.util.List<UpstreamRepositoryInfo> upstreams = repositoryDescription.getUpstreams();
            jsonWriter.name("upstreams");
            jsonWriter.beginArray();
            for (UpstreamRepositoryInfo upstreamsItem : upstreams) {
                if (upstreamsItem != null) {
                    UpstreamRepositoryInfoJsonMarshaller.getInstance().marshall(upstreamsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (repositoryDescription.getExternalConnections() != null) {
            java.util.List<RepositoryExternalConnectionInfo> externalConnections = repositoryDescription
                    .getExternalConnections();
            jsonWriter.name("externalConnections");
            jsonWriter.beginArray();
            for (RepositoryExternalConnectionInfo externalConnectionsItem : externalConnections) {
                if (externalConnectionsItem != null) {
                    RepositoryExternalConnectionInfoJsonMarshaller.getInstance().marshall(
                            externalConnectionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RepositoryDescriptionJsonMarshaller instance;

    public static RepositoryDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryDescriptionJsonMarshaller();
        return instance;
    }
}
