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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Handshake
 */
class HandshakeJsonUnmarshaller implements Unmarshaller<Handshake, JsonUnmarshallerContext> {

    public Handshake unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Handshake handshake = new Handshake();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                handshake.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                handshake.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parties")) {
                handshake.setParties(new ListUnmarshaller<HandshakeParty>(
                        HandshakePartyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("State")) {
                handshake.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestedTimestamp")) {
                handshake.setRequestedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpirationTimestamp")) {
                handshake.setExpirationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Action")) {
                handshake.setAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Resources")) {
                handshake.setResources(new ListUnmarshaller<HandshakeResource>(
                        HandshakeResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return handshake;
    }

    private static HandshakeJsonUnmarshaller instance;

    public static HandshakeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HandshakeJsonUnmarshaller();
        return instance;
    }
}
