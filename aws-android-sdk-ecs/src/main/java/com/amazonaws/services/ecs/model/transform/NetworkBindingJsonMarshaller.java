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
 * JSON marshaller for POJO NetworkBinding
 */
class NetworkBindingJsonMarshaller {

    public void marshall(NetworkBinding networkBinding, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkBinding.getBindIP() != null) {
            String bindIP = networkBinding.getBindIP();
            jsonWriter.name("bindIP");
            jsonWriter.value(bindIP);
        }
        if (networkBinding.getContainerPort() != null) {
            Integer containerPort = networkBinding.getContainerPort();
            jsonWriter.name("containerPort");
            jsonWriter.value(containerPort);
        }
        if (networkBinding.getHostPort() != null) {
            Integer hostPort = networkBinding.getHostPort();
            jsonWriter.name("hostPort");
            jsonWriter.value(hostPort);
        }
        if (networkBinding.getProtocol() != null) {
            String protocol = networkBinding.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        jsonWriter.endObject();
    }

    private static NetworkBindingJsonMarshaller instance;

    public static NetworkBindingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkBindingJsonMarshaller();
        return instance;
    }
}
