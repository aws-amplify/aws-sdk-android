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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HyperParameterRanges
 */
class HyperParameterRangesJsonMarshaller {

    public void marshall(HyperParameterRanges hyperParameterRanges, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterRanges.getIntegerHyperParameterRanges() != null) {
            java.util.List<IntegerHyperParameterRange> integerHyperParameterRanges = hyperParameterRanges
                    .getIntegerHyperParameterRanges();
            jsonWriter.name("integerHyperParameterRanges");
            jsonWriter.beginArray();
            for (IntegerHyperParameterRange integerHyperParameterRangesItem : integerHyperParameterRanges) {
                if (integerHyperParameterRangesItem != null) {
                    IntegerHyperParameterRangeJsonMarshaller.getInstance().marshall(
                            integerHyperParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hyperParameterRanges.getContinuousHyperParameterRanges() != null) {
            java.util.List<ContinuousHyperParameterRange> continuousHyperParameterRanges = hyperParameterRanges
                    .getContinuousHyperParameterRanges();
            jsonWriter.name("continuousHyperParameterRanges");
            jsonWriter.beginArray();
            for (ContinuousHyperParameterRange continuousHyperParameterRangesItem : continuousHyperParameterRanges) {
                if (continuousHyperParameterRangesItem != null) {
                    ContinuousHyperParameterRangeJsonMarshaller.getInstance().marshall(
                            continuousHyperParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hyperParameterRanges.getCategoricalHyperParameterRanges() != null) {
            java.util.List<CategoricalHyperParameterRange> categoricalHyperParameterRanges = hyperParameterRanges
                    .getCategoricalHyperParameterRanges();
            jsonWriter.name("categoricalHyperParameterRanges");
            jsonWriter.beginArray();
            for (CategoricalHyperParameterRange categoricalHyperParameterRangesItem : categoricalHyperParameterRanges) {
                if (categoricalHyperParameterRangesItem != null) {
                    CategoricalHyperParameterRangeJsonMarshaller.getInstance().marshall(
                            categoricalHyperParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HyperParameterRangesJsonMarshaller instance;

    public static HyperParameterRangesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterRangesJsonMarshaller();
        return instance;
    }
}
