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
 * JSON marshaller for POJO ProxySession
 */
class ProxySessionJsonMarshaller {

    public void marshall(ProxySession proxySession, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (proxySession.getVoiceConnectorId() != null) {
            String voiceConnectorId = proxySession.getVoiceConnectorId();
            jsonWriter.name("VoiceConnectorId");
            jsonWriter.value(voiceConnectorId);
        }
        if (proxySession.getProxySessionId() != null) {
            String proxySessionId = proxySession.getProxySessionId();
            jsonWriter.name("ProxySessionId");
            jsonWriter.value(proxySessionId);
        }
        if (proxySession.getName() != null) {
            String name = proxySession.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (proxySession.getStatus() != null) {
            String status = proxySession.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (proxySession.getExpiryMinutes() != null) {
            Integer expiryMinutes = proxySession.getExpiryMinutes();
            jsonWriter.name("ExpiryMinutes");
            jsonWriter.value(expiryMinutes);
        }
        if (proxySession.getCapabilities() != null) {
            java.util.List<String> capabilities = proxySession.getCapabilities();
            jsonWriter.name("Capabilities");
            jsonWriter.beginArray();
            for (String capabilitiesItem : capabilities) {
                if (capabilitiesItem != null) {
                    jsonWriter.value(capabilitiesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (proxySession.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = proxySession.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (proxySession.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = proxySession.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
        }
        if (proxySession.getEndedTimestamp() != null) {
            java.util.Date endedTimestamp = proxySession.getEndedTimestamp();
            jsonWriter.name("EndedTimestamp");
            jsonWriter.value(endedTimestamp);
        }
        if (proxySession.getParticipants() != null) {
            java.util.List<Participant> participants = proxySession.getParticipants();
            jsonWriter.name("Participants");
            jsonWriter.beginArray();
            for (Participant participantsItem : participants) {
                if (participantsItem != null) {
                    ParticipantJsonMarshaller.getInstance().marshall(participantsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (proxySession.getNumberSelectionBehavior() != null) {
            String numberSelectionBehavior = proxySession.getNumberSelectionBehavior();
            jsonWriter.name("NumberSelectionBehavior");
            jsonWriter.value(numberSelectionBehavior);
        }
        if (proxySession.getGeoMatchLevel() != null) {
            String geoMatchLevel = proxySession.getGeoMatchLevel();
            jsonWriter.name("GeoMatchLevel");
            jsonWriter.value(geoMatchLevel);
        }
        if (proxySession.getGeoMatchParams() != null) {
            GeoMatchParams geoMatchParams = proxySession.getGeoMatchParams();
            jsonWriter.name("GeoMatchParams");
            GeoMatchParamsJsonMarshaller.getInstance().marshall(geoMatchParams, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProxySessionJsonMarshaller instance;

    public static ProxySessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProxySessionJsonMarshaller();
        return instance;
    }
}
