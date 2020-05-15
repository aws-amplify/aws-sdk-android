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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TransformParameters
 */
class TransformParametersJsonMarshaller {

    public void marshall(TransformParameters transformParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transformParameters.getTransformType() != null) {
            String transformType = transformParameters.getTransformType();
            jsonWriter.name("TransformType");
            jsonWriter.value(transformType);
        }
        if (transformParameters.getFindMatchesParameters() != null) {
            FindMatchesParameters findMatchesParameters = transformParameters
                    .getFindMatchesParameters();
            jsonWriter.name("FindMatchesParameters");
            FindMatchesParametersJsonMarshaller.getInstance().marshall(findMatchesParameters,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TransformParametersJsonMarshaller instance;

    public static TransformParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransformParametersJsonMarshaller();
        return instance;
    }
}
