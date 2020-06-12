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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FindMatchesParameters
 */
class FindMatchesParametersJsonUnmarshaller implements
        Unmarshaller<FindMatchesParameters, JsonUnmarshallerContext> {

    public FindMatchesParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FindMatchesParameters findMatchesParameters = new FindMatchesParameters();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PrimaryKeyColumnName")) {
                findMatchesParameters.setPrimaryKeyColumnName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrecisionRecallTradeoff")) {
                findMatchesParameters.setPrecisionRecallTradeoff(DoubleJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccuracyCostTradeoff")) {
                findMatchesParameters.setAccuracyCostTradeoff(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EnforceProvidedLabels")) {
                findMatchesParameters.setEnforceProvidedLabels(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return findMatchesParameters;
    }

    private static FindMatchesParametersJsonUnmarshaller instance;

    public static FindMatchesParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FindMatchesParametersJsonUnmarshaller();
        return instance;
    }
}
