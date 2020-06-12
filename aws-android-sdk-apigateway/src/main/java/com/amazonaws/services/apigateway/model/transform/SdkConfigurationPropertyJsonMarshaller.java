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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SdkConfigurationProperty
 */
class SdkConfigurationPropertyJsonMarshaller {

    public void marshall(SdkConfigurationProperty sdkConfigurationProperty, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sdkConfigurationProperty.getName() != null) {
            String name = sdkConfigurationProperty.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (sdkConfigurationProperty.getFriendlyName() != null) {
            String friendlyName = sdkConfigurationProperty.getFriendlyName();
            jsonWriter.name("friendlyName");
            jsonWriter.value(friendlyName);
        }
        if (sdkConfigurationProperty.getDescription() != null) {
            String description = sdkConfigurationProperty.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (sdkConfigurationProperty.getRequired() != null) {
            Boolean required = sdkConfigurationProperty.getRequired();
            jsonWriter.name("required");
            jsonWriter.value(required);
        }
        if (sdkConfigurationProperty.getDefaultValue() != null) {
            String defaultValue = sdkConfigurationProperty.getDefaultValue();
            jsonWriter.name("defaultValue");
            jsonWriter.value(defaultValue);
        }
        jsonWriter.endObject();
    }

    private static SdkConfigurationPropertyJsonMarshaller instance;

    public static SdkConfigurationPropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SdkConfigurationPropertyJsonMarshaller();
        return instance;
    }
}
