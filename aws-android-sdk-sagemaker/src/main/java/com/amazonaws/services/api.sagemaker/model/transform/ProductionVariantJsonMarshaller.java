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
 * JSON marshaller for POJO ProductionVariant
 */
class ProductionVariantJsonMarshaller {

    public void marshall(ProductionVariant productionVariant, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (productionVariant.getVariantName() != null) {
            String variantName = productionVariant.getVariantName();
            jsonWriter.name("VariantName");
            jsonWriter.value(variantName);
        }
        if (productionVariant.getModelName() != null) {
            String modelName = productionVariant.getModelName();
            jsonWriter.name("ModelName");
            jsonWriter.value(modelName);
        }
        if (productionVariant.getInitialInstanceCount() != null) {
            Integer initialInstanceCount = productionVariant.getInitialInstanceCount();
            jsonWriter.name("InitialInstanceCount");
            jsonWriter.value(initialInstanceCount);
        }
        if (productionVariant.getInstanceType() != null) {
            String instanceType = productionVariant.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (productionVariant.getInitialVariantWeight() != null) {
            Float initialVariantWeight = productionVariant.getInitialVariantWeight();
            jsonWriter.name("InitialVariantWeight");
            jsonWriter.value(initialVariantWeight);
        }
        if (productionVariant.getAcceleratorType() != null) {
            String acceleratorType = productionVariant.getAcceleratorType();
            jsonWriter.name("AcceleratorType");
            jsonWriter.value(acceleratorType);
        }
        jsonWriter.endObject();
    }

    private static ProductionVariantJsonMarshaller instance;

    public static ProductionVariantJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductionVariantJsonMarshaller();
        return instance;
    }
}
