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
 * JSON marshaller for POJO ServiceActionSummary
 */
class ServiceActionSummaryJsonMarshaller {

    public void marshall(ServiceActionSummary serviceActionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceActionSummary.getId() != null) {
            String id = serviceActionSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (serviceActionSummary.getName() != null) {
            String name = serviceActionSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (serviceActionSummary.getDescription() != null) {
            String description = serviceActionSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (serviceActionSummary.getDefinitionType() != null) {
            String definitionType = serviceActionSummary.getDefinitionType();
            jsonWriter.name("DefinitionType");
            jsonWriter.value(definitionType);
        }
        jsonWriter.endObject();
    }

    private static ServiceActionSummaryJsonMarshaller instance;

    public static ServiceActionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceActionSummaryJsonMarshaller();
        return instance;
    }
}
