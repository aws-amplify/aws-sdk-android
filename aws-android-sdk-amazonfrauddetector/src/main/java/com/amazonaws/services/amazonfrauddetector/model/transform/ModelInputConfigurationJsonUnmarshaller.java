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

package com.amazonaws.services.amazonfrauddetector.model.transform;

import com.amazonaws.services.amazonfrauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ModelInputConfiguration
 */
class ModelInputConfigurationJsonUnmarshaller implements
        Unmarshaller<ModelInputConfiguration, JsonUnmarshallerContext> {

    public ModelInputConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ModelInputConfiguration modelInputConfiguration = new ModelInputConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("format")) {
                modelInputConfiguration.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isOpaque")) {
                modelInputConfiguration.setIsOpaque(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("jsonInputTemplate")) {
                modelInputConfiguration.setJsonInputTemplate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("csvInputTemplate")) {
                modelInputConfiguration.setCsvInputTemplate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return modelInputConfiguration;
    }

    private static ModelInputConfigurationJsonUnmarshaller instance;

    public static ModelInputConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelInputConfigurationJsonUnmarshaller();
        return instance;
    }
}
