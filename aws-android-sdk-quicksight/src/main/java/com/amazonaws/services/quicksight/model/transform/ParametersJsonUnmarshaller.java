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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Parameters
 */
class ParametersJsonUnmarshaller implements Unmarshaller<Parameters, JsonUnmarshallerContext> {

    public Parameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Parameters parameters = new Parameters();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StringParameters")) {
                parameters.setStringParameters(new ListUnmarshaller<StringParameter>(
                        StringParameterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IntegerParameters")) {
                parameters.setIntegerParameters(new ListUnmarshaller<IntegerParameter>(
                        IntegerParameterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DecimalParameters")) {
                parameters.setDecimalParameters(new ListUnmarshaller<DecimalParameter>(
                        DecimalParameterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DateTimeParameters")) {
                parameters.setDateTimeParameters(new ListUnmarshaller<DateTimeParameter>(
                        DateTimeParameterJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return parameters;
    }

    private static ParametersJsonUnmarshaller instance;

    public static ParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParametersJsonUnmarshaller();
        return instance;
    }
}
