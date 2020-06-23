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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Handshake
 */
class HandshakeJsonMarshaller {

    public void marshall(Handshake handshake, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (handshake.getId() != null) {
            String id = handshake.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (handshake.getArn() != null) {
            String arn = handshake.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (handshake.getParties() != null) {
            java.util.List<HandshakeParty> parties = handshake.getParties();
            jsonWriter.name("Parties");
            jsonWriter.beginArray();
            for (HandshakeParty partiesItem : parties) {
                if (partiesItem != null) {
                    HandshakePartyJsonMarshaller.getInstance().marshall(partiesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (handshake.getState() != null) {
            String state = handshake.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (handshake.getRequestedTimestamp() != null) {
            java.util.Date requestedTimestamp = handshake.getRequestedTimestamp();
            jsonWriter.name("RequestedTimestamp");
            jsonWriter.value(requestedTimestamp);
        }
        if (handshake.getExpirationTimestamp() != null) {
            java.util.Date expirationTimestamp = handshake.getExpirationTimestamp();
            jsonWriter.name("ExpirationTimestamp");
            jsonWriter.value(expirationTimestamp);
        }
        if (handshake.getAction() != null) {
            String action = handshake.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (handshake.getResources() != null) {
            java.util.List<HandshakeResource> resources = handshake.getResources();
            jsonWriter.name("Resources");
            jsonWriter.beginArray();
            for (HandshakeResource resourcesItem : resources) {
                if (resourcesItem != null) {
                    HandshakeResourceJsonMarshaller.getInstance().marshall(resourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static HandshakeJsonMarshaller instance;

    public static HandshakeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HandshakeJsonMarshaller();
        return instance;
    }
}
