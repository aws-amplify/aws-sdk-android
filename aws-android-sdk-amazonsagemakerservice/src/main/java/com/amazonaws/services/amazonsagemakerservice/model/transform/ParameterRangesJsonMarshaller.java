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
 * JSON marshaller for POJO ParameterRanges
 */
class ParameterRangesJsonMarshaller {

    public void marshall(ParameterRanges parameterRanges, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (parameterRanges.getIntegerParameterRanges() != null) {
            java.util.List<IntegerParameterRange> integerParameterRanges = parameterRanges
                    .getIntegerParameterRanges();
            jsonWriter.name("IntegerParameterRanges");
            jsonWriter.beginArray();
            for (IntegerParameterRange integerParameterRangesItem : integerParameterRanges) {
                if (integerParameterRangesItem != null) {
                    IntegerParameterRangeJsonMarshaller.getInstance().marshall(
                            integerParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (parameterRanges.getContinuousParameterRanges() != null) {
            java.util.List<ContinuousParameterRange> continuousParameterRanges = parameterRanges
                    .getContinuousParameterRanges();
            jsonWriter.name("ContinuousParameterRanges");
            jsonWriter.beginArray();
            for (ContinuousParameterRange continuousParameterRangesItem : continuousParameterRanges) {
                if (continuousParameterRangesItem != null) {
                    ContinuousParameterRangeJsonMarshaller.getInstance().marshall(
                            continuousParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (parameterRanges.getCategoricalParameterRanges() != null) {
            java.util.List<CategoricalParameterRange> categoricalParameterRanges = parameterRanges
                    .getCategoricalParameterRanges();
            jsonWriter.name("CategoricalParameterRanges");
            jsonWriter.beginArray();
            for (CategoricalParameterRange categoricalParameterRangesItem : categoricalParameterRanges) {
                if (categoricalParameterRangesItem != null) {
                    CategoricalParameterRangeJsonMarshaller.getInstance().marshall(
                            categoricalParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ParameterRangesJsonMarshaller instance;

    public static ParameterRangesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterRangesJsonMarshaller();
        return instance;
    }
}
