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

package com.amazonaws.services.kinesisvideosignaling.model.transform;

import com.amazonaws.services.kinesisvideosignaling.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IceServer
 */
class IceServerJsonMarshaller {

    public void marshall(IceServer iceServer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (iceServer.getUris() != null) {
            java.util.List<String> uris = iceServer.getUris();
            jsonWriter.name("Uris");
            jsonWriter.beginArray();
            for (String urisItem : uris) {
                if (urisItem != null) {
                    jsonWriter.value(urisItem);
                }
            }
            jsonWriter.endArray();
        }
        if (iceServer.getUsername() != null) {
            String username = iceServer.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (iceServer.getPassword() != null) {
            String password = iceServer.getPassword();
            jsonWriter.name("Password");
            jsonWriter.value(password);
        }
        if (iceServer.getTtl() != null) {
            Integer ttl = iceServer.getTtl();
            jsonWriter.name("Ttl");
            jsonWriter.value(ttl);
        }
        jsonWriter.endObject();
    }

    private static IceServerJsonMarshaller instance;

    public static IceServerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IceServerJsonMarshaller();
        return instance;
    }
}
