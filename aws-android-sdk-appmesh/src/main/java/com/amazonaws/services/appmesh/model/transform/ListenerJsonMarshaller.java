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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Listener
 */
class ListenerJsonMarshaller {

    public void marshall(Listener listener, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listener.getHealthCheck() != null) {
            HealthCheckPolicy healthCheck = listener.getHealthCheck();
            jsonWriter.name("healthCheck");
            HealthCheckPolicyJsonMarshaller.getInstance().marshall(healthCheck, jsonWriter);
        }
        if (listener.getPortMapping() != null) {
            PortMapping portMapping = listener.getPortMapping();
            jsonWriter.name("portMapping");
            PortMappingJsonMarshaller.getInstance().marshall(portMapping, jsonWriter);
        }
        if (listener.getTimeout() != null) {
            ListenerTimeout timeout = listener.getTimeout();
            jsonWriter.name("timeout");
            ListenerTimeoutJsonMarshaller.getInstance().marshall(timeout, jsonWriter);
        }
        if (listener.getTls() != null) {
            ListenerTls tls = listener.getTls();
            jsonWriter.name("tls");
            ListenerTlsJsonMarshaller.getInstance().marshall(tls, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ListenerJsonMarshaller instance;

    public static ListenerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListenerJsonMarshaller();
        return instance;
    }
}
