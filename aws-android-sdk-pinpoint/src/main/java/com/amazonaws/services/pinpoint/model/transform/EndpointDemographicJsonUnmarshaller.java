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
 * JSON unmarshaller for POJO EndpointDemographic
 */
class EndpointDemographicJsonUnmarshaller implements
        Unmarshaller<EndpointDemographic, JsonUnmarshallerContext> {

    public EndpointDemographic unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EndpointDemographic endpointDemographic = new EndpointDemographic();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AppVersion")) {
                endpointDemographic.setAppVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Locale")) {
                endpointDemographic.setLocale(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Make")) {
                endpointDemographic.setMake(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Model")) {
                endpointDemographic.setModel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelVersion")) {
                endpointDemographic.setModelVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                endpointDemographic.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlatformVersion")) {
                endpointDemographic.setPlatformVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timezone")) {
                endpointDemographic.setTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpointDemographic;
    }

    private static EndpointDemographicJsonUnmarshaller instance;

    public static EndpointDemographicJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointDemographicJsonUnmarshaller();
        return instance;
    }
}
