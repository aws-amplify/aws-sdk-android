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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ModelInputConfiguration
 */
class ModelInputConfigurationJsonMarshaller {

    public void marshall(ModelInputConfiguration modelInputConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (modelInputConfiguration.getFormat() != null) {
            String format = modelInputConfiguration.getFormat();
            jsonWriter.name("format");
            jsonWriter.value(format);
        }
        if (modelInputConfiguration.getIsOpaque() != null) {
            Boolean isOpaque = modelInputConfiguration.getIsOpaque();
            jsonWriter.name("isOpaque");
            jsonWriter.value(isOpaque);
        }
        if (modelInputConfiguration.getJsonInputTemplate() != null) {
            String jsonInputTemplate = modelInputConfiguration.getJsonInputTemplate();
            jsonWriter.name("jsonInputTemplate");
            jsonWriter.value(jsonInputTemplate);
        }
        if (modelInputConfiguration.getCsvInputTemplate() != null) {
            String csvInputTemplate = modelInputConfiguration.getCsvInputTemplate();
            jsonWriter.name("csvInputTemplate");
            jsonWriter.value(csvInputTemplate);
        }
        jsonWriter.endObject();
    }

    private static ModelInputConfigurationJsonMarshaller instance;

    public static ModelInputConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelInputConfigurationJsonMarshaller();
        return instance;
    }
}
