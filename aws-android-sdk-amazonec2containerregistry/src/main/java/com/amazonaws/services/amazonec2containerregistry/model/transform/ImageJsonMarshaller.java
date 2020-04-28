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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Image
 */
class ImageJsonMarshaller {

    public void marshall(Image image, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (image.getRegistryId() != null) {
            String registryId = image.getRegistryId();
            jsonWriter.name("registryId");
            jsonWriter.value(registryId);
        }
        if (image.getRepositoryName() != null) {
            String repositoryName = image.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        if (image.getImageId() != null) {
            ImageIdentifier imageId = image.getImageId();
            jsonWriter.name("imageId");
            ImageIdentifierJsonMarshaller.getInstance().marshall(imageId, jsonWriter);
        }
        if (image.getImageManifest() != null) {
            String imageManifest = image.getImageManifest();
            jsonWriter.name("imageManifest");
            jsonWriter.value(imageManifest);
        }
        jsonWriter.endObject();
    }

    private static ImageJsonMarshaller instance;

    public static ImageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonMarshaller();
        return instance;
    }
}
