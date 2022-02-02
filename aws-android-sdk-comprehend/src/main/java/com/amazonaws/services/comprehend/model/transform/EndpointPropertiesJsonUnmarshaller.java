/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EndpointProperties
 */
class EndpointPropertiesJsonUnmarshaller implements
        Unmarshaller<EndpointProperties, JsonUnmarshallerContext> {

    public EndpointProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EndpointProperties endpointProperties = new EndpointProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EndpointArn")) {
                endpointProperties.setEndpointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                endpointProperties.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Message")) {
                endpointProperties.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelArn")) {
                endpointProperties.setModelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DesiredModelArn")) {
                endpointProperties.setDesiredModelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DesiredInferenceUnits")) {
                endpointProperties.setDesiredInferenceUnits(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentInferenceUnits")) {
                endpointProperties.setCurrentInferenceUnits(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                endpointProperties.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                endpointProperties.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataAccessRoleArn")) {
                endpointProperties.setDataAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DesiredDataAccessRoleArn")) {
                endpointProperties.setDesiredDataAccessRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return endpointProperties;
    }

    private static EndpointPropertiesJsonUnmarshaller instance;

    public static EndpointPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointPropertiesJsonUnmarshaller();
        return instance;
    }
}
