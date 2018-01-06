/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO EndpointSendConfiguration
 */
class EndpointSendConfigurationJsonUnmarshaller implements
        Unmarshaller<EndpointSendConfiguration, JsonUnmarshallerContext> {

    public EndpointSendConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EndpointSendConfiguration endpointSendConfiguration = new EndpointSendConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BodyOverride")) {
                endpointSendConfiguration.setBodyOverride(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Context")) {
                endpointSendConfiguration.setContext(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("RawContent")) {
                endpointSendConfiguration.setRawContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Substitutions")) {
                endpointSendConfiguration
                        .setSubstitutions(new MapUnmarshaller<java.util.List<String>>(
                                new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("TitleOverride")) {
                endpointSendConfiguration.setTitleOverride(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpointSendConfiguration;
    }

    private static EndpointSendConfigurationJsonUnmarshaller instance;

    public static EndpointSendConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointSendConfigurationJsonUnmarshaller();
        return instance;
    }
}
