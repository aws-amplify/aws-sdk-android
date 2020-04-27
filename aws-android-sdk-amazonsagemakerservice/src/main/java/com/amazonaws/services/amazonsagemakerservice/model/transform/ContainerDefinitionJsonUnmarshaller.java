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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ContainerDefinition
 */
class ContainerDefinitionJsonUnmarshaller implements
        Unmarshaller<ContainerDefinition, JsonUnmarshallerContext> {

    public ContainerDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContainerDefinition containerDefinition = new ContainerDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ContainerHostname")) {
                containerDefinition.setContainerHostname(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Image")) {
                containerDefinition.setImage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mode")) {
                containerDefinition.setMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ModelDataUrl")) {
                containerDefinition.setModelDataUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Environment")) {
                containerDefinition.setEnvironment(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ModelPackageName")) {
                containerDefinition.setModelPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return containerDefinition;
    }

    private static ContainerDefinitionJsonUnmarshaller instance;

    public static ContainerDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonUnmarshaller();
        return instance;
    }
}
