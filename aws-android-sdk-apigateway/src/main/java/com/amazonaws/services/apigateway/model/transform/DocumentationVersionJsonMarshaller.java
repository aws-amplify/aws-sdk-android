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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DocumentationVersion
 */
class DocumentationVersionJsonMarshaller {

    public void marshall(DocumentationVersion documentationVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (documentationVersion.getVersion() != null) {
            String version = documentationVersion.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (documentationVersion.getCreatedDate() != null) {
            java.util.Date createdDate = documentationVersion.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (documentationVersion.getDescription() != null) {
            String description = documentationVersion.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static DocumentationVersionJsonMarshaller instance;

    public static DocumentationVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentationVersionJsonMarshaller();
        return instance;
    }
}
