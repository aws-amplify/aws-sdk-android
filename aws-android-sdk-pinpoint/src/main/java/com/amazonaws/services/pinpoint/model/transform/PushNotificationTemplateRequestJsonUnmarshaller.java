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
 * JSON unmarshaller for POJO PushNotificationTemplateRequest
 */
class PushNotificationTemplateRequestJsonUnmarshaller implements
        Unmarshaller<PushNotificationTemplateRequest, JsonUnmarshallerContext> {

    public PushNotificationTemplateRequest unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PushNotificationTemplateRequest pushNotificationTemplateRequest = new PushNotificationTemplateRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ADM")) {
                pushNotificationTemplateRequest
                        .setADM(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("APNS")) {
                pushNotificationTemplateRequest
                        .setAPNS(APNSPushNotificationTemplateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Baidu")) {
                pushNotificationTemplateRequest
                        .setBaidu(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("Default")) {
                pushNotificationTemplateRequest
                        .setDefault(DefaultPushNotificationTemplateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("GCM")) {
                pushNotificationTemplateRequest
                        .setGCM(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("tags")) {
                pushNotificationTemplateRequest.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return pushNotificationTemplateRequest;
    }

    private static PushNotificationTemplateRequestJsonUnmarshaller instance;

    public static PushNotificationTemplateRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PushNotificationTemplateRequestJsonUnmarshaller();
        return instance;
    }
}
