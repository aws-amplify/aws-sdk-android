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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProxySession
 */
class ProxySessionJsonUnmarshaller implements Unmarshaller<ProxySession, JsonUnmarshallerContext> {

    public ProxySession unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProxySession proxySession = new ProxySession();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VoiceConnectorId")) {
                proxySession.setVoiceConnectorId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProxySessionId")) {
                proxySession.setProxySessionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                proxySession.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                proxySession.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExpiryMinutes")) {
                proxySession.setExpiryMinutes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Capabilities")) {
                proxySession.setCapabilities(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreatedTimestamp")) {
                proxySession.setCreatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedTimestamp")) {
                proxySession.setUpdatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndedTimestamp")) {
                proxySession.setEndedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Participants")) {
                proxySession.setParticipants(new ListUnmarshaller<Participant>(
                        ParticipantJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NumberSelectionBehavior")) {
                proxySession.setNumberSelectionBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GeoMatchLevel")) {
                proxySession.setGeoMatchLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GeoMatchParams")) {
                proxySession.setGeoMatchParams(GeoMatchParamsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return proxySession;
    }

    private static ProxySessionJsonUnmarshaller instance;

    public static ProxySessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProxySessionJsonUnmarshaller();
        return instance;
    }
}
