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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Severity
 */
class SeverityJsonMarshaller {

    public void marshall(Severity severity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (severity.getProduct() != null) {
            Double product = severity.getProduct();
            jsonWriter.name("Product");
            jsonWriter.value(product);
        }
        if (severity.getLabel() != null) {
            String label = severity.getLabel();
            jsonWriter.name("Label");
            jsonWriter.value(label);
        }
        if (severity.getNormalized() != null) {
            Integer normalized = severity.getNormalized();
            jsonWriter.name("Normalized");
            jsonWriter.value(normalized);
        }
        jsonWriter.endObject();
    }

    private static SeverityJsonMarshaller instance;

    public static SeverityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SeverityJsonMarshaller();
        return instance;
    }
}
