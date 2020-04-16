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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Network
 */
class NetworkJsonUnmarshaller implements Unmarshaller<Network, JsonUnmarshallerContext> {

    public Network unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Network network = new Network();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Direction")) {
                network.setDirection(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Protocol")) {
                network.setProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceIpV4")) {
                network.setSourceIpV4(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceIpV6")) {
                network.setSourceIpV6(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourcePort")) {
                network.setSourcePort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceDomain")) {
                network.setSourceDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceMac")) {
                network.setSourceMac(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationIpV4")) {
                network.setDestinationIpV4(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationIpV6")) {
                network.setDestinationIpV6(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationPort")) {
                network.setDestinationPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationDomain")) {
                network.setDestinationDomain(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return network;
    }

    private static NetworkJsonUnmarshaller instance;

    public static NetworkJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkJsonUnmarshaller();
        return instance;
    }
}
