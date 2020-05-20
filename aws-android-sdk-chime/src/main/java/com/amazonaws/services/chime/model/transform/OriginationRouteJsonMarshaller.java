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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OriginationRoute
 */
class OriginationRouteJsonMarshaller {

    public void marshall(OriginationRoute originationRoute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (originationRoute.getHost() != null) {
            String host = originationRoute.getHost();
            jsonWriter.name("Host");
            jsonWriter.value(host);
        }
        if (originationRoute.getPort() != null) {
            Integer port = originationRoute.getPort();
            jsonWriter.name("Port");
            jsonWriter.value(port);
        }
        if (originationRoute.getProtocol() != null) {
            String protocol = originationRoute.getProtocol();
            jsonWriter.name("Protocol");
            jsonWriter.value(protocol);
        }
        if (originationRoute.getPriority() != null) {
            Integer priority = originationRoute.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (originationRoute.getWeight() != null) {
            Integer weight = originationRoute.getWeight();
            jsonWriter.name("Weight");
            jsonWriter.value(weight);
        }
        jsonWriter.endObject();
    }

    private static OriginationRouteJsonMarshaller instance;

    public static OriginationRouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OriginationRouteJsonMarshaller();
        return instance;
    }
}
