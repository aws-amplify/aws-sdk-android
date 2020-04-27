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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HyperParameterSpecification
 */
class HyperParameterSpecificationJsonMarshaller {

    public void marshall(HyperParameterSpecification hyperParameterSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterSpecification.getName() != null) {
            String name = hyperParameterSpecification.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (hyperParameterSpecification.getDescription() != null) {
            String description = hyperParameterSpecification.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (hyperParameterSpecification.getType() != null) {
            String type = hyperParameterSpecification.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (hyperParameterSpecification.getRange() != null) {
            ParameterRange range = hyperParameterSpecification.getRange();
            jsonWriter.name("Range");
            ParameterRangeJsonMarshaller.getInstance().marshall(range, jsonWriter);
        }
        if (hyperParameterSpecification.getIsTunable() != null) {
            Boolean isTunable = hyperParameterSpecification.getIsTunable();
            jsonWriter.name("IsTunable");
            jsonWriter.value(isTunable);
        }
        if (hyperParameterSpecification.getIsRequired() != null) {
            Boolean isRequired = hyperParameterSpecification.getIsRequired();
            jsonWriter.name("IsRequired");
            jsonWriter.value(isRequired);
        }
        if (hyperParameterSpecification.getDefaultValue() != null) {
            String defaultValue = hyperParameterSpecification.getDefaultValue();
            jsonWriter.name("DefaultValue");
            jsonWriter.value(defaultValue);
        }
        jsonWriter.endObject();
    }

    private static HyperParameterSpecificationJsonMarshaller instance;

    public static HyperParameterSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterSpecificationJsonMarshaller();
        return instance;
    }
}
