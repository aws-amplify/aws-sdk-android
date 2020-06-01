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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProductionVariantSummary
 */
class ProductionVariantSummaryJsonMarshaller {

    public void marshall(ProductionVariantSummary productionVariantSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (productionVariantSummary.getVariantName() != null) {
            String variantName = productionVariantSummary.getVariantName();
            jsonWriter.name("VariantName");
            jsonWriter.value(variantName);
        }
        if (productionVariantSummary.getDeployedImages() != null) {
            java.util.List<DeployedImage> deployedImages = productionVariantSummary
                    .getDeployedImages();
            jsonWriter.name("DeployedImages");
            jsonWriter.beginArray();
            for (DeployedImage deployedImagesItem : deployedImages) {
                if (deployedImagesItem != null) {
                    DeployedImageJsonMarshaller.getInstance().marshall(deployedImagesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (productionVariantSummary.getCurrentWeight() != null) {
            Float currentWeight = productionVariantSummary.getCurrentWeight();
            jsonWriter.name("CurrentWeight");
            jsonWriter.value(currentWeight);
        }
        if (productionVariantSummary.getDesiredWeight() != null) {
            Float desiredWeight = productionVariantSummary.getDesiredWeight();
            jsonWriter.name("DesiredWeight");
            jsonWriter.value(desiredWeight);
        }
        if (productionVariantSummary.getCurrentInstanceCount() != null) {
            Integer currentInstanceCount = productionVariantSummary.getCurrentInstanceCount();
            jsonWriter.name("CurrentInstanceCount");
            jsonWriter.value(currentInstanceCount);
        }
        if (productionVariantSummary.getDesiredInstanceCount() != null) {
            Integer desiredInstanceCount = productionVariantSummary.getDesiredInstanceCount();
            jsonWriter.name("DesiredInstanceCount");
            jsonWriter.value(desiredInstanceCount);
        }
        jsonWriter.endObject();
    }

    private static ProductionVariantSummaryJsonMarshaller instance;

    public static ProductionVariantSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductionVariantSummaryJsonMarshaller();
        return instance;
    }
}
