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
package com.amazonaws.services.application-autoscaling.model.transform;

import com.amazonaws.services.application-autoscaling.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PredefinedMetricSpecification
 */
class PredefinedMetricSpecificationJsonMarshaller {

    public void marshall(PredefinedMetricSpecification predefinedMetricSpecification, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (predefinedMetricSpecification.getPredefinedMetricType() != null) {
            String predefinedMetricType = predefinedMetricSpecification.getPredefinedMetricType();
            jsonWriter.name("PredefinedMetricType");
            jsonWriter.value(predefinedMetricType);
        }
        if (predefinedMetricSpecification.getResourceLabel() != null) {
            String resourceLabel = predefinedMetricSpecification.getResourceLabel();
            jsonWriter.name("ResourceLabel");
            jsonWriter.value(resourceLabel);
        }
        jsonWriter.endObject();
    }

    private static PredefinedMetricSpecificationJsonMarshaller instance;
    public static PredefinedMetricSpecificationJsonMarshaller getInstance() {
        if (instance == null) instance = new PredefinedMetricSpecificationJsonMarshaller();
        return instance;
    }
}
