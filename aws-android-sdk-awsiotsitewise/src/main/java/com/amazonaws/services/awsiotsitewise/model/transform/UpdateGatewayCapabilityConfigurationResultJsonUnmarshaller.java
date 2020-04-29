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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateGatewayCapabilityConfigurationResult
 */
public class UpdateGatewayCapabilityConfigurationResultJsonUnmarshaller implements
        Unmarshaller<UpdateGatewayCapabilityConfigurationResult, JsonUnmarshallerContext> {

    public UpdateGatewayCapabilityConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateGatewayCapabilityConfigurationResult updateGatewayCapabilityConfigurationResult = new UpdateGatewayCapabilityConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("capabilityNamespace")) {
                updateGatewayCapabilityConfigurationResult
                        .setCapabilityNamespace(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("capabilitySyncStatus")) {
                updateGatewayCapabilityConfigurationResult
                        .setCapabilitySyncStatus(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateGatewayCapabilityConfigurationResult;
    }

    private static UpdateGatewayCapabilityConfigurationResultJsonUnmarshaller instance;

    public static UpdateGatewayCapabilityConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateGatewayCapabilityConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
