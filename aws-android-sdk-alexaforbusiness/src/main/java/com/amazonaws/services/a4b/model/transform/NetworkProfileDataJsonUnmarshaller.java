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
 * JSON unmarshaller for POJO NetworkProfileData
 */
class NetworkProfileDataJsonUnmarshaller implements
        Unmarshaller<NetworkProfileData, JsonUnmarshallerContext> {

    public NetworkProfileData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkProfileData networkProfileData = new NetworkProfileData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NetworkProfileArn")) {
                networkProfileData.setNetworkProfileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkProfileName")) {
                networkProfileData.setNetworkProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                networkProfileData.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ssid")) {
                networkProfileData.setSsid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityType")) {
                networkProfileData.setSecurityType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EapMethod")) {
                networkProfileData.setEapMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateAuthorityArn")) {
                networkProfileData.setCertificateAuthorityArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkProfileData;
    }

    private static NetworkProfileDataJsonUnmarshaller instance;

    public static NetworkProfileDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkProfileDataJsonUnmarshaller();
        return instance;
    }
}
