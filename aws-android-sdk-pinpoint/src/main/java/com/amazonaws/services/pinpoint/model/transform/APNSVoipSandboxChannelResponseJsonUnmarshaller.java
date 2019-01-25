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
 * JSON unmarshaller for POJO APNSVoipSandboxChannelResponse
 */
class APNSVoipSandboxChannelResponseJsonUnmarshaller implements
        Unmarshaller<APNSVoipSandboxChannelResponse, JsonUnmarshallerContext> {

    public APNSVoipSandboxChannelResponse unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        APNSVoipSandboxChannelResponse aPNSVoipSandboxChannelResponse = new APNSVoipSandboxChannelResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                aPNSVoipSandboxChannelResponse.setApplicationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                aPNSVoipSandboxChannelResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAuthenticationMethod")) {
                aPNSVoipSandboxChannelResponse
                        .setDefaultAuthenticationMethod(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Enabled")) {
                aPNSVoipSandboxChannelResponse.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HasCredential")) {
                aPNSVoipSandboxChannelResponse.setHasCredential(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HasTokenKey")) {
                aPNSVoipSandboxChannelResponse.setHasTokenKey(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                aPNSVoipSandboxChannelResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsArchived")) {
                aPNSVoipSandboxChannelResponse.setIsArchived(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                aPNSVoipSandboxChannelResponse.setLastModifiedBy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                aPNSVoipSandboxChannelResponse.setLastModifiedDate(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                aPNSVoipSandboxChannelResponse.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                aPNSVoipSandboxChannelResponse.setVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aPNSVoipSandboxChannelResponse;
    }

    private static APNSVoipSandboxChannelResponseJsonUnmarshaller instance;

    public static APNSVoipSandboxChannelResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipSandboxChannelResponseJsonUnmarshaller();
        return instance;
    }
}
