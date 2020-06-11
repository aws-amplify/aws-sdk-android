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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PortMapping
 */
class PortMappingJsonMarshaller {

    public void marshall(PortMapping portMapping, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (portMapping.getContainerPort() != null) {
            Integer containerPort = portMapping.getContainerPort();
            jsonWriter.name("containerPort");
            jsonWriter.value(containerPort);
        }
        if (portMapping.getHostPort() != null) {
            Integer hostPort = portMapping.getHostPort();
            jsonWriter.name("hostPort");
            jsonWriter.value(hostPort);
        }
        if (portMapping.getProtocol() != null) {
            String protocol = portMapping.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        jsonWriter.endObject();
    }

    private static PortMappingJsonMarshaller instance;

    public static PortMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortMappingJsonMarshaller();
        return instance;
    }
}
