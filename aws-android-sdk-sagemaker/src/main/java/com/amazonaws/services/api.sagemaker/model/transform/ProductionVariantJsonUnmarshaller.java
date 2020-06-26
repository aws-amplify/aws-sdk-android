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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProductionVariant
 */
class ProductionVariantJsonUnmarshaller implements
        Unmarshaller<ProductionVariant, JsonUnmarshallerContext> {

    public ProductionVariant unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProductionVariant productionVariant = new ProductionVariant();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VariantName")) {
                productionVariant.setVariantName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelName")) {
                productionVariant.setModelName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitialInstanceCount")) {
                productionVariant.setInitialInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                productionVariant.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitialVariantWeight")) {
                productionVariant.setInitialVariantWeight(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AcceleratorType")) {
                productionVariant.setAcceleratorType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return productionVariant;
    }

    private static ProductionVariantJsonUnmarshaller instance;

    public static ProductionVariantJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProductionVariantJsonUnmarshaller();
        return instance;
    }
}
