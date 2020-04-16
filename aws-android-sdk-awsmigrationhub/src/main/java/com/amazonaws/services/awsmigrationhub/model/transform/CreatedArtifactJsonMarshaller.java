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

package com.amazonaws.services.awsmigrationhub.model.transform;

import com.amazonaws.services.awsmigrationhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreatedArtifact
 */
class CreatedArtifactJsonMarshaller {

    public void marshall(CreatedArtifact createdArtifact, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (createdArtifact.getName() != null) {
            String name = createdArtifact.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (createdArtifact.getDescription() != null) {
            String description = createdArtifact.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static CreatedArtifactJsonMarshaller instance;

    public static CreatedArtifactJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreatedArtifactJsonMarshaller();
        return instance;
    }
}
