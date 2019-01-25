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
 * JSON unmarshaller for POJO SMSChannelResponse
 */
class SMSChannelResponseJsonUnmarshaller implements
        Unmarshaller<SMSChannelResponse, JsonUnmarshallerContext> {

    public SMSChannelResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SMSChannelResponse sMSChannelResponse = new SMSChannelResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                sMSChannelResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                sMSChannelResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Enabled")) {
                sMSChannelResponse.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HasCredential")) {
                sMSChannelResponse.setHasCredential(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                sMSChannelResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsArchived")) {
                sMSChannelResponse.setIsArchived(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                sMSChannelResponse.setLastModifiedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                sMSChannelResponse.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Platform")) {
                sMSChannelResponse.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PromotionalMessagesPerSecond")) {
                sMSChannelResponse.setPromotionalMessagesPerSecond(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SenderId")) {
                sMSChannelResponse.setSenderId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShortCode")) {
                sMSChannelResponse.setShortCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransactionalMessagesPerSecond")) {
                sMSChannelResponse.setTransactionalMessagesPerSecond(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                sMSChannelResponse.setVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return sMSChannelResponse;
    }

    private static SMSChannelResponseJsonUnmarshaller instance;

    public static SMSChannelResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SMSChannelResponseJsonUnmarshaller();
        return instance;
    }
}
