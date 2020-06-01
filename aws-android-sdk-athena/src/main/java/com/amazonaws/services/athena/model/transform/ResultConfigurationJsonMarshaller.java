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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResultConfiguration
 */
class ResultConfigurationJsonMarshaller {

    public void marshall(ResultConfiguration resultConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resultConfiguration.getOutputLocation() != null) {
            String outputLocation = resultConfiguration.getOutputLocation();
            jsonWriter.name("OutputLocation");
            jsonWriter.value(outputLocation);
        }
        if (resultConfiguration.getEncryptionConfiguration() != null) {
            EncryptionConfiguration encryptionConfiguration = resultConfiguration
                    .getEncryptionConfiguration();
            jsonWriter.name("EncryptionConfiguration");
            EncryptionConfigurationJsonMarshaller.getInstance().marshall(encryptionConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResultConfigurationJsonMarshaller instance;

    public static ResultConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResultConfigurationJsonMarshaller();
        return instance;
    }
}
