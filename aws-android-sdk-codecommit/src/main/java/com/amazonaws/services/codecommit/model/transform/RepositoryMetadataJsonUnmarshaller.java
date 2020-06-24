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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RepositoryMetadata
 */
class RepositoryMetadataJsonUnmarshaller implements
        Unmarshaller<RepositoryMetadata, JsonUnmarshallerContext> {

    public RepositoryMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RepositoryMetadata repositoryMetadata = new RepositoryMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("accountId")) {
                repositoryMetadata.setAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryId")) {
                repositoryMetadata.setRepositoryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                repositoryMetadata.setRepositoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryDescription")) {
                repositoryMetadata.setRepositoryDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("defaultBranch")) {
                repositoryMetadata.setDefaultBranch(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                repositoryMetadata.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                repositoryMetadata.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cloneUrlHttp")) {
                repositoryMetadata.setCloneUrlHttp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cloneUrlSsh")) {
                repositoryMetadata.setCloneUrlSsh(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                repositoryMetadata.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return repositoryMetadata;
    }

    private static RepositoryMetadataJsonUnmarshaller instance;

    public static RepositoryMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryMetadataJsonUnmarshaller();
        return instance;
    }
}
