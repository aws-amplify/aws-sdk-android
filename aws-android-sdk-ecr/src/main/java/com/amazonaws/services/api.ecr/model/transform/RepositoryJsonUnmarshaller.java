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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Repository
 */
class RepositoryJsonUnmarshaller implements Unmarshaller<Repository, JsonUnmarshallerContext> {

    public Repository unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Repository repository = new Repository();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("repositoryArn")) {
                repository.setRepositoryArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("registryId")) {
                repository.setRegistryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryName")) {
                repository.setRepositoryName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("repositoryUri")) {
                repository.setRepositoryUri(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                repository.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageTagMutability")) {
                repository.setImageTagMutability(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("imageScanningConfiguration")) {
                repository.setImageScanningConfiguration(ImageScanningConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return repository;
    }

    private static RepositoryJsonUnmarshaller instance;

    public static RepositoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryJsonUnmarshaller();
        return instance;
    }
}
