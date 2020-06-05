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
 * JSON marshaller for POJO TagOptionDetail
 */
class TagOptionDetailJsonMarshaller {

    public void marshall(TagOptionDetail tagOptionDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tagOptionDetail.getKey() != null) {
            String key = tagOptionDetail.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (tagOptionDetail.getValue() != null) {
            String value = tagOptionDetail.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (tagOptionDetail.getActive() != null) {
            Boolean active = tagOptionDetail.getActive();
            jsonWriter.name("Active");
            jsonWriter.value(active);
        }
        if (tagOptionDetail.getId() != null) {
            String id = tagOptionDetail.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        jsonWriter.endObject();
    }

    private static TagOptionDetailJsonMarshaller instance;

    public static TagOptionDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagOptionDetailJsonMarshaller();
        return instance;
    }
}
