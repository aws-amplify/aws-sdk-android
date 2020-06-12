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
 * JSON marshaller for POJO SdkType
 */
class SdkTypeJsonMarshaller {

    public void marshall(SdkType sdkType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sdkType.getId() != null) {
            String id = sdkType.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (sdkType.getFriendlyName() != null) {
            String friendlyName = sdkType.getFriendlyName();
            jsonWriter.name("friendlyName");
            jsonWriter.value(friendlyName);
        }
        if (sdkType.getDescription() != null) {
            String description = sdkType.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (sdkType.getConfigurationProperties() != null) {
            java.util.List<SdkConfigurationProperty> configurationProperties = sdkType
                    .getConfigurationProperties();
            jsonWriter.name("configurationProperties");
            jsonWriter.beginArray();
            for (SdkConfigurationProperty configurationPropertiesItem : configurationProperties) {
                if (configurationPropertiesItem != null) {
                    SdkConfigurationPropertyJsonMarshaller.getInstance().marshall(
                            configurationPropertiesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SdkTypeJsonMarshaller instance;

    public static SdkTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SdkTypeJsonMarshaller();
        return instance;
    }
}
