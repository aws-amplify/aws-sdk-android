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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PatchSource
 */
class PatchSourceJsonMarshaller {

    public void marshall(PatchSource patchSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patchSource.getName() != null) {
            String name = patchSource.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (patchSource.getProducts() != null) {
            java.util.List<String> products = patchSource.getProducts();
            jsonWriter.name("Products");
            jsonWriter.beginArray();
            for (String productsItem : products) {
                if (productsItem != null) {
            jsonWriter.value(productsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (patchSource.getConfiguration() != null) {
            String configuration = patchSource.getConfiguration();
            jsonWriter.name("Configuration");
            jsonWriter.value(configuration);
        }
        jsonWriter.endObject();
    }

    private static PatchSourceJsonMarshaller instance;
    public static PatchSourceJsonMarshaller getInstance() {
        if (instance == null) instance = new PatchSourceJsonMarshaller();
        return instance;
    }
}
