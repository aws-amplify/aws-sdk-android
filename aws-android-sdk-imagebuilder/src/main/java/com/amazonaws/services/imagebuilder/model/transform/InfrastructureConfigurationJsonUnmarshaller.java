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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InfrastructureConfiguration
 */
class InfrastructureConfigurationJsonUnmarshaller implements
        Unmarshaller<InfrastructureConfiguration, JsonUnmarshallerContext> {

    public InfrastructureConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InfrastructureConfiguration infrastructureConfiguration = new InfrastructureConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                infrastructureConfiguration.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                infrastructureConfiguration.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                infrastructureConfiguration.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instanceTypes")) {
                infrastructureConfiguration.setInstanceTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("instanceProfileName")) {
                infrastructureConfiguration.setInstanceProfileName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityGroupIds")) {
                infrastructureConfiguration.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("subnetId")) {
                infrastructureConfiguration.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("logging")) {
                infrastructureConfiguration.setLogging(LoggingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("keyPair")) {
                infrastructureConfiguration.setKeyPair(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("terminateInstanceOnFailure")) {
                infrastructureConfiguration.setTerminateInstanceOnFailure(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("snsTopicArn")) {
                infrastructureConfiguration.setSnsTopicArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateCreated")) {
                infrastructureConfiguration.setDateCreated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateUpdated")) {
                infrastructureConfiguration.setDateUpdated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                infrastructureConfiguration.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return infrastructureConfiguration;
    }

    private static InfrastructureConfigurationJsonUnmarshaller instance;

    public static InfrastructureConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InfrastructureConfigurationJsonUnmarshaller();
        return instance;
    }
}
