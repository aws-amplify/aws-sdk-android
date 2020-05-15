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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceUri
 */
class ResourceUriJsonMarshaller {

    public void marshall(ResourceUri resourceUri, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceUri.getResourceType() != null) {
            String resourceType = resourceUri.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (resourceUri.getUri() != null) {
            String uri = resourceUri.getUri();
            jsonWriter.name("Uri");
            jsonWriter.value(uri);
        }
        jsonWriter.endObject();
    }

    private static ResourceUriJsonMarshaller instance;

    public static ResourceUriJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceUriJsonMarshaller();
        return instance;
    }
}
