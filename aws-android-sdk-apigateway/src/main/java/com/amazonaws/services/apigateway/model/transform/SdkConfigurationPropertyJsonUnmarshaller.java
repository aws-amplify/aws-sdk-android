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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SdkConfigurationProperty
 */
class SdkConfigurationPropertyJsonUnmarshaller implements
        Unmarshaller<SdkConfigurationProperty, JsonUnmarshallerContext> {

    public SdkConfigurationProperty unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SdkConfigurationProperty sdkConfigurationProperty = new SdkConfigurationProperty();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                sdkConfigurationProperty.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("friendlyName")) {
                sdkConfigurationProperty.setFriendlyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                sdkConfigurationProperty.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("required")) {
                sdkConfigurationProperty.setRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("defaultValue")) {
                sdkConfigurationProperty.setDefaultValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return sdkConfigurationProperty;
    }

    private static SdkConfigurationPropertyJsonUnmarshaller instance;

    public static SdkConfigurationPropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SdkConfigurationPropertyJsonUnmarshaller();
        return instance;
    }
}
