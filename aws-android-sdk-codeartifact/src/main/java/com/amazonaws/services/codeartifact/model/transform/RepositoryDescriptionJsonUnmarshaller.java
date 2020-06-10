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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RepositoryDescription
 */
class RepositoryDescriptionJsonUnmarshaller implements
        Unmarshaller<RepositoryDescription, JsonUnmarshallerContext> {

    public RepositoryDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RepositoryDescription repositoryDescription = new RepositoryDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                repositoryDescription.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("administratorAccount")) {
                repositoryDescription.setAdministratorAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainName")) {
                repositoryDescription.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainOwner")) {
                repositoryDescription.setDomainOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                repositoryDescription.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                repositoryDescription.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("upstreams")) {
                repositoryDescription.setUpstreams(new ListUnmarshaller<UpstreamRepositoryInfo>(
                        UpstreamRepositoryInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("externalConnections")) {
                repositoryDescription
                        .setExternalConnections(new ListUnmarshaller<RepositoryExternalConnectionInfo>(
                                RepositoryExternalConnectionInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return repositoryDescription;
    }

    private static RepositoryDescriptionJsonUnmarshaller instance;

    public static RepositoryDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryDescriptionJsonUnmarshaller();
        return instance;
    }
}
