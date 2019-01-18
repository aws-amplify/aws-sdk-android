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
 * JSON unmarshaller for POJO APNSChannelRequest
 */
class APNSChannelRequestJsonUnmarshaller implements
        Unmarshaller<APNSChannelRequest, JsonUnmarshallerContext> {

    public APNSChannelRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        APNSChannelRequest aPNSChannelRequest = new APNSChannelRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BundleId")) {
                aPNSChannelRequest.setBundleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Certificate")) {
                aPNSChannelRequest.setCertificate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAuthenticationMethod")) {
                aPNSChannelRequest.setDefaultAuthenticationMethod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                aPNSChannelRequest.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateKey")) {
                aPNSChannelRequest.setPrivateKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TeamId")) {
                aPNSChannelRequest.setTeamId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TokenKey")) {
                aPNSChannelRequest.setTokenKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TokenKeyId")) {
                aPNSChannelRequest.setTokenKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aPNSChannelRequest;
    }

    private static APNSChannelRequestJsonUnmarshaller instance;

    public static APNSChannelRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSChannelRequestJsonUnmarshaller();
        return instance;
    }
}
