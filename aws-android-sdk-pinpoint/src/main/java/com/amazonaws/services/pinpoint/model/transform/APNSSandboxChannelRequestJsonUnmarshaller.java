/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO APNSSandboxChannelRequest
 */
class APNSSandboxChannelRequestJsonUnmarshaller implements
        Unmarshaller<APNSSandboxChannelRequest, JsonUnmarshallerContext> {

    public APNSSandboxChannelRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        APNSSandboxChannelRequest aPNSSandboxChannelRequest = new APNSSandboxChannelRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BundleId")) {
                aPNSSandboxChannelRequest.setBundleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Certificate")) {
                aPNSSandboxChannelRequest.setCertificate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAuthenticationMethod")) {
                aPNSSandboxChannelRequest.setDefaultAuthenticationMethod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                aPNSSandboxChannelRequest.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateKey")) {
                aPNSSandboxChannelRequest.setPrivateKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TeamId")) {
                aPNSSandboxChannelRequest.setTeamId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TokenKey")) {
                aPNSSandboxChannelRequest.setTokenKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TokenKeyId")) {
                aPNSSandboxChannelRequest.setTokenKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aPNSSandboxChannelRequest;
    }

    private static APNSSandboxChannelRequestJsonUnmarshaller instance;

    public static APNSSandboxChannelRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSSandboxChannelRequestJsonUnmarshaller();
        return instance;
    }
}
