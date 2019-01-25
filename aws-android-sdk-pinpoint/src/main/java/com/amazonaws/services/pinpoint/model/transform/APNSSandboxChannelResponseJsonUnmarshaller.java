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
 * JSON unmarshaller for POJO APNSSandboxChannelResponse
 */
class APNSSandboxChannelResponseJsonUnmarshaller implements
        Unmarshaller<APNSSandboxChannelResponse, JsonUnmarshallerContext> {

    public APNSSandboxChannelResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        APNSSandboxChannelResponse aPNSSandboxChannelResponse = new APNSSandboxChannelResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                aPNSSandboxChannelResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                aPNSSandboxChannelResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAuthenticationMethod")) {
                aPNSSandboxChannelResponse.setDefaultAuthenticationMethod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                aPNSSandboxChannelResponse.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HasCredential")) {
                aPNSSandboxChannelResponse.setHasCredential(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HasTokenKey")) {
                aPNSSandboxChannelResponse.setHasTokenKey(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                aPNSSandboxChannelResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsArchived")) {
                aPNSSandboxChannelResponse.setIsArchived(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                aPNSSandboxChannelResponse.setLastModifiedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                aPNSSandboxChannelResponse.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                aPNSSandboxChannelResponse.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                aPNSSandboxChannelResponse.setVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aPNSSandboxChannelResponse;
    }

    private static APNSSandboxChannelResponseJsonUnmarshaller instance;

    public static APNSSandboxChannelResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSSandboxChannelResponseJsonUnmarshaller();
        return instance;
    }
}
