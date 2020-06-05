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
 * JSON marshaller for POJO ResourceDetail
 */
class ResourceDetailJsonMarshaller {

    public void marshall(ResourceDetail resourceDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceDetail.getId() != null) {
            String id = resourceDetail.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (resourceDetail.getARN() != null) {
            String aRN = resourceDetail.getARN();
            jsonWriter.name("ARN");
            jsonWriter.value(aRN);
        }
        if (resourceDetail.getName() != null) {
            String name = resourceDetail.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (resourceDetail.getDescription() != null) {
            String description = resourceDetail.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (resourceDetail.getCreatedTime() != null) {
            java.util.Date createdTime = resourceDetail.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        jsonWriter.endObject();
    }

    private static ResourceDetailJsonMarshaller instance;

    public static ResourceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDetailJsonMarshaller();
        return instance;
    }
}
