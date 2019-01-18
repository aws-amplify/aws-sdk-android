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
 * JSON unmarshaller for POJO APNSVoipChannelResponse
 */
class APNSVoipChannelResponseJsonUnmarshaller implements
        Unmarshaller<APNSVoipChannelResponse, JsonUnmarshallerContext> {

    public APNSVoipChannelResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        APNSVoipChannelResponse aPNSVoipChannelResponse = new APNSVoipChannelResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                aPNSVoipChannelResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                aPNSVoipChannelResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultAuthenticationMethod")) {
                aPNSVoipChannelResponse.setDefaultAuthenticationMethod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                aPNSVoipChannelResponse.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HasCredential")) {
                aPNSVoipChannelResponse.setHasCredential(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HasTokenKey")) {
                aPNSVoipChannelResponse.setHasTokenKey(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                aPNSVoipChannelResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsArchived")) {
                aPNSVoipChannelResponse.setIsArchived(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                aPNSVoipChannelResponse.setLastModifiedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                aPNSVoipChannelResponse.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                aPNSVoipChannelResponse.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                aPNSVoipChannelResponse.setVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return aPNSVoipChannelResponse;
    }

    private static APNSVoipChannelResponseJsonUnmarshaller instance;

    public static APNSVoipChannelResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipChannelResponseJsonUnmarshaller();
        return instance;
    }
}
