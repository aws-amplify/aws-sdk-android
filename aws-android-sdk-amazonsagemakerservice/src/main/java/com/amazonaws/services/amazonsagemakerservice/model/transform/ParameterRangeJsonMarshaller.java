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
 * JSON marshaller for POJO ParameterRange
 */
class ParameterRangeJsonMarshaller {

    public void marshall(ParameterRange parameterRange, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (parameterRange.getIntegerParameterRangeSpecification() != null) {
            IntegerParameterRangeSpecification integerParameterRangeSpecification = parameterRange
                    .getIntegerParameterRangeSpecification();
            jsonWriter.name("IntegerParameterRangeSpecification");
            IntegerParameterRangeSpecificationJsonMarshaller.getInstance().marshall(
                    integerParameterRangeSpecification, jsonWriter);
        }
        if (parameterRange.getContinuousParameterRangeSpecification() != null) {
            ContinuousParameterRangeSpecification continuousParameterRangeSpecification = parameterRange
                    .getContinuousParameterRangeSpecification();
            jsonWriter.name("ContinuousParameterRangeSpecification");
            ContinuousParameterRangeSpecificationJsonMarshaller.getInstance().marshall(
                    continuousParameterRangeSpecification, jsonWriter);
        }
        if (parameterRange.getCategoricalParameterRangeSpecification() != null) {
            CategoricalParameterRangeSpecification categoricalParameterRangeSpecification = parameterRange
                    .getCategoricalParameterRangeSpecification();
            jsonWriter.name("CategoricalParameterRangeSpecification");
            CategoricalParameterRangeSpecificationJsonMarshaller.getInstance().marshall(
                    categoricalParameterRangeSpecification, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ParameterRangeJsonMarshaller instance;

    public static ParameterRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterRangeJsonMarshaller();
        return instance;
    }
}
