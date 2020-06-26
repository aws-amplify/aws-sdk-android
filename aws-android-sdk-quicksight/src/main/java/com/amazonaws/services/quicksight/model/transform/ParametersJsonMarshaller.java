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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Parameters
 */
class ParametersJsonMarshaller {

    public void marshall(Parameters parameters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (parameters.getStringParameters() != null) {
            java.util.List<StringParameter> stringParameters = parameters.getStringParameters();
            jsonWriter.name("StringParameters");
            jsonWriter.beginArray();
            for (StringParameter stringParametersItem : stringParameters) {
                if (stringParametersItem != null) {
                    StringParameterJsonMarshaller.getInstance().marshall(stringParametersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (parameters.getIntegerParameters() != null) {
            java.util.List<IntegerParameter> integerParameters = parameters.getIntegerParameters();
            jsonWriter.name("IntegerParameters");
            jsonWriter.beginArray();
            for (IntegerParameter integerParametersItem : integerParameters) {
                if (integerParametersItem != null) {
                    IntegerParameterJsonMarshaller.getInstance().marshall(integerParametersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (parameters.getDecimalParameters() != null) {
            java.util.List<DecimalParameter> decimalParameters = parameters.getDecimalParameters();
            jsonWriter.name("DecimalParameters");
            jsonWriter.beginArray();
            for (DecimalParameter decimalParametersItem : decimalParameters) {
                if (decimalParametersItem != null) {
                    DecimalParameterJsonMarshaller.getInstance().marshall(decimalParametersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (parameters.getDateTimeParameters() != null) {
            java.util.List<DateTimeParameter> dateTimeParameters = parameters
                    .getDateTimeParameters();
            jsonWriter.name("DateTimeParameters");
            jsonWriter.beginArray();
            for (DateTimeParameter dateTimeParametersItem : dateTimeParameters) {
                if (dateTimeParametersItem != null) {
                    DateTimeParameterJsonMarshaller.getInstance().marshall(dateTimeParametersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ParametersJsonMarshaller instance;

    public static ParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ParametersJsonMarshaller();
        return instance;
    }
}
