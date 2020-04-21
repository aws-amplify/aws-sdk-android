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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NetworkConnectionAction
 */
class NetworkConnectionActionJsonMarshaller {

    public void marshall(NetworkConnectionAction networkConnectionAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (networkConnectionAction.getBlocked() != null) {
            Boolean blocked = networkConnectionAction.getBlocked();
            jsonWriter.name("Blocked");
            jsonWriter.value(blocked);
        }
        if (networkConnectionAction.getConnectionDirection() != null) {
            String connectionDirection = networkConnectionAction.getConnectionDirection();
            jsonWriter.name("ConnectionDirection");
            jsonWriter.value(connectionDirection);
        }
        if (networkConnectionAction.getLocalPortDetails() != null) {
            LocalPortDetails localPortDetails = networkConnectionAction.getLocalPortDetails();
            jsonWriter.name("LocalPortDetails");
            LocalPortDetailsJsonMarshaller.getInstance().marshall(localPortDetails, jsonWriter);
        }
        if (networkConnectionAction.getProtocol() != null) {
            String protocol = networkConnectionAction.getProtocol();
            jsonWriter.name("Protocol");
            jsonWriter.value(protocol);
        }
        if (networkConnectionAction.getLocalIpDetails() != null) {
            LocalIpDetails localIpDetails = networkConnectionAction.getLocalIpDetails();
            jsonWriter.name("LocalIpDetails");
            LocalIpDetailsJsonMarshaller.getInstance().marshall(localIpDetails, jsonWriter);
        }
        if (networkConnectionAction.getRemoteIpDetails() != null) {
            RemoteIpDetails remoteIpDetails = networkConnectionAction.getRemoteIpDetails();
            jsonWriter.name("RemoteIpDetails");
            RemoteIpDetailsJsonMarshaller.getInstance().marshall(remoteIpDetails, jsonWriter);
        }
        if (networkConnectionAction.getRemotePortDetails() != null) {
            RemotePortDetails remotePortDetails = networkConnectionAction.getRemotePortDetails();
            jsonWriter.name("RemotePortDetails");
            RemotePortDetailsJsonMarshaller.getInstance().marshall(remotePortDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NetworkConnectionActionJsonMarshaller instance;

    public static NetworkConnectionActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkConnectionActionJsonMarshaller();
        return instance;
    }
}
