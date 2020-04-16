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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelPackageContainerDefinition
 */
class ModelPackageContainerDefinitionJsonMarshaller {

    public void marshall(ModelPackageContainerDefinition modelPackageContainerDefinition,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (modelPackageContainerDefinition.getContainerHostname() != null) {
            String containerHostname = modelPackageContainerDefinition.getContainerHostname();
            jsonWriter.name("ContainerHostname");
            jsonWriter.value(containerHostname);
        }
        if (modelPackageContainerDefinition.getImage() != null) {
            String image = modelPackageContainerDefinition.getImage();
            jsonWriter.name("Image");
            jsonWriter.value(image);
        }
        if (modelPackageContainerDefinition.getImageDigest() != null) {
            String imageDigest = modelPackageContainerDefinition.getImageDigest();
            jsonWriter.name("ImageDigest");
            jsonWriter.value(imageDigest);
        }
        if (modelPackageContainerDefinition.getModelDataUrl() != null) {
            String modelDataUrl = modelPackageContainerDefinition.getModelDataUrl();
            jsonWriter.name("ModelDataUrl");
            jsonWriter.value(modelDataUrl);
        }
        if (modelPackageContainerDefinition.getProductId() != null) {
            String productId = modelPackageContainerDefinition.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        jsonWriter.endObject();
    }

    private static ModelPackageContainerDefinitionJsonMarshaller instance;

    public static ModelPackageContainerDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelPackageContainerDefinitionJsonMarshaller();
        return instance;
    }
}
