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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NetworkProfile
 */
class NetworkProfileJsonUnmarshaller implements
        Unmarshaller<NetworkProfile, JsonUnmarshallerContext> {

    public NetworkProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkProfile networkProfile = new NetworkProfile();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NetworkProfileArn")) {
                networkProfile.setNetworkProfileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkProfileName")) {
                networkProfile.setNetworkProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                networkProfile.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ssid")) {
                networkProfile.setSsid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityType")) {
                networkProfile.setSecurityType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EapMethod")) {
                networkProfile.setEapMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrentPassword")) {
                networkProfile.setCurrentPassword(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NextPassword")) {
                networkProfile.setNextPassword(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateAuthorityArn")) {
                networkProfile.setCertificateAuthorityArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrustAnchors")) {
                networkProfile.setTrustAnchors(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkProfile;
    }

    private static NetworkProfileJsonUnmarshaller instance;

    public static NetworkProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkProfileJsonUnmarshaller();
        return instance;
    }
}
