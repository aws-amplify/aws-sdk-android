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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListTagOptionsFilters
 */
class ListTagOptionsFiltersJsonMarshaller {

    public void marshall(ListTagOptionsFilters listTagOptionsFilters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (listTagOptionsFilters.getKey() != null) {
            String key = listTagOptionsFilters.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (listTagOptionsFilters.getValue() != null) {
            String value = listTagOptionsFilters.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (listTagOptionsFilters.getActive() != null) {
            Boolean active = listTagOptionsFilters.getActive();
            jsonWriter.name("Active");
            jsonWriter.value(active);
        }
        jsonWriter.endObject();
    }

    private static ListTagOptionsFiltersJsonMarshaller instance;

    public static ListTagOptionsFiltersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListTagOptionsFiltersJsonMarshaller();
        return instance;
    }
}
