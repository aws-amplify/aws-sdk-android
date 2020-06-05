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
 * JSON marshaller for POJO ServiceActionDetail
 */
class ServiceActionDetailJsonMarshaller {

    public void marshall(ServiceActionDetail serviceActionDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (serviceActionDetail.getServiceActionSummary() != null) {
            ServiceActionSummary serviceActionSummary = serviceActionDetail
                    .getServiceActionSummary();
            jsonWriter.name("ServiceActionSummary");
            ServiceActionSummaryJsonMarshaller.getInstance().marshall(serviceActionSummary,
                    jsonWriter);
        }
        if (serviceActionDetail.getDefinition() != null) {
            java.util.Map<String, String> definition = serviceActionDetail.getDefinition();
            jsonWriter.name("Definition");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> definitionEntry : definition.entrySet()) {
                String definitionValue = definitionEntry.getValue();
                if (definitionValue != null) {
                    jsonWriter.name(definitionEntry.getKey());
                    jsonWriter.value(definitionValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ServiceActionDetailJsonMarshaller instance;

    public static ServiceActionDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceActionDetailJsonMarshaller();
        return instance;
    }
}
