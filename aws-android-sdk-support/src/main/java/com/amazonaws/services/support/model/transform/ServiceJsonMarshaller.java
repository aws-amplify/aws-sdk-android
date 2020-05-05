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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Service
 */
class ServiceJsonMarshaller {

    public void marshall(Service service, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (service.getCode() != null) {
            String code = service.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        if (service.getName() != null) {
            String name = service.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (service.getCategories() != null) {
            java.util.List<Category> categories = service.getCategories();
            jsonWriter.name("categories");
            jsonWriter.beginArray();
            for (Category categoriesItem : categories) {
                if (categoriesItem != null) {
                    CategoryJsonMarshaller.getInstance().marshall(categoriesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ServiceJsonMarshaller instance;

    public static ServiceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonMarshaller();
        return instance;
    }
}
