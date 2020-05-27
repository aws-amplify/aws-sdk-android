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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NetworkConnectionAction
 */
class NetworkConnectionActionJsonUnmarshaller implements
        Unmarshaller<NetworkConnectionAction, JsonUnmarshallerContext> {

    public NetworkConnectionAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkConnectionAction networkConnectionAction = new NetworkConnectionAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Blocked")) {
                networkConnectionAction.setBlocked(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionDirection")) {
                networkConnectionAction.setConnectionDirection(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalPortDetails")) {
                networkConnectionAction.setLocalPortDetails(LocalPortDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Protocol")) {
                networkConnectionAction.setProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalIpDetails")) {
                networkConnectionAction.setLocalIpDetails(LocalIpDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RemoteIpDetails")) {
                networkConnectionAction.setRemoteIpDetails(RemoteIpDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RemotePortDetails")) {
                networkConnectionAction.setRemotePortDetails(RemotePortDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkConnectionAction;
    }

    private static NetworkConnectionActionJsonUnmarshaller instance;

    public static NetworkConnectionActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkConnectionActionJsonUnmarshaller();
        return instance;
    }
}
