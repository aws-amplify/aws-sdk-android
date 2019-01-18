/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AddressConfiguration
 */
class AddressConfigurationJsonUnmarshaller implements
        Unmarshaller<AddressConfiguration, JsonUnmarshallerContext> {

    public AddressConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AddressConfiguration addressConfiguration = new AddressConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BodyOverride")) {
                addressConfiguration.setBodyOverride(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChannelType")) {
                addressConfiguration.setChannelType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Context")) {
                addressConfiguration.setContext(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RawContent")) {
                addressConfiguration.setRawContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Substitutions")) {
                addressConfiguration.setSubstitutions(new MapUnmarshaller<java.util.List<String>>(
                        new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("TitleOverride")) {
                addressConfiguration.setTitleOverride(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return addressConfiguration;
    }

    private static AddressConfigurationJsonUnmarshaller instance;

    public static AddressConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressConfigurationJsonUnmarshaller();
        return instance;
    }
}
