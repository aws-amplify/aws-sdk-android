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
 * JSON marshaller for POJO DefaultHyperParameterRanges
 */
class DefaultHyperParameterRangesJsonMarshaller {

    public void marshall(DefaultHyperParameterRanges defaultHyperParameterRanges,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (defaultHyperParameterRanges.getIntegerHyperParameterRanges() != null) {
            java.util.List<DefaultIntegerHyperParameterRange> integerHyperParameterRanges = defaultHyperParameterRanges
                    .getIntegerHyperParameterRanges();
            jsonWriter.name("integerHyperParameterRanges");
            jsonWriter.beginArray();
            for (DefaultIntegerHyperParameterRange integerHyperParameterRangesItem : integerHyperParameterRanges) {
                if (integerHyperParameterRangesItem != null) {
                    DefaultIntegerHyperParameterRangeJsonMarshaller.getInstance().marshall(
                            integerHyperParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (defaultHyperParameterRanges.getContinuousHyperParameterRanges() != null) {
            java.util.List<DefaultContinuousHyperParameterRange> continuousHyperParameterRanges = defaultHyperParameterRanges
                    .getContinuousHyperParameterRanges();
            jsonWriter.name("continuousHyperParameterRanges");
            jsonWriter.beginArray();
            for (DefaultContinuousHyperParameterRange continuousHyperParameterRangesItem : continuousHyperParameterRanges) {
                if (continuousHyperParameterRangesItem != null) {
                    DefaultContinuousHyperParameterRangeJsonMarshaller.getInstance().marshall(
                            continuousHyperParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (defaultHyperParameterRanges.getCategoricalHyperParameterRanges() != null) {
            java.util.List<DefaultCategoricalHyperParameterRange> categoricalHyperParameterRanges = defaultHyperParameterRanges
                    .getCategoricalHyperParameterRanges();
            jsonWriter.name("categoricalHyperParameterRanges");
            jsonWriter.beginArray();
            for (DefaultCategoricalHyperParameterRange categoricalHyperParameterRangesItem : categoricalHyperParameterRanges) {
                if (categoricalHyperParameterRangesItem != null) {
                    DefaultCategoricalHyperParameterRangeJsonMarshaller.getInstance().marshall(
                            categoricalHyperParameterRangesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DefaultHyperParameterRangesJsonMarshaller instance;

    public static DefaultHyperParameterRangesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DefaultHyperParameterRangesJsonMarshaller();
        return instance;
    }
}
